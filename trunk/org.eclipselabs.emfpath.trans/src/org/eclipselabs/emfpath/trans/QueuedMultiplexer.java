package org.eclipselabs.emfpath.trans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class QueuedMultiplexer implements IMultiplexer {

	private static final int QUEUE_SIZE = 64;

	private static final Predicate<Iterator<?>> IS_EMPTY = new  Predicate<Iterator<?>>() {
		public boolean apply(Iterator<?> input) {
			return input.hasNext();
		}
	};
	
	private final BlockingQueue<ImmutableMap<String, EObject>> fInputs;
	
	public QueuedMultiplexer() {
		fInputs = new ArrayBlockingQueue<ImmutableMap<String,EObject>>(QUEUE_SIZE);
	}
	
	public QueuedMultiplexer(int capacity) {
		fInputs = new ArrayBlockingQueue<ImmutableMap<String,EObject>>(capacity);
	}
	
	public <E extends ITransformationRule> ImmutableMap<E, BlockingIterable<Map<String, EObject>>> multiplex(TransformationInput inputs, ImmutableList<? extends E> rules) {
		ImmutableMap<String, Iterator<? extends EObject>> iteratorsMap = buildInputIteratorsMap(inputs);
		Thread inputIterator = new InputIterator(iteratorsMap);
		inputIterator.start();
		
		ImmutableMap.Builder<E, ImmutableMap<String, BlockingQueue<EObject>>> cpInput = ImmutableMap.builder();
		for (E rule : rules) {
			ImmutableMap<String, BlockingQueue<EObject>> cartesianProductInput = buildCartesianProductInput(rule);
			cpInput.put(rule, cartesianProductInput);
			RuleMatchingThread<E> rt = new RuleMatchingThread<E>(rule, cartesianProductInput);
			rt.start();
		}
		
		ImmutableMap<E, BlockingIterable<Map<String, EObject>>> cartesianProduct = buildCartesianProducts(cpInput.build());
		return cartesianProduct;
	}


	private class RuleMatchingThread<E extends ITransformationRule> extends Thread {

		private E fRule;
		private final ImmutableMap<String, BlockingQueue<EObject>> fCPInput;
		
		public RuleMatchingThread(E rule, ImmutableMap<String,BlockingQueue<EObject>> cartesianProductInput) {
			this.fRule = rule;
			this.fCPInput = cartesianProductInput;
		}
		
		@Override
		public void run() {
			ISourcePattern sp = fRule.sourcePattern();
			
			for (final ISourcePatternElement spe : sp.elements()) {
				try {
					ImmutableMap<String, EObject> input = fInputs.take();
					EObject in = input.get(spe.in());
					if (in != null) {
						if (spe.predicate().apply(in)) {
							fCPInput.get(spe.name()).add(in);
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private class InputIterator extends Thread {
		
		private final ImmutableMap<String, Iterator<? extends EObject>> iteratorsMap;

		public InputIterator(ImmutableMap<String, Iterator<? extends EObject>> iteratorsMap) {
			this.iteratorsMap = iteratorsMap;
		}
		
		@Override
		public void run() {
			while (!Maps.filterValues(iteratorsMap, IS_EMPTY).isEmpty()) {
				ImmutableMap<String,EObject> inputLoop = processInputLoop();
				fInputs.offer(inputLoop);
			}
		}
		
		private ImmutableMap<String, EObject> processInputLoop() {
			ImmutableMap.Builder<String, EObject> loop = ImmutableMap.builder();
			for (Entry<String, Iterator<? extends EObject>> iteratorMapEntry : iteratorsMap.entrySet()) {
				String key = iteratorMapEntry.getKey();
				Iterator<? extends EObject> value = iteratorMapEntry.getValue();
				if (value.hasNext()) {
					loop.put(key, value.next());
				}
			}
			return loop.build();
		}
	}
	
	

	private static <E extends ITransformationRule> ImmutableMap<E, BlockingIterable<Map<String, EObject>>> buildCartesianProducts(ImmutableMap<E, ImmutableMap<String, BlockingQueue<EObject>>> cpInputs) {
		ImmutableMap.Builder<E, BlockingIterable<Map<String, EObject>>> cpBuilder = ImmutableMap.builder();
		for (Entry<E, ImmutableMap<String, BlockingQueue<EObject>>> cpInput : cpInputs.entrySet()) {
			E rule = cpInput.getKey();
			BlockingIterable<Map<String, EObject>> cartesianProduct = CartesianProduct.blockingCartesianProduct(cpInput.getValue()); /// XXX: Fixme make a blocking CartesianProduct
			cpBuilder.put(rule, BlockingIterables.filter(cartesianProduct, rule.sourcePattern().joinPredicate()));
		}
		return cpBuilder.build();
	}

	private static <E extends ITransformationRule> ImmutableMap<String, BlockingQueue<EObject>> buildCartesianProductInput(E rule) {
		ImmutableMap.Builder<String, BlockingQueue<EObject>> rInput = ImmutableMap.builder();
		for (ISourcePatternElement spe : rule.sourcePattern().elements()) {
			rInput.put(spe.name(), new ArrayBlockingQueue<EObject>(QueuedMultiplexer.QUEUE_SIZE));
		}
		return rInput.build();
	}

	private static ImmutableMap<String, Iterator<? extends EObject>> buildInputIteratorsMap(TransformationInput inputs) {
		ImmutableMap.Builder<String, Iterator<? extends EObject>> iteratorMapBuilder = ImmutableMap.builder();
		for (Entry<String, Iterable<? extends EObject>> input : inputs) {
			iteratorMapBuilder.put(input.getKey(), input.getValue().iterator());
		}
		return iteratorMapBuilder.build();
	}

}
