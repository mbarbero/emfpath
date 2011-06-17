package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;

/**
 * @generated
 */
public final class EAnnotations {

	private EAnnotations() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<EAnnotation, String> source = new Function<EAnnotation, String>() {
    public String apply(EAnnotation s) {
      return s.getSource();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EAnnotation, EMap<String, String>> details = new Function<EAnnotation, EMap<String, String>>() {
    public EMap<String, String> apply(EAnnotation s) {
      return s.getDetails();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EAnnotation, EModelElement> eModelElement = new Function<EAnnotation, EModelElement>() {
    public EModelElement apply(EAnnotation s) {
      return s.getEModelElement();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EAnnotation, EList<EObject>> contents = new Function<EAnnotation, EList<EObject>>() {
    public EList<EObject> apply(EAnnotation s) {
      return s.getContents();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EAnnotation, EList<EObject>> references = new Function<EAnnotation, EList<EObject>>() {
    public EList<EObject> apply(EAnnotation s) {
      return s.getReferences();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
