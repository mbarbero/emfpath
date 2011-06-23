package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActionExecutionSpecification ActionExecutionSpecification} in a functional way.
 * <p>
 * An action execution specification is a kind of execution specification representing
 * the execution of an action. 
 * @see org.eclipse.uml2.uml.ActionExecutionSpecification
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
	 * Action whose execution is occurring. 
	 * @see org.eclipse.uml2.uml.ActionExecutionSpecification#getAction()
	 * @generated
	 */
	public static final Function<ActionExecutionSpecification, Action> action = new Function<ActionExecutionSpecification, Action>() {
		public Action apply(ActionExecutionSpecification s) {
			return s.getAction();
		}
	};
	
	/**
	 * The Action referenced by the ActionExecutionSpecification, if any, must be owned by
	 * the Interaction owning the ActionExecutionOccurrence.
	true 
	 * @see org.eclipse.uml2.uml.ActionExecutionSpecification#validateActionReferenced(DiagnosticChain, Map)
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
