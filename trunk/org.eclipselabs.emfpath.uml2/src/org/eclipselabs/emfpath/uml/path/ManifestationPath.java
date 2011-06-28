package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.PackageableElement;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Manifestation Manifestation} in a functional way.
 * <p>
 * A manifestation is the concrete physical rendering of one or more model elements by
 * an artifact. 
 * @see org.eclipse.uml2.uml.Manifestation
 * @generated
 */
public class ManifestationPath extends AbstractionPath {

	/**
	 * @generated
	 */
	private ManifestationPath() {
    super();
  }

	/**
	 * The model element that is utilized in the manifestation in an Artifact. 
	 * @see org.eclipse.uml2.uml.Manifestation#getUtilizedElement()
	 * @generated
	 */
	public static final Function<Manifestation, PackageableElement> utilizedElement = new Function<Manifestation, PackageableElement>() {
    public PackageableElement apply(Manifestation s) {
      return s.getUtilizedElement();
    }
  };
	
	

}
