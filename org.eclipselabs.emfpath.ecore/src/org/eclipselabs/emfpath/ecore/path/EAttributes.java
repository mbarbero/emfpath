package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * @generated
 */
public final class EAttributes {

	private EAttributes() {
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
	public static final Predicate<EStructuralFeature> isChangeable = EStructuralFeatures.isChangeable;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isVolatile = EStructuralFeatures.isVolatile;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isTransient = EStructuralFeatures.isTransient;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, String> defaultValueLiteral = EStructuralFeatures.defaultValueLiteral;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Object> defaultValue = EStructuralFeatures.defaultValue;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isUnsettable = EStructuralFeatures.isUnsettable;

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isDerived = EStructuralFeatures.isDerived;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, EClass> eContainingClass = EStructuralFeatures.eContainingClass;

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
	public static final Predicate<EAttribute> isID = new Predicate<EAttribute>() {
    public boolean apply(EAttribute s) {
      return s.isID();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EAttribute, EDataType> eAttributeType = new Function<EAttribute, EDataType>() {
    public EDataType apply(EAttribute s) {
      return s.getEAttributeType();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, java.lang.Integer> getFeatureID = EStructuralFeatures.getFeatureID;

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Class<?>> getContainerClass = EStructuralFeatures.getContainerClass;

	/**
	 * Create an new search object to find {@link EAttribute} from the specified <code>eClass</code>.
	 * 
	 * @param eClass the {@link EClass} to search in.
	 * @return a new search object
	 * @throws IllegalArgumentException if <code>eClass</code> is null
	 * @see EStructuralFeatures#from(EClass)
	 */
	public static Lookup from(EClass eClass) {
		return new Lookup(eClass);
	}
	
	/**
	 * A search object to find a {@link EAttribute} from an {@link EClass}. The {@link EAttribute} will be search in the
	 * whole {@link EClass}'s hierarchy.
	 * <p>
	 * Usage: <code>EAttributes.from(anEClass).named("xxx")</code>
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 * @since 0.1.0
	 */
	public final static class Lookup extends EStructuralFeatures.Lookup {

		private Lookup(EClass eClass) {
			super(eClass);
		}

		/**
		 * Search for an {@link EAttribute} named <code>featureNamed</code>.
		 * 
		 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
		 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
		 * @throws ClassCastException if the {@link EStructuralFeature} named <code>featureName</code> is an
		 *         {@link EReference} and not an {@link EAttribute}
		 * @see org.eclipselabs.emfpath.internal.i18n.utils.EStructuralFeatures#named(java.lang.String)
		 */
		@Override
		public EAttribute named(String featureName) throws NoSuchFeatureException {
			EStructuralFeature ret = super.named(featureName);

			if (!(ret instanceof EAttribute)) {
				throw new ClassCastException("The feature named " + featureName + " in " + this.eClass.getName() + " is not an EAttribute");
			}

			return (EAttribute) ret;
		}
	}
}
