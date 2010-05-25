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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.indie.util.ComposablePredicate;
import org.eclipselabs.emfpath.util.EStructuralFeatures;

import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public class EIsSet extends ComposablePredicate<EObject> {

	private String eStructuralFeatureName;

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public static EIsSet feature(String eStructuralFeatureName) {
		Preconditions.checkNotNull(eStructuralFeatureName);
		Preconditions.checkState(!eStructuralFeatureName.equals(""));

		EIsSet ret = new EIsSet();
		ret.eStructuralFeatureName = eStructuralFeatureName;
		return ret;
	}

	private EIsSet() {
		// Do nothing
	}

	/**
	 * @param from
	 * @return
	 */
	public boolean of(EObject from) {
		return this.apply(from);
	}

	public boolean apply(EObject from) {
		Preconditions.checkNotNull(from);

		EClass eClass = from.eClass();
		EStructuralFeature eStructuralFeature;
		try {
			eStructuralFeature = EStructuralFeatures.from(eClass).named(this.eStructuralFeatureName);
		} catch (NoSuchFeatureException e) {
			throw new IllegalArgumentException(e);
		}

		return from.eIsSet(eStructuralFeature);
	}
}
