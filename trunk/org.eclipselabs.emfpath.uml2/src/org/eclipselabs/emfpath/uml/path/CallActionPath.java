package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CallAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CallAction CallAction} in a functional way.
 * <p>
 * CallAction is an abstract class for actions that invoke behavior and receive return
 * values. 
 * @see org.eclipse.uml2.uml.CallAction
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
	 * If true, the call is synchronous and the caller waits for completion of the invoked
	 * behavior.
	If false, the call is asynchronous and the caller proceeds immediately
	 * and does not expect a return values.
	 
	 * @see org.eclipse.uml2.uml.CallAction#isSynchronous()
	 * @generated
	 */
	public static final Predicate<CallAction> isSynchronous = new Predicate<CallAction>() {
		public boolean apply(CallAction s) {
			return s.isSynchronous();
		}
	};

	/**
	 * A list of output pins where the results of performing the invocation are placed. 
	 * @see org.eclipse.uml2.uml.CallAction#getResults()
	 * @generated
	 */
	public static final Function<CallAction, EList<OutputPin>> result = new Function<CallAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(CallAction s) {
			return s.getResults();
		}
	};
	
	/**
	 * Only synchronous call actions can have result pins.
	true 
	 * @see org.eclipse.uml2.uml.CallAction#validateSynchronousCall(DiagnosticChain, Map)
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
	 * The number and order of argument pins must be the same as the number and order of
	 * parameters of the invoked behavior or behavioral feature. Pins are matched to parameters
	 * by order.
	true 
	 * @see org.eclipse.uml2.uml.CallAction#validateNumberAndOrder(DiagnosticChain, Map)
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
	 * The type, ordering, and multiplicity of an argument pin must be the same as the corresponding
	 * parameter of the behavior or behavioral feature.
	true 
	 * @see org.eclipse.uml2.uml.CallAction#validateTypeOrderingMultiplicity(DiagnosticChain, Map)
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
