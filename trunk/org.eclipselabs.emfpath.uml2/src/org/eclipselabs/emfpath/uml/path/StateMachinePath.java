package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

/**
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
	 * @see org.eclipse.uml2.uml.StateMachine#getRegions()
	 * @generated
	 */
	public static final Function<StateMachine, EList<Region>> region = new Function<StateMachine, EList<Region>>() {
		public EList<Region> apply(StateMachine s) {
			return s.getRegions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#getSubmachineStates()
	 * @generated
	 */
	public static final Function<StateMachine, EList<State>> submachineState = new Function<StateMachine, EList<State>>() {
		public EList<State> apply(StateMachine s) {
			return s.getSubmachineStates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#getConnectionPoints()
	 * @generated
	 */
	public static final Function<StateMachine, EList<Pseudostate>> connectionPoint = new Function<StateMachine, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(StateMachine s) {
			return s.getConnectionPoints();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#getExtendedStateMachines()
	 * @generated
	 */
	public static final Function<StateMachine, EList<StateMachine>> extendedStateMachine = new Function<StateMachine, EList<StateMachine>>() {
		public EList<StateMachine> apply(StateMachine s) {
			return s.getExtendedStateMachines();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StateMachine#validateClassifierContext()
	 * @generated
	 */
	public static Predicate<StateMachine> validateClassifierContext(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.validateClassifierContext(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#validateContextClassifier()
	 * @generated
	 */
	public static Predicate<StateMachine> validateContextClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.validateContextClassifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#validateConnectionPoints()
	 * @generated
	 */
	public static Predicate<StateMachine> validateConnectionPoints(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.validateConnectionPoints(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#validateMethod()
	 * @generated
	 */
	public static Predicate<StateMachine> validateMethod(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.validateMethod(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#LCA()
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
	 * @see org.eclipse.uml2.uml.StateMachine#ancestor()
	 * @generated
	 */
	public static Predicate<StateMachine> ancestor(final State s1, final State s2) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.ancestor(s1, s2);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StateMachine#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<StateMachine> isRedefinitionContextValid(final StateMachine redefined) {
		return new Predicate<StateMachine>() {
			public boolean apply(StateMachine s) {
				return s.isRedefinitionContextValid(redefined);
			}
		};
	}

}
