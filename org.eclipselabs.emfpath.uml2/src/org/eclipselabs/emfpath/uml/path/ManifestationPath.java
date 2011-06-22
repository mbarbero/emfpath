package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.PackageableElement;

/**
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
	 * @see org.eclipse.uml2.uml.Manifestation#getUtilizedElement()
	 * @generated
	 */
	public static final Function<Manifestation, PackageableElement> utilizedElement = new Function<Manifestation, PackageableElement>() {
		public PackageableElement apply(Manifestation s) {
			return s.getUtilizedElement();
		}
	};
	
	

}
