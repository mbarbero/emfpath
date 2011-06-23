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

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author mbarbero
 * @param <E>
 */
class FluentSetImpl<E> extends FluentCollectionImpl<E> implements FluentSet<E> {

	/**
	 * @param delegator
	 */
	FluentSetImpl(Set<E> delegator) {
		super(delegator);
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentCollectionImpl#delegate()
	 */
	@Override
	protected Set<E> delegate() {
		return (Set<E>) super.delegate();
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentList()
	 */
	@Override
	public FluentList<E> asFluentList() {
		return FluentCollections.newFluentList(this.delegate());
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentSet()
	 */
	@Override
	public FluentSet<E> asFluentSet() {
		return this;
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#asFluentMultiset()
	 */
	@Override
	public FluentMultiset<E> asFluentMultiset() {
		return FluentCollections.newFluentMultiset(this.delegate());
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<E> union(Set<? extends E> other) {
		return FluentCollections.newFluentSet(Sets.union(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<E> difference(Set<?> other) {
		return FluentCollections.newFluentSet(Sets.difference(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<E> symmetricDifference(Set<? extends E> other) {
		return FluentCollections.newFluentSet(Sets.symmetricDifference(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<E> intersection(Set<?> other) {
		return FluentCollections.newFluentSet(Sets.intersection(this.delegate(), other));
	}

	/**
	 * @return
	 */
	public FluentSet<Set<E>> powerSet() {
		return FluentCollections.newFluentSet(Sets.powerSet(this.delegate()));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<List<E>> cartesianProduct(List<? extends Set<? extends E>> other) {
		List<Set<? extends E>> sets = Lists.newArrayList();
		sets.add(this.delegate());
		sets.addAll(other);
		return FluentCollections.newFluentSet(Sets.cartesianProduct(sets));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<List<E>> cartesianProduct(Set<? extends E>... other) {
		List<Set<? extends E>> sets = Lists.newArrayList();
		sets.add(this.delegate());
		sets.addAll(Arrays.asList(other));
		return FluentCollections.newFluentSet(Sets.cartesianProduct(sets));
	}

	@Override
	public FluentSet<E> filter(Predicate<? super E> predicate) {
		return FluentCollections.newFluentSet(Sets.filter(this.delegate(), predicate));
	}

	/**
	 * @see org.eclipselabs.emfpath.collect.FluentCollectionImpl#transform(com.google.common.base.Function)
	 */
	@Override
	public <X> FluentSet<X> transform(Function<? super E, ? extends X> function) {
		// FIXME: ASAP wehn Collections2.transform has been updated to accept "? extends X"
		return (FluentSet<X>) FluentCollections.newFluentSet(Collections2.transform(this.delegate(), function));
	}
}
