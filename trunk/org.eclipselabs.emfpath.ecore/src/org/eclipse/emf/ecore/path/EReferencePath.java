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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;

public class EReferencePath {

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
	public static final Predicate<EStructuralFeature> isChangeable = EStructuralFeaturePath.isChangeable;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isVolatile = EStructuralFeaturePath.isVolatile;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isTransient = EStructuralFeaturePath.isTransient;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, String> defaultValueLiteral = EStructuralFeaturePath.defaultValueLiteral;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Object> defaultValue = EStructuralFeaturePath.defaultValue;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isUnsettable = EStructuralFeaturePath.isUnsettable;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isDerived = EStructuralFeaturePath.isDerived;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, EClass> eContainingClass = EStructuralFeaturePath.eContainingClass;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isOrdered = ETypedElementPath.isOrdered;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isUnique = ETypedElementPath.isUnique;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> lowerBound = ETypedElementPath.lowerBound;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> upperBound = ETypedElementPath.upperBound;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isMany = ETypedElementPath.isMany;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isRequired = ETypedElementPath.isRequired;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EClassifier> eType = ETypedElementPath.eType;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EGenericType> eGenericType = ETypedElementPath.eGenericType;

	/**
	 * @generated
	 */
	public static final Predicate<EReference> isContainment = new Predicate<EReference>() {
		public boolean apply(EReference s) {
			return s.isContainment();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<EReference> isContainer = new Predicate<EReference>() {
		public boolean apply(EReference s) {
			return s.isContainer();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<EReference> isResolveProxies = new Predicate<EReference>() {
		public boolean apply(EReference s) {
			return s.isResolveProxies();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EReference, EReference> eOpposite = new Function<EReference, EReference>() {
		public EReference apply(EReference s) {
			return s.getEOpposite();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EReference, EClass> eReferenceType = new Function<EReference, EClass>() {
		public EClass apply(EReference s) {
			return s.getEReferenceType();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EReference, EList<EAttribute>> eKeys = new Function<EReference, EList<EAttribute>>() {
		public EList<EAttribute> apply(EReference s) {
			return s.getEKeys();
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

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, java.lang.Integer> getFeatureID = EStructuralFeaturePath.getFeatureID;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Class<?>> getContainerClass = EStructuralFeaturePath.getContainerClass;

}
