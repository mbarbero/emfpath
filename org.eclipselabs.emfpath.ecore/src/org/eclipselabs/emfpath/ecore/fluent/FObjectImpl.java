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
package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.collect.FluentCollections;
import org.eclipselabs.emfpath.collect.FluentIterable;

import com.google.common.base.Function;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
final class FObjectImpl<E extends EObject> extends ForwardingEObject implements FObject<E> {

	private final E delegator;

	/**
	 * @see org.eclipselabs.emfpath.util.ForwardingEObject#delegate()
	 */
	protected E delegate() {
		return this.delegator;
	}

	static <E extends EObject> Function<E, FObject<E>> wrapFunction() {
		return new Function<E, FObject<E>>() {
			public FObject<E> apply(E input) {
				return FObjects.create(input);
			}
		};
	}
	
	FObjectImpl(E delegator) {
		this.delegator = delegator;
	}

	/**
	 * @param feature
	 * @return
	 */
	public FProperty fGet(EStructuralFeature feature) {
		return FPropertyImpl.create(this.delegate(), feature);
	}

	/**
	 * @param featureName
	 * @return
	 */
	public FProperty fGet(String featureName) {
		EStructuralFeature eStructuralFeature = this.eClass().getEStructuralFeature(featureName);
		return FPropertyImpl.create(this.delegate(), eStructuralFeature);
	}
	
	public <T> T fGet(Function<? super E, T> function) {
		return function.apply(delegate());
	}
	
	public <T extends EObject> FObject<T> fGetFObject(Function<? super E, T> function) {
		return FObjects.create(function.apply(delegate()));
	}
	
	public <F, T extends Iterable<F>> FluentIterable<F> fGetIterable(Function<? super E, T> function) {
		return FluentCollections.newFluentIterable(function.apply(delegate()));
	}
	
	public <F extends EObject, T extends Iterable<F>> FIterable<F> fGetFIterable(Function<? super E, T> function) {
		return FIterableImpl.create(function.apply(delegate()));
	}
}
