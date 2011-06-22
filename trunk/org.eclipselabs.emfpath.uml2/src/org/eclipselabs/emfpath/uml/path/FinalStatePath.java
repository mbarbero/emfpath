package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FinalState;

/**
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
	 * @see org.eclipse.uml2.uml.FinalState#validateNoOutgoingTransitions()
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
	 * @see org.eclipse.uml2.uml.FinalState#validateNoRegions()
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
	 * @see org.eclipse.uml2.uml.FinalState#validateCannotReferenceSubmachine()
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
	 * @see org.eclipse.uml2.uml.FinalState#validateNoEntryBehavior()
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
	 * @see org.eclipse.uml2.uml.FinalState#validateNoExitBehavior()
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
	 * @see org.eclipse.uml2.uml.FinalState#validateNoStateBehavior()
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
