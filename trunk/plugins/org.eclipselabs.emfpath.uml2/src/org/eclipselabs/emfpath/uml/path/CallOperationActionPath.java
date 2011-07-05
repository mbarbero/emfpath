package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Operation;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CallOperationAction CallOperationAction} in a functional way.
 * <p>
 * A call operation action is an action that transmits an operation call request to the
 * target object, where it may cause the invocation of associated behavior. The argument
 * values of the action are available to the execution of the invoked behavior. If the
 * action is marked synchronous, the execution of the call operation action waits until
 * the execution of the invoked behavior completes and a reply transmission is returned
 * to the caller; otherwise execution of the action is complete when the invocation of
 * the operation is established and the execution of the invoked operation proceeds concurrently
 * with the execution of the calling behavior. Any values returned as part of the reply
 * transmission are put on the result output pins of the call operation action. Upon
 * receipt of the reply transmission, execution of the call operation action is complete.
 * @see org.eclipse.uml2.uml.CallOperationAction
 * @generated
 */
public class CallOperationActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private CallOperationActionPath() {
    super();
  }

	/**
	 * The operation to be invoked by the action execution. 
	 * @see org.eclipse.uml2.uml.CallOperationAction#getOperation()
	 * @generated
	 */
	public static final Function<CallOperationAction, Operation> operation = new Function<CallOperationAction, Operation>() {
    public Operation apply(CallOperationAction s) {
      return s.getOperation();
    }
  };

	/**
	 * The target object to which the request is sent. The classifier of the target object
	 * is used to dynamically determine a behavior to invoke. This object constitutes the
	 * context of the execution of the operation. 
	 * @see org.eclipse.uml2.uml.CallOperationAction#getTarget()
	 * @generated
	 */
	public static final Function<CallOperationAction, InputPin> target = new Function<CallOperationAction, InputPin>() {
    public InputPin apply(CallOperationAction s) {
      return s.getTarget();
    }
  };
	
	/**
	 * The number of argument pins and the number of owned parameters of the operation of
	 * type in and in-out must be equal.
	true 
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateArgumentPinEqualParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CallOperationAction> validateArgumentPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CallOperationAction>() {
      public boolean apply(CallOperationAction s) {
        return s.validateArgumentPinEqualParameter(diagnostics, context);
      }
    };
  }

	/**
	 * The number of result pins and the number of owned parameters of the operation of type
	 * return, out, and in-out must be equal.
	true 
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateResultPinEqualParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CallOperationAction> validateResultPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CallOperationAction>() {
      public boolean apply(CallOperationAction s) {
        return s.validateResultPinEqualParameter(diagnostics, context);
      }
    };
  }

	/**
	 * The type of the target pin must be the same as the type that owns the operation.
	true
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateTypeTargetPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CallOperationAction> validateTypeTargetPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CallOperationAction>() {
      public boolean apply(CallOperationAction s) {
        return s.validateTypeTargetPin(diagnostics, context);
      }
    };
  }

}
