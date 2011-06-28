package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StateMachine StateMachine} in a functional way.
 * <p>
 * State machines can be used to express the behavior of part of a system. Behavior is
 * modeled as a traversal of a graph of state nodes interconnected by one or more joined
 * transition arcs that are triggered by the dispatching of series of (event) occurrences.
 * During this traversal, the state machine executes a series of activities associated
 * with various elements of the state machine. 
 * @see org.eclipse.uml2.uml.StateMachine
 * @generated
 */
public class StateMachinePath extends BehaviorPath {

	/**
	 * @generated
	 */
	 StateMachinePath() {
    super();
  }

	/**
	 * The regions owned directly by the state machine. 
	 * @see org.eclipse.uml2.uml.StateMachine#getRegions()
	 * @generated
	 */
	public static final Function<StateMachine, EList<Region>> region = new Function<StateMachine, EList<Region>>() {
    public EList<Region> apply(StateMachine s) {
      return s.getRegions();
    }
  };

	/**
	 * References the submachine(s) in case of a submachine state. Multiple machines are
	 * referenced in case of a concurrent state. 
	 * @see org.eclipse.uml2.uml.StateMachine#getSubmachineStates()
	 * @generated
	 */
	public static final Function<StateMachine, EList<State>> submachineState = new Function<StateMachine, EList<State>>() {
    public EList<State> apply(StateMachine s) {
      return s.getSubmachineStates();
    }
  };

	/**
	 * The connection points defined for this state machine. They represent the interface
	 * of the state machine when used as part of submachine state. 
	 * @see org.eclipse.uml2.uml.StateMachine#getConnectionPoints()
	 * @generated
	 */
	public static final Function<StateMachine, EList<Pseudostate>> connectionPoint = new Function<StateMachine, EList<Pseudostate>>() {
    public EList<Pseudostate> apply(StateMachine s) {
      return s.getConnectionPoints();
    }
  };

	/**
	 * The state machines of which this is an extension. 
	 * @see org.eclipse.uml2.uml.StateMachine#getExtendedStateMachines()
	 * @generated
	 */
	public static final Function<StateMachine, EList<StateMachine>> extendedStateMachine = new Function<StateMachine, EList<StateMachine>>() {
    public EList<StateMachine> apply(StateMachine s) {
      return s.getExtendedStateMachines();
    }
  };
	
	/**
	 * The classifier context of a state machine cannot be an interface.
	context->notEmpty()
	 * implies not context.oclIsKindOf(Interface) 
	 * @see org.eclipse.uml2.uml.StateMachine#validateClassifierContext(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> validateClassifierContext(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.validateClassifierContext(diagnostics, context);
      }
    };
  }

	/**
	 * The context classifier of the method state machine of a behavioral feature must be
	 * the classifier that owns the behavioral feature.
	specification->notEmpty() implies
	 * (context->notEmpty() and specification->featuringClassifier->exists (c | c = context))
	 * @see org.eclipse.uml2.uml.StateMachine#validateContextClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> validateContextClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.validateContextClassifier(diagnostics, context);
      }
    };
  }

	/**
	 * The connection points of a state machine are pseudostates of kind entry point or exit
	 * point.
	conectionPoint->forAll (c | c.kind = #entryPoint or c.kind = #exitPoint) 
	 * @see org.eclipse.uml2.uml.StateMachine#validateConnectionPoints(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> validateConnectionPoints(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.validateConnectionPoints(diagnostics, context);
      }
    };
  }

	/**
	 * A state machine as the method for a behavioral feature cannot have entry/exit connection
	 * points.
	specification->notEmpty() implies connectionPoint->isEmpty() 
	 * @see org.eclipse.uml2.uml.StateMachine#validateMethod(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> validateMethod(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.validateMethod(diagnostics, context);
      }
    };
  }

	/**
	 * The operation LCA(s1,s2) returns an orthogonal state or region which is the least
	 * common ancestor of states s1 and s2, based on the statemachine containment hierarchy.
	true
	 * @see org.eclipse.uml2.uml.StateMachine#LCA(State, State)
	 * @generated
	 */
	public static Function<StateMachine, Namespace> LCA(final State s1, final State s2) {
    return new Function<StateMachine, Namespace>() {
      public Namespace apply(StateMachine s) {
        return s.LCA(s1, s2);
      }
    };
  }

	/**
	 * The query ancestor(s1, s2) checks whether s2 is an ancestor state of state s1. context
	 * StateMachine::ancestor (s1 : State, s2 : State) : Boolean
	
	result = if (s2 = s1)
	 * then
	true
	else if (s1.container->isEmpty) then
	true
	else if (s2.container->isEmpty)
	 * then
	false
	else (ancestor (s1, s2.container)) 
	 * @see org.eclipse.uml2.uml.StateMachine#ancestor(State, State)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> ancestor(final State s1, final State s2) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.ancestor(s1, s2);
      }
    };
  }

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of a statemachine are properly related to the redefinition contexts of the specified
	 * statemachine to allow this element to redefine the other. The containing classifier
	 * of a redefining statemachine must redefine the containing classifier of the redefined
	 * statemachine.
	result = true 
	 * @see org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid(StateMachine)
	 * @generated
	 */
	public static ComposablePredicate<StateMachine> isRedefinitionContextValid(final StateMachine redefined) {
    return new ComposablePredicate<StateMachine>() {
      public boolean apply(StateMachine s) {
        return s.isRedefinitionContextValid(redefined);
      }
    };
  }

}
