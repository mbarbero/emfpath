package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.BroadcastSignalAction BroadcastSignalAction} in a functional way.
 * <p>
 * A broadcast signal action is an action that transmits a signal instance to all the
 * potential target objects in the system, which may cause the firing of a state machine
 * transitions or the execution of associated activities of a target object. The argument
 * values are available to the execution of associated behaviors. The requestor continues
 * execution immediately after the signals are sent out. It does not wait for receipt.
 * Any reply messages are ignored and are not transmitted to the requestor. 
 * @see org.eclipse.uml2.uml.BroadcastSignalAction
 * @generated
 */
public class BroadcastSignalActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private BroadcastSignalActionPath() {
    super();
  }

	/**
	 * The specification of signal object transmitted to the target objects. 
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#getSignal()
	 * @generated
	 */
	public static final Function<BroadcastSignalAction, Signal> signal = new Function<BroadcastSignalAction, Signal>() {
    public Signal apply(BroadcastSignalAction s) {
      return s.getSignal();
    }
  };
	
	/**
	 * The number and order of argument pins must be the same as the number and order of
	 * attributes in the signal.
	true 
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#validateNumberAndOrder(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<BroadcastSignalAction> validateNumberAndOrder(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<BroadcastSignalAction>() {
      public boolean apply(BroadcastSignalAction s) {
        return s.validateNumberAndOrder(diagnostics, context);
      }
    };
  }

	/**
	 * The type, ordering, and multiplicity of an argument pin must be the same as the corresponding
	 * attribute of the signal.
	true 
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#validateTypeOrderingMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<BroadcastSignalAction> validateTypeOrderingMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<BroadcastSignalAction>() {
      public boolean apply(BroadcastSignalAction s) {
        return s.validateTypeOrderingMultiplicity(diagnostics, context);
      }
    };
  }

}
