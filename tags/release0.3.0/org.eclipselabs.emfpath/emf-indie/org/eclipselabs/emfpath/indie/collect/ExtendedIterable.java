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

import org.eclipselabs.emfpath.indie.predicate.Contains;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;


/**
 * A specific {@link Iterable} providing a set of utility methods (most of them are calling their counterparts in
 * {@link Iterables}).
 * <p>
 * To create an {@link ExtendedIterable} from an {@link Iterable}, you should use the
 * {@link ExtendedIterable#adapt(Iterable)} method.
 * 
 * @param <T> the kind of element in the {@link Iterable}
 * @since 0.3
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public class ExtendedIterable<T> extends ForwardingIterable<T> {

	private final Iterable<T> delegator;

	/**
	 * @param <X>
	 * @return
	 */
	public static <X> Function<Iterable<X>, ExtendedIterable<X>> iterableToEIterable() {
		return new Function<Iterable<X>, ExtendedIterable<X>>() {
			public ExtendedIterable<X> apply(Iterable<X> from) {
				return ExtendedIterable.adapt(from);
			}
		};
	}

	/**
	 * @param <X>
	 * @param delegator
	 * @return
	 */
	public static <X> ExtendedIterable<X> adapt(Iterable<X> delegator) {
		ExtendedIterable<X> ret = null;
		if (delegator instanceof ExtendedIterable<?>) {
			ret = (ExtendedIterable<X>) delegator;
		} else {
			ret = new ExtendedIterable<X>(delegator);
		}

		return ret;
	}

	/**
	 * @param delegator
	 */
	protected ExtendedIterable(Iterable<T> delegator) {
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
	public ExtendedIterable<List<T>> partition(final int size) {
		return ExtendedIterable.adapt(Iterables.partition(this.delegate(), size));
	}

	/**
	 * @param size
	 * @return
	 */
	public ExtendedIterable<List<T>> paddedPartition(final int size) {
		return ExtendedIterable.adapt(Iterables.paddedPartition(this.delegate(), size));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<T> filter(Predicate<? super T> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(this.delegate(), predicate));
	}

	/**
	 * @param <X>
	 * @param type
	 * @return
	 */
	public <X> ExtendedIterable<X> filter(final Class<X> type) {
		return ExtendedIterable.adapt(Iterables.filter(this.delegate(), type));
	}

	/**
	 * @param <X>
	 * @param function
	 * @return
	 */
	public <X> ExtendedIterable<X> transform(Function<? super T, ? extends X> function) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), function));
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
	public ExtendedIterable<T> reverse() {
		ExtendedIterable<T> ret = null;

		if (this.delegate() instanceof List<?>) {
			ret = ExtendedIterable.adapt(Iterables.reverse((List<T>) this.delegate()));
		} else {
			ret = ExtendedIterable.adapt(Iterables.reverse(ImmutableList.copyOf(this.delegate())));
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
		return Contains.atLeast(n).elementsIn(this.delegate());
	}

	/**
	 * @param n
	 * @return
	 */
	public boolean atMost(int n) {
		return Contains.atMost(n).elementsIn(this.delegate());
	}

	/**
	 * @return
	 */
	public ExtendedIterable<T> removeDuplicates() {
		return ExtendedIterable.adapt(Sets.newLinkedHashSet(this.delegate()));
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ExtendedIterable<T> sort() {
		Iterable<T> it = (Iterable<T>) Ordering.natural().sortedCopy(((Iterable<Comparable<T>>) this.delegate()));
		return ExtendedIterable.adapt(it);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T max() {
		return (T) Ordering.natural().max(((Iterable<Comparable<T>>) this.delegate()));
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T min() {
		return (T) Ordering.natural().max(((Iterable<Comparable<T>>) this.delegate()));
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
