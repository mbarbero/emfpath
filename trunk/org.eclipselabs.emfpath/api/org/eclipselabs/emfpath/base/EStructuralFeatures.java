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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.internal.i18n.Messages;

import com.google.common.base.Preconditions;

/**
 * A search object to find a {@link EStructuralFeature} from an {@link EClass}. The {@link EStructuralFeature} will be
 * search in the whole {@link EClass}'s hierarchy.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public class EStructuralFeatures {

	/**
	 * The EClass where the feature will be search in.
	 */
	protected EClass eClass;

	/**
	 * Construct a new search object
	 * 
	 * @param eClass the EClass where the feature will be search in.
	 */
	protected EStructuralFeatures(EClass eClass) {
		this.eClass = eClass;
	}

	/**
	 * Create an new search object to find {@link EStructuralFeature} from the specified <code>eClass</code>.
	 * 
	 * @param eClass the {@link EClass} to search in.
	 * @return a new search object
	 * @throws IllegalArgumentException if <code>eClass</code> is null
	 */
	public static EStructuralFeatures from(EClass eClass) {
		Preconditions.checkArgument(eClass != null, Messages.getString("EStructuralFeatures.0")); //$NON-NLS-1$
		return new EStructuralFeatures(eClass);
	}

	/**
	 * Search for a {@link EStructuralFeature} with the given <code>name</code>.
	 * 
	 * @param featureName the name of the searched {@link EStructuralFeature}
	 * @return the feature with the search name.
	 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
	 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
	 */
	public EStructuralFeature named(String featureName) throws NoSuchFeatureException {
		Preconditions.checkArgument((featureName != null) && (featureName.length() > 0), Messages.getString("EStructuralFeatures.3")); //$NON-NLS-1$

		EStructuralFeature ret = this.eClass.getEStructuralFeature(featureName);
		if (ret == null) {
			throw new NoSuchFeatureException(featureName, this.eClass);
		}

		return ret;
	}
}
