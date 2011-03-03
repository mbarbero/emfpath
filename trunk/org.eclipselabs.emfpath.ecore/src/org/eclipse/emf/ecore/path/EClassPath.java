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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EClassifier;

public class EClassPath {

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
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElementPath.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = ENamedElementPath.name;

	/**
	 * @generated
	 */
	public static final Predicate<EClass> isAbstract = new Predicate<EClass>() {
		public boolean apply(EClass s) {
			return s.isAbstract();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<EClass> isInterface = new Predicate<EClass>() {
		public boolean apply(EClass s) {
			return s.isInterface();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EClass>> eSuperTypes = new Function<EClass, EList<EClass>>() {
		public EList<EClass> apply(EClass s) {
			return s.getESuperTypes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EOperation>> eOperations = new Function<EClass, EList<EOperation>>() {
		public EList<EOperation> apply(EClass s) {
			return s.getEOperations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EAttribute>> eAllAttributes = new Function<EClass, EList<EAttribute>>() {
		public EList<EAttribute> apply(EClass s) {
			return s.getEAllAttributes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eAllReferences = new Function<EClass, EList<EReference>>() {
		public EList<EReference> apply(EClass s) {
			return s.getEAllReferences();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eReferences = new Function<EClass, EList<EReference>>() {
		public EList<EReference> apply(EClass s) {
			return s.getEReferences();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EAttribute>> eAttributes = new Function<EClass, EList<EAttribute>>() {
		public EList<EAttribute> apply(EClass s) {
			return s.getEAttributes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eAllContainments = new Function<EClass, EList<EReference>>() {
		public EList<EReference> apply(EClass s) {
			return s.getEAllContainments();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EOperation>> eAllOperations = new Function<EClass, EList<EOperation>>() {
		public EList<EOperation> apply(EClass s) {
			return s.getEAllOperations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EStructuralFeature>> eAllStructuralFeatures = new Function<EClass, EList<EStructuralFeature>>() {
		public EList<EStructuralFeature> apply(EClass s) {
			return s.getEAllStructuralFeatures();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EClass>> eAllSuperTypes = new Function<EClass, EList<EClass>>() {
		public EList<EClass> apply(EClass s) {
			return s.getEAllSuperTypes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EAttribute> eIDAttribute = new Function<EClass, EAttribute>() {
		public EAttribute apply(EClass s) {
			return s.getEIDAttribute();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EStructuralFeature>> eStructuralFeatures = new Function<EClass, EList<EStructuralFeature>>() {
		public EList<EStructuralFeature> apply(EClass s) {
			return s.getEStructuralFeatures();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EGenericType>> eGenericSuperTypes = new Function<EClass, EList<EGenericType>>() {
		public EList<EGenericType> apply(EClass s) {
			return s.getEGenericSuperTypes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EGenericType>> eAllGenericSuperTypes = new Function<EClass, EList<EGenericType>>() {
		public EList<EGenericType> apply(EClass s) {
			return s.getEAllGenericSuperTypes();
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
	public static Predicate<EClass> isSuperTypeOf(final EClass someClass) {
		return new Predicate<EClass>() {
			public boolean apply(EClass s) {
				return s.isSuperTypeOf(someClass);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<EClass, java.lang.Integer> getFeatureCount = new Function<EClass, java.lang.Integer>() {
		public java.lang.Integer apply(EClass s) {
			return s.getFeatureCount();
		}
	};

	/**
	 * @generated
	 */
	public static Function<EClass, EStructuralFeature> getEStructuralFeature(final int featureID) {
		return new Function<EClass, EStructuralFeature>() {
			public EStructuralFeature apply(EClass s) {
				return s.getEStructuralFeature(featureID);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<EClass, java.lang.Integer> getFeatureID(final EStructuralFeature feature) {
		return new Function<EClass, java.lang.Integer>() {
			public java.lang.Integer apply(EClass s) {
				return s.getFeatureID(feature);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<EClass, EStructuralFeature> getEStructuralFeature(final String featureName) {
		return new Function<EClass, EStructuralFeature>() {
			public EStructuralFeature apply(EClass s) {
				return s.getEStructuralFeature(featureName);
			}
		};
	}

}
