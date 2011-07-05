/*******************************************************************************
 * Copyright (c) 2009, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfpath.collect;

import java.util.Iterator;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <E>
 */
public class FluentIterableImpl<E> extends ForwardingIterable<E> implements FluentIterable<E> {

	private final Iterable<E> delegator;

	/**
	 * @param <X>
	 * @return
	 */
	public static <X> Function<Iterable<X>, FluentIterable<X>> wrapFunction() {
		return new Function<Iterable<X>, FluentIterable<X>>() {
			public FluentIterable<X> apply(Iterable<X> from) {
				return FluentCollections.newFluentIterable(from);
			}
		};
	}

	/**
	 * @param delegator
	 */
	protected FluentIterableImpl(Iterable<E> delegator) {
		this.delegator = delegator;
	}

	/**
	 * @see Iterables#size(Iterable)
	 * @return Returns the number of elements in this {@link Iterable}.
	 */
	public int size() {
		return Iterables.size(this.delegate());
	}

	/**
	 * @see Iterables#contains(Iterable, Object)
	 * @param element
	 * @return
	 */
	public boolean contains(Object element) {
		return Iterables.contains(this.delegate(), element);
	}

	/**
	 * @param type
	 * @return
	 */
	public E[] toArray(Class<E> type) {
		return Iterables.toArray(this.delegate(), type);
	}

	/**
	 * @param size
	 * @return
	 */
	public FluentIterable<List<E>> partition(final int size) {
		return FluentCollections.newFluentIterable(Iterables.partition(this.delegate(), size));
	}

	/**
	 * @param size
	 * @return
	 */
	public FluentIterable<List<E>> paddedPartition(final int size) {
		return FluentCollections.newFluentIterable(Iterables.paddedPartition(this.delegate(), size));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public FluentIterable<E> filter(Predicate<? super E> predicate) {
		return FluentCollections.newFluentIterable(Iterables.filter(this.delegate(), predicate));
	}

	/**
	 * @param <X>
	 * @param type
	 * @return
	 */
	public <X> FluentIterable<X> filter(final Class<X> type) {
		return FluentCollections.newFluentIterable(Iterables.filter(this.delegate(), type));
	}

	/**
	 * @param <X>
	 * @param function
	 * @return
	 */
	public <X> FluentIterable<X> transform(Function<? super E, ? extends X> function) {
		return FluentCollections.newFluentIterable(Iterables.transform(this.delegate(), function));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public boolean any(Predicate<? super E> predicate) {
		return Iterables.any(this.delegate(), predicate);
	}

	/**
	 * @param predicate
	 * @return
	 */
	public boolean all(Predicate<? super E> predicate) {
		return Iterables.all(this.delegate(), predicate);
	}

	/**
	 * @param predicate
	 * @return
	 */
	public E find(Predicate<? super E> predicate) {
		return Iterables.find(this.delegate(), predicate);
	}

	/**
	 * @param position
	 * @return
	 */
	public E get(int position) {
		return Iterables.get(this.delegate(), position);
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return Iterables.isEmpty(this.delegate());
	}

	/**
	 * @return
	 */
	public E first() {
		return Iterables.get(this.delegate(), 0);
	}

	/**
	 * @return
	 */
	public E last() {
		return Iterables.getLast(this.delegate());
	}

	/**
	 * @param n
	 * @return
	 */
	public boolean atLeast(int n) {
		return Iterables2.containsAtLeast(n).elementsIn(this.delegate());
	}

	/**
	 * @param n
	 * @return
	 */
	public boolean atMost(int n) {
		return Iterables2.containsAtMost(n).elementsIn(this.delegate());
	}

	/**
	 * @return
	 */
	public FluentSet<E> removeDuplicates() {
		return FluentCollections.newFluentSet(Sets.newLinkedHashSet(this.delegate()));
	}

	/**
	 * @param ordering
	 * @return
	 */
	public FluentList<E> sort(Ordering<E> ordering) {
		List<E> it = ordering.sortedCopy(this.delegate());
		return FluentCollections.newFluentList(it);
	}

	/**
	 * @param ordering
	 * @return
	 */
	public E max(final Ordering<E> ordering) {
		return ordering.max(this.delegate());
	}

	/**
	 * @param ordering
	 * @return
	 */
	public E min(Ordering<E> ordering) {
		return ordering.min(this.delegate());
	}

	@Override
	public Iterator<E> iterator() {
		return this.delegate().iterator();
	}

	@Override
	protected Iterable<E> delegate() {
		return this.delegator;
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentList()
	 */
	public FluentList<E> asFluentList() {
		return FluentCollections.newFluentList(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentSet()
	 */
	public FluentSet<E> asFluentSet() {
		return FluentCollections.newFluentSet(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentMultiset()
	 */
	public FluentMultiset<E> asFluentMultiset() {
		return FluentCollections.newFluentMultiset(this.delegate());
	}

}
