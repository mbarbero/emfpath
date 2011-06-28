package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EOperations extends ETypedElements {

  /**
   * @generated
   */
  private EOperations() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getEContainingClass()
   * @generated
   */
  public static final Function<EOperation, EClass> eContainingClass = new Function<EOperation, EClass>() {
    public EClass apply(EOperation s) {
      return s.getEContainingClass();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getETypeParameters()
   * @generated
   */
  public static final Function<EOperation, EList<ETypeParameter>> eTypeParameters = new Function<EOperation, EList<ETypeParameter>>() {
    public EList<ETypeParameter> apply(EOperation s) {
      return s.getETypeParameters();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getEParameters()
   * @generated
   */
  public static final Function<EOperation, EList<EParameter>> eParameters = new Function<EOperation, EList<EParameter>>() {
    public EList<EParameter> apply(EOperation s) {
      return s.getEParameters();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getEExceptions()
   * @generated
   */
  public static final Function<EOperation, EList<EClassifier>> eExceptions = new Function<EOperation, EList<EClassifier>>() {
    public EList<EClassifier> apply(EOperation s) {
      return s.getEExceptions();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getEGenericExceptions()
   * @generated
   */
  public static final Function<EOperation, EList<EGenericType>> eGenericExceptions = new Function<EOperation, EList<EGenericType>>() {
    public EList<EGenericType> apply(EOperation s) {
      return s.getEGenericExceptions();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#getOperationID()
   * @generated
   */
  public static final Function<EOperation, java.lang.Integer> getOperationID = new Function<EOperation, java.lang.Integer>() {
    public java.lang.Integer apply(EOperation s) {
      return s.getOperationID();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EOperation#isOverrideOf(EOperation)
   * @generated
   */
  public static ComposablePredicate<EOperation> isOverrideOf(final EOperation someOperation) {
    return new ComposablePredicate<EOperation>() {
      public boolean apply(EOperation s) {
        return s.isOverrideOf(someOperation);
      }
    };
  }
}
