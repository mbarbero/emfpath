package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageMerge;

/**
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
	 * @see org.eclipse.uml2.uml.PackageMerge#getMergedPackage()
	 * @generated
	 */
	public static final Function<PackageMerge, Package> mergedPackage = new Function<PackageMerge, Package>() {
		public Package apply(PackageMerge s) {
			return s.getMergedPackage();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.PackageMerge#getReceivingPackage()
	 * @generated
	 */
	public static final Function<PackageMerge, Package> receivingPackage = new Function<PackageMerge, Package>() {
		public Package apply(PackageMerge s) {
			return s.getReceivingPackage();
		}
	};
	
	

}
