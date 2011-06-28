package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StartObjectBehaviorAction StartObjectBehaviorAction} in a functional way.
 * <p>
 * StartObjectBehaviorAction is an action that starts the execution either of a directly
 * instantiated behavior or of the classifier behavior of an object. Argument values
 * may be supplied for the input parameters of the behavior. If the behavior is invoked
 * synchronously, then output values may be obtained for output parameters. 
 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction
 * @generated
 */
public class StartObjectBehaviorActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private StartObjectBehaviorActionPath() {
    super();
  }

	/**
	 * Holds the object which is either a behavior to be started or has a classifier behavior
	 * to be started. 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#getObject()
	 * @generated
	 */
	public static final Function<StartObjectBehaviorAction, InputPin> object = new Function<StartObjectBehaviorAction, InputPin>() {
    public InputPin apply(StartObjectBehaviorAction s) {
      return s.getObject();
    }
  };
	
	/**
	 * The type of the object input pin must be either a Behavior or a BehavioredClassifier
	 * with a classifier behavior.
	true 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOfObject(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StartObjectBehaviorAction> validateTypeOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StartObjectBehaviorAction>() {
      public boolean apply(StartObjectBehaviorAction s) {
        return s.validateTypeOfObject(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the object input pin must be [1..1].
	true 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateMultiplicityOfObject(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StartObjectBehaviorAction> validateMultiplicityOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StartObjectBehaviorAction>() {
      public boolean apply(StartObjectBehaviorAction s) {
        return s.validateMultiplicityOfObject(diagnostics, context);
      }
    };
  }

	/**
	 * The number and order of the argument pins must be the same as the number and order
	 * of the in and in-out parameters of the invoked behavior. Pins are matched to parameters
	 * by order.
	true 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderArguments(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StartObjectBehaviorAction> validateNumberOrderArguments(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StartObjectBehaviorAction>() {
      public boolean apply(StartObjectBehaviorAction s) {
        return s.validateNumberOrderArguments(diagnostics, context);
      }
    };
  }

	/**
	 * The number and order of result pins must be the same as the number and order of the
	 * in-out, out and return parameters of the invoked behavior. Pins are matched to parameters
	 * by order.
	true 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderResults(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StartObjectBehaviorAction> validateNumberOrderResults(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StartObjectBehaviorAction>() {
      public boolean apply(StartObjectBehaviorAction s) {
        return s.validateNumberOrderResults(diagnostics, context);
      }
    };
  }

	/**
	 * The type, ordering, and multiplicity of an argument or result pin must be the same
	 * as the corresponding parameter of the behavior.
	true 
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOrderingMultiplicityMatch(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StartObjectBehaviorAction> validateTypeOrderingMultiplicityMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StartObjectBehaviorAction>() {
      public boolean apply(StartObjectBehaviorAction s) {
        return s.validateTypeOrderingMultiplicityMatch(diagnostics, context);
      }
    };
  }

}
