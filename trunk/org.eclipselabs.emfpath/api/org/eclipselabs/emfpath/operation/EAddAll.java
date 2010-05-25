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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.internal.CommonCheck;

import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.1.0
 */
public abstract class EAddAll {

	/**
	 * 
	 */
	Collection<?> values;

	/**
	 * 
	 */
	EAddAll() {
		// Do nothing
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public static EAddAll toFeature(String eStructuralFeatureName) {
		Preconditions.checkArgument((eStructuralFeatureName != null) && (eStructuralFeatureName.length() > 0),
		"Cannot add a collection of value to an EStructuralFeature with a null or empty name");

		return new EAddAllWithFeatureName(eStructuralFeatureName);
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public static EAddAll toFeature(EStructuralFeature eStructuralFeature) {
		Preconditions.checkArgument(eStructuralFeature != null, "Cannot add a collection of value to a null EStructuralFeature");
		Preconditions.checkArgument(eStructuralFeature.isMany(), "Cannot add a collection of values to the EStructuralFeature "
			+ eStructuralFeature + ". It is not multivalued.");

		return new EAddWithEStructuralFeature(eStructuralFeature);
	}

	/**
	 * @param newValues
	 * @return
	 */
	public Function values(Collection<?> newValues) {
		this.values = newValues;
		return (Function) this;
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 */
	public static abstract class Function extends EAddAll implements com.google.common.base.Function<EObject, EObject> {

		/**
		 * @param of
		 * @return
		 */
		public EObject of(EObject of) {
			return this.apply(of);
		}

	}

	private static final class EAddAllWithFeatureName extends Function {
		private final String eStructuralFeatureName;

		public EAddAllWithFeatureName(String eStructuralFeatureName) {
			this.eStructuralFeatureName = eStructuralFeatureName;
		}

		@SuppressWarnings("unchecked")
		public EObject apply(EObject from) {
			Preconditions.checkArgument(from != null, "Cannot add a collection of values to an EStructuralFeature of a null EObject");

			EStructuralFeature eStructuralFeature = CommonCheck.getFeatureAndRedirectToRuntimeExceptions(this.eStructuralFeatureName, from
				.eClass());

			if (!eStructuralFeature.isMany()) {
				throw new IllegalArgumentException("Cannot add a collection of values to the EStructuralFeature " + eStructuralFeature
					+ " of " + from.eClass().getName() + ". It is not multivalued.");
			}

			((List<? super Object>) from.eGet(eStructuralFeature)).addAll(this.values);
			return from;
		}
	}

	private static final class EAddWithEStructuralFeature extends Function {
		private final EStructuralFeature eStructuralFeature;

		public EAddWithEStructuralFeature(EStructuralFeature eStructuralFeature) {
			this.eStructuralFeature = eStructuralFeature;
		}

		@SuppressWarnings("unchecked")
		public EObject apply(EObject from) {
			Preconditions.checkArgument(from != null, "Cannot add a collection of values to an EStructuralFeature of a null EObject");

			CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, from.eClass());

			((List<? super Object>) from.eGet(this.eStructuralFeature)).addAll(this.values);
			return from;
		}
	}

}
