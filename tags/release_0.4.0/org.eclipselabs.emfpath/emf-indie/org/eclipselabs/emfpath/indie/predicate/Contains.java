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
package org.eclipselabs.emfpath.indie.predicate;

import java.util.Iterator;

import org.eclipselabs.emfpath.indie.util.ComposablePredicate;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public abstract class Contains extends ComposablePredicate<Iterable<?>> {

	/**
	 * @param n
	 * @return
	 */
	public static Contains atMost(int n) {
		return new ContainsAtMost(n);
	}

	/**
	 * @param n
	 * @return
	 */
	public static Contains atLeast(int n) {
		return new ContainsAtLeast(n);
	}

	/**
	 * @param input
	 * @return
	 */
	public boolean elementsIn(Iterable<?> input) {
		return this.apply(input);
	}

	private static final class ContainsAtMost extends Contains {
		int n;

		public ContainsAtMost(int n2) {
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
		int n;

		public ContainsAtLeast(int n) {
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
