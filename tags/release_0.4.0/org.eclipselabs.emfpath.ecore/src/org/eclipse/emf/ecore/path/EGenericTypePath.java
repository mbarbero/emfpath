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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypeParameter;

public class EGenericTypePath {

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EGenericType> eUpperBound = new Function<EGenericType, EGenericType>() {
		public EGenericType apply(EGenericType s) {
			return s.getEUpperBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EList<EGenericType>> eTypeArguments = new Function<EGenericType, EList<EGenericType>>() {
		public EList<EGenericType> apply(EGenericType s) {
			return s.getETypeArguments();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EClassifier> eRawType = new Function<EGenericType, EClassifier>() {
		public EClassifier apply(EGenericType s) {
			return s.getERawType();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EGenericType> eLowerBound = new Function<EGenericType, EGenericType>() {
		public EGenericType apply(EGenericType s) {
			return s.getELowerBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EGenericType, ETypeParameter> eTypeParameter = new Function<EGenericType, ETypeParameter>() {
		public ETypeParameter apply(EGenericType s) {
			return s.getETypeParameter();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EClassifier> eClassifier = new Function<EGenericType, EClassifier>() {
		public EClassifier apply(EGenericType s) {
			return s.getEClassifier();
		}
	};
	
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
