package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.SendOperationEvent;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SendOperationEvent SendOperationEvent} in a functional way.
 * <p>
 * A send operation event models the invocation of an operation call. 
 * @see org.eclipse.uml2.uml.SendOperationEvent
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
	 * The operation associated with this event. 
	 * @see org.eclipse.uml2.uml.SendOperationEvent#getOperation()
	 * @generated
	 */
	public static final Function<SendOperationEvent, Operation> operation = new Function<SendOperationEvent, Operation>() {
    public Operation apply(SendOperationEvent s) {
      return s.getOperation();
    }
  };
	
	

}
