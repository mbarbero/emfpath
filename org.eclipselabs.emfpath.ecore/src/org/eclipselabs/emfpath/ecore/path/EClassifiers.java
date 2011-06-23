package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * @generated
 */
public class EClassifiers extends ENamedElements {

  /**
   * @generated
   */
   EClassifiers() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getInstanceClassName()
   * @generated
   */
  public static final Function<EClassifier, String> instanceClassName = new Function<EClassifier, String>() {
    public String apply(EClassifier s) {
      return s.getInstanceClassName();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getInstanceClass()
   * @generated
   */
  public static final Function<EClassifier, Class<?>> instanceClass = new Function<EClassifier, Class<?>>() {
    public Class<?> apply(EClassifier s) {
      return s.getInstanceClass();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getDefaultValue()
   * @generated
   */
  public static final Function<EClassifier, Object> defaultValue = new Function<EClassifier, Object>() {
    public Object apply(EClassifier s) {
      return s.getDefaultValue();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getInstanceTypeName()
   * @generated
   */
  public static final Function<EClassifier, String> instanceTypeName = new Function<EClassifier, String>() {
    public String apply(EClassifier s) {
      return s.getInstanceTypeName();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getEPackage()
   * @generated
   */
  public static final Function<EClassifier, EPackage> ePackage = new Function<EClassifier, EPackage>() {
    public EPackage apply(EClassifier s) {
      return s.getEPackage();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getETypeParameters()
   * @generated
   */
  public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = new Function<EClassifier, EList<ETypeParameter>>() {
    public EList<ETypeParameter> apply(EClassifier s) {
      return s.getETypeParameters();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EClassifier#isInstance(Object)
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
   * 
   * @see org.eclipse.emf.ecore.EClassifier#getClassifierID()
   * @generated
   */
  public static final Function<EClassifier, java.lang.Integer> getClassifierID = new Function<EClassifier, java.lang.Integer>() {
    public java.lang.Integer apply(EClassifier s) {
      return s.getClassifierID();
    }
  };

	
}
