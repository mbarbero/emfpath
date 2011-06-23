package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.Port;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InvocationAction InvocationAction} in a functional way.
 * <p>
 * InvocationAction is an abstract class for the various actions that invoke behavior.
In
 * addition to targeting an object, invocation actions can also invoke behavioral features
 * on ports from where the invocation requests are routed onwards on links deriving from
 * attached connectors. Invocation actions may also be sent to a target via a given port,
 * either on the sending object or on another object. 
 * @see org.eclipse.uml2.uml.InvocationAction
 * @generated
 */
public class InvocationActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 InvocationActionPath() {
		super();
	}

	/**
	 * Specification of the ordered set of argument values that appears during execution.
	 * @see org.eclipse.uml2.uml.InvocationAction#getArguments()
	 * @generated
	 */
	public static final Function<InvocationAction, EList<InputPin>> argument = new Function<InvocationAction, EList<InputPin>>() {
		public EList<InputPin> apply(InvocationAction s) {
			return s.getArguments();
		}
	};

	/**
	 * A optional port of the receiver object on which the behavioral feature is invoked.
	 * @see org.eclipse.uml2.uml.InvocationAction#getOnPort()
	 * @generated
	 */
	public static final Function<InvocationAction, Port> onPort = new Function<InvocationAction, Port>() {
		public Port apply(InvocationAction s) {
			return s.getOnPort();
		}
	};
	
	/**
	 * The onPort must be a port on the receiver object.
	true 
	 * @see org.eclipse.uml2.uml.InvocationAction#validateOnPortReceiver(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InvocationAction> validateOnPortReceiver(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InvocationAction>() {
			public boolean apply(InvocationAction s) {
				return s.validateOnPortReceiver(diagnostics, context);
			}
		};
	}

}
