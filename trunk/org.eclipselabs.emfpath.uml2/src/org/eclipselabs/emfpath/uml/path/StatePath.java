package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.State State} in a functional way.
 * <p>
 * A state models a situation during which some (usually implicit) invariant condition
 * holds.
The states of protocol state machines are exposed to the users of their context
 * classifiers. A protocol state represents an exposed stable situation of its context
 * classifier: when an instance of the classifier is not processing any operation, users
 * of this instance can always know its state configuration. 
 * @see org.eclipse.uml2.uml.State
 * @generated
 */
public class StatePath extends NamespacePath {

	/**
	 * @generated
	 */
	 StatePath() {
    super();
  }

	/**
	 * Indicates whether it is possible to further specialize a RedefinableElement. If the
	 * value is true, then it is not possible to further specialize the RedefinableElement.
	 *
	 * @see RedefinableElementPath#isLeaf()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final ComposablePredicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * The redefinable element that is being redefined by this element. 
	 *
	 * @see RedefinableElementPath#redefinedElement()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * References the contexts that this element may be redefined from. 
	 *
	 * @see RedefinableElementPath#redefinitionContext()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * Specifies the transitions departing from this vertex. 
	 *
	 * @see VertexPath#outgoing()
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> outgoing = VertexPath.outgoing;

	/**
	 * Specifies the transitions entering this vertex. 
	 *
	 * @see VertexPath#incoming()
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> incoming = VertexPath.incoming;

	/**
	 * The region that contains this vertex. 
	 *
	 * @see VertexPath#container()
	 * @see org.eclipse.uml2.uml.Vertex#getContainer()
	 * @generated
	 */
	public static final Function<Vertex, Region> container = VertexPath.container;

	/**
	 * A state with isComposite=true is said to be a composite state. A composite state is
	 * a state that contains at least one region. 
	 * @see org.eclipse.uml2.uml.State#isComposite()
	 * @generated
	 */
	public static final ComposablePredicate<State> isComposite = new ComposablePredicate<State>() {
    public boolean apply(State s) {
      return s.isComposite();
    }
  };

	/**
	 * A state with isOrthogonal=true is said to be an orthogonal composite state. An orthogonal
	 * composite state contains two or more regions. 
	 * @see org.eclipse.uml2.uml.State#isOrthogonal()
	 * @generated
	 */
	public static final ComposablePredicate<State> isOrthogonal = new ComposablePredicate<State>() {
    public boolean apply(State s) {
      return s.isOrthogonal();
    }
  };

	/**
	 * A state with isSimple=true is said to be a simple state. A simple state does not have
	 * any regions and it does not refer to any submachine state machine. 
	 * @see org.eclipse.uml2.uml.State#isSimple()
	 * @generated
	 */
	public static final ComposablePredicate<State> isSimple = new ComposablePredicate<State>() {
    public boolean apply(State s) {
      return s.isSimple();
    }
  };

	/**
	 * A state with isSubmachineState=true is said to be a submachine state. Such a state
	 * refers to a state machine (submachine). 
	 * @see org.eclipse.uml2.uml.State#isSubmachineState()
	 * @generated
	 */
	public static final ComposablePredicate<State> isSubmachineState = new ComposablePredicate<State>() {
    public boolean apply(State s) {
      return s.isSubmachineState();
    }
  };

	/**
	 * The state machine that is to be inserted in place of the (submachine) state. 
	 * @see org.eclipse.uml2.uml.State#getSubmachine()
	 * @generated
	 */
	public static final Function<State, StateMachine> submachine = new Function<State, StateMachine>() {
    public StateMachine apply(State s) {
      return s.getSubmachine();
    }
  };

	/**
	 * The entry and exit connection points used in conjunction with this (submachine) state,
	 * i.e. as targets and sources, respectively, in the region with the submachine state.
	 * A connection point reference references the corresponding definition of a connection
	 * point pseudostate in the statemachine referenced by the submachinestate. 
	 * @see org.eclipse.uml2.uml.State#getConnections()
	 * @generated
	 */
	public static final Function<State, EList<ConnectionPointReference>> connection = new Function<State, EList<ConnectionPointReference>>() {
    public EList<ConnectionPointReference> apply(State s) {
      return s.getConnections();
    }
  };

	/**
	 * The entry and exit pseudostates of a composite state. These can only be entry or exit
	 * Pseudostates, and they must have different names. They can only be defined for composite
	 * states. 
	 * @see org.eclipse.uml2.uml.State#getConnectionPoints()
	 * @generated
	 */
	public static final Function<State, EList<Pseudostate>> connectionPoint = new Function<State, EList<Pseudostate>>() {
    public EList<Pseudostate> apply(State s) {
      return s.getConnectionPoints();
    }
  };

	/**
	 * The state of which this state is a redefinition. 
	 * @see org.eclipse.uml2.uml.State#getRedefinedState()
	 * @generated
	 */
	public static final Function<State, State> redefinedState = new Function<State, State>() {
    public State apply(State s) {
      return s.getRedefinedState();
    }
  };

	/**
	 * Specifies conditions that are always true when this state is the current state. In
	 * protocol state machines, state invariants are additional conditions to the preconditions
	 * of the outgoing transitions, and to the postcondition of the incoming transitions.
	
	 * @see org.eclipse.uml2.uml.State#getStateInvariant()
	 * @generated
	 */
	public static final Function<State, Constraint> stateInvariant = new Function<State, Constraint>() {
    public Constraint apply(State s) {
      return s.getStateInvariant();
    }
  };

	/**
	 * An optional behavior that is executed whenever this state is entered regardless of
	 * the transition taken to reach the state. If defined, entry actions are always executed
	 * to completion prior to any internal behavior or transitions performed within the state.
	
	 * @see org.eclipse.uml2.uml.State#getEntry()
	 * @generated
	 */
	public static final Function<State, Behavior> entry = new Function<State, Behavior>() {
    public Behavior apply(State s) {
      return s.getEntry();
    }
  };

	/**
	 * An optional behavior that is executed whenever this state is exited regardless of
	 * which transition was taken out of the state. If defined, exit actions are always executed
	 * to completion only after all internal activities and transition actions have completed
	 * execution. 
	 * @see org.eclipse.uml2.uml.State#getExit()
	 * @generated
	 */
	public static final Function<State, Behavior> exit = new Function<State, Behavior>() {
    public Behavior apply(State s) {
      return s.getExit();
    }
  };

	/**
	 * An optional behavior that is executed while being in the state. The execution starts
	 * when this state is entered, and stops either by itself, or when the state is exited,
	 * whichever comes first. 
	 * @see org.eclipse.uml2.uml.State#getDoActivity()
	 * @generated
	 */
	public static final Function<State, Behavior> doActivity = new Function<State, Behavior>() {
    public Behavior apply(State s) {
      return s.getDoActivity();
    }
  };

	/**
	 * A list of triggers that are candidates to be retained by the state machine if they
	 * trigger no transitions out of the state (not consumed). A deferred trigger is retained
	 * until the state machine reaches a state configuration where it is no longer deferred.
	
	 * @see org.eclipse.uml2.uml.State#getDeferrableTriggers()
	 * @generated
	 */
	public static final Function<State, EList<Trigger>> deferrableTrigger = new Function<State, EList<Trigger>>() {
    public EList<Trigger> apply(State s) {
      return s.getDeferrableTriggers();
    }
  };

	/**
	 * The regions owned directly by the state. 
	 * @see org.eclipse.uml2.uml.State#getRegions()
	 * @generated
	 */
	public static final Function<State, EList<Region>> region = new Function<State, EList<Region>>() {
    public EList<Region> apply(State s) {
      return s.getRegions();
    }
  };
	
	/**
	 * At least one of the redefinition contexts of the redefining element must be a specialization
	 * of at least one of the redefinition contexts for each redefined element.
	self.redefinedElement->forAll(e
	 * | self.isRedefinitionContextValid(e)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
  }

	/**
	 * A redefining element must be consistent with each redefined element.
	self.redefinedElement->forAll(re
	 * | re.isConsistentWith(self)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionConsistent()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
  }

	/**
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context
	 * in which redefinition is possible, whether redefinition would be logically consistent.
	 * By default, this is false; this operation must be overridden for subclasses of RedefinableElement
	 * to define the consistency conditions.
	redefinee.isRedefinitionContextValid(self)
	result
	 * = false 
	 *
	 * @see RedefinableElementPath#isConsistentWith()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
    return RedefinableElementPath.isConsistentWith(redefinee);
  }

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of this RedefinableElement are properly related to the redefinition contexts of the
	 * specified RedefinableElement to allow this element to redefine the other. By default
	 * at least one of the redefinition contexts of this element must be a specialization
	 * of at least one of the redefinition contexts of the specified element.
	result = redefinitionContext->exists(c
	 * | c.allParents()->includes(redefined.redefinitionContext))) 
	 *
	 * @see RedefinableElementPath#isRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
    return RedefinableElementPath.isRedefinitionContextValid(redefined);
  }

	/**
	 * The operation containingStateMachine() returns the state machine in which this Vertex
	 * is defined
	result = if not container->isEmpty()
	then
	-- the container is a region
	container.containingStateMachine()
	else
	 * if (oclIsKindOf(Pseudostate)) then
	-- entry or exit point?
	if (kind = #entryPoint)
	 * or (kind = #exitPoint) then
	stateMachine
	else if (oclIsKindOf(ConnectionPointReference))
	 * then
	state.containingStateMachine() -- no other valid cases possible
	endif
	 
	 *
	 * @see VertexPath#containingStateMachine()
	 * @see org.eclipse.uml2.uml.Vertex#containingStateMachine()
	 * @generated
	 */
	public static final Function<Vertex, StateMachine> containingStateMachine = VertexPath.containingStateMachine;

	/**
	 * Only submachine states can have connection point references.
	isSubmachineState implies
	 * connection->notEmpty ( ) 
	 * @see org.eclipse.uml2.uml.State#validateSubmachineStates(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<State> validateSubmachineStates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.validateSubmachineStates(diagnostics, context);
      }
    };
  }

	/**
	 * The connection point references used as destinations/sources of transitions associated
	 * with a submachine state must be defined as entry/exit points in the submachine state
	 * machine.
	self.isSubmachineState implies (self.connection->forAll (cp |
	cp.entry->forAll
	 * (p | p.statemachine = self.submachine) and
	cp.exit->forAll (p | p.statemachine =
	 * self.submachine))) 
	 * @see org.eclipse.uml2.uml.State#validateDestinationsOrSourcesOfTransitions(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<State> validateDestinationsOrSourcesOfTransitions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.validateDestinationsOrSourcesOfTransitions(diagnostics, context);
      }
    };
  }

	/**
	 * A state is not allowed to have both a submachine and regions.
	isComposite implies
	 * not isSubmachineState 
	 * @see org.eclipse.uml2.uml.State#validateSubmachineOrRegions(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<State> validateSubmachineOrRegions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.validateSubmachineOrRegions(diagnostics, context);
      }
    };
  }

	/**
	 * Only composite states can have entry or exit pseudostates defined.
	connectionPoint->notEmpty()
	 * implies isComoposite 
	 * @see org.eclipse.uml2.uml.State#validateCompositeStates(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<State> validateCompositeStates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.validateCompositeStates(diagnostics, context);
      }
    };
  }

	/**
	 * Only entry or exit pseudostates can serve as connection points.
	connectionPoint->forAll(cp|cp.kind
	 * = #entry or cp.kind = #exit) 
	 * @see org.eclipse.uml2.uml.State#validateEntryOrExit(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<State> validateEntryOrExit(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.validateEntryOrExit(diagnostics, context);
      }
    };
  }

	/**
	 * The redefinition context of a state is the nearest containing statemachine.
	result
	 * = let sm = containingStateMachine() in
	if sm.context->isEmpty() or sm.general->notEmpty()
	 * then
	sm
	else
	sm.context
	endif 
	 * @see org.eclipse.uml2.uml.State#redefinitionContext()
	 * @generated
	 */
	public static final Function<State, Classifier> redefinitionContext_ = new Function<State, Classifier>() {
    public Classifier apply(State s) {
      return s.redefinitionContext();
    }
  };

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of a state are properly related to the redefinition contexts of the specified state
	 * to allow this element to redefine the other. The containing region of a redefining
	 * state must redefine the containing region of the redefined state.
	result = true 
	 * @see org.eclipse.uml2.uml.State#isRedefinitionContextValid(State)
	 * @generated
	 */
	public static ComposablePredicate<State> isRedefinitionContextValid(final State redefined) {
    return new ComposablePredicate<State>() {
      public boolean apply(State s) {
        return s.isRedefinitionContextValid(redefined);
      }
    };
  }

}
