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

import org.eclipselabs.emfpath.indie.util.ComposablePredicate;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 * @since 0.3
 */
public class Greater<T extends Comparable<T>> extends ComposablePredicate<T> {

	/**
	 * @param <X>
	 * @param value
	 * @return
	 */
	public static <X extends Comparable<X>> Greater<X> than(X value) {
		return new Greater<X>(value);
	}

	private final T value;

	private Greater(T value) {
		this.value = value;
	}

	public boolean apply(T input) {
		return (input.compareTo(this.value) > 0);
	}
}
