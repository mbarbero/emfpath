package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EFactories extends EModelElements {

  /**
   * @generated
   */
  private EFactories() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EFactory#getEPackage()
   * @generated
   */
  public static final Function<EFactory, EPackage> ePackage = new Function<EFactory, EPackage>() {
    public EPackage apply(EFactory s) {
      return s.getEPackage();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EFactory#create(EClass)
   * @generated
   */
  public static Function<EFactory, EObject> create(final EClass eClass) {
    return new Function<EFactory, EObject>() {
      public EObject apply(EFactory s) {
        return s.create(eClass);
      }
    };
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EFactory#createFromString(EDataType, String)
   * @generated
   */
  public static Function<EFactory, Object> createFromString(final EDataType eDataType, final String literalValue) {
    return new Function<EFactory, Object>() {
      public Object apply(EFactory s) {
        return s.createFromString(eDataType, literalValue);
      }
    };
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EFactory#convertToString(EDataType, Object)
   * @generated
   */
  public static Function<EFactory, String> convertToString(final EDataType eDataType, final Object instanceValue) {
    return new Function<EFactory, String>() {
      public String apply(EFactory s) {
        return s.convertToString(eDataType, instanceValue);
      }
    };
  }

}
