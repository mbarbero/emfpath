package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class EClassifiers {

	private EClassifiers() {
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
	public static final Function<EClassifier, String> instanceClassName = new Function<EClassifier, String>() {
    public String apply(EClassifier s) {
      return s.getInstanceClassName();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = new Function<EClassifier, Class<?>>() {
    public Class<?> apply(EClassifier s) {
      return s.getInstanceClass();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = new Function<EClassifier, Object>() {
    public Object apply(EClassifier s) {
      return s.getDefaultValue();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = new Function<EClassifier, String>() {
    public String apply(EClassifier s) {
      return s.getInstanceTypeName();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = new Function<EClassifier, EPackage>() {
    public EPackage apply(EClassifier s) {
      return s.getEPackage();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = new Function<EClassifier, EList<ETypeParameter>>() {
    public EList<ETypeParameter> apply(EClassifier s) {
      return s.getETypeParameters();
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
	public static Predicate<EClassifier> isInstance(final Object object) {
    return new Predicate<EClassifier>() {
      public boolean apply(EClassifier s) {
        return s.isInstance(object);
      }
    };
  }

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = new Function<EClassifier, java.lang.Integer>() {
    public java.lang.Integer apply(EClassifier s) {
      return s.getClassifierID();
    }
  };

}
