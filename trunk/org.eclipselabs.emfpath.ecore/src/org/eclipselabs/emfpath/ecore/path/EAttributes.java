package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.base.ComposablePredicate;
import org.eclipselabs.emfpath.ecore.exception.NoSuchFeatureException;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EAttributes extends EStructuralFeatures {



	
	/**
   * @generated
   */
  private EAttributes() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EAttribute#isID()
   * @generated
   */
  public static final ComposablePredicate<EAttribute> isID = new ComposablePredicate<EAttribute>() {
    public boolean apply(EAttribute s) {
      return s.isID();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EAttribute#getEAttributeType()
   * @generated
   */
  public static final Function<EAttribute, EDataType> eAttributeType = new Function<EAttribute, EDataType>() {
    public EDataType apply(EAttribute s) {
      return s.getEAttributeType();
    }
  };

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
