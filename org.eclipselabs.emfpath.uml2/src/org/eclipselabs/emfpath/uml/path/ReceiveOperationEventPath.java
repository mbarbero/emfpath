package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ReceiveOperationEvent;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReceiveOperationEvent ReceiveOperationEvent} in a functional way.
 * <p>
 * A receive operation event specifies the event of receiving an operation invocation
 * for a particular operation by the target entity. 
 * @see org.eclipse.uml2.uml.ReceiveOperationEvent
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
	 * The operation associated with this event. 
	 * @see org.eclipse.uml2.uml.ReceiveOperationEvent#getOperation()
	 * @generated
	 */
	public static final Function<ReceiveOperationEvent, Operation> operation = new Function<ReceiveOperationEvent, Operation>() {
    public Operation apply(ReceiveOperationEvent s) {
      return s.getOperation();
    }
  };
	
	

}
