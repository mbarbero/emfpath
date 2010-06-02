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
package org.eclipselabs.emfpath.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.base.EStructuralFeatures;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public class CommonCheck {

	/**
	 * @param eStructuralFeature
	 * @param eClass
	 */
	public static void checkFeatureContainedInClassFeatureList(EStructuralFeature eStructuralFeature, EClass eClass) {
		if (!eClass.getEAllStructuralFeatures().contains(eStructuralFeature)) {
			throw new IllegalArgumentException(new NoSuchFeatureException(eStructuralFeature, eClass));
		}
	}

	/**
	 * @param eStructuralFeatureName
	 * @param eClass
	 * @return
	 */
	public static EStructuralFeature getFeatureAndRedirectToRuntimeExceptions(String eStructuralFeatureName, EClass eClass) {
		try {
			return EStructuralFeatures.from(eClass).named(eStructuralFeatureName);
		} catch (NoSuchFeatureException e) {
			throw new IllegalArgumentException(e);
		}
	}
}
