package org.eclipselabs.emfpath.trans;

import java.util.Iterator;

import org.eclipselabs.emfpath.collect.ForwardingIterable;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;

class BlockingIterables {

	@SuppressWarnings("unchecked")
	public static <T> BlockingIterable<T> of() {
		return (BlockingIterable<T>) EMPTY;
	}
	
	private static final BlockingIterable<Object> EMPTY = new EmptyBlockingIterable<Object>();
	
	private static class EmptyBlockingIterable<T> extends ForwardingIterable<T> implements BlockingIterable<T> {
		@Override
		protected Iterable<T> delegate() {
			return ImmutableSet.of();
		}
	}
	
	public static <E> BlockingIterable<E> filter(BlockingIterable<E> input, Predicate<? super E> predicate) {
		return new FilteredBlockingIterable<E>(input, predicate);
	}
	
	
	private static class FilteredBlockingIterable<E> extends ForwardingIterable<E> implements BlockingIterable<E> {

		private final Predicate<? super E> fPredicate;
		private final BlockingIterable<E> fInput;

		public FilteredBlockingIterable(BlockingIterable<E> input, Predicate<? super E> predicate) {
			this.fInput = input;
			this.fPredicate = predicate;

		}

		@Override
		protected BlockingIterable<E> delegate() {
			return fInput;
		}
		
		@Override
		public Iterator<E> iterator() {
			return Iterators.filter(delegate().iterator(), fPredicate);
		}
	}
}
