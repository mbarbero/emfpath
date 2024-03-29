package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * @generated
 */
public class ETypedElements extends ENamedElements {

  /**
   * @generated
   */
   ETypedElements() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#isOrdered()
   * @generated
   */
  public static final ComposablePredicate<ETypedElement> isOrdered = new ComposablePredicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isOrdered();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#isUnique()
   * @generated
   */
  public static final ComposablePredicate<ETypedElement> isUnique = new ComposablePredicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isUnique();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#getLowerBound()
   * @generated
   */
  public static final Function<ETypedElement, java.lang.Integer> lowerBound = new Function<ETypedElement, java.lang.Integer>() {
    public java.lang.Integer apply(ETypedElement s) {
      return s.getLowerBound();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#getUpperBound()
   * @generated
   */
  public static final Function<ETypedElement, java.lang.Integer> upperBound = new Function<ETypedElement, java.lang.Integer>() {
    public java.lang.Integer apply(ETypedElement s) {
      return s.getUpperBound();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#isMany()
   * @generated
   */
  public static final ComposablePredicate<ETypedElement> isMany = new ComposablePredicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isMany();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#isRequired()
   * @generated
   */
  public static final ComposablePredicate<ETypedElement> isRequired = new ComposablePredicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isRequired();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#getEType()
   * @generated
   */
  public static final Function<ETypedElement, EClassifier> eType = new Function<ETypedElement, EClassifier>() {
    public EClassifier apply(ETypedElement s) {
      return s.getEType();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.ETypedElement#getEGenericType()
   * @generated
   */
  public static final Function<ETypedElement, EGenericType> eGenericType = new Function<ETypedElement, EGenericType>() {
    public EGenericType apply(ETypedElement s) {
      return s.getEGenericType();
    }
  };


}
