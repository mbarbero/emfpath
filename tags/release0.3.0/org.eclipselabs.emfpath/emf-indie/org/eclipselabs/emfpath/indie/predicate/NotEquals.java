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

import com.google.common.base.Objects;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 * @since 0.3
 */
public class NotEquals<T> extends ComposablePredicate<T> {

	private final T other;

	private NotEquals(T other) {
		this.other = other;
	}

	/**
	 * @param <X>
	 * @param other
	 * @return
	 */
	public static <X> NotEquals<X> to(X other) {
		return new NotEquals<X>(other);
	}

	public boolean apply(T input) {
		return !Objects.equal(this.other, input);
	}
}
