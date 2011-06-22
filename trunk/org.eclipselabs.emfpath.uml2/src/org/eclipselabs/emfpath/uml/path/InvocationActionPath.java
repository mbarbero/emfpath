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
	 * @see org.eclipse.uml2.uml.InvocationAction#getArguments()
	 * @generated
	 */
	public static final Function<InvocationAction, EList<InputPin>> argument = new Function<InvocationAction, EList<InputPin>>() {
		public EList<InputPin> apply(InvocationAction s) {
			return s.getArguments();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InvocationAction#getOnPort()
	 * @generated
	 */
	public static final Function<InvocationAction, Port> onPort = new Function<InvocationAction, Port>() {
		public Port apply(InvocationAction s) {
			return s.getOnPort();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InvocationAction#validateOnPortReceiver()
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
