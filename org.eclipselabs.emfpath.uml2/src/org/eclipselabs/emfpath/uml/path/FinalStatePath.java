package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FinalState;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.FinalState FinalState} in a functional way.
 * <p>
 * A special kind of state signifying that the enclosing region is completed. If the
 * enclosing region is directly contained in a state machine and all other regions in
 * the state machine also are completed, then it means that the entire state machine
 * is completed. 
 * @see org.eclipse.uml2.uml.FinalState
 * @generated
 */
public class FinalStatePath extends StatePath {

	/**
	 * @generated
	 */
	private FinalStatePath() {
		super();
	}

	
	
	/**
	 * A final state cannot have any outgoing transitions.
	self.outgoing->size() = 0 
	 * @see org.eclipse.uml2.uml.FinalState#validateNoOutgoingTransitions(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateNoOutgoingTransitions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateNoOutgoingTransitions(diagnostics, context);
			}
		};
	}

	/**
	 * A final state cannot have regions.
	self.region->size() = 0 
	 * @see org.eclipse.uml2.uml.FinalState#validateNoRegions(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateNoRegions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateNoRegions(diagnostics, context);
			}
		};
	}

	/**
	 * A final state cannot reference a submachine.
	self.submachine->isEmpty() 
	 * @see org.eclipse.uml2.uml.FinalState#validateCannotReferenceSubmachine(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateCannotReferenceSubmachine(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateCannotReferenceSubmachine(diagnostics, context);
			}
		};
	}

	/**
	 * A final state has no entry behavior.
	self.entry->isEmpty() 
	 * @see org.eclipse.uml2.uml.FinalState#validateNoEntryBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateNoEntryBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateNoEntryBehavior(diagnostics, context);
			}
		};
	}

	/**
	 * A final state has no exit behavior.
	self.exit->isEmpty() 
	 * @see org.eclipse.uml2.uml.FinalState#validateNoExitBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateNoExitBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateNoExitBehavior(diagnostics, context);
			}
		};
	}

	/**
	 * A final state has no state (doActivity) behavior.
	self.doActivity->isEmpty() 
	 * @see org.eclipse.uml2.uml.FinalState#validateNoStateBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<FinalState> validateNoStateBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalState>() {
			public boolean apply(FinalState s) {
				return s.validateNoStateBehavior(diagnostics, context);
			}
		};
	}

}
