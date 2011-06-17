package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypeParameter;

/**
 * @generated
 */
public final class EGenericTypes {

	private EGenericTypes() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EGenericType> eUpperBound = new Function<EGenericType, EGenericType>() {
    public EGenericType apply(EGenericType s) {
      return s.getEUpperBound();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EList<EGenericType>> eTypeArguments = new Function<EGenericType, EList<EGenericType>>() {
    public EList<EGenericType> apply(EGenericType s) {
      return s.getETypeArguments();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EClassifier> eRawType = new Function<EGenericType, EClassifier>() {
    public EClassifier apply(EGenericType s) {
      return s.getERawType();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EGenericType> eLowerBound = new Function<EGenericType, EGenericType>() {
    public EGenericType apply(EGenericType s) {
      return s.getELowerBound();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EGenericType, ETypeParameter> eTypeParameter = new Function<EGenericType, ETypeParameter>() {
    public ETypeParameter apply(EGenericType s) {
      return s.getETypeParameter();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EGenericType, EClassifier> eClassifier = new Function<EGenericType, EClassifier>() {
    public EClassifier apply(EGenericType s) {
      return s.getEClassifier();
    }
  };
	
	

}
