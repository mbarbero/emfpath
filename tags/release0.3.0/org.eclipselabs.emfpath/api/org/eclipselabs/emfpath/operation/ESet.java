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

import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public abstract class ESet {

	private static final Object EMPTY_VALUE = new Object();

	/**
	 * 
	 */
	Object value = ESet.EMPTY_VALUE;

	/**
	 * 
	 */
	ESet() {
		// Do nothing
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public static ESet feature(String eStructuralFeatureName) {
		Preconditions.checkNotNull(eStructuralFeatureName);
		Preconditions.checkArgument(!eStructuralFeatureName.equals(""));

		return new ESetWithFeatureName(eStructuralFeatureName);
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public static ESet feature(EStructuralFeature eStructuralFeature) {
		Preconditions.checkNotNull(eStructuralFeature);

		return new ESetWithEStructuralFeature(eStructuralFeature);
	}

	/**
	 * @param newValue
	 * @return
	 */
	public Function withValue(Object newValue) {
		this.value = newValue;
		return (Function) this;
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 */
	public abstract static class Function extends ESet implements com.google.common.base.Function<EObject, EObject> {
		/**
		 * @param of
		 * @return
		 */
		public EObject of(EObject of) {
			return this.apply(of);
		}
	}

	private static final class ESetWithFeatureName extends Function {
		private final String eStructuralFeatureName;

		public ESetWithFeatureName(String eStructuralFeatureName) {
			this.eStructuralFeatureName = eStructuralFeatureName;
		}

		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);
			EStructuralFeature eStructuralFeature = CommonCheck.getFeatureAndRedirectToRuntimeExceptions(this.eStructuralFeatureName, from
				.eClass());
			from.eSet(eStructuralFeature, this.value);
			return from;
		}

	}

	private static final class ESetWithEStructuralFeature extends Function {
		private final EStructuralFeature eStructuralFeature;

		public ESetWithEStructuralFeature(EStructuralFeature eStructuralFeature) {
			this.eStructuralFeature = eStructuralFeature;
		}

		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);

			CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, from.eClass());

			from.eSet(this.eStructuralFeature, this.value);
			return from;
		}

	}

}
