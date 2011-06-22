package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

/**
 * @generated
 */
public class InterfaceRealizationPath extends RealizationPath {

	/**
	 * @generated
	 */
	private InterfaceRealizationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getContract()
	 * @generated
	 */
	public static final Function<InterfaceRealization, Interface> contract = new Function<InterfaceRealization, Interface>() {
		public Interface apply(InterfaceRealization s) {
			return s.getContract();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier()
	 * @generated
	 */
	public static final Function<InterfaceRealization, BehavioredClassifier> implementingClassifier = new Function<InterfaceRealization, BehavioredClassifier>() {
		public BehavioredClassifier apply(InterfaceRealization s) {
			return s.getImplementingClassifier();
		}
	};
	
	

}
