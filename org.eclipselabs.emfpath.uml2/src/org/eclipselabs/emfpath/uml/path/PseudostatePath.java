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
	 * @see org.eclipse.uml2.uml.Pseudostate#getKind()
	 * @generated
	 */
	public static final Function<Pseudostate, PseudostateKind> kind = new Function<Pseudostate, PseudostateKind>() {
		public PseudostateKind apply(Pseudostate s) {
			return s.getKind();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Pseudostate#getStateMachine()
	 * @generated
	 */
	public static final Function<Pseudostate, StateMachine> stateMachine = new Function<Pseudostate, StateMachine>() {
		public StateMachine apply(Pseudostate s) {
			return s.getStateMachine();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Pseudostate#getState()
	 * @generated
	 */
	public static final Function<Pseudostate, State> state = new Function<Pseudostate, State>() {
		public State apply(Pseudostate s) {
			return s.getState();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Pseudostate#validateInitialVertex()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJoinVertex()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateForkVertex()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex()
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
	 * @see org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial()
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
