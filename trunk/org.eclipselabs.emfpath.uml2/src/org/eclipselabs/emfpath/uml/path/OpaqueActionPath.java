package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;

/**
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
	 * @see org.eclipse.uml2.uml.OpaqueAction#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<String>> body = new Function<OpaqueAction, EList<String>>() {
		public EList<String> apply(OpaqueAction s) {
			return s.getBodies();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueAction#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<String>> language = new Function<OpaqueAction, EList<String>>() {
		public EList<String> apply(OpaqueAction s) {
			return s.getLanguages();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueAction#getInputValues()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<InputPin>> inputValue = new Function<OpaqueAction, EList<InputPin>>() {
		public EList<InputPin> apply(OpaqueAction s) {
			return s.getInputValues();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueAction#getOutputValues()
	 * @generated
	 */
	public static final Function<OpaqueAction, EList<OutputPin>> outputValue = new Function<OpaqueAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(OpaqueAction s) {
			return s.getOutputValues();
		}
	};
	
	

}
