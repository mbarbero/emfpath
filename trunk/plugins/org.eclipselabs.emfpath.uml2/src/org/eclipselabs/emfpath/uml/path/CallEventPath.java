package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Operation;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CallEvent CallEvent} in a functional way.
 * <p>
 * A call event models the receipt by an object of a message invoking a call of an operation.
 * @see org.eclipse.uml2.uml.CallEvent
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
	 * Designates the operation whose invocation raised the call event. 
	 * @see org.eclipse.uml2.uml.CallEvent#getOperation()
	 * @generated
	 */
	public static final Function<CallEvent, Operation> operation = new Function<CallEvent, Operation>() {
    public Operation apply(CallEvent s) {
      return s.getOperation();
    }
  };
	
	

}
