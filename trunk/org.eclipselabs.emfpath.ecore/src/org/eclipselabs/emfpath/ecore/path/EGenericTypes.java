package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EGenericTypes {

  /**
   * @generated
   */
  private EGenericTypes() {
    // prevent instantiation
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getEUpperBound()
   * @generated
   */
  public static final Function<EGenericType, EGenericType> eUpperBound = new Function<EGenericType, EGenericType>() {
    public EGenericType apply(EGenericType s) {
      return s.getEUpperBound();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getETypeArguments()
   * @generated
   */
  public static final Function<EGenericType, EList<EGenericType>> eTypeArguments = new Function<EGenericType, EList<EGenericType>>() {
    public EList<EGenericType> apply(EGenericType s) {
      return s.getETypeArguments();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getERawType()
   * @generated
   */
  public static final Function<EGenericType, EClassifier> eRawType = new Function<EGenericType, EClassifier>() {
    public EClassifier apply(EGenericType s) {
      return s.getERawType();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getELowerBound()
   * @generated
   */
  public static final Function<EGenericType, EGenericType> eLowerBound = new Function<EGenericType, EGenericType>() {
    public EGenericType apply(EGenericType s) {
      return s.getELowerBound();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getETypeParameter()
   * @generated
   */
  public static final Function<EGenericType, ETypeParameter> eTypeParameter = new Function<EGenericType, ETypeParameter>() {
    public ETypeParameter apply(EGenericType s) {
      return s.getETypeParameter();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EGenericType#getEClassifier()
   * @generated
   */
  public static final Function<EGenericType, EClassifier> eClassifier = new Function<EGenericType, EClassifier>() {
    public EClassifier apply(EGenericType s) {
      return s.getEClassifier();
    }
  };


}
