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

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * @author mbarbero
 * @param <T>
 */
class FluentListImpl<T> extends FluentCollectionImpl<T> implements FluentList<T> {

	/**
	 * @param delegator
	 */
	protected FluentListImpl(List<T> delegator) {
		super(delegator);
	}

	/**
	 * @see java.util.List#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int index, Collection<? extends T> c) {
		return this.delegate().addAll(index, c);
	}

	/**
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public T set(int index, T element) {
		return this.delegate().set(index, element);
	}

	/**
	 * @see java.util.List#add(int, java.lang.Object)
	 */
	public void add(int index, T element) {
		this.delegate().add(index, element);
	}

	/**
	 * @see java.util.List#remove(int)
	 */
	public T remove(int index) {
		return this.delegate().remove(index);
	}

	/**
	 * @see java.util.List#indexOf(java.lang.Object)
	 */
	public int indexOf(Object o) {
		return this.delegate().indexOf(o);
	}

	/**
	 * @see java.util.List#lastIndexOf(java.lang.Object)
	 */
	public int lastIndexOf(Object o) {
		return this.delegate().lastIndexOf(o);
	}

	/**
	 * @see java.util.List#listIterator()
	 */
	public ListIterator<T> listIterator() {
		return this.delegate().listIterator();
	}

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public ListIterator<T> listIterator(int index) {
		return this.delegate().listIterator(index);
	}

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public FluentList<T> subList(int fromIndex, int toIndex) {
		return FluentCollections.newFluentList(this.delegate().subList(fromIndex, toIndex));
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#delegate()
	 */
	@Override
	protected List<T> delegate() {
		return (List<T>) super.delegate();
	}

	/**
	 * @return
	 */
	public FluentList<T> reverse() {
		return FluentCollections.newFluentList(Lists.reverse(this.delegate()));
	}

	/**
	 * @param function
	 * @return
	 */
	@Override
	public <V> FluentList<V> transform(Function<? super T, ? extends V> function) {
		return FluentCollections.newFluentList(Lists.transform(this.delegate(), function));
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterableImpl#partition(int)
	 */
	@Override
	public FluentList<List<T>> partition(int size) {
		return FluentCollections.newFluentList(Lists.partition(this.delegate(), size));
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#asFluentList()
	 */
	@Override
	public FluentList<T> asFluentList() {
		return this;
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#asFluentSet()
	 */
	@Override
	public FluentSet<T> asFluentSet() {
		return FluentCollections.newFluentSet(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#asFluentMultiset()
	 */
	@Override
	public FluentMultiset<T> asFluentMultiset() {
		return FluentCollections.newFluentMultiset(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#filter(com.google.common.base.Predicate)
	 */
	@Override
	public FluentCollection<T> filter(Predicate<? super T> predicate) {
		return FluentCollections.newFluentList(Collections2.filter(this.delegate(), predicate));
	}
}
