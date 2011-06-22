package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RaiseExceptionAction;

/**
 * @generated
 */
public class RaiseExceptionActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private RaiseExceptionActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.RaiseExceptionAction#getException()
	 * @generated
	 */
	public static final Function<RaiseExceptionAction, InputPin> exception = new Function<RaiseExceptionAction, InputPin>() {
		public InputPin apply(RaiseExceptionAction s) {
			return s.getException();
		}
	};
	
	

}
