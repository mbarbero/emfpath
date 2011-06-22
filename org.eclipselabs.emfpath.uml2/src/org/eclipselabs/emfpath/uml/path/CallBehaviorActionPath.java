package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;

/**
 * @generated
 */
public class CallBehaviorActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private CallBehaviorActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#getBehavior()
	 * @generated
	 */
	public static final Function<CallBehaviorAction, Behavior> behavior = new Function<CallBehaviorAction, Behavior>() {
		public Behavior apply(CallBehaviorAction s) {
			return s.getBehavior();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#validateArgumentPinEqualParameter()
	 * @generated
	 */
	public static Predicate<CallBehaviorAction> validateArgumentPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallBehaviorAction>() {
			public boolean apply(CallBehaviorAction s) {
				return s.validateArgumentPinEqualParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CallBehaviorAction#validateResultPinEqualParameter()
	 * @generated
	 */
	public static Predicate<CallBehaviorAction> validateResultPinEqualParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallBehaviorAction>() {
			public boolean apply(CallBehaviorAction s) {
				return s.validateResultPinEqualParameter(diagnostics, context);
			}
		};
	}

}
