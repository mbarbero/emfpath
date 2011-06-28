package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActionInputPin ActionInputPin} in a functional way.
 * <p>
 * An action input pin is a kind of pin that executes an action to determine the values
 * to input to another. 
 * @see org.eclipse.uml2.uml.ActionInputPin
 * @generated
 */
public class ActionInputPinPath extends InputPinPath {

	/**
	 * @generated
	 */
	private ActionInputPinPath() {
    super();
  }

	/**
	 * The action used to provide values. 
	 * @see org.eclipse.uml2.uml.ActionInputPin#getFromAction()
	 * @generated
	 */
	public static final Function<ActionInputPin, Action> fromAction = new Function<ActionInputPin, Action>() {
    public Action apply(ActionInputPin s) {
      return s.getFromAction();
    }
  };
	
	/**
	 * The fromAction of an action input pin must have exactly one output pin.
	true 
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActionInputPin> validateOneOutputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActionInputPin>() {
      public boolean apply(ActionInputPin s) {
        return s.validateOneOutputPin(diagnostics, context);
      }
    };
  }

	/**
	 * The fromAction of an action input pin must only have action input pins as input pins.
	true
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActionInputPin> validateInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActionInputPin>() {
      public boolean apply(ActionInputPin s) {
        return s.validateInputPin(diagnostics, context);
      }
    };
  }

	/**
	 * The fromAction of an action input pin cannot have control or data flows coming into
	 * or out of it or its pins.
	true 
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrDataFlow(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActionInputPin> validateNoControlOrDataFlow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActionInputPin>() {
      public boolean apply(ActionInputPin s) {
        return s.validateNoControlOrDataFlow(diagnostics, context);
      }
    };
  }

}
