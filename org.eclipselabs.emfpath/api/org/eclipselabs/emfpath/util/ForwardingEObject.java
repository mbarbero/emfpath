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
package org.eclipselabs.emfpath.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.ForwardingObject;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public abstract class ForwardingEObject extends ForwardingObject implements EObject {

	@Override
	protected abstract EObject delegate();

	public TreeIterator<EObject> eAllContents() {
		return this.delegate().eAllContents();
	}

	public EClass eClass() {
		return this.delegate().eClass();
	}

	public EObject eContainer() {
		return this.delegate().eContainer();
	}

	public EStructuralFeature eContainingFeature() {
		return this.delegate().eContainingFeature();
	}

	public EReference eContainmentFeature() {
		return this.delegate().eContainmentFeature();
	}

	public EList<EObject> eContents() {
		return this.delegate().eContents();
	}

	public EList<EObject> eCrossReferences() {
		return this.delegate().eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return this.delegate().eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return this.delegate().eGet(feature, resolve);
	}

	public boolean eIsProxy() {
		return this.delegate().eIsProxy();
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return this.delegate().eIsSet(feature);
	}

	public Resource eResource() {
		return this.delegate().eResource();
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		this.delegate().eSet(feature, newValue);
	}

	public void eUnset(EStructuralFeature feature) {
		this.delegate().eUnset(feature);
	}

	public EList<Adapter> eAdapters() {
		return this.delegate().eAdapters();
	}

	public boolean eDeliver() {
		return this.delegate().eDeliver();
	}

	public void eNotify(Notification notification) {
		this.delegate().eNotify(notification);
	}

	public void eSetDeliver(boolean deliver) {
		this.delegate().eSetDeliver(deliver);
	}

	@Override
	public boolean equals(Object object) {
		return (object == this) || this.delegate().equals(object);
	}

	@Override
	public int hashCode() {
		return this.delegate().hashCode();
	}
}
