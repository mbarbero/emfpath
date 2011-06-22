package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.SendObjectAction;

/**
 * @generated
 */
public class SendObjectActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private SendObjectActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.SendObjectAction#getTarget()
	 * @generated
	 */
	public static final Function<SendObjectAction, InputPin> target = new Function<SendObjectAction, InputPin>() {
		public InputPin apply(SendObjectAction s) {
			return s.getTarget();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.SendObjectAction#getRequest()
	 * @generated
	 */
	public static final Function<SendObjectAction, InputPin> request = new Function<SendObjectAction, InputPin>() {
		public InputPin apply(SendObjectAction s) {
			return s.getRequest();
		}
	};
	
	

}
