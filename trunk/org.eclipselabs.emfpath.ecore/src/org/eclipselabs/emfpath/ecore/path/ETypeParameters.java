package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class ETypeParameters {

	private ETypeParameters() {
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
	public static final Function<ETypeParameter, EList<EGenericType>> eBounds = new Function<ETypeParameter, EList<EGenericType>>() {
    public EList<EGenericType> apply(ETypeParameter s) {
      return s.getEBounds();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
