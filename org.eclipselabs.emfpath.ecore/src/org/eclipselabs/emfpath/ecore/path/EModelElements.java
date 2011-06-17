package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class EModelElements {

	private EModelElements() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = new Function<EModelElement, EList<EAnnotation>>() {
    public EList<EAnnotation> apply(EModelElement s) {
      return s.getEAnnotations();
    }
  };
	
	/**
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
