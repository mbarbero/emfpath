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
package org.eclipselabs.emfpath.indie.util;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

/**
 * Abstract implementation of {@link Predicate}. It provides four methods to compose predicates:
 * <ul>
 * <li><em>and</em></li>
 * <li><em>or</em></li>
 * <li><em>xor</em></li>
 * <li><em>negate</em></li>
 * </ul>
 * 
 * @param <T> the kind of element the predicate applies to.
 * @since 0.3
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public abstract class ComposablePredicate<T> implements Predicate<T> {

	private List<ComposablePredicate<? super T>> concat(ComposablePredicate<? super T> other) {
		Preconditions.checkNotNull(other);
		List<ComposablePredicate<? super T>> tmp = Lists.newArrayListWithCapacity(2);
		tmp.add(this);
		tmp.add(other);
		return tmp;
	}

	/**
	 * Returns a new {@link ComposablePredicate} evaluating to {@code true} if each of its components evaluates to
	 * {@code true}. The components are evaluated in order, and evaluation will be "short-circuited" as soon as a false
	 * predicate is found.
	 * <p>
	 * If you want to and-compose {@link Predicate}s that do not extends {@link ComposablePredicate}, you should have a
	 * look on {@link Predicates#and(Predicate...)}.
	 * 
	 * @param other the other component to and-compose.
	 * @return a new {@link ComposablePredicate} evaluating to {@code true} if {@code this} and {@code other} evaluates
	 *         to {@code true}.
	 */
	public ComposablePredicate<T> and(ComposablePredicate<? super T> other) {
		return new And<T>(this.concat(Preconditions.checkNotNull(other)));
	}

	private static class And<T> extends ComposablePredicate<T> {
		List<ComposablePredicate<? super T>> components;

		And(List<ComposablePredicate<? super T>> list) {
			this.components = list; // Skip defensive copy (private)
		}

		public boolean apply(T c) {
			for (ComposablePredicate<? super T> predicate : this.components) {
				if (!predicate.apply(c)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public ComposablePredicate<T> and(ComposablePredicate<? super T> other) {
			List<ComposablePredicate<? super T>> newComponents = Lists.newArrayList(this.components);
			newComponents.add(Preconditions.checkNotNull(other));
			return new And<T>(newComponents);
		}
	}

	/**
	 * Returns a new {@link ComposablePredicate} evaluating to {@code true} if any one of its components evaluates to
	 * {@code true}. The components are evaluated in order, and evaluation will be "short-circuited" as soon as a true
	 * predicate is found.
	 * <p>
	 * If you want to and-compose {@link Predicate}s that do not extends {@link ComposablePredicate}, you should have a
	 * look on {@link Predicates#or(Predicate...)}.
	 * 
	 * @param other the other component to or-compose.
	 * @return a new {@link ComposablePredicate} evaluating to {@code true} if {@code this} or {@code other} evaluates
	 *         to {@code true}.
	 */
	public ComposablePredicate<T> or(ComposablePredicate<? super T> other) {
		return new Or<T>(this.concat(Preconditions.checkNotNull(other)));
	}

	private static class Or<T> extends ComposablePredicate<T> {
		List<ComposablePredicate<? super T>> components;

		Or(List<ComposablePredicate<? super T>> components) {
			this.components = components; // Skip defensive copy (private)
		}

		public boolean apply(T c) {
			for (ComposablePredicate<? super T> predicate : this.components) {
				if (predicate.apply(c)) {
					return true;
				}
			}
			return false;
		}

		@Override
		public ComposablePredicate<T> or(ComposablePredicate<? super T> other) {
			List<ComposablePredicate<? super T>> newComponents = Lists.newArrayList(this.components);
			newComponents.add(Preconditions.checkNotNull(other));
			return new Or<T>(newComponents);
		}
	}

	/**
	 * Returns a new {@link ComposablePredicate} evaluating to {@code true} if it contains an odd number of components
	 * evaluating to {@code true}.
	 * 
	 * @param other the other component to xor-compose.
	 * @return a new {@link ComposablePredicate} evaluating to {@code true} if {@code this} or {@code other} evaluates
	 *         to {@code true}, but not the twice.
	 */
	public ComposablePredicate<T> xor(ComposablePredicate<? super T> other) {
		return new Xor<T>(this.concat(Preconditions.checkNotNull(other)));
	}

	private static class Xor<T> extends ComposablePredicate<T> {
		List<ComposablePredicate<? super T>> components;

		Xor(List<ComposablePredicate<? super T>> components) {
			this.components = components; // Skip defensive copy (private)
		}

		public boolean apply(T c) {
			int truth = 0;
			for (ComposablePredicate<? super T> predicate : this.components) {
				if (predicate.apply(c)) {
					truth ^= 1;
				}
			}
			return truth == 1;
		}

		@Override
		public ComposablePredicate<T> xor(ComposablePredicate<? super T> other) {
			List<ComposablePredicate<? super T>> newComponents = Lists.newArrayList(this.components);
			newComponents.add(Preconditions.checkNotNull(other));
			return new Xor<T>(newComponents);
		}
	}

	/**
	 * Returns a new {@link Predicate} being the negation of this predicate, i.e., the returned predicate will evaluate
	 * to {@code true} when the original one evaluated to {@code false} and to {@code false} when it evaluated to
	 * {@code true}.
	 * 
	 * @return the negation of this predicate.
	 */
	public ComposablePredicate<T> negate() {
		final ComposablePredicate<T> original = this;
		return new ComposablePredicate<T>() {
			public boolean apply(T c) {
				return !original.apply(c);
			}

			@Override
			public ComposablePredicate<T> negate() {
				return original;
			}
		};
	}
}
