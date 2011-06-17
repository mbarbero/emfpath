package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * @generated
 */
public final class ETypedElements {

	private ETypedElements() {
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
	public static final Predicate<ETypedElement> isOrdered = new Predicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isOrdered();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isUnique = new Predicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isUnique();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> lowerBound = new Function<ETypedElement, java.lang.Integer>() {
    public java.lang.Integer apply(ETypedElement s) {
      return s.getLowerBound();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> upperBound = new Function<ETypedElement, java.lang.Integer>() {
    public java.lang.Integer apply(ETypedElement s) {
      return s.getUpperBound();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isMany = new Predicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isMany();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isRequired = new Predicate<ETypedElement>() {
    public boolean apply(ETypedElement s) {
      return s.isRequired();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EClassifier> eType = new Function<ETypedElement, EClassifier>() {
    public EClassifier apply(ETypedElement s) {
      return s.getEType();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EGenericType> eGenericType = new Function<ETypedElement, EGenericType>() {
    public EGenericType apply(ETypedElement s) {
      return s.getEGenericType();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
