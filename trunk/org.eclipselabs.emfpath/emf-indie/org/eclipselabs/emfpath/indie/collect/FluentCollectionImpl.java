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

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * @author mbarbero
 * @param <T>
 */
abstract class FluentCollectionImpl<T> extends FluentIterable<T> implements FluentCollection<T> {

	/**
	 * @param delegator
	 */
	FluentCollectionImpl(Collection<T> delegator) {
		super(delegator);
	}

	/**
	 * @see java.util.Collection#toArray()
	 */
	public Object[] toArray() {
		return this.delegate().toArray();
	}

	/**
	 * @see java.util.Collection#toArray(T[])
	 */
	public <T> T[] toArray(T[] a) {
		return this.delegate().toArray(a);
	}

	/**
	 * @see java.util.Collection#add(java.lang.Object)
	 */
	public boolean add(T o) {
		return this.delegate().add(o);
	}

	/**
	 * @see java.util.Collection#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return this.delegate().remove(o);
	}

	/**
	 * @see java.util.Collection#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection<?> c) {
		return this.delegate().containsAll(c);
	}

	/**
	 * @see java.util.Collection#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<? extends T> c) {
		return this.delegate().addAll(c);
	}

	/**
	 * @see java.util.Collection#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection<?> c) {
		return this.delegate().removeAll(c);
	}

	/**
	 * @see java.util.Collection#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection<?> c) {
		return this.delegate().retainAll(c);
	}

	/**
	 * @see java.util.Collection#clear()
	 */
	public void clear() {
		this.delegate().clear();
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#delegate()
	 */
	@Override
	protected Collection<T> delegate() {
		return (Collection<T>) super.delegate();
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#filter(com.google.common.base.Predicate)
	 */
	@Override
	public abstract FluentCollection<T> filter(Predicate<? super T> predicate);

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#transform(com.google.common.base.Function)
	 */
	@Override
	public abstract <X> FluentCollection<X> transform(Function<? super T, ? extends X> function);
}
