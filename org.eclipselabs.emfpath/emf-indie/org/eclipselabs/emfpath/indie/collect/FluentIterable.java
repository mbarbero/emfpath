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
package org.eclipselabs.emfpath.indie.collect;

import java.util.Iterator;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 */
public class FluentIterable<T> extends ForwardingIterable<T> {

	private final Iterable<T> delegator;

	/**
	 * @param <X>
	 * @return
	 */
	public static <X> Function<Iterable<X>, FluentIterable<X>> iterableToEIterable() {
		return new Function<Iterable<X>, FluentIterable<X>>() {
			public FluentIterable<X> apply(Iterable<X> from) {
				return FluentIterable.adapt(from);
			}
		};
	}

	/**
	 * @param <X>
	 * @param delegator
	 * @return
	 */
	public static <X> FluentIterable<X> adapt(Iterable<X> delegator) {
		FluentIterable<X> ret = null;
		if (delegator instanceof FluentIterable<?>) {
			ret = (FluentIterable<X>) delegator;
		} else {
			ret = new FluentIterable<X>(delegator);
		}

		return ret;
	}

	/**
	 * @param delegator
	 */
	protected FluentIterable(Iterable<T> delegator) {
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
	public T[] toArray(Class<T> type) {
		return Iterables.toArray(this.delegate(), type);
	}

	/**
	 * @param size
	 * @return
	 */
	public FluentIterable<List<T>> partition(final int size) {
		return FluentIterable.adapt(Iterables.partition(this.delegate(), size));
	}

	/**
	 * @param size
	 * @return
	 */
	public FluentIterable<List<T>> paddedPartition(final int size) {
		return FluentIterable.adapt(Iterables.paddedPartition(this.delegate(), size));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public FluentIterable<T> filter(Predicate<? super T> predicate) {
		return FluentIterable.adapt(Iterables.filter(this.delegate(), predicate));
	}

	/**
	 * @param <X>
	 * @param type
	 * @return
	 */
	public <X> FluentIterable<X> filter(final Class<X> type) {
		return FluentIterable.adapt(Iterables.filter(this.delegate(), type));
	}

	/**
	 * @param <X>
	 * @param function
	 * @return
	 */
	public <X> FluentIterable<X> transform(Function<? super T, ? extends X> function) {
		return FluentIterable.adapt(Iterables.transform(this.delegate(), function));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public boolean any(Predicate<? super T> predicate) {
		return Iterables.any(this.delegate(), predicate);
	}

	/**
	 * @param predicate
	 * @return
	 */
	public boolean all(Predicate<? super T> predicate) {
		return Iterables.all(this.delegate(), predicate);
	}

	/**
	 * @param predicate
	 * @return
	 */
	public T find(Predicate<? super T> predicate) {
		return Iterables.find(this.delegate(), predicate);
	}

	/**
	 * @param position
	 * @return
	 */
	public T get(int position) {
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
	public FluentIterable<T> reverse() {
		FluentIterable<T> ret = null;

		if (this.delegate() instanceof List<?>) {
			ret = FluentIterable.adapt(Lists.reverse((List<T>) this.delegate()));
		} else {
			ret = FluentIterable.adapt(Lists.reverse(ImmutableList.copyOf(this.delegate())));
		}

		return ret;
	}

	/**
	 * @return
	 */
	public T first() {
		return Iterables.get(this.delegate(), 0);
	}

	/**
	 * @return
	 */
	public T last() {
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
	public FluentIterable<T> removeDuplicates() {
		return FluentIterable.adapt(Sets.newLinkedHashSet(this.delegate()));
	}

	/**
	 * @param ordering
	 * @return
	 */
	public FluentIterable<T> sort(Ordering<T> ordering) {
		Iterable<T> it = ordering.sortedCopy(this.delegate());
		return FluentIterable.adapt(it);
	}

	/**
	 * @param ordering
	 * @return
	 */
	public T max(final Ordering<T> ordering) {
		return ordering.max(this.delegate());
	}

	/**
	 * @param ordering
	 * @return
	 */
	public T min(Ordering<T> ordering) {
		return ordering.min(this.delegate());
	}

	@Override
	public Iterator<T> iterator() {
		return this.delegate().iterator();
	}

	@Override
	protected Iterable<T> delegate() {
		return this.delegator;
	}

}
