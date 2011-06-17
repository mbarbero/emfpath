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
import org.eclipse.emf.ecore.EDataType;

/**
 * @generated
 */
public final class EDataTypes {

	private EDataTypes() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceClassName = EClassifiers.instanceClassName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = EClassifiers.instanceClass;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = EClassifiers.defaultValue;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = EClassifiers.instanceTypeName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = EClassifiers.ePackage;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = EClassifiers.eTypeParameters;

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
	public static final Predicate<EDataType> isSerializable = new Predicate<EDataType>() {
    public boolean apply(EDataType s) {
      return s.isSerializable();
    }
  };
	
	/**
	 * @generated
	 */
	public static Predicate<EClassifier> isInstance(final Object object) {
    return EClassifiers.isInstance(object);
  }

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = EClassifiers.getClassifierID;

	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

}
