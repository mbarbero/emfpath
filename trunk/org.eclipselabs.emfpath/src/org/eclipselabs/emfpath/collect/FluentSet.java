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
import java.util.Set;

import com.google.common.base.Predicate;

/**
 * @author mbarbero
 * @param <E>
 */
public interface FluentSet<E> extends FluentCollection<E>, Set<E> {

	/**
	 * @param other
	 * @return
	 */
	FluentSet<E> union(Set<? extends E> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<E> difference(Set<?> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<E> symmetricDifference(Set<? extends E> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<E> intersection(Set<?> other);

	/**
	 * @return
	 */
	FluentSet<Set<E>> powerSet();

	/**
	 * @param other
	 * @return
	 */
	FluentSet<List<E>> cartesianProduct(List<? extends Set<? extends E>> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<List<E>> cartesianProduct(Set<? extends E>... other);

	FluentSet<E> filter(Predicate<? super E> predicate);
}
