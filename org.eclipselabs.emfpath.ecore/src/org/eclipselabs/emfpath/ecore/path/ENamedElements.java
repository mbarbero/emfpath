package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class ENamedElements {

	private ENamedElements() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = new Function<ENamedElement, String>() {
    public String apply(ENamedElement s) {
      return s.getName();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
