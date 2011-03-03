package org.eclipse.emf.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;

public class ETypedElementPath {

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElementPath.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = ENamedElementPath.name;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isOrdered = new Predicate<ETypedElement>() {
		public boolean apply(ETypedElement s) {
			return s.isOrdered();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isUnique = new Predicate<ETypedElement>() {
		public boolean apply(ETypedElement s) {
			return s.isUnique();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> lowerBound = new Function<ETypedElement, java.lang.Integer>() {
		public java.lang.Integer apply(ETypedElement s) {
			return s.getLowerBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> upperBound = new Function<ETypedElement, java.lang.Integer>() {
		public java.lang.Integer apply(ETypedElement s) {
			return s.getUpperBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isMany = new Predicate<ETypedElement>() {
		public boolean apply(ETypedElement s) {
			return s.isMany();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isRequired = new Predicate<ETypedElement>() {
		public boolean apply(ETypedElement s) {
			return s.isRequired();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EClassifier> eType = new Function<ETypedElement, EClassifier>() {
		public EClassifier apply(ETypedElement s) {
			return s.getEType();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EGenericType> eGenericType = new Function<ETypedElement, EGenericType>() {
		public EGenericType apply(ETypedElement s) {
			return s.getEGenericType();
		}
	};
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
		return EModelElementPath.getEAnnotation(source);
	}

	/**
	 * @generated
	 */
	public static final Function<EObject, EClass> eClass = EObjectPath.eClass;

	/**
	 * @generated
	 */
	public static final Predicate<EObject> eIsProxy = EObjectPath.eIsProxy;

	/**
	 * @generated
	 */
	public static final Function<EObject, Resource> eResource = EObjectPath.eResource;

	/**
	 * @generated
	 */
	public static final Function<EObject, EObject> eContainer = EObjectPath.eContainer;

	/**
	 * @generated
	 */
	public static final Function<EObject, EStructuralFeature> eContainingFeature = EObjectPath.eContainingFeature;

	/**
	 * @generated
	 */
	public static final Function<EObject, EReference> eContainmentFeature = EObjectPath.eContainmentFeature;

	/**
	 * @generated
	 */
	public static final Function<EObject, EList<EObject>> eContents = EObjectPath.eContents;

	/**
	 * @generated
	 */
	public static final Function<EObject, TreeIterator<EObject>> eAllContents = EObjectPath.eAllContents;

	/**
	 * @generated
	 */
	public static final Function<EObject, EList<EObject>> eCrossReferences = EObjectPath.eCrossReferences;

	/**
	 * @generated
	 */
	public static Function<EObject, Object> eGet(final EStructuralFeature feature) {
		return EObjectPath.eGet(feature);
	}

	/**
	 * @generated
	 */
	public static Function<EObject, Object> eGet(final EStructuralFeature feature, final boolean resolve) {
		return EObjectPath.eGet(feature, resolve);
	}

	/**
	 * @generated
	 */
	public static Predicate<EObject> eIsSet(final EStructuralFeature feature) {
		return EObjectPath.eIsSet(feature);
	}

}
