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
package org.eclipselabs.emfpath.indie.base;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;
import com.google.common.base.Predicate;

/**
 * @author mbarbero
 *
 */
public final class Equivalences2 {

	private Equivalences2() {
		// prevents instantiation
	}

	/**
	 * @param equivalenceStrategy
	 * @param to
	 * @return
	 */
	public static <T> Predicate<T> equivalencePredicate(final Equivalence<? super T> equivalenceStrategy, final T to) {
		return new Predicate<T>() {
			public boolean apply(T input) {
				return equivalenceStrategy.equivalent(to, input);
			}
		};
	}

	/**
	 * @param to
	 * @return
	 */
	public static <T> Predicate<T> equalsTo(final T to) {
		return new Predicate<T>() {
			public boolean apply(T input) {
				return Equivalences.equals().equivalent(to, input);
			}
		};
	}

	/**
	 * @param to
	 * @return
	 */
	public static <T> Predicate<T> sameIdentityAs(final T to) {
		return new Predicate<T>() {
			public boolean apply(T input) {
				return Equivalences.identity().equivalent(to, input);
			}
		};
	}
}
