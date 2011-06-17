package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * @generated
 */
public final class EOperations {

	private EOperations() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = ENamedElements.name;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isOrdered = ETypedElements.isOrdered;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isUnique = ETypedElements.isUnique;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> lowerBound = ETypedElements.lowerBound;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> upperBound = ETypedElements.upperBound;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isMany = ETypedElements.isMany;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isRequired = ETypedElements.isRequired;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EClassifier> eType = ETypedElements.eType;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EGenericType> eGenericType = ETypedElements.eGenericType;

	/**
	 * @generated
	 */
	public static final Function<EOperation, EClass> eContainingClass = new Function<EOperation, EClass>() {
    public EClass apply(EOperation s) {
      return s.getEContainingClass();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EOperation, EList<ETypeParameter>> eTypeParameters = new Function<EOperation, EList<ETypeParameter>>() {
    public EList<ETypeParameter> apply(EOperation s) {
      return s.getETypeParameters();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EOperation, EList<EParameter>> eParameters = new Function<EOperation, EList<EParameter>>() {
    public EList<EParameter> apply(EOperation s) {
      return s.getEParameters();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EOperation, EList<EClassifier>> eExceptions = new Function<EOperation, EList<EClassifier>>() {
    public EList<EClassifier> apply(EOperation s) {
      return s.getEExceptions();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EOperation, EList<EGenericType>> eGenericExceptions = new Function<EOperation, EList<EGenericType>>() {
    public EList<EGenericType> apply(EOperation s) {
      return s.getEGenericExceptions();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

	/**
	 * @generated
	 */
	public static final Function<EOperation, java.lang.Integer> getOperationID = new Function<EOperation, java.lang.Integer>() {
    public java.lang.Integer apply(EOperation s) {
      return s.getOperationID();
    }
  };

	/**
	 * @generated
	 */
	public static Predicate<EOperation> isOverrideOf(final EOperation someOperation) {
    return new Predicate<EOperation>() {
      public boolean apply(EOperation s) {
        return s.isOverrideOf(someOperation);
      }
    };
  }

}
