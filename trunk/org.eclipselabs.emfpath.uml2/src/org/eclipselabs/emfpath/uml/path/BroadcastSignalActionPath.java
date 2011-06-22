package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.Signal;

/**
 * @generated
 */
public class BroadcastSignalActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private BroadcastSignalActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#getSignal()
	 * @generated
	 */
	public static final Function<BroadcastSignalAction, Signal> signal = new Function<BroadcastSignalAction, Signal>() {
		public Signal apply(BroadcastSignalAction s) {
			return s.getSignal();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#validateNumberAndOrder()
	 * @generated
	 */
	public static Predicate<BroadcastSignalAction> validateNumberAndOrder(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<BroadcastSignalAction>() {
			public boolean apply(BroadcastSignalAction s) {
				return s.validateNumberAndOrder(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.BroadcastSignalAction#validateTypeOrderingMultiplicity()
	 * @generated
	 */
	public static Predicate<BroadcastSignalAction> validateTypeOrderingMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<BroadcastSignalAction>() {
			public boolean apply(BroadcastSignalAction s) {
				return s.validateTypeOrderingMultiplicity(diagnostics, context);
			}
		};
	}

}
