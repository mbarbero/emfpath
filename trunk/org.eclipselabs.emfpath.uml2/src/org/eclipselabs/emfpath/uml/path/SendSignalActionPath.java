package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SendSignalAction SendSignalAction} in a functional way.
 * <p>
 * A send signal action is an action that creates a signal instance from its inputs,
 * and transmits it to the target object, where it may cause the firing of a state machine
 * transition or the execution of an activity. The argument values are available to the
 * execution of associated behaviors. The requestor continues execution immediately.
 * Any reply message is ignored and is not transmitted to the requestor. If the input
 * is already a signal instance, use a send object action. 
 * @see org.eclipse.uml2.uml.SendSignalAction
 * @generated
 */
public class SendSignalActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private SendSignalActionPath() {
    super();
  }

	/**
	 * The target object to which the signal is sent. 
	 * @see org.eclipse.uml2.uml.SendSignalAction#getTarget()
	 * @generated
	 */
	public static final Function<SendSignalAction, InputPin> target = new Function<SendSignalAction, InputPin>() {
    public InputPin apply(SendSignalAction s) {
      return s.getTarget();
    }
  };

	/**
	 * The type of signal transmitted to the target object. 
	 * @see org.eclipse.uml2.uml.SendSignalAction#getSignal()
	 * @generated
	 */
	public static final Function<SendSignalAction, Signal> signal = new Function<SendSignalAction, Signal>() {
    public Signal apply(SendSignalAction s) {
      return s.getSignal();
    }
  };
	
	/**
	 * The number and order of argument pins must be the same as the number and order of
	 * attributes in the signal.
	true 
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateNumberOrder(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<SendSignalAction> validateNumberOrder(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<SendSignalAction>() {
      public boolean apply(SendSignalAction s) {
        return s.validateNumberOrder(diagnostics, context);
      }
    };
  }

	/**
	 * The type, ordering, and multiplicity of an argument pin must be the same as the corresponding
	 * attribute of the signal.
	true 
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateTypeOrderingMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<SendSignalAction> validateTypeOrderingMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<SendSignalAction>() {
      public boolean apply(SendSignalAction s) {
        return s.validateTypeOrderingMultiplicity(diagnostics, context);
      }
    };
  }

}
