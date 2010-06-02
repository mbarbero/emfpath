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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;


/**
 * A search object to find a {@link EAttribute} from an {@link EClass}. The {@link EAttribute} will be search in the
 * whole {@link EClass}'s hierarchy.
 * <p>
 * Usage: <code>EAttributes.from(anEClass).named("xxx")</code>
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.1.0
 */
public final class EAttributes extends EStructuralFeatures {

	private EAttributes(EClass eClass) {
		super(eClass);
	}

	/**
	 * Create an new search object to find {@link EAttribute} from the specified <code>eClass</code>.
	 * 
	 * @param eClass the {@link EClass} to search in.
	 * @return a new search object
	 * @throws IllegalArgumentException if <code>eClass</code> is null
	 * @see EStructuralFeatures#from(EClass)
	 */
	public static EAttributes from(EClass eClass) {
		return new EAttributes(eClass);
	}

	/**
	 * Search for an {@link EAttribute} named <code>featureNamed</code>.
	 * 
	 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
	 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
	 * @throws ClassCastException if the {@link EStructuralFeature} named <code>featureName</code> is an
	 *         {@link EReference} and not an {@link EAttribute}
	 * @see org.eclipselabs.emfpath.internal.i18n.utils.EStructuralFeatures#named(java.lang.String)
	 */
	@Override
	public EAttribute named(String featureName) throws NoSuchFeatureException {
		EStructuralFeature ret = super.named(featureName);

		if (!(ret instanceof EAttribute)) {
			throw new ClassCastException("The feature named " + featureName + " in " + this.eClass.getName() + " is not an EAttribute");
		}

		return (EAttribute) ret;
	}
}
