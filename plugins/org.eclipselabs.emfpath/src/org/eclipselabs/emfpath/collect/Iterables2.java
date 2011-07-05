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

import java.util.Iterator;

import com.google.common.base.Predicate;

/**
 * @author mbarbero
 *
 */
public final class Iterables2 {

	private Iterables2() {
		// prevents instantiation
	}

	/**
	 * @param n
	 * @return
	 */
	public static Contains containsAtMost(int n) {
		return new ContainsAtMost(n);
	}

	/**
	 * @param n
	 * @return
	 */
	public static Contains containsAtLeast(int n) {
		return new ContainsAtLeast(n);
	}

	/**
	 * @author mbarbero
	 */
	public static abstract class Contains implements Predicate<Iterable<?>> {
		/**
		 * @param input
		 * @return
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		public boolean elementsIn(Iterable<?> input) {
			return this.apply(input);
		}
	}

	private static final class ContainsAtMost extends Contains {
		private final int n;

		ContainsAtMost(int n2) {
			this.n = n2;
		}

		public boolean apply(Iterable<?> input) {
			int count = 0;
			Iterator<?> iterator = input.iterator();
			while (iterator.hasNext()) {
				count++;
				if (count >= this.n) {
					return false;
				}
				iterator.next();
			}

			return true;
		}
	}

	private static final class ContainsAtLeast extends Contains {
		private final int n;

		ContainsAtLeast(int n) {
			this.n = n;
		}

		public boolean apply(Iterable<?> input) {
			int count = 0;
			Iterator<?> iterator = input.iterator();
			while (iterator.hasNext()) {
				count++;
				if (count >= this.n) {
					return true;
				}
				iterator.next();
			}

			return false;
		}
	}
}
