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
package org.eclipselabs.emfpath.function;

import static org.eclipselabs.emfpath.function.EObjects.descendant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emfpath.predicate.IsKind;
import org.eclipselabs.emfpath.predicate.IsType;
import org.eclipselabs.emfpath.util.Resources;

import com.google.common.collect.Iterables;

/**
 * <p>
 * <code>
 * Iterable<EObject> allNamedElement = AllInstances.ofKind(myEClassOfNamedElement).in(aResource);
 * Multimap<EClass, EObject> index = Multimaps.index(allNull, EObjects.eClass);
 * </code>
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3.0
 */
public abstract class AllInstances {

	private EClass eClass;

	/**
	 * @param eClass
	 * @return
	 */
	public static AllInstances ofKind(EClass eClass) {
		AllInstances ret = new OfKind();
		ret.setEClass(eClass);
		return ret;
	}

	/**
	 * @param eClass
	 * @return
	 */
	public static AllInstances ofType(EClass eClass) {
		AllInstances ret = new OfType();
		ret.setEClass(eClass);
		return ret;
	}

	/**
	 * @param resource
	 * @return
	 */
	public abstract Iterable<EObject> in(Resource resource);

	/**
	 * @param eObject
	 * @return
	 */
	public abstract Iterable<EObject> in(EObject eObject);

	/**
	 * @return the eClass
	 */
	protected EClass getEClass() {
		return this.eClass;
	}

	/**
	 * @param eClass the eClass to set
	 */
	protected void setEClass(EClass eClass) {
		this.eClass = eClass;
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 */
	static class OfKind extends AllInstances {

		/**
		 * @see org.eclipselabs.emfpath.function.AllInstances#in(org.eclipse.emf.ecore.resource.Resource)
		 */
		@Override
		public Iterable<EObject> in(final Resource resource) {
			return Iterables.filter(Resources.descendant.of(resource), IsKind.of(this.getEClass()));
		}

		/**
		 * @see org.eclipselabs.emfpath.function.AllInstances#in(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public Iterable<EObject> in(EObject eObject) {
			return Iterables.filter(descendant.of(eObject), IsKind.of(this.getEClass()));
		}
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 */
	static class OfType extends AllInstances {

		/**
		 * @see org.eclipselabs.emfpath.function.AllInstances#in(org.eclipse.emf.ecore.resource.Resource)
		 */
		@Override
		public Iterable<EObject> in(final Resource resource) {
			return Iterables.filter(Resources.descendant.of(resource), IsType.of(this.getEClass()));
		}

		/**
		 * @see org.eclipselabs.emfpath.function.AllInstances#in(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public Iterable<EObject> in(EObject eObject) {
			return Iterables.filter(descendant.of(eObject), IsType.of(this.getEClass()));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
