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

import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Multiset;

/**
 * @author mbarbero
 * @param <T>
 */
class FluentMultisetImpl<T> extends FluentCollectionImpl<T> implements FluentMultiset<T> {

	/**
	 * @param delegator
	 */
	FluentMultisetImpl(Multiset<T> delegator) {
		super(delegator);
	}

	/**
	 * @see com.google.common.collect.Multiset#count(java.lang.Object)
	 */
	public int count(Object element) {
		return this.delegate().count(element);
	}

	/**
	 * @see com.google.common.collect.Multiset#add(java.lang.Object, int)
	 */
	public int add(T element, int occurrences) {
		return this.delegate().add(element, occurrences);
	}

	/**
	 * @see com.google.common.collect.Multiset#remove(java.lang.Object, int)
	 */
	public int remove(Object element, int occurrences) {
		return this.delegate().remove(element, occurrences);
	}

	/**
	 * @see com.google.common.collect.Multiset#setCount(java.lang.Object, int)
	 */
	public int setCount(T element, int count) {
		return this.delegate().setCount(element, count);
	}

	/**
	 * @see com.google.common.collect.Multiset#setCount(java.lang.Object, int, int)
	 */
	public boolean setCount(T element, int oldCount, int newCount) {
		return this.delegate().setCount(element, oldCount, newCount);
	}

	/**
	 * @see com.google.common.collect.Multiset#elementSet()
	 */
	public Set<T> elementSet() {
		return this.delegate().elementSet();
	}

	/**
	 * @see com.google.common.collect.Multiset#entrySet()
	 */
	public Set<Multiset.Entry<T>> entrySet() {
		return this.delegate().entrySet();
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#delegate()
	 */
	@Override
	protected Multiset<T> delegate() {
		return (Multiset<T>) super.delegate();
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#asFluentList()
	 */
	@Override
	public FluentList<T> asFluentList() {
		return FluentCollections.newFluentList(this.delegate());
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
		return this;
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#transform(com.google.common.base.Function)
	 */
	@Override
	public <X> FluentMultiset<X> transform(Function<? super T, ? extends X> function) {
		// FIXME: ASAP wehn Collections2.transform has been updated to accept "? extends X"
		return (FluentMultiset<X>) FluentCollections.newFluentMultiset(Collections2.transform(this.delegate(), function));
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#filter(com.google.common.base.Predicate)
	 */
	@Override
	public FluentCollection<T> filter(Predicate<? super T> predicate) {
		return FluentCollections.newFluentMultiset(Collections2.filter(this.delegate(), predicate));
	}
}
