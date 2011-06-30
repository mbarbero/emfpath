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
package org.eclipselabs.emfpath.base;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

import javax.annotation.Nullable;

/**
 * Set of utility methods to create {@link Predicate} from an {@link Equivalence} strategy.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public final class Equivalences2 {

	private Equivalences2() {
		// prevents instantiation
	}

	/**
	 * Creates a {@link Predicate} that test the equivalence to <code>to</code> following the given
	 * <code>equivalenceStrategy</code>.
	 * 
	 * @param equivalenceStrategy the strategy to use when applying the predicate.
	 * @param to the object to test the equivalence against.
	 * @return a new {@link Predicate}.
	 * @throws NullPointerException if the given <code>equivalenceStrategy</code> is null.
	 */
	public static <T> Predicate<T> equivalencePredicate(final Equivalence<? super T> equivalenceStrategy, @Nullable final T to) {
		Preconditions.checkNotNull(equivalenceStrategy);
		return new Predicate<T>() {
			public boolean apply(T input) {
				return equivalenceStrategy.equivalent(to, input);
			}
		};
	}

	/**
	 * Creates a {@link Predicate} that test the equality to <code>to</code> following the {@link Equivalences#equals()}
	 * strategy.
	 * 
	 * @param to the object to test the equality against.
	 * @return a new {@link Predicate}.
	 */
	public static <T> Predicate<T> equalsTo(@Nullable final T to) {
		return new Predicate<T>() {
			public boolean apply(T input) {
				return Equivalences.equals().equivalent(to, input);
			}
		};
	}

	/**
	 * Creates a {@link Predicate} that test the equality to <code>to</code> following the
	 * {@link Equivalences#identity()} strategy.
	 * 
	 * @param to the object to test the equality against.
	 * @return a new {@link Predicate}.
	 */
	public static <T> Predicate<T> sameIdentityAs(@Nullable final T to) {
		return new Predicate<T>() {
			public boolean apply(T input) {
				return Equivalences.identity().equivalent(to, input);
			}
		};
	}
}
