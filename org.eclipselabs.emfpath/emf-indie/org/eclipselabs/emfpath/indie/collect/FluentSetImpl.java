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
 * @param <T>
 */
class FluentSetImpl<T> extends FluentCollectionImpl<T> implements FluentSet<T> {

	/**
	 * @param delegator
	 */
	FluentSetImpl(Set<T> delegator) {
		super(delegator);
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#delegate()
	 */
	@Override
	protected Set<T> delegate() {
		return (Set<T>) super.delegate();
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
		return this;
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentIterable#asFluentMultiset()
	 */
	@Override
	public FluentMultiset<T> asFluentMultiset() {
		return FluentCollections.newFluentMultiset(this.delegate());
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<T> union(Set<? extends T> other) {
		return FluentCollections.newFluentSet(Sets.union(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<T> difference(Set<?> other) {
		return FluentCollections.newFluentSet(Sets.difference(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<T> symmetricDifference(Set<? extends T> other) {
		return FluentCollections.newFluentSet(Sets.symmetricDifference(this.delegate(), other));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<T> intersection(Set<?> other) {
		return FluentCollections.newFluentSet(Sets.intersection(this.delegate(), other));
	}

	/**
	 * @return
	 */
	public FluentSet<Set<T>> powerSet() {
		return FluentCollections.newFluentSet(Sets.powerSet(this.delegate()));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<List<T>> cartesianProduct(List<? extends Set<? extends T>> other) {
		List<Set<? extends T>> sets = Lists.newArrayList();
		sets.add(this.delegate());
		sets.addAll(other);
		return FluentCollections.newFluentSet(Sets.cartesianProduct(sets));
	}

	/**
	 * @param other
	 * @return
	 */
	public FluentSet<List<T>> cartesianProduct(Set<? extends T>... other) {
		List<Set<? extends T>> sets = Lists.newArrayList();
		sets.add(this.delegate());
		sets.addAll(Arrays.asList(other));
		return FluentCollections.newFluentSet(Sets.cartesianProduct(sets));
	}

	@Override
	public FluentSet<T> filter(Predicate<? super T> predicate) {
		return FluentCollections.newFluentSet(Sets.filter(this.delegate(), predicate));
	}

	/**
	 * @see org.eclipselabs.emfpath.indie.collect.FluentCollectionImpl#transform(com.google.common.base.Function)
	 */
	@Override
	public <X> FluentSet<X> transform(Function<? super T, ? extends X> function) {
		// FIXME: ASAP wehn Collections2.transform has been updated to accept "? extends X"
		return (FluentSet<X>) FluentCollections.newFluentSet(Collections2.transform(this.delegate(), function));
	}
}
