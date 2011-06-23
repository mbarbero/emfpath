package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Pseudostate Pseudostate} in a functional way.
 * <p>
 * A pseudostate is an abstraction that encompasses different types of transient vertices
 * in the state machine graph. 
 * @see org.eclipse.uml2.uml.Pseudostate
 * @generated
 */
public class PseudostatePath extends VertexPath {

	/**
	 * @generated
	 */
	private PseudostatePath() {
		super();
	}

	/**
	 * Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint,
	 * initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice. 
	 * @see org.eclipse.uml2.uml.Pseudostate#getKind()
	 * @generated
	 */
	public static final Function<Pseudostate, PseudostateKind> kind = new Function<Pseudostate, PseudostateKind>() {
		public PseudostateKind apply(Pseudostate s) {
			return s.getKind();
		}
	};

	/**
	 * The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates
	 * of the kind entryPoint or exitPoint. 
	 * @see org.eclipse.uml2.uml.Pseudostate#getStateMachine()
	 * @generated
	 */
	public static final Function<Pseudostate, StateMachine> stateMachine = new Function<Pseudostate, StateMachine>() {
		public StateMachine apply(Pseudostate s) {
			return s.getStateMachine();
		}
	};

	/**
	 * The State that owns this pseudostate and in which it appears. 
	 * @see org.eclipse.uml2.uml.Pseudostate#getState()
	 * @generated
	 */
	public static final Function<Pseudostate, State> state = new Function<Pseudostate, State>() {
		public State apply(Pseudostate s) {
			return s.getState();
		}
	};
	
	/**
	 * An initial vertex can have at most one outgoing transition.
	(self.kind = #initial)
	 * implies (self.outgoing->size <= 1) 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateInitialVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateInitialVertex(diagnostics, context);
			}
		};
	}

	/**
	 * History vertices can have at most one outgoing transition.
	((self.kind = #deepHistory)
	 * or (self.kind = #shallowHistory)) implies
	(self.outgoing->size <= 1)
	 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateHistoryVertices(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateHistoryVertices(diagnostics, context);
			}
		};
	}

	/**
	 * In a complete statemachine, a join vertex must have at least two incoming transitions
	 * and exactly one outgoing transition.
	(self.kind = #join) implies
	((self.outgoing->size
	 * = 1) and (self.incoming->size >= 2))
	 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateJoinVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateJoinVertex(diagnostics, context);
			}
		};
	}

	/**
	 * All transitions incoming a join vertex must originate in different regions of an orthogonal
	 * state.
	(self.kind = #join) implies
	  self.incoming->forAll (t1, t2 | t1<>t2 implies
	
	 *    (self.stateMachine.LCA(t1.source, t2.source).container.isOrthogonal)) 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateTransitionsIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateTransitionsIncoming(diagnostics, context);
			}
		};
	}

	/**
	 * In a complete statemachine, a fork vertex must have at least two outgoing transitions
	 * and exactly one incoming transition.
	(self.kind = #fork) implies
	((self.incoming->size
	 * = 1) and (self.outgoing->size >= 2))
	 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateForkVertex(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateForkVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateForkVertex(diagnostics, context);
			}
		};
	}

	/**
	 * All transitions outgoing a fork vertex must target states in different regions of
	 * an orthogonal state.
	(self.kind = #fork) implies
	  self.outgoing->forAll (t1, t2
	 * | t1<>t2 implies
	    (self.stateMachine.LCA(t1.target, t2.target).container.isOrthogonal))
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateTransitionsOutgoing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateTransitionsOutgoing(diagnostics, context);
			}
		};
	}

	/**
	 * In a complete statemachine, a junction vertex must have at least one incoming and
	 * one outgoing transition.
	(self.kind = #junction) implies
	((self.incoming->size >=
	 * 1) and (self.outgoing->size >= 1))
	 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateJunctionVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateJunctionVertex(diagnostics, context);
			}
		};
	}

	/**
	 * In a complete statemachine, a choice vertex must have at least one incoming and one
	 * outgoing transition.
	(self.kind = #choice) implies
	((self.incoming->size >= 1) and
	 * (self.outgoing->size >= 1))
	 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateChoiceVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateChoiceVertex(diagnostics, context);
			}
		};
	}

	/**
	 * The outgoing transition from and initial vertex may have a behavior, but not a trigger
	 * or a guard.
	(self.kind = #initial) implies (self.outgoing.guard->isEmpty()
	  and
	 * self.outgoing.trigger->isEmpty()) 
	 * @see org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Pseudostate> validateOutgoingFromInitial(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Pseudostate>() {
			public boolean apply(Pseudostate s) {
				return s.validateOutgoingFromInitial(diagnostics, context);
			}
		};
	}

}
