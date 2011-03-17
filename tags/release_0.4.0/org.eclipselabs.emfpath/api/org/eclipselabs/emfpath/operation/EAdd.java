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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.internal.CommonCheck;
import org.eclipselabs.emfpath.internal.i18n.Messages;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;


/**
 * A function taking an EObject as input and returning the same EObject as output after having added a
 * {@link EAdd#value(Object) value} to the {@link EAdd#toFeature(EStructuralFeature) feature} specified when creating
 * it.
 * <p>
 * Usage:
 * <p>
 * <code>
 * EAdd.toFeature(EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES).value(anEStructuralFeatureObject).of(anEObject);
 * </code>
 * <p>
 * As a {@link Function function}, it can be used to transform an {@link Iterable iterable} or {@link Iterator iterator}
 * with {@link Iterables#transform(Iterable, Function)} or {@link Iterators#transform(Iterator, Function)}
 * <p>
 * Usage:
 * <p>
 * <code>
 * EAdd eAdd = EAdd.toFeature(EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES).value(anEStructuralFeatureObject);<br/>
 * Iterables<EObject> res = Iterables.transform(anEClassIterable, eAdd);
 * </code>
 * <p>
 * In the previous example, <code>res</code> and <code>anEClassIterable</code> are two different iterables which can
 * iterate on the same set of value.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.1.0
 */
public abstract class EAdd {

	/**
	 * The value to add
	 */
	protected Object value;

	/**
	 * Default constructor
	 */
	protected EAdd() {
		// do nothing
	}

	/**
	 * Instantiates and return a {@link EAdd} function that will be able to add a value to the
	 * {@link EStructuralFeature feature} named <code>eStructuralFeature</code>. The corresponding
	 * {@link EStructuralFeature feature} must be {@link EStructuralFeature#isMany() many valued}.
	 * <p>
	 * Note that if you are applying this {@link Function} to an {@link Iterable} the corresponding
	 * {@link EStructuralFeature feature} will be retrieved for each element of this {@link Iterable}. This can lead to
	 * an undesired performance overhead.
	 * <p>
	 * Instead, you should use the {@link EAdd#toFeature(EStructuralFeature)} static method to avoid this repeated
	 * retrieving.
	 * 
	 * @param eStructuralFeatureName the name of the {@link EStructuralFeature feature} to which we will add an object
	 * @return a function on which you have to call {@link EAdd#value(Object)} method to specify the value to add to the
	 *         {@link EStructuralFeature feature} named {@code eStructuralFeature}
	 * @throws IllegalArgumentException if {@code eStructuralFeatureName} is null or an empty {@link String}
	 * @since 0.1.0
	 */
	public static EAdd toFeature(String eStructuralFeatureName) {
		Preconditions.checkArgument((eStructuralFeatureName != null) && (eStructuralFeatureName.length() != 0), Messages
			.getString("EAdd.0")); //$NON-NLS-1$

		return new Function.WithFeatureName(eStructuralFeatureName);
	}

	/**
	 * Instantiates and return a {@link EAdd} function that will be able to add a value to the
	 * {@link EStructuralFeature eStructuralFeature}. This {@link EStructuralFeature feature} must be
	 * {@link EStructuralFeature#isMany() many valued}.
	 * <p>
	 * Note that if you are applying this {@link Function} to an {@link Iterable}, all the {@link EObject} in this
	 * {@link Iterable} must have this very {@link EStructuralFeature feature}
	 * {@link EClass#getEAllStructuralFeatures() owned by their EClass}. For instance, if two objects {@code a} and
	 * {@code b} both have a {@link EStructuralFeature feature} named {@code contents} from two distinct class, the
	 * result of applying this function with the feature from {@code a.eClass()} or {@code b.eClass()} is undetermined.
	 * 
	 * @param eStructuralFeature the {@link EStructuralFeature feature} to which we will add an object
	 * @return a function on which you have to call {@link EAdd#value(Object)} method to specify the value to add to the
	 *         {@link EStructuralFeature eStructuralFeature}
	 * @throws IllegalArgumentException if {@code eStructuralFeature} is null.
	 * @throws IllegalArgumentException if {@code eStructuralFeature} is not {@link EStructuralFeature#isMany() many
	 *         valued}.
	 * @since 0.1.0
	 */
	public static EAdd toFeature(EStructuralFeature eStructuralFeature) {
		Preconditions.checkArgument(eStructuralFeature != null, Messages.getString("EAdd.1")); //$NON-NLS-1$
		Preconditions.checkArgument(eStructuralFeature.isMany(), Messages.getString("EAdd.2")); //$NON-NLS-1$

		return new Function.WithEStructuralFeature(eStructuralFeature);
	}

	/**
	 * Configure this object to add the {@code newValue} to the {@link EStructuralFeature feature} of the
	 * {@link EObject} on which this {@link Function function} will be applied.
	 * 
	 * @param newValue the value to add to the {@link EStructuralFeature feature} as specified by the static generator
	 *        methods.
	 * @return this object to allow chained calls.
	 * @since 0.1.0
	 */
	public Function value(Object newValue) {
		this.value = newValue;
		return (Function) this;
	}

	/**
	 * Abstract class with synonym caller to apply.
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 */
	public abstract static class Function extends EAdd implements com.google.common.base.Function<EObject, EObject> {

		/**
		 * A synonym of apply.
		 * 
		 * @param to the {@link EObject} on which this {@link Function function} applies.
		 * @return the same {@link EObject} after the value have been added to one of its feature.
		 * @since 0.1.0
		 */
		public EObject of(EObject to) {
			return this.apply(to);
		}

		/**
		 * Applies this function to the specified {@link EObject eObject}.
		 * <p>
		 * The {@link EAdd#value(Object)} method must have been called before this one
		 * 
		 * @param eObject the {@link EObject} on which this {@link Function function} applies.
		 * @return the same {@link EObject} after the value have been added to one of its feature.
		 * @throws IllegalArgumentException if this {@link EAdd} object has been created by the static generator
		 *         {@link EAdd#toFeature(String)} and that the corresponding {@link EStructuralFeature feature} is not
		 *         {@link EStructuralFeature#isMany() many-valued}.
		 * @since 0.1.0
		 */
		public abstract EObject apply(EObject eObject);

		private static final class WithFeatureName extends Function {

			private final String eStructuralFeatureName;

			public WithFeatureName(String eStructuralFeatureName) {
				this.eStructuralFeatureName = eStructuralFeatureName;
			}

			@Override
			@SuppressWarnings("unchecked")
			public EObject apply(EObject from) {
				Preconditions.checkArgument(from != null, Messages.getString("EAdd.3")); //$NON-NLS-1$

				EStructuralFeature eStructuralFeature = CommonCheck.getFeatureAndRedirectToRuntimeExceptions(this.eStructuralFeatureName,
					from.eClass());

				if (!eStructuralFeature.isMany()) {
					throw new IllegalArgumentException(Messages.getString("EAdd.9", this.eStructuralFeatureName)); //$NON-NLS-1$
				}

				((List<? super Object>) from.eGet(eStructuralFeature)).add(this.value);
				return from;
			}
		}

		private static final class WithEStructuralFeature extends Function {

			private final EStructuralFeature eStructuralFeature;

			public WithEStructuralFeature(EStructuralFeature eStructuralFeature) {
				this.eStructuralFeature = eStructuralFeature;
			}

			@Override
			@SuppressWarnings("unchecked")
			public EObject apply(EObject from) {
				Preconditions.checkArgument(from != null, Messages.getString("EAdd.7")); //$NON-NLS-1$

				CommonCheck.checkFeatureContainedInClassFeatureList(this.eStructuralFeature, from.eClass());

				((List<? super Object>) from.eGet(this.eStructuralFeature)).add(this.value);
				return from;
			}

		}
	}
}
