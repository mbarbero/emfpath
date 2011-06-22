package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Operation;

/**
 * @generated
 */
public class CallOperationActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private CallOperationActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CallOperationAction#getOperation()
	 * @generated
	 */
	public static final Function<CallOperationAction, Operation> operation = new Function<CallOperationAction, Operation>() {
		public Operation apply(CallOperationAction s) {
			return s.getOperation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CallOperationAction#getTarget()
	 * @generated
	 */
	public static final Function<CallOperationAction, InputPin> target = new Function<CallOperationAction, InputPin>() {
		public InputPin apply(CallOperationAction s) {
			return s.getTarget();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateArgumentPinEqualParameter()
	 * @generated
	 */
	public static Predicate<CallOperationAction> validateArgumentPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallOperationAction>() {
			public boolean apply(CallOperationAction s) {
				return s.validateArgumentPinEqualParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateResultPinEqualParameter()
	 * @generated
	 */
	public static Predicate<CallOperationAction> validateResultPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallOperationAction>() {
			public boolean apply(CallOperationAction s) {
				return s.validateResultPinEqualParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CallOperationAction#validateTypeTargetPin()
	 * @generated
	 */
	public static Predicate<CallOperationAction> validateTypeTargetPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallOperationAction>() {
			public boolean apply(CallOperationAction s) {
				return s.validateTypeTargetPin(diagnostics, context);
			}
		};
	}

}
