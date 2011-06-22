package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;

/**
 * @generated
 */
public class ActionExecutionSpecificationPath extends ExecutionSpecificationPath {

	/**
	 * @generated
	 */
	private ActionExecutionSpecificationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ActionExecutionSpecification#getAction()
	 * @generated
	 */
	public static final Function<ActionExecutionSpecification, Action> action = new Function<ActionExecutionSpecification, Action>() {
		public Action apply(ActionExecutionSpecification s) {
			return s.getAction();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActionExecutionSpecification#validateActionReferenced()
	 * @generated
	 */
	public static Predicate<ActionExecutionSpecification> validateActionReferenced(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActionExecutionSpecification>() {
			public boolean apply(ActionExecutionSpecification s) {
				return s.validateActionReferenced(diagnostics, context);
			}
		};
	}

}
