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

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;

/**
 * @author mbarbero
 *
 * @param <T>
 */
public interface FluentIterable<T> extends Iterable<T> {

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
	T[] toArray(Class<T> type);

	/**
	 * @param size
	 * @return
	 */
	FluentIterable<List<T>> partition(final int size);

	/**
	 * @param size
	 * @return
	 */
	FluentIterable<List<T>> paddedPartition(final int size);

	/**
	 * @param predicate
	 * @return
	 */
	FluentIterable<T> filter(Predicate<? super T> predicate);

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
	<X> FluentIterable<X> transform(Function<? super T, ? extends X> function);

	/**
	 * @param predicate
	 * @return
	 */
	boolean any(Predicate<? super T> predicate);

	/**
	 * @param predicate
	 * @return
	 */
	boolean all(Predicate<? super T> predicate);

	/**
	 * @param predicate
	 * @return
	 */
	T find(Predicate<? super T> predicate);

	/**
	 * @param position
	 * @return
	 */
	T get(int position);

	/**
	 * @return
	 */
	boolean isEmpty();

	/**
	 * @return
	 */
	T first();

	/**
	 * @return
	 */
	T last();

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
	FluentIterable<T> removeDuplicates();

	/**
	 * @param ordering
	 * @return
	 */
	FluentIterable<T> sort(Ordering<T> ordering);

	/**
	 * @param ordering
	 * @return
	 */
	T max(final Ordering<T> ordering);

	/**
	 * @param ordering
	 * @return
	 */
	T min(Ordering<T> ordering);

	/**
	 * @return
	 */
	FluentList<T> asFluentList();

	/**
	 * @return
	 */
	FluentSet<T> asFluentSet();

	/**
	 * @return
	 */
	FluentMultiset<T> asFluentMultiset();
}