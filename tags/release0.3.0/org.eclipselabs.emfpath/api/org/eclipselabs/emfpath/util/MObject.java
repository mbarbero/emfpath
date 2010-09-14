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

import static org.eclipselabs.emfpath.base.EObjects.ancestor;
import static org.eclipselabs.emfpath.base.EObjects.ancestorOrSelf;
import static org.eclipselabs.emfpath.base.EObjects.child;
import static org.eclipselabs.emfpath.base.EObjects.descendant;
import static org.eclipselabs.emfpath.base.EObjects.descendantOrSelf;
import static org.eclipselabs.emfpath.base.EObjects.following;
import static org.eclipselabs.emfpath.base.EObjects.followingSibling;
import static org.eclipselabs.emfpath.base.EObjects.parent;
import static org.eclipselabs.emfpath.base.EObjects.preceding;
import static org.eclipselabs.emfpath.base.EObjects.precedingSibling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.ExtendedIterable;
import org.eclipselabs.emfpath.operation.EGet;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public final class MObject extends ForwardingEObject {

	private final EObject delegator;

	/**
	 * 
	 */
	public static final Function<EObject, MObject> EOBJECT_TO_EEOBJECT = new Function<EObject, MObject>() {
		public MObject apply(EObject from) {
			Preconditions.checkNotNull(from);
			return MObject.adapt(from);
		}
	};

	/**
	 * @param from
	 * @return
	 */
	public static MObject adapt(EObject from) {
		MObject ret = null;
		if (from instanceof MObject) {
			ret = (MObject) from;
		} else {
			ret = new MObject(from);
		}
		return ret;
	}

	private MObject(EObject delegator) {
		this.delegator = delegator;
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> X get(EStructuralFeature eStructuralFeature) {
		return EGet.<X> feature(eStructuralFeature).of(this.delegate());
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> X get(String eStructuralFeatureName) {
		return EGet.<X> feature(eStructuralFeatureName).of(this.delegate());
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public MObject getMObject(EStructuralFeature eStructuralFeature) {
		return MObject.adapt(EGet.<EObject> feature(eStructuralFeature).of(this.delegate()));
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public MObject getMObject(String eStructuralFeatureName) {
		return MObject.adapt(EGet.<EObject> feature(eStructuralFeatureName).of(this.delegate()));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> ExtendedIterable<X> getIterable(EStructuralFeature eStructuralFeature) {
		return ExtendedIterable.adapt(EGet.<Iterable<X>> feature(eStructuralFeature).of(this.delegate()));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> ExtendedIterable<X> getIterable(String eStructuralFeatureName) {
		return ExtendedIterable.adapt(EGet.<Iterable<X>> feature(eStructuralFeatureName).of(this.delegate()));
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public MIterable getMIterable(String eStructuralFeatureName) {
		return MIterable.adapt(EGet.<Iterable<EObject>> feature(eStructuralFeatureName).of(this.delegate()));
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public MIterable getMIterable(EStructuralFeature eStructuralFeature) {
		return MIterable.adapt(EGet.<Iterable<EObject>> feature(eStructuralFeature).of(this.delegate()));
	}

	/**
	 * @return
	 */
	public MIterable ancestor() {
		return MIterable.adapt(ancestor.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable ancestor(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(ancestor.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable ancestorOrSelf() {
		return MIterable.adapt(ancestorOrSelf.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable ancestorOrSelf(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(ancestorOrSelf.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable following() {
		return MIterable.adapt(following.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable following(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(following.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable followingSibling() {
		return MIterable.adapt(followingSibling.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable followingSibling(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(followingSibling.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable preceding() {
		return MIterable.adapt(preceding.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable preceding(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(preceding.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable precedingSibling() {
		return MIterable.adapt(precedingSibling.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable precedingSibling(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(precedingSibling.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MObject parent() {
		return MObject.adapt(parent.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MObject parent(Predicate<? super EObject> predicate) {
		EObject parentOfDelegate = parent.of(this.delegate());
		return MObject.adapt(predicate.apply(parentOfDelegate) ? parentOfDelegate : null);
	}

	/**
	 * @return
	 */
	public MIterable child() {
		return MIterable.adapt(child.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable child(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(child.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable descendant() {
		return MIterable.adapt(descendant.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable descendant(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(descendant.of(this.delegate()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable descendantOrSelf() {
		return MIterable.adapt(descendantOrSelf.of(this.delegate()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable descendantOrSelf(Predicate<? super EObject> predicate) {
		return MIterable.adapt(Iterables.filter(descendantOrSelf.of(this.delegate()), predicate));
	}

	@Override
	protected EObject delegate() {
		return this.delegator;
	}
}
