package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ProtocolStateMachine ProtocolStateMachine} in a functional way.
 * <p>
 * A protocol state machine is always defined in the context of a classifier. It specifies
 * which operations of the classifier can be called in which state and under which condition,
 * thus specifying the allowed call sequences on the classifier's operations. A protocol
 * state machine presents the possible and permitted transitions on the instances of
 * its context classifier, together with the operations which carry the transitions.
 * In this manner, an instance lifecycle can be created for a classifier, by specifying
 * the order in which the operations can be activated and the states through which an
 * instance progresses during its existence. 
 * @see org.eclipse.uml2.uml.ProtocolStateMachine
 * @generated
 */
public class ProtocolStateMachinePath extends StateMachinePath {

	/**
	 * @generated
	 */
	private ProtocolStateMachinePath() {
		super();
	}

	/**
	 * Conformance between protocol state machines. 
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#getConformances()
	 * @generated
	 */
	public static final Function<ProtocolStateMachine, EList<ProtocolConformance>> conformance = new Function<ProtocolStateMachine, EList<ProtocolConformance>>() {
		public EList<ProtocolConformance> apply(ProtocolStateMachine s) {
			return s.getConformances();
		}
	};
	
	/**
	 * All transitions of a protocol state machine must be protocol transitions. (transitions
	 * as extended by the ProtocolStateMachines package)
	region->forAll(r | r.transition->forAll(t
	 * | t.oclIsTypeOf(ProtocolTransition))) 
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateProtocolTransitions(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ProtocolStateMachine> validateProtocolTransitions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolStateMachine>() {
			public boolean apply(ProtocolStateMachine s) {
				return s.validateProtocolTransitions(diagnostics, context);
			}
		};
	}

	/**
	 * The states of a protocol state machine cannot have entry, exit, or do activity actions.
	region->forAll(r
	 * | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
	(v.entry->isEmpty() and v.exit->isEmpty()
	 * and v.doActivity->isEmpty())))
	 
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateEntryExitDo(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ProtocolStateMachine> validateEntryExitDo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolStateMachine>() {
			public boolean apply(ProtocolStateMachine s) {
				return s.validateEntryExitDo(diagnostics, context);
			}
		};
	}

	/**
	 * Protocol state machines cannot have deep or shallow history pseudostates.
	region->forAll
	 * (r | r.subvertex->forAll (v | v.oclIsKindOf(Psuedostate) implies
	((v.kind <> #deepHistory)
	 * and (v.kind <> #shallowHistory)))))
	 
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateDeepOrShallowHistory(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ProtocolStateMachine> validateDeepOrShallowHistory(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolStateMachine>() {
			public boolean apply(ProtocolStateMachine s) {
				return s.validateDeepOrShallowHistory(diagnostics, context);
			}
		};
	}

	/**
	 * If two ports are connected, then the protocol state machine of the required interface
	 * (if defined) must be conformant to the protocol state machine of the provided interface
	 * (if defined).
	true 
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validatePortsConnected(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ProtocolStateMachine> validatePortsConnected(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolStateMachine>() {
			public boolean apply(ProtocolStateMachine s) {
				return s.validatePortsConnected(diagnostics, context);
			}
		};
	}

}
