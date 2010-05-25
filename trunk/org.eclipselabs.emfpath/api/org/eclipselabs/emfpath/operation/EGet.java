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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.internal.CommonCheck;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 * @since 0.1.0
 */
public abstract class EGet<T> implements Function<EObject, T> {

	/**
	 * 
	 */
	EGet() {
		// Do nothing
	}

	/**
	 * @param <E>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public static <E> EGet<E> feature(String eStructuralFeatureName) {
		Preconditions.checkNotNull(eStructuralFeatureName);
		Preconditions.checkArgument(!eStructuralFeatureName.equals(""));

		return new EGetWithFeatureName<E>(eStructuralFeatureName);
	}

	/**
	 * @param <E>
	 * @param eStructuralFeature
	 * @return
	 */
	public static <E> EGet<E> feature(EStructuralFeature eStructuralFeature) {
		Preconditions.checkNotNull(eStructuralFeature);

		return new EGetWithEStructuralFeature<E>(eStructuralFeature);
	}

	/**
	 * @param of
	 * @return
	 */
	public T of(EObject of) {
		return this.apply(of);
	}

	private static final class EGetWithFeatureName<T> extends EGet<T> {
		private final String eStructuralFeatureName;

		public EGetWithFeatureName(String eStructuralFeatureName) {
			this.eStructuralFeatureName = eStructuralFeatureName;
		}

		@SuppressWarnings("unchecked")
		public T apply(EObject from) {
			Preconditions.checkNotNull(from);

			EClass eClass = from.eClass();
			EStructuralFeature eStructuralFeature = CommonCheck.getFeatureAndRedirectToRuntimeExceptions(this.eStructuralFeatureName,
				eClass);

			return (T) from.eGet(eStructuralFeature);
		}
	}

	private static final class EGetWithEStructuralFeature<T> extends EGet<T> {
		private final EStructuralFeature eStructuralFeature;

		public EGetWithEStructuralFeature(EStructuralFeature eStructuralFeature) {
			this.eStructuralFeature = eStructuralFeature;
		}

		@SuppressWarnings("unchecked")
		public T apply(EObject from) {
			Preconditions.checkNotNull(from);

			CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, from.eClass());

			return (T) from.eGet(this.eStructuralFeature);
		}
	}
}
