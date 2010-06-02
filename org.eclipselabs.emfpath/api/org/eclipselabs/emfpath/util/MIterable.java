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
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public final class MIterable extends ExtendedIterable<MObject> {

	/**
	 * 
	 */
	static final Function<Iterable<EObject>, MIterable> ITERABLE_OF_EOBJECT_TO_EEITERABLE = new Function<Iterable<EObject>, MIterable>() {
		public MIterable apply(Iterable<EObject> from) {
			return MIterable.adapt2(Iterables.transform(from, MObject.EOBJECT_TO_EEOBJECT));
		}
	};

	/**
	 * @param delegator
	 * @return
	 */
	static MIterable adapt2(Iterable<MObject> delegator) {
		if (delegator instanceof MIterable) {
			return (MIterable) delegator;
		} else {
			return new MIterable(delegator);
		}
	}

	/**
	 * @param delegator
	 * @return
	 */
	public static MIterable adapt(Iterable<EObject> delegator) {
		return MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE.apply(delegator);
	}

	private MIterable(Iterable<MObject> delegator) {
		super(delegator);
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> ExtendedIterable<X> get(String eStructuralFeatureName) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), EGet.<X> feature(eStructuralFeatureName)));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> ExtendedIterable<X> get(EStructuralFeature eStructuralFeature) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), EGet.<X> feature(eStructuralFeature)));
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public MIterable getEObject(String eStructuralFeatureName) {
		return MIterable.adapt2(Iterables.transform(this.delegate(), Functions.compose(MObject.EOBJECT_TO_EEOBJECT, EGet
			.<EObject> feature(eStructuralFeatureName))));
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public MIterable getEObject(EStructuralFeature eStructuralFeature) {
		return MIterable.adapt2(Iterables.transform(this.delegate(), Functions.compose(MObject.EOBJECT_TO_EEOBJECT, EGet
			.<EObject> feature(eStructuralFeature))));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> ExtendedIterable<ExtendedIterable<X>> getIterable(String eStructuralFeatureName) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), Functions.compose(ExtendedIterable.<X> iterableToEIterable(),
			EGet.<Iterable<X>> feature(eStructuralFeatureName))));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> ExtendedIterable<ExtendedIterable<X>> getIterable(EStructuralFeature eStructuralFeature) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), Functions.compose(ExtendedIterable.<X> iterableToEIterable(),
			EGet.<Iterable<X>> feature(eStructuralFeature))));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> ExtendedIterable<MIterable> getEObjectIterable(String eStructuralFeatureName) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
			EGet.<Iterable<EObject>> feature(eStructuralFeatureName))));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> ExtendedIterable<MIterable> getEObjectIterable(EStructuralFeature eStructuralFeature) {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
			EGet.<Iterable<EObject>> feature(eStructuralFeature))));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeatureName
	 * @return
	 */
	public <X> ExtendedIterable<X> getFlatIterable(String eStructuralFeatureName) {
		return ExtendedIterable.adapt(Iterables.concat(this.<X> getIterable(eStructuralFeatureName)));
	}

	/**
	 * @param <X>
	 * @param eStructuralFeature
	 * @return
	 */
	public <X> ExtendedIterable<X> getFlatIterable(EStructuralFeature eStructuralFeature) {
		return ExtendedIterable.adapt(Iterables.concat(this.<X> getIterable(eStructuralFeature)));
	}

	/**
	 * @param eStructuralFeatureName
	 * @return
	 */
	public MIterable getFlatEObjectIterable(String eStructuralFeatureName) {
		return MIterable.adapt2(Iterables.concat(this.getEObjectIterable(eStructuralFeatureName)));
	}

	/**
	 * @param eStructuralFeature
	 * @return
	 */
	public MIterable getFlatEObjectIterable(EStructuralFeature eStructuralFeature) {
		return MIterable.adapt2(Iterables.concat(this.getEObjectIterable(eStructuralFeature)));
	}

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_ANCESTOR = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE, ancestor);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_ANCESTOR_OR_SELF = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		ancestorOrSelf);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_CHILD = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE, child);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_DESCENDANT = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		descendant);

	/**
	 * 
	 */
	private static final Function<EObject, MObject> E_PARENT = Functions.compose(MObject.EOBJECT_TO_EEOBJECT, parent);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_DESCENDANT_OR_SELF = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		descendantOrSelf);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_FOLLOWING = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		following);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_FOLLOWING_SIBLING = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		followingSibling);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_PRECEDING = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		preceding);

	/**
	 * 
	 */
	private static final Function<EObject, MIterable> E_PRECEDING_SIBLING = Functions.compose(MIterable.ITERABLE_OF_EOBJECT_TO_EEITERABLE,
		precedingSibling);

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> ancestor() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_ANCESTOR));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> ancestor(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_ANCESTOR), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> ancestorOrSelf() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_ANCESTOR_OR_SELF));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> ancestorOrSelf(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_ANCESTOR_OR_SELF), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> child() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_CHILD));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> child(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_CHILD), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> descendant() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_DESCENDANT));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> descendant(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_DESCENDANT), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> descendantOrSelf() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_DESCENDANT_OR_SELF));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> descendantOrSelf(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_DESCENDANT_OR_SELF), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> following() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_FOLLOWING));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> following(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_FOLLOWING), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> followingSibling() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_FOLLOWING_SIBLING));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> followingSibling(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_FOLLOWING_SIBLING), predicate));
	}

	/**
	 * @return
	 */
	public MIterable parent() {
		return MIterable.adapt2(Iterables.transform(this.delegate(), MIterable.E_PARENT));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable parent(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_PARENT), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> preceding() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_PRECEDING));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> preceding(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_PRECEDING), predicate));
	}

	/**
	 * @return
	 */
	public ExtendedIterable<MIterable> precedingSibling() {
		return ExtendedIterable.adapt(Iterables.transform(this.delegate(), MIterable.E_PRECEDING_SIBLING));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public ExtendedIterable<MIterable> precedingSibling(Predicate<MIterable> predicate) {
		return ExtendedIterable.adapt(Iterables.filter(Iterables.transform(this.delegate(), MIterable.E_PRECEDING_SIBLING), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatAncestor() {
		return MIterable.adapt2(Iterables.concat(this.ancestor()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatAncestor(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.ancestor()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatAncestorOrSelf() {
		return MIterable.adapt2(Iterables.concat(this.ancestorOrSelf()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatAncestorOrSelf(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.ancestorOrSelf()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatChild() {
		return MIterable.adapt2(Iterables.concat(this.child()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatChild(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.child()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatDescendant() {
		return MIterable.adapt2(Iterables.concat(this.descendant()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatDescendant(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.descendant()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatDescendantOrSelf() {
		return MIterable.adapt2(Iterables.concat(this.descendantOrSelf()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatDescendantOrSelf(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.descendantOrSelf()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatFollowing() {
		return MIterable.adapt2(Iterables.concat(this.following()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatFollowing(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.following()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatFollowingSibling() {
		return MIterable.adapt2(Iterables.concat(this.followingSibling()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatFollowingSibling(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.followingSibling()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatPreceding() {
		return MIterable.adapt2(Iterables.concat(this.preceding()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatPreceding(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.preceding()), predicate));
	}

	/**
	 * @return
	 */
	public MIterable flatPrecedingSibling() {
		return MIterable.adapt2(Iterables.concat(this.precedingSibling()));
	}

	/**
	 * @param predicate
	 * @return
	 */
	public MIterable flatPrecedingSibling(Predicate<EObject> predicate) {
		return MIterable.adapt2(Iterables.filter(Iterables.concat(this.precedingSibling()), predicate));
	}
}
