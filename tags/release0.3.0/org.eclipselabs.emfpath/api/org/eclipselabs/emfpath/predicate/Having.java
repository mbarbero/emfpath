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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.base.EStructuralFeatures;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.indie.util.ComposablePredicate;
import org.eclipselabs.emfpath.internal.CommonCheck;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 * @since 0.1.0
 */
public abstract class Having<T> extends ComposablePredicate<EObject> {

	/**
	 * @param <C>
	 * @param featureName
	 * @param filter
	 * @return
	 */
	public static <C> Having<C> feature(String featureName, Predicate<C> filter) {
		Preconditions.checkNotNull(featureName);
		Preconditions.checkNotNull(filter);
		Preconditions.checkArgument(featureName.length() > 0);

		return new HavingWithFeatureName<C>(featureName, filter);
	}

	/**
	 * @param <C>
	 * @param eStructuralFeature
	 * @param filter
	 * @return
	 */
	public static <C> Having<C> feature(EStructuralFeature eStructuralFeature, Predicate<C> filter) {
		Preconditions.checkNotNull(eStructuralFeature);
		Preconditions.checkNotNull(filter);

		return new HavingWithEStructuralFeature<C>(eStructuralFeature, filter);
	}

	/**
	 * 
	 */
	Having() {
		// prevent instantiation
	}

	private static final class HavingWithFeatureName<T> extends Having<T> {

		private final String featureName;
		private final Predicate<T> filter;

		public HavingWithFeatureName(String featureName, Predicate<T> filter) {
			this.featureName = featureName;
			this.filter = filter;
		}

		@SuppressWarnings("unchecked")
		public boolean apply(EObject input) {
			EStructuralFeature feature;
			try {
				feature = EStructuralFeatures.from(input.eClass()).named(this.featureName);
			} catch (NoSuchFeatureException e) {
				throw new IllegalArgumentException(e);
			}
			return this.filter.apply((T) input.eGet(feature));
		}
	}

	private static final class HavingWithEStructuralFeature<T> extends Having<T> {

		private final EStructuralFeature eStructuralFeature;
		private final Predicate<T> filter;

		public HavingWithEStructuralFeature(EStructuralFeature eStructuralFeature, Predicate<T> filter) {
			this.eStructuralFeature = eStructuralFeature;
			this.filter = filter;
		}

		@SuppressWarnings("unchecked")
		public boolean apply(EObject input) {
			CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, input.eClass());

			return this.filter.apply((T) input.eGet(this.eStructuralFeature));
		}
	}
}
