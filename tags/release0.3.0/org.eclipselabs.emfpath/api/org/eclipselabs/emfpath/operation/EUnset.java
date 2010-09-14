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
package org.eclipselabs.emfpath.operation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.internal.CommonCheck;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public abstract class EUnset implements Function<EObject, EObject> {

	/**
	 * 
	 */
	EUnset() {
		// Do nothing
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public static EUnset feature(String eStructuralFeatureName) {
		Preconditions.checkNotNull(eStructuralFeatureName);
		Preconditions.checkArgument(!eStructuralFeatureName.equals(""));

		return new EUnsetWithFeatureName(eStructuralFeatureName);
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public static EUnset feature(EStructuralFeature eStructuralFeature) {
		Preconditions.checkNotNull(eStructuralFeature);

		return new EUnsetWithEStructuralFeature(eStructuralFeature);
	}

	/**
	 * @param of
	 * @return
	 */
	public EObject of(EObject of) {
		return this.apply(of);
	}

	private static final class EUnsetWithFeatureName extends EUnset {
		private final String eStructuralFeatureName;

		public EUnsetWithFeatureName(String eStructuralFeatureName) {
			this.eStructuralFeatureName = eStructuralFeatureName;
		}

		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);
			EStructuralFeature eStructuralFeature = CommonCheck.getFeatureAndRedirectToRuntimeExceptions(this.eStructuralFeatureName, from
				.eClass());
			from.eUnset(eStructuralFeature);
			return from;
		}

	}

	private static final class EUnsetWithEStructuralFeature extends EUnset {
		private final EStructuralFeature eStructuralFeature;

		public EUnsetWithEStructuralFeature(EStructuralFeature eStructuralFeature) {
			this.eStructuralFeature = eStructuralFeature;
		}

		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);

			CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, from.eClass());

			from.eUnset(this.eStructuralFeature);
			return from;
		}
	}

}
