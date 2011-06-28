package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.base.ComposablePredicate;
import org.eclipselabs.emfpath.ecore.exception.NoSuchFeatureException;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EReferences extends EStructuralFeatures {

	
	/**
   * @generated
   */
  private EReferences() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#isContainment()
   * @generated
   */
  public static final ComposablePredicate<EReference> isContainment = new ComposablePredicate<EReference>() {
    public boolean apply(EReference s) {
      return s.isContainment();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#isContainer()
   * @generated
   */
  public static final ComposablePredicate<EReference> isContainer = new ComposablePredicate<EReference>() {
    public boolean apply(EReference s) {
      return s.isContainer();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#isResolveProxies()
   * @generated
   */
  public static final ComposablePredicate<EReference> isResolveProxies = new ComposablePredicate<EReference>() {
    public boolean apply(EReference s) {
      return s.isResolveProxies();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#getEOpposite()
   * @generated
   */
  public static final Function<EReference, EReference> eOpposite = new Function<EReference, EReference>() {
    public EReference apply(EReference s) {
      return s.getEOpposite();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#getEReferenceType()
   * @generated
   */
  public static final Function<EReference, EClass> eReferenceType = new Function<EReference, EClass>() {
    public EClass apply(EReference s) {
      return s.getEReferenceType();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EReference#getEKeys()
   * @generated
   */
  public static final Function<EReference, EList<EAttribute>> eKeys = new Function<EReference, EList<EAttribute>>() {
    public EList<EAttribute> apply(EReference s) {
      return s.getEKeys();
    }
  };

  /**
	 * Create an new search object to find {@link EReference} from the specified <code>eClass</code>.
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
	 * A search object to find a {@link EReference} from an {@link EClass}. The {@link EReference} will be search in the
	 * whole {@link EClass}'s hierarchy.
	 * <p>
	 * Usage: <code>EReferences.from(anEClass).named("xxx")</code>
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 * @since 0.1.0
	 */
	public static final class Lookup extends EStructuralFeatures.Lookup {

		private Lookup(EClass eClass) {
			super(eClass);
		}

		/**
		 * Search for a {@link EReference} with the given <code>name</code>.
		 * 
		 * @param featureName the name of the searched {@link EReference}
		 * @return the feature with the search name.
		 * @throws NoSuchFeatureException if there is no {@link EStructuralFeature} with name <code>featureName</code>
		 * @throws IllegalArgumentException if <code>featureName</code> is null or empty
		 * @throws ClassCastException if the {@link EStructuralFeature} named <code>featureName</code> is an
		 *         {@link EAttribute} and not an {@link EReference}
		 * @see org.eclipselabs.emfpath.base.EStructuralFeatures#named(java.lang.String)
		 */
		@Override
		public EReference named(String featureName) throws NoSuchFeatureException {
			EStructuralFeature ret = super.named(featureName);

			if (!(ret instanceof EReference)) {
				throw new ClassCastException("The feature named " + featureName + " in " + this.eClass.getName() + " is not an EReference");
			}

			return (EReference) ret;
		}
	}
	
}
