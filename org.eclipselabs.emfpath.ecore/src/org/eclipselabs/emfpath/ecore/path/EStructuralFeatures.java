package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.base.ComposablePredicate;
import org.eclipselabs.emfpath.ecore.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.ecore.internal.i18n.Messages;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * @generated
 */
public class EStructuralFeatures extends ETypedElements {


	/**
   * @generated
   */
   EStructuralFeatures() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#isChangeable()
   * @generated
   */
  public static final ComposablePredicate<EStructuralFeature> isChangeable = new ComposablePredicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isChangeable();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#isVolatile()
   * @generated
   */
  public static final ComposablePredicate<EStructuralFeature> isVolatile = new ComposablePredicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isVolatile();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#isTransient()
   * @generated
   */
  public static final ComposablePredicate<EStructuralFeature> isTransient = new ComposablePredicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isTransient();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#getDefaultValueLiteral()
   * @generated
   */
  public static final Function<EStructuralFeature, String> defaultValueLiteral = new Function<EStructuralFeature, String>() {
    public String apply(EStructuralFeature s) {
      return s.getDefaultValueLiteral();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#getDefaultValue()
   * @generated
   */
  public static final Function<EStructuralFeature, Object> defaultValue = new Function<EStructuralFeature, Object>() {
    public Object apply(EStructuralFeature s) {
      return s.getDefaultValue();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#isUnsettable()
   * @generated
   */
  public static final ComposablePredicate<EStructuralFeature> isUnsettable = new ComposablePredicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isUnsettable();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#isDerived()
   * @generated
   */
  public static final ComposablePredicate<EStructuralFeature> isDerived = new ComposablePredicate<EStructuralFeature>() {
    public boolean apply(EStructuralFeature s) {
      return s.isDerived();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#getEContainingClass()
   * @generated
   */
  public static final Function<EStructuralFeature, EClass> eContainingClass = new Function<EStructuralFeature, EClass>() {
    public EClass apply(EStructuralFeature s) {
      return s.getEContainingClass();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#getFeatureID()
   * @generated
   */
  public static final Function<EStructuralFeature, java.lang.Integer> getFeatureID = new Function<EStructuralFeature, java.lang.Integer>() {
    public java.lang.Integer apply(EStructuralFeature s) {
      return s.getFeatureID();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EStructuralFeature#getContainerClass()
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
