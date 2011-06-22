package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Operation;

/**
 * @generated
 */
public class CallEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private CallEventPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CallEvent#getOperation()
	 * @generated
	 */
	public static final Function<CallEvent, Operation> operation = new Function<CallEvent, Operation>() {
		public Operation apply(CallEvent s) {
			return s.getOperation();
		}
	};
	
	

}
