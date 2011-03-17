package org.eclipse.emf.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;

public class EPackagePath {

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
	public static final Function<EPackage, String> nsURI = new Function<EPackage, String>() {
		public String apply(EPackage s) {
			return s.getNsURI();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EPackage, String> nsPrefix = new Function<EPackage, String>() {
		public String apply(EPackage s) {
			return s.getNsPrefix();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EPackage, EFactory> eFactoryInstance = new Function<EPackage, EFactory>() {
		public EFactory apply(EPackage s) {
			return s.getEFactoryInstance();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EPackage, EList<EClassifier>> eClassifiers = new Function<EPackage, EList<EClassifier>>() {
		public EList<EClassifier> apply(EPackage s) {
			return s.getEClassifiers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EPackage, EList<EPackage>> eSubpackages = new Function<EPackage, EList<EPackage>>() {
		public EList<EPackage> apply(EPackage s) {
			return s.getESubpackages();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EPackage, EPackage> eSuperPackage = new Function<EPackage, EPackage>() {
		public EPackage apply(EPackage s) {
			return s.getESuperPackage();
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
	public static Function<EPackage, EClassifier> getEClassifier(final String name) {
		return new Function<EPackage, EClassifier>() {
			public EClassifier apply(EPackage s) {
				return s.getEClassifier(name);
			}
		};
	}

}
