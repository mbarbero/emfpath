package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipselabs.emfpath.ecore.path.internal.i18n.Messages;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;

/**
 * @generated
 */
public final class EStructuralFeatures {

	private EStructuralFeatures() {
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
	public static final Predicate<EStructuralFeature> isChangeable = new Predicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isChangeable();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isVolatile = new Predicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isVolatile();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isTransient = new Predicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isTransient();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, String> defaultValueLiteral = new Function<EStructuralFeature, String>() {
    public String apply(EStructuralFeature s) {
      return s.getDefaultValueLiteral();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Object> defaultValue = new Function<EStructuralFeature, Object>() {
    public Object apply(EStructuralFeature s) {
      return s.getDefaultValue();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isUnsettable = new Predicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isUnsettable();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<EStructuralFeature> isDerived = new Predicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isDerived();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, EClass> eContainingClass = new Function<EStructuralFeature, EClass>() {
    public EClass apply(EStructuralFeature s) {
      return s.getEContainingClass();
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
	public static final Function<EStructuralFeature, java.lang.Integer> getFeatureID = new Function<EStructuralFeature, java.lang.Integer>() {
    public java.lang.Integer apply(EStructuralFeature s) {
      return s.getFeatureID();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EStructuralFeature, Class<?>> getContainerClass = new Function<EStructuralFeature, Class<?>>() {
    public Class<?> apply(EStructuralFeature s) {
      return s.getContainerClass();
    }
  };

	/**
	 * Create an new search object to find {@link EStructuralFeature} from the specified <code>eClass</code>.
	 * 
	 * @param eClass the {@link EClass} to search in.
	 * @return a new search object
	 * @throws IllegalArgumentException if <code>eClass</code> is null
	 */
	public static EStructuralFeatures.Lookup from(EClass eClass) {
		Preconditions.checkArgument(eClass != null, Messages.getString("EStructuralFeatures.0")); //$NON-NLS-1$
		return new EStructuralFeatures.Lookup(eClass);
	}
	
	/**
	 * A search object to find a {@link EStructuralFeature} from an {@link EClass}. The {@link EStructuralFeature} will be
	 * search in the whole {@link EClass}'s hierarchy.
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @since 0.1.0
	 */
	public static class Lookup {

		/**
		 * The EClass where the feature will be search in.
		 */
		protected EClass eClass;

		/**
		 * Construct a new search object
		 * 
		 * @param eClass the EClass where the feature will be search in.
		 */
		Lookup(EClass eClass) {
			this.eClass = eClass;
		}

		/**
		 * Search for a {@link EStructuralFeature} with the given <code>name</code>.
		 * 
		 * @param featureName the name of the searched {@link EStructuralFeature}
		 * @return the feature with the search name.
		 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
		 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
		 */
		public EStructuralFeature named(String featureName) throws NoSuchFeatureException {
			Preconditions.checkArgument(!Strings.isNullOrEmpty(featureName), Messages.getString("EStructuralFeatures.3")); //$NON-NLS-1$

			EStructuralFeature ret = this.eClass.getEStructuralFeature(featureName);
			if (ret == null) {
				throw new NoSuchFeatureException(featureName, this.eClass);
			}

			return ret;
		}
	}
}
