package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CallAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class CallActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	 CallActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CallAction#isSynchronous()
	 * @generated
	 */
	public static final Predicate<CallAction> isSynchronous = new Predicate<CallAction>() {
		public boolean apply(CallAction s) {
			return s.isSynchronous();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CallAction#getResults()
	 * @generated
	 */
	public static final Function<CallAction, EList<OutputPin>> result = new Function<CallAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(CallAction s) {
			return s.getResults();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CallAction#validateSynchronousCall()
	 * @generated
	 */
	public static Predicate<CallAction> validateSynchronousCall(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallAction>() {
			public boolean apply(CallAction s) {
				return s.validateSynchronousCall(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CallAction#validateNumberAndOrder()
	 * @generated
	 */
	public static Predicate<CallAction> validateNumberAndOrder(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallAction>() {
			public boolean apply(CallAction s) {
				return s.validateNumberAndOrder(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CallAction#validateTypeOrderingMultiplicity()
	 * @generated
	 */
	public static Predicate<CallAction> validateTypeOrderingMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CallAction>() {
			public boolean apply(CallAction s) {
				return s.validateTypeOrderingMultiplicity(diagnostics, context);
			}
		};
	}

}
