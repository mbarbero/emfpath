package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;

/**
 * @generated
 */
public class EncapsulatedClassifierPath extends StructuredClassifierPath {

	/**
	 * @generated
	 */
	 EncapsulatedClassifierPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts()
	 * @generated
	 */
	public static final Function<EncapsulatedClassifier, EList<Port>> ownedPort = new Function<EncapsulatedClassifier, EList<Port>>() {
		public EList<Port> apply(EncapsulatedClassifier s) {
			return s.getOwnedPorts();
		}
	};
	
	

}
