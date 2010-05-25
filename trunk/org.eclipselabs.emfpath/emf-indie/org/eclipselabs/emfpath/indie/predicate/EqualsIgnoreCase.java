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

import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public class EqualsIgnoreCase extends ComposablePredicate<String> {

	private final String other;

	private EqualsIgnoreCase(String other) {
		this.other = other;
	}

	/**
	 * @param other
	 * @return
	 */
	public static EqualsIgnoreCase to(String other) {
		Preconditions.checkNotNull(other);
		return new EqualsIgnoreCase(other);
	}

	public boolean apply(String input) {
		Preconditions.checkNotNull(input);
		return input.equalsIgnoreCase(this.other);
	}
}
