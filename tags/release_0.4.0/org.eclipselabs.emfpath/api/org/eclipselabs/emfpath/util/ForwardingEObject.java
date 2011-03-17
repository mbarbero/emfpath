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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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

	private static final String E_INVOKE = "eInvoke"; //$NON-NLS-1$

	/**
	 * @param operation
	 * @param arguments
	 * @return
	 * @throws InvocationTargetException
	 * @see EObject#eInvoke(EOperation, EList<?> )
	 */
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		Method method;
		try {
			method = this.delegate().getClass().getMethod(ForwardingEObject.E_INVOKE, EOperation.class, EList.class);
		} catch (SecurityException e) {
			throw new InvocationTargetException(e,
				"You can not call ForwardingEObject#eInvoke(EOperation, EList<?>). The caller's class loader ("
					+ this.getClass().getClassLoader() + ") is not the same as or an ancestor of the class loader ("
					+ this.delegate().getClass().getClassLoader()
					+ ") for the current class and invocation of s.checkPackageAccess() denies access to the package of this class ");
		} catch (NoSuchMethodException e) {
			throw new InvocationTargetException(e,
			"The eInvoke is available only since EMF 2.6. You should check the version of the EMF runtime you are executing this code on");
		}

		try {
			if (method == null) {
				throw new InvocationTargetException(
					new NullPointerException(
					"This is a bug in ForwardingEObject#eInvoke(EOperation, EList<?>) implementation. You may want to tell it to the authors by filling a bug @ http://code.google.com/a/eclipselabs.org/p/emfpath/issues/entry"));
			}
			return method.invoke(this.delegate(), operation, arguments);
		} catch (IllegalArgumentException e) {
			throw new InvocationTargetException(
				e,
			"This is a bug in ForwardingEObject#eInvoke(EOperation, EList<?>) implementation. You may want to tell it to the authors by filling a bug @ http://code.google.com/a/eclipselabs.org/p/emfpath/issues/entry");
		} catch (IllegalAccessException e) {
			throw new InvocationTargetException(
				e,
			"This is a bug in ForwardingEObject#eInvoke(EOperation, EList<?>) implementation. You may want to tell it to the authors by filling a bug @ http://code.google.com/a/eclipselabs.org/p/emfpath/issues/entry");
		}
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
