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
import java.util.Set;

import com.google.common.base.Predicate;

/**
 * @author mbarbero
 * @param <T>
 */
public interface FluentSet<T> extends FluentCollection<T>, Set<T> {

	/**
	 * @param other
	 * @return
	 */
	FluentSet<T> union(Set<? extends T> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<T> difference(Set<?> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<T> symmetricDifference(Set<? extends T> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<T> intersection(Set<?> other);

	/**
	 * @return
	 */
	FluentSet<Set<T>> powerSet();

	/**
	 * @param other
	 * @return
	 */
	FluentSet<List<T>> cartesianProduct(List<? extends Set<? extends T>> other);

	/**
	 * @param other
	 * @return
	 */
	FluentSet<List<T>> cartesianProduct(Set<? extends T>... other);

	FluentSet<T> filter(Predicate<? super T> predicate);
}
