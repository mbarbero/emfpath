package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionInputPin;

/**
 * @generated
 */
public class ActionInputPinPath extends InputPinPath {

	/**
	 * @generated
	 */
	private ActionInputPinPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ActionInputPin#getFromAction()
	 * @generated
	 */
	public static final Function<ActionInputPin, Action> fromAction = new Function<ActionInputPin, Action>() {
		public Action apply(ActionInputPin s) {
			return s.getFromAction();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateOneOutputPin()
	 * @generated
	 */
	public static Predicate<ActionInputPin> validateOneOutputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActionInputPin>() {
			public boolean apply(ActionInputPin s) {
				return s.validateOneOutputPin(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateInputPin()
	 * @generated
	 */
	public static Predicate<ActionInputPin> validateInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActionInputPin>() {
			public boolean apply(ActionInputPin s) {
				return s.validateInputPin(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActionInputPin#validateNoControlOrDataFlow()
	 * @generated
	 */
	public static Predicate<ActionInputPin> validateNoControlOrDataFlow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActionInputPin>() {
			public boolean apply(ActionInputPin s) {
				return s.validateNoControlOrDataFlow(diagnostics, context);
			}
		};
	}

}
