package org.eclipse.emf.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EClassifier;

public class EEnumPath {

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceClassName = EClassifierPath.instanceClassName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = EClassifierPath.instanceClass;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = EClassifierPath.defaultValue;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = EClassifierPath.instanceTypeName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = EClassifierPath.ePackage;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = EClassifierPath.eTypeParameters;

	/**
	 * @generated
	 */
	public static final Predicate<EDataType> isSerializable = EDataTypePath.isSerializable;

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
	public static final Function<EEnum, EList<EEnumLiteral>> eLiterals = new Function<EEnum, EList<EEnumLiteral>>() {
		public EList<EEnumLiteral> apply(EEnum s) {
			return s.getELiterals();
		}
	};
	
	/**
	 * @generated
	 */
	public static Predicate<EClassifier> isInstance(final Object object) {
		return EClassifierPath.isInstance(object);
	}

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = EClassifierPath.getClassifierID;

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
	public static Function<EEnum, EEnumLiteral> getEEnumLiteral(final String name) {
		return new Function<EEnum, EEnumLiteral>() {
			public EEnumLiteral apply(EEnum s) {
				return s.getEEnumLiteral(name);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<EEnum, EEnumLiteral> getEEnumLiteral(final int value) {
		return new Function<EEnum, EEnumLiteral>() {
			public EEnumLiteral apply(EEnum s) {
				return s.getEEnumLiteral(value);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<EEnum, EEnumLiteral> getEEnumLiteralByLiteral(final String literal) {
		return new Function<EEnum, EEnumLiteral>() {
			public EEnumLiteral apply(EEnum s) {
				return s.getEEnumLiteralByLiteral(literal);
			}
		};
	}

}
