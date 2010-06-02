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
 * A search object to find a {@link EReference} from an {@link EClass}. The {@link EReference} will be search in the
 * whole {@link EClass}'s hierarchy.
 * <p>
 * Usage: <code>EReferences.from(anEClass).named("xxx")</code>
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.1.0
 */
public final class EReferences extends EStructuralFeatures {

	private EReferences(EClass eClass) {
		super(eClass);
	}

	/**
	 * Create an new search object to find {@link EReference} from the specified <code>eClass</code>.
	 * 
	 * @param eClass the {@link EClass} to search in.
	 * @return a new search object
	 * @throws IllegalArgumentException if <code>eClass</code> is null
	 * @see EStructuralFeatures#from(EClass)
	 */
	public static EReferences from(EClass eClass) {
		return new EReferences(eClass);
	}

	/**
	 * Search for a {@link EReference} with the given <code>name</code>.
	 * 
	 * @param featureName the name of the searched {@link EReference}
	 * @return the feature with the search name.
	 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
	 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
	 * @throws ClassCastException if the {@link EStructuralFeature} named <code>featureName</code> is an
	 *         {@link EAttribute} and not an {@link EReference}
	 * @see org.eclipselabs.emfpath.internal.i18n.utils.EStructuralFeatures#named(java.lang.String)
	 */
	@Override
	public EReference named(String featureName) throws NoSuchFeatureException {
		EStructuralFeature ret = super.named(featureName);

		if (!(ret instanceof EReference)) {
			throw new ClassCastException("The feature named " + featureName + " in " + this.eClass.getName() + " is not an EReference");
		}

		return (EReference) ret;
	}
}
