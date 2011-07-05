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

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * @author mbarbero
 * @param <E>
 */
class FluentListImpl<E> extends FluentCollectionImpl<E> implements FluentList<E> {

	/**
	 * @param delegator
	 */
	protected FluentListImpl(List<E> delegator) {
		super(delegator);
	}

	/**
	 * @see java.util.List#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int index, Collection<? extends E> c) {
		return this.delegate().addAll(index, c);
	}

	/**
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public E set(int index, E element) {
		return this.delegate().set(index, element);
	}

	/**
	 * @see java.util.List#add(int, java.lang.Object)
	 */
	public void add(int index, E element) {
		this.delegate().add(index, element);
	}

	/**
	 * @see java.util.List#remove(int)
	 */
	public E remove(int index) {
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
	public ListIterator<E> listIterator() {
		return this.delegate().listIterator();
	}

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public ListIterator<E> listIterator(int index) {
		return this.delegate().listIterator(index);
	}

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public FluentList<E> subList(int fromIndex, int toIndex) {
		return FluentCollections.newFluentList(this.delegate().subList(fromIndex, toIndex));
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentCollectionImpl#delegate()
	 */
	@Override
	protected List<E> delegate() {
		return (List<E>) super.delegate();
	}

	/**
	 * @return
	 */
	public FluentList<E> reverse() {
		return FluentCollections.newFluentList(Lists.reverse(this.delegate()));
	}

	/**
	 * @param function
	 * @return
	 */
	@Override
	public <V> FluentList<V> transform(Function<? super E, ? extends V> function) {
		return FluentCollections.newFluentList(Lists.transform(this.delegate(), function));
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterableImpl#partition(int)
	 */
	@Override
	public FluentList<List<E>> partition(int size) {
		return FluentCollections.newFluentList(Lists.partition(this.delegate(), size));
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentList()
	 */
	@Override
	public FluentList<E> asFluentList() {
		return this;
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentSet()
	 */
	@Override
	public FluentSet<E> asFluentSet() {
		return FluentCollections.newFluentSet(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentMultiset()
	 */
	@Override
	public FluentMultiset<E> asFluentMultiset() {
		return FluentCollections.newFluentMultiset(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentCollectionImpl#filter(com.google.common.base.Predicate)
	 */
	@Override
	public FluentCollection<E> filter(Predicate<? super E> predicate) {
		return FluentCollections.newFluentList(Collections2.filter(this.delegate(), predicate));
	}
}
