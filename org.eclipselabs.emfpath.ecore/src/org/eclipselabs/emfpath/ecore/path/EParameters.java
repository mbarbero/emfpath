package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * @generated
 */
public final class EParameters {

	private EParameters() {
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
	public static final Predicate<ETypedElement> isOrdered = ETypedElements.isOrdered;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isUnique = ETypedElements.isUnique;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> lowerBound = ETypedElements.lowerBound;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, java.lang.Integer> upperBound = ETypedElements.upperBound;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isMany = ETypedElements.isMany;

	/**
	 * @generated
	 */
	public static final Predicate<ETypedElement> isRequired = ETypedElements.isRequired;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EClassifier> eType = ETypedElements.eType;

	/**
	 * @generated
	 */
	public static final Function<ETypedElement, EGenericType> eGenericType = ETypedElements.eGenericType;

	/**
	 * @generated
	 */
	public static final Function<EParameter, EOperation> eOperation = new Function<EParameter, EOperation>() {
    public EOperation apply(EParameter s) {
      return s.getEOperation();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
