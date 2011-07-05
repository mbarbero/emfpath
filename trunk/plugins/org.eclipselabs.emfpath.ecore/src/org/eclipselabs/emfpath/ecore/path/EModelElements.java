package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EModelElements {

  /**
   * @generated
   */
   EModelElements() {
    // prevent instantiation
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EModelElement#getEAnnotations()
   * @generated
   */
  public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = new Function<EModelElement, EList<EAnnotation>>() {
    public EList<EAnnotation> apply(EModelElement s) {
      return s.getEAnnotations();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EModelElement#getEAnnotation(String)
   * @generated
   */
  public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return new Function<EModelElement, EAnnotation>() {
      public EAnnotation apply(EModelElement s) {
        return s.getEAnnotation(source);
      }
    };
  }

	

}
