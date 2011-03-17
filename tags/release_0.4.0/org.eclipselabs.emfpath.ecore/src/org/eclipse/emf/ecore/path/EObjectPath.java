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

public class EObjectPath {

	
	
	/**
	 * @generated
	 */
	public static final Function<EObject, EClass> eClass = new Function<EObject, EClass>() {
		public EClass apply(EObject s) {
			return s.eClass();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<EObject> eIsProxy = new Predicate<EObject>() {
		public boolean apply(EObject s) {
			return s.eIsProxy();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, Resource> eResource = new Function<EObject, Resource>() {
		public Resource apply(EObject s) {
			return s.eResource();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, EObject> eContainer = new Function<EObject, EObject>() {
		public EObject apply(EObject s) {
			return s.eContainer();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, EStructuralFeature> eContainingFeature = new Function<EObject, EStructuralFeature>() {
		public EStructuralFeature apply(EObject s) {
			return s.eContainingFeature();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, EReference> eContainmentFeature = new Function<EObject, EReference>() {
		public EReference apply(EObject s) {
			return s.eContainmentFeature();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, EList<EObject>> eContents = new Function<EObject, EList<EObject>>() {
		public EList<EObject> apply(EObject s) {
			return s.eContents();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, TreeIterator<EObject>> eAllContents = new Function<EObject, TreeIterator<EObject>>() {
		public TreeIterator<EObject> apply(EObject s) {
			return s.eAllContents();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<EObject, EList<EObject>> eCrossReferences = new Function<EObject, EList<EObject>>() {
		public EList<EObject> apply(EObject s) {
			return s.eCrossReferences();
		}
	};

	/**
	 * @generated
	 */
	public static Function<EObject, Object> eGet(final EStructuralFeature feature) {
		return new Function<EObject, Object>() {
			public Object apply(EObject s) {
				return s.eGet(feature);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<EObject, Object> eGet(final EStructuralFeature feature, final boolean resolve) {
		return new Function<EObject, Object>() {
			public Object apply(EObject s) {
				return s.eGet(feature, resolve);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<EObject> eIsSet(final EStructuralFeature feature) {
		return new Predicate<EObject>() {
			public boolean apply(EObject s) {
				return s.eIsSet(feature);
			}
		};
	}

}
