package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class EFactories {

	private EFactories() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<EFactory, EPackage> ePackage = new Function<EFactory, EPackage>() {
    public EPackage apply(EFactory s) {
      return s.getEPackage();
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
	public static Function<EFactory, EObject> create(final EClass eClass) {
    return new Function<EFactory, EObject>() {
      public EObject apply(EFactory s) {
        return s.create(eClass);
      }
    };
  }

	/**
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
