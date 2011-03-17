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
package org.eclipselabs.emfpath.predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emfpath.indie.util.ComposablePredicate;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public class IsAncestor extends ComposablePredicate<EObject> {

	private final EObject of;

	private IsAncestor(EObject of) {
		this.of = of;
	}

	/**
	 * @param of
	 * @return
	 */
	public static IsAncestor of(EObject of) {
		return new IsAncestor(of);
	}

	public boolean apply(EObject input) {
		return EcoreUtil.isAncestor(input, this.of);
	}
}
