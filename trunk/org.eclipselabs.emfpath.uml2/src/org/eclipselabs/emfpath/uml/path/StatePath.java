package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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

/**
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
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> outgoing = VertexPath.outgoing;

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> incoming = VertexPath.incoming;

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getContainer()
	 * @generated
	 */
	public static final Function<Vertex, Region> container = VertexPath.container;

	/**
	 * @see org.eclipse.uml2.uml.State#isComposite()
	 * @generated
	 */
	public static final Predicate<State> isComposite = new Predicate<State>() {
		public boolean apply(State s) {
			return s.isComposite();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#isOrthogonal()
	 * @generated
	 */
	public static final Predicate<State> isOrthogonal = new Predicate<State>() {
		public boolean apply(State s) {
			return s.isOrthogonal();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#isSimple()
	 * @generated
	 */
	public static final Predicate<State> isSimple = new Predicate<State>() {
		public boolean apply(State s) {
			return s.isSimple();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#isSubmachineState()
	 * @generated
	 */
	public static final Predicate<State> isSubmachineState = new Predicate<State>() {
		public boolean apply(State s) {
			return s.isSubmachineState();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getSubmachine()
	 * @generated
	 */
	public static final Function<State, StateMachine> submachine = new Function<State, StateMachine>() {
		public StateMachine apply(State s) {
			return s.getSubmachine();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getConnections()
	 * @generated
	 */
	public static final Function<State, EList<ConnectionPointReference>> connection = new Function<State, EList<ConnectionPointReference>>() {
		public EList<ConnectionPointReference> apply(State s) {
			return s.getConnections();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getConnectionPoints()
	 * @generated
	 */
	public static final Function<State, EList<Pseudostate>> connectionPoint = new Function<State, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(State s) {
			return s.getConnectionPoints();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getRedefinedState()
	 * @generated
	 */
	public static final Function<State, State> redefinedState = new Function<State, State>() {
		public State apply(State s) {
			return s.getRedefinedState();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getStateInvariant()
	 * @generated
	 */
	public static final Function<State, Constraint> stateInvariant = new Function<State, Constraint>() {
		public Constraint apply(State s) {
			return s.getStateInvariant();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getEntry()
	 * @generated
	 */
	public static final Function<State, Behavior> entry = new Function<State, Behavior>() {
		public Behavior apply(State s) {
			return s.getEntry();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getExit()
	 * @generated
	 */
	public static final Function<State, Behavior> exit = new Function<State, Behavior>() {
		public Behavior apply(State s) {
			return s.getExit();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getDoActivity()
	 * @generated
	 */
	public static final Function<State, Behavior> doActivity = new Function<State, Behavior>() {
		public Behavior apply(State s) {
			return s.getDoActivity();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getDeferrableTriggers()
	 * @generated
	 */
	public static final Function<State, EList<Trigger>> deferrableTrigger = new Function<State, EList<Trigger>>() {
		public EList<Trigger> apply(State s) {
			return s.getDeferrableTriggers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#getRegions()
	 * @generated
	 */
	public static final Function<State, EList<Region>> region = new Function<State, EList<Region>>() {
		public EList<Region> apply(State s) {
			return s.getRegions();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * @see org.eclipse.uml2.uml.Vertex#containingStateMachine()
	 * @generated
	 */
	public static final Function<Vertex, StateMachine> containingStateMachine = VertexPath.containingStateMachine;

	/**
	 * @see org.eclipse.uml2.uml.State#validateSubmachineStates()
	 * @generated
	 */
	public static Predicate<State> validateSubmachineStates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.validateSubmachineStates(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.State#validateDestinationsOrSourcesOfTransitions()
	 * @generated
	 */
	public static Predicate<State> validateDestinationsOrSourcesOfTransitions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.validateDestinationsOrSourcesOfTransitions(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.State#validateSubmachineOrRegions()
	 * @generated
	 */
	public static Predicate<State> validateSubmachineOrRegions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.validateSubmachineOrRegions(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.State#validateCompositeStates()
	 * @generated
	 */
	public static Predicate<State> validateCompositeStates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.validateCompositeStates(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.State#validateEntryOrExit()
	 * @generated
	 */
	public static Predicate<State> validateEntryOrExit(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.validateEntryOrExit(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.State#redefinitionContext()
	 * @generated
	 */
	public static final Function<State, Classifier> redefinitionContext_ = new Function<State, Classifier>() {
		public Classifier apply(State s) {
			return s.redefinitionContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.State#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<State> isRedefinitionContextValid(final State redefined) {
		return new Predicate<State>() {
			public boolean apply(State s) {
				return s.isRedefinitionContextValid(redefined);
			}
		};
	}

}
