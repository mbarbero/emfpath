package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class AcceptCallActionPath extends AcceptEventActionPath {

	/**
	 * @generated
	 */
	private AcceptCallActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptCallAction#getReturnInformation()
	 * @generated
	 */
	public static final Function<AcceptCallAction, OutputPin> returnInformation = new Function<AcceptCallAction, OutputPin>() {
		public OutputPin apply(AcceptCallAction s) {
			return s.getReturnInformation();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateResultPins()
	 * @generated
	 */
	public static Predicate<AcceptCallAction> validateResultPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptCallAction>() {
			public boolean apply(AcceptCallAction s) {
				return s.validateResultPins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent()
	 * @generated
	 */
	public static Predicate<AcceptCallAction> validateTriggerCallEvent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptCallAction>() {
			public boolean apply(AcceptCallAction s) {
				return s.validateTriggerCallEvent(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall()
	 * @generated
	 */
	public static Predicate<AcceptCallAction> validateUnmarshall(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptCallAction>() {
			public boolean apply(AcceptCallAction s) {
				return s.validateUnmarshall(diagnostics, context);
			}
		};
	}

}
