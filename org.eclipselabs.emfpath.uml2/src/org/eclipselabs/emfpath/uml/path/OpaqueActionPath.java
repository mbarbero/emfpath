package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.OpaqueAction OpaqueAction} in a functional way.
 * <p>
 * An action with implementation-specific semantics. 
 * @see org.eclipse.uml2.uml.OpaqueAction
 * @generated
 */
public class OpaqueActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private OpaqueActionPath() {
		super();
	}

	/**
	 * Specifies the action in one or more languages. 
	 * @see org.eclipse.uml2.uml.OpaqueAction#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<String>> body = new Function<OpaqueAction, EList<String>>() {
		public EList<String> apply(OpaqueAction s) {
			return s.getBodies();
		}
	};

	/**
	 * Languages the body strings use, in the same order as the body strings 
	 * @see org.eclipse.uml2.uml.OpaqueAction#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<String>> language = new Function<OpaqueAction, EList<String>>() {
		public EList<String> apply(OpaqueAction s) {
			return s.getLanguages();
		}
	};

	/**
	 * Provides input to the action. 
	 * @see org.eclipse.uml2.uml.OpaqueAction#getInputValues()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<InputPin>> inputValue = new Function<OpaqueAction, EList<InputPin>>() {
		public EList<InputPin> apply(OpaqueAction s) {
			return s.getInputValues();
		}
	};

	/**
	 * Takes output from the action. 
	 * @see org.eclipse.uml2.uml.OpaqueAction#getOutputValues()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<OutputPin>> outputValue = new Function<OpaqueAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(OpaqueAction s) {
			return s.getOutputValues();
		}
	};
	
	

}
