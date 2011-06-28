package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageMerge;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.PackageMerge PackageMerge} in a functional way.
 * <p>
 * A package merge defines how the contents of one package are extended by the contents
 * of another package. 
 * @see org.eclipse.uml2.uml.PackageMerge
 * @generated
 */
public class PackageMergePath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private PackageMergePath() {
    super();
  }

	/**
	 * References the Package that is to be merged with the receiving package of the PackageMerge.
	 * @see org.eclipse.uml2.uml.PackageMerge#getMergedPackage()
	 * @generated
	 */
	public static final Function<PackageMerge, Package> mergedPackage = new Function<PackageMerge, Package>() {
    public Package apply(PackageMerge s) {
      return s.getMergedPackage();
    }
  };

	/**
	 * References the Package that is being extended with the contents of the merged package
	 * of the PackageMerge. 
	 * @see org.eclipse.uml2.uml.PackageMerge#getReceivingPackage()
	 * @generated
	 */
	public static final Function<PackageMerge, Package> receivingPackage = new Function<PackageMerge, Package>() {
    public Package apply(PackageMerge s) {
      return s.getReceivingPackage();
    }
  };
	
	

}
