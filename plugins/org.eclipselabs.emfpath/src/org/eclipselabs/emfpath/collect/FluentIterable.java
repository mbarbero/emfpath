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

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;

/**
 * @author mbarbero
 *
 * @param <E>
 */
public interface FluentIterable<E> extends Iterable<E> {

	/**
	 * @see Iterables#size(Iterable)
	 * @return Returns the number of elements in this {@link Iterable}.
	 */
	int size();

	/**
	 * @see Iterables#contains(Iterable, Object)
	 * @param element
	 * @return
	 */
	boolean contains(Object element);

	/**
	 * @param type
	 * @return
	 */
	E[] toArray(Class<E> type);

	/**
	 * @param size
	 * @return
	 */
	FluentIterable<List<E>> partition(final int size);

	/**
	 * @param size
	 * @return
	 */
	FluentIterable<List<E>> paddedPartition(final int size);

	/**
	 * @param predicate
	 * @return
	 */
	FluentIterable<E> filter(Predicate<? super E> predicate);

	/**
	 * @param <X>
	 * @param type
	 * @return
	 */
	<X> FluentIterable<X> filter(final Class<X> type);

	/**
	 * @param <X>
	 * @param function
	 * @return
	 */
	<X> FluentIterable<X> transform(Function<? super E, ? extends X> function);

	/**
	 * @param predicate
	 * @return
	 */
	boolean any(Predicate<? super E> predicate);

	/**
	 * @param predicate
	 * @return
	 */
	boolean all(Predicate<? super E> predicate);

	/**
	 * @param predicate
	 * @return
	 */
	E find(Predicate<? super E> predicate);

	/**
	 * @param position
	 * @return
	 */
	E get(int position);

	/**
	 * @return
	 */
	boolean isEmpty();

	/**
	 * @return
	 */
	E first();

	/**
	 * @return
	 */
	E last();

	/**
	 * @param n
	 * @return
	 */
	boolean atLeast(int n);

	/**
	 * @param n
	 * @return
	 */
	boolean atMost(int n);

	/**
	 * @return
	 */
	FluentIterable<E> removeDuplicates();

	/**
	 * @param ordering
	 * @return
	 */
	FluentIterable<E> sort(Ordering<E> ordering);

	/**
	 * @param ordering
	 * @return
	 */
	E max(final Ordering<E> ordering);

	/**
	 * @param ordering
	 * @return
	 */
	E min(Ordering<E> ordering);

	/**
	 * @return
	 */
	FluentList<E> asFluentList();

	/**
	 * @return
	 */
	FluentSet<E> asFluentSet();

	/**
	 * @return
	 */
	FluentMultiset<E> asFluentMultiset();
}