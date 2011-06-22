package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.SendOperationEvent;

/**
 * @generated
 */
public class SendOperationEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private SendOperationEventPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.SendOperationEvent#getOperation()
	 * @generated
	 */
	public static final Function<SendOperationEvent, Operation> operation = new Function<SendOperationEvent, Operation>() {
		public Operation apply(SendOperationEvent s) {
			return s.getOperation();
		}
	};
	
	

}
