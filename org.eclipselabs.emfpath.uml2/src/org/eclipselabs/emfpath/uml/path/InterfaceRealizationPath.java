package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InterfaceRealization InterfaceRealization} in a functional way.
 * <p>
 * An interface realization is a specialized realization relationship between a classifier
 * and an interface. This relationship signifies that the realizing classifier conforms
 * to the contract specified by the interface. 
 * @see org.eclipse.uml2.uml.InterfaceRealization
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
	 * References the Interface specifying the conformance contract. 
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getContract()
	 * @generated
	 */
	public static final Function<InterfaceRealization, Interface> contract = new Function<InterfaceRealization, Interface>() {
		public Interface apply(InterfaceRealization s) {
			return s.getContract();
		}
	};

	/**
	 * References the BehavioredClassifier that owns this Interfacerealization (i.e., the
	 * classifier that realizes the Interface to which it points). 
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier()
	 * @generated
	 */
	public static final Function<InterfaceRealization, BehavioredClassifier> implementingClassifier = new Function<InterfaceRealization, BehavioredClassifier>() {
		public BehavioredClassifier apply(InterfaceRealization s) {
			return s.getImplementingClassifier();
		}
	};
	
	

}
