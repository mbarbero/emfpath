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

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

/**
 * @author mbarbero
 *
 */
public final class FluentCollections {

	private FluentCollections() {
		// prevents instantiation
	}

	/**
	 * @param <T>
	 * @param delegator
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> IFluentIterable<T> newFluentIterable(Iterable<T> delegator) {
		return new FluentIterable<T>(delegator);
	}

	/**
	 * @param delegator
	 * @return
	 */
	public static <T> FluentList<T> newFluentList(Iterable<T> delegator) {
		if (delegator instanceof List<?>) {
			return new FluentListImpl<T>((List<T>) delegator);
		}
		return new FluentListImpl<T>(Lists.newArrayList(delegator));
	}

	/**
	 * @param delegator
	 * @return
	 */
	public static <T> FluentSet<T> newFluentSet(Iterable<T> delegator) {
		if (delegator instanceof Set<?>) {
			return new FluentSetImpl<T>((Set<T>) delegator);
		}
		return new FluentSetImpl<T>(Sets.newHashSet(delegator));
	}

	/**
	 * @param delegator
	 * @return
	 */
	public static <T> FluentMultiset<T> newFluentMultiset(Iterable<T> delegator) {
		if (delegator instanceof Multiset<?>) {
			return new FluentMultisetImpl<T>((Multiset<T>) delegator);
		}
		return new FluentMultisetImpl<T>(HashMultiset.create(delegator));
	}
}
