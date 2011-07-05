package org.eclipselabs.emfpath.trans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.Resolver.UnresolvingResolver;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Iterables;

public class LazyDeclarativeTransformationEngine implements ITransformationEngine {

	private IMultiplexer fMux;

	private IDemultiplexer fDemux;

	private ILinkerResolver fResolver;

	LazyDeclarativeTransformationEngine() {
		// prevents instantation
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ITransformationEngine#transform(org.eclipselabs.emfpath.trans.TransformationInput, com.google.common.collect.ImmutableSet)
	 */
	public <E extends IDeclarativeTransformationRule> TransformationOutput transform(TransformationInput input, ImmutableList<E> rules) {
		initTargetPatternElementWithResolver(rules);
		return fDemux.demultiplex(doTransform(fMux.multiplex(input, rules)));
	}

	private void initTargetPatternElementWithResolver(ImmutableList<? extends IDeclarativeTransformationRule> rules) {
		if (fResolver != null) { // init TPE with the given resolver
			for (IDeclarativeTransformationRule rule : rules) {
				for (IDeclarativeTargetPatternElement tpe : rule.targetPattern().elements()) {
					tpe.function().setResolver(fResolver);
				}
			}
		}
	}
	
	private  <E extends IDeclarativeTransformationRule> ImmutableMap<IDeclarativeTransformationRule, ImmutableMultimap<String, Iterable<EObject>>> doTransform(ImmutableMap<E,? extends Iterable<Map<String,EObject>>> immutableMap) {
		ImmutableMap.Builder<IDeclarativeTransformationRule, ImmutableMultimap<String, Iterable<EObject>>> retBuilder = ImmutableMap.builder();

		for (Entry<E, ? extends Iterable<Map<String, EObject>>> channel : immutableMap.entrySet()) {
			E rule = channel.getKey();
			Iterable<Map<String, EObject>> ruleInput = channel.getValue();

			IDeclarativeTargetPattern tp = rule.targetPattern();

			ImmutableMultimap.Builder<String, Iterable<EObject>> m = ImmutableMultimap.builder();
			for (final IDeclarativeTargetPatternElement tpe : tp.elements()) {
				Iterable<EObject> transformedInput = transform(ruleInput, tpe);
				m.put(tpe.in(), transformedInput);
			}
			retBuilder.put(rule, m.build());
		}

		return retBuilder.build();
	}

	void setMuxer(IMultiplexer mux) {
		this.fMux = mux;
	}

	void setDemuxer(IDemultiplexer demux) {
		this.fDemux = demux;
	}

	void setResolver(ILinkerResolver resolver) {
		this.fResolver = resolver;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private IMultiplexer fMux;

		private IDemultiplexer fDemux;

		private ILinkerResolver fResolver;

		Builder() {
			fResolver = UnresolvingResolver.INSTANCE;
		}

		public Builder multiplexer(IMultiplexer muxer) {
			Preconditions.checkNotNull(muxer);
			fMux = muxer;
			return this;
		}

		public Builder demultiplexer(IDemultiplexer demuxer) {
			Preconditions.checkNotNull(demuxer);
			fDemux = demuxer;
			return this;
		}

		public Builder resolver(ILinkerResolver proxyResolver) {
			Preconditions.checkNotNull(proxyResolver);
			fResolver = proxyResolver;
			return this;
		}

		public ITransformationEngine build() {
			LazyDeclarativeTransformationEngine te = new LazyDeclarativeTransformationEngine();
			Preconditions.checkState(fMux != null);
			Preconditions.checkState(fDemux != null);
			te.setMuxer(fMux);
			te.setDemuxer(fDemux);
			te.setResolver(fResolver);
			return te;
		}
	}

	private Iterable<EObject> transform(final Iterable<Map<String, EObject>> fromIterable, final IDeclarativeTargetPatternElement tpe) {
		Preconditions.checkNotNull(fromIterable);
		Preconditions.checkNotNull(tpe);
		return new IterableWithToString<EObject>() {
			public Iterator<EObject> iterator() {
				return transform(fromIterable.iterator(), tpe);
			}
		};
	}
	
	private Iterator<EObject> transform(final Iterator<Map<String, EObject>> fromIterator, final IDeclarativeTargetPatternElement tpe) {
		Preconditions.checkNotNull(fromIterator);
		Preconditions.checkNotNull(tpe);
		return new Iterator<EObject>() {
			public boolean hasNext() {
				return fromIterator.hasNext();
			}

			public EObject next() {
				Map<String, EObject> from = fromIterator.next();
				
				if (from.size() > 1) {
					// sort on keys to link elements with the proper key
					from = ImmutableSortedMap.copyOf(from); 
				}
				
				EObject ret = tpe.function().apply(from);

				if (tpe.isDefault()) {
					fResolver.link(from.values(), ret);
				}
				fResolver.link(from.values(), tpe.name(), ret);
				
				return ret;
			}

			public void remove() {
				fromIterator.remove();
			}
		};
	}
	
	abstract static class IterableWithToString<E> implements Iterable<E> {
		@Override
		public String toString() {
			return Iterables.toString(this);
		}
	}
}
