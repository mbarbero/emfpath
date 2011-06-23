package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VariableAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.VariableAction VariableAction} in a functional way.
 * <p>
 * VariableAction is an abstract class for actions that operate on a statically specified
 * variable. 
 * @see org.eclipse.uml2.uml.VariableAction
 * @generated
 */
public class VariableActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 VariableActionPath() {
		super();
	}

	/**
	 * Variable to be read. 
	 * @see org.eclipse.uml2.uml.VariableAction#getVariable()
	 * @generated
	 */
	public static final Function<VariableAction, Variable> variable = new Function<VariableAction, Variable>() {
		public Variable apply(VariableAction s) {
			return s.getVariable();
		}
	};
	
	/**
	 * The action must be in the scope of the variable.
	self.variable.isAccessibleBy(self)
	 * @see org.eclipse.uml2.uml.VariableAction#validateScopeOfVariable(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<VariableAction> validateScopeOfVariable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<VariableAction>() {
			public boolean apply(VariableAction s) {
				return s.validateScopeOfVariable(diagnostics, context);
			}
		};
	}

}
