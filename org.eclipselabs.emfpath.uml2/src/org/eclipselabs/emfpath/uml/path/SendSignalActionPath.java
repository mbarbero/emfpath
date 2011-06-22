package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Signal;

/**
 * @generated
 */
public class SendSignalActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private SendSignalActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.SendSignalAction#getTarget()
	 * @generated
	 */
	public static final Function<SendSignalAction, InputPin> target = new Function<SendSignalAction, InputPin>() {
		public InputPin apply(SendSignalAction s) {
			return s.getTarget();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.SendSignalAction#getSignal()
	 * @generated
	 */
	public static final Function<SendSignalAction, Signal> signal = new Function<SendSignalAction, Signal>() {
		public Signal apply(SendSignalAction s) {
			return s.getSignal();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateNumberOrder()
	 * @generated
	 */
	public static Predicate<SendSignalAction> validateNumberOrder(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<SendSignalAction>() {
			public boolean apply(SendSignalAction s) {
				return s.validateNumberOrder(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.SendSignalAction#validateTypeOrderingMultiplicity()
	 * @generated
	 */
	public static Predicate<SendSignalAction> validateTypeOrderingMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<SendSignalAction>() {
			public boolean apply(SendSignalAction s) {
				return s.validateTypeOrderingMultiplicity(diagnostics, context);
			}
		};
	}

}
