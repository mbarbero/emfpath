package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;

/**
 * @generated
 */
public final class EEnumLiterals {

	private EEnumLiterals() {
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
	public static final Function<EEnumLiteral, java.lang.Integer> value = new Function<EEnumLiteral, java.lang.Integer>() {
    public java.lang.Integer apply(EEnumLiteral s) {
      return s.getValue();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EEnumLiteral, Enumerator> instance = new Function<EEnumLiteral, Enumerator>() {
    public Enumerator apply(EEnumLiteral s) {
      return s.getInstance();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EEnumLiteral, String> literal = new Function<EEnumLiteral, String>() {
    public String apply(EEnumLiteral s) {
      return s.getLiteral();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EEnumLiteral, EEnum> eEnum = new Function<EEnumLiteral, EEnum>() {
    public EEnum apply(EEnumLiteral s) {
      return s.getEEnum();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
