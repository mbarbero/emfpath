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
package org.eclipselabs.emfpath.ecore.exception;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.exception.EMFPathException;
import org.eclipselabs.emfpath.ecore.internal.i18n.Messages;


/**
 * A exception that occurs when a {@link EStructuralFeature} is not found in an {@link EClass} or its
 * {@link EClass#getEAllSuperTypes() superclasses}.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public class NoSuchFeatureException extends EMFPathException {

	private static final long serialVersionUID = 5434078333436921611L;

	/**
	 * Creates a new exception meaning that the {@link EStructuralFeature} with name <code>featureName</code> cannot be
	 * found in the {@link EClass} <code>fromEClass</code>.
	 * 
	 * @param featureName the name of the feature that cannot be found
	 * @param fromEClass the EClass in which the {@link EStructuralFeature} with name <code>featureName</code> cannot be
	 *        found.
	 */
	public NoSuchFeatureException(String featureName, EClass fromEClass) {
		super(Messages.getString("NoSuchFeatureException.0", featureName, fromEClass.getName())); //$NON-NLS-1$
	}

	/**
	 * Creates a new exception meaning that the <code>eStructuralFeature</code> doesn't belong to the
	 * {@link EClass#getEAllStructuralFeatures()} of <code>fromEClass</code>.
	 * 
	 * @param eStructuralFeature the feature that cannot be found.
	 * @param fromEclass the EClass in which the {@link EStructuralFeature} cannot be found.
	 */
	public NoSuchFeatureException(EStructuralFeature eStructuralFeature, EClass fromEclass) {
		this(eStructuralFeature.getName(), fromEclass);
	}
}
