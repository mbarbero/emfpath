package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ReceiveOperationEvent;

/**
 * @generated
 */
public class ReceiveOperationEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private ReceiveOperationEventPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReceiveOperationEvent#getOperation()
	 * @generated
	 */
	public static final Function<ReceiveOperationEvent, Operation> operation = new Function<ReceiveOperationEvent, Operation>() {
		public Operation apply(ReceiveOperationEvent s) {
			return s.getOperation();
		}
	};
	
	

}
