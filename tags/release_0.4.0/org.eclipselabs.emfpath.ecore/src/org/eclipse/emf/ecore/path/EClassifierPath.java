package org.eclipse.emf.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

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
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EClassifier;

public class EClassifierPath {

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
	public static final Function<EClassifier, String> instanceClassName = new Function<EClassifier, String>() {
		public String apply(EClassifier s) {
			return s.getInstanceClassName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = new Function<EClassifier, Class<?>>() {
		public Class<?> apply(EClassifier s) {
			return s.getInstanceClass();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = new Function<EClassifier, Object>() {
		public Object apply(EClassifier s) {
			return s.getDefaultValue();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = new Function<EClassifier, String>() {
		public String apply(EClassifier s) {
			return s.getInstanceTypeName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = new Function<EClassifier, EPackage>() {
		public EPackage apply(EClassifier s) {
			return s.getEPackage();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = new Function<EClassifier, EList<ETypeParameter>>() {
		public EList<ETypeParameter> apply(EClassifier s) {
			return s.getETypeParameters();
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
	public static Predicate<EClassifier> isInstance(final Object object) {
		return new Predicate<EClassifier>() {
			public boolean apply(EClassifier s) {
				return s.isInstance(object);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = new Function<EClassifier, java.lang.Integer>() {
		public java.lang.Integer apply(EClassifier s) {
			return s.getClassifierID();
		}
	};

}
