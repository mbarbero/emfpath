package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.AcceptCallAction AcceptCallAction} in a functional way.
 * <p>
 * An accept call action is an accept event action representing the receipt of a synchronous
 * call request. In addition to the normal operation parameters, the action produces
 * an output that is needed later to supply the information to the reply action necessary
 * to return control to the caller. This action is for synchronous calls. If it is used
 * to handle an asynchronous call, execution of the subsequent reply action will complete
 * immediately with no effects. 
 * @see org.eclipse.uml2.uml.AcceptCallAction
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
	 * Pin where a value is placed containing sufficient information to perform a subsequent
	 * reply and return control to the caller. The contents of this value are opaque. It
	 * can be passed and copied but it cannot be manipulated by the model. 
	 * @see org.eclipse.uml2.uml.AcceptCallAction#getReturnInformation()
	 * @generated
	 */
	public static final Function<AcceptCallAction, OutputPin> returnInformation = new Function<AcceptCallAction, OutputPin>() {
		public OutputPin apply(AcceptCallAction s) {
			return s.getReturnInformation();
		}
	};
	
	/**
	 * The result pins must match the in and inout parameters of the operation specified
	 * by the trigger event in number, type, and order.
	true 
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateResultPins(DiagnosticChain, Map)
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
	 * The trigger event must be a CallEvent.
	trigger.event.oclIsKindOf(CallEvent) 
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateTriggerCallEvent(DiagnosticChain, Map)
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
	 * isUnmrashall must be true for an AcceptCallAction.
	isUnmarshall = true 
	 * @see org.eclipse.uml2.uml.AcceptCallAction#validateUnmarshall(DiagnosticChain, Map)
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
