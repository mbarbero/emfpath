package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;

/**
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
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#getConformances()
	 * @generated
	 */
	public static final Function<ProtocolStateMachine, EList<ProtocolConformance>> conformance = new Function<ProtocolStateMachine, EList<ProtocolConformance>>() {
		public EList<ProtocolConformance> apply(ProtocolStateMachine s) {
			return s.getConformances();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateProtocolTransitions()
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
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateEntryExitDo()
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
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validateDeepOrShallowHistory()
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
	 * @see org.eclipse.uml2.uml.ProtocolStateMachine#validatePortsConnected()
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
