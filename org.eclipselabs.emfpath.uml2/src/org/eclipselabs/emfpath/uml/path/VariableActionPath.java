package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VariableAction;

/**
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
	 * @see org.eclipse.uml2.uml.VariableAction#getVariable()
	 * @generated
	 */
	public static final Function<VariableAction, Variable> variable = new Function<VariableAction, Variable>() {
		public Variable apply(VariableAction s) {
			return s.getVariable();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.VariableAction#validateScopeOfVariable()
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
