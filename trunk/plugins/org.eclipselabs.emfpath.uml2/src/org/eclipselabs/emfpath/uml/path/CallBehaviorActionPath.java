package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CallBehaviorAction CallBehaviorAction} in a functional way.
 * <p>
 * A call behavior action is a call action that invokes a behavior directly rather than
 * invoking a behavioral feature that, in turn, results in the invocation of that behavior.
 * The argument values of the action are available to the execution of the invoked behavior.
 * For synchronous calls the execution of the call behavior action waits until the execution
 * of the invoked behavior completes and a result is returned on its output pin. The
 * action completes immediately without a result, if the call is asynchronous. In particular,
 * the invoked behavior may be an activity. 
 * @see org.eclipse.uml2.uml.CallBehaviorAction
 * @generated
 */
public class CallBehaviorActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private CallBehaviorActionPath() {
    super();
  }

	/**
	 * The invoked behavior. It must be capable of accepting and returning control. 
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#getBehavior()
	 * @generated
	 */
	public static final Function<CallBehaviorAction, Behavior> behavior = new Function<CallBehaviorAction, Behavior>() {
    public Behavior apply(CallBehaviorAction s) {
      return s.getBehavior();
    }
  };
	
	/**
	 * The number of argument pins and the number of parameters of the behavior of type in
	 * and in-out must be equal.
	true 
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#validateArgumentPinEqualParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CallBehaviorAction> validateArgumentPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CallBehaviorAction>() {
      public boolean apply(CallBehaviorAction s) {
        return s.validateArgumentPinEqualParameter(diagnostics, context);
      }
    };
  }

	/**
	 * The number of result pins and the number of parameters of the behavior of type return,
	 * out, and in-out must be equal.
	true 
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#validateResultPinEqualParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CallBehaviorAction> validateResultPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CallBehaviorAction>() {
      public boolean apply(CallBehaviorAction s) {
        return s.validateResultPinEqualParameter(diagnostics, context);
      }
    };
  }

}
