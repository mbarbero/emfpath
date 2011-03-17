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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.base.EClasses;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.indie.util.ComposablePredicate;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 * @since 0.1.0
 */
public abstract class IsKind<T extends EObject> extends ComposablePredicate<T> {

	/**
	 * @param <T>
	 * @param eClass
	 * @return
	 */
	public static <T extends EObject> IsKind<T> of(EClass eClass) {
		return new IsKindOfWithEClass<T>(eClass);
	}

	/**
	 * @param <T>
	 * @param eClassName
	 * @return
	 */
	public static <T extends EObject> IsKind<T> of(String eClassName) {
		return new IsKindOfWithEClassName<T>(eClassName);
	}

	/**
	 * 
	 */
	IsKind() {
		// prevent instantiation
	}

	private static final class IsKindOfWithEClass<T extends EObject> extends IsKind<T> {

		private final EClass eClass;

		IsKindOfWithEClass(EClass eClass) {
			this.eClass = eClass;
		}

		public boolean apply(T input) {
			EClass inputEClass = input.eClass();
			return ((inputEClass == this.eClass) || inputEClass.getEAllSuperTypes().contains(this.eClass));
		}
	}

	private static final class IsKindOfWithEClassName<T extends EObject> extends IsKind<T> {

		private final String eClassName;

		IsKindOfWithEClassName(String eClassName) {
			this.eClassName = eClassName;
		}

		public boolean apply(T input) {
			EClass of;
			try {
				of = EClasses.from(input.eClass().getEPackage()).forName(this.eClassName);
			} catch (NotFoundException e) {
				throw new IllegalArgumentException(e);
			}
			EClass inputEClass = input.eClass();
			return ((inputEClass == of) || inputEClass.getEAllSuperTypes().contains(of));
		}
	}

}
