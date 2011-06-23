package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.WriteVariableAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.WriteVariableAction WriteVariableAction} in a functional way.
 * <p>
 * WriteVariableAction is an abstract class for variable actions that change variable
 * values. 
 * @see org.eclipse.uml2.uml.WriteVariableAction
 * @generated
 */
public class WriteVariableActionPath extends VariableActionPath {

	/**
	 * @generated
	 */
	 WriteVariableActionPath() {
		super();
	}

	/**
	 * Value to be added or removed from the variable. 
	 * @see org.eclipse.uml2.uml.WriteVariableAction#getValue()
	 * @generated
	 */
	public static final Function<WriteVariableAction, InputPin> value = new Function<WriteVariableAction, InputPin>() {
		public InputPin apply(WriteVariableAction s) {
			return s.getValue();
		}
	};
	
	/**
	 * The type input pin is the same as the type of the variable.
	self.value.type = self.variable.type
	 * @see org.eclipse.uml2.uml.WriteVariableAction#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<WriteVariableAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteVariableAction>() {
			public boolean apply(WriteVariableAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the input pin is 1..1.
	self.value.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.WriteVariableAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<WriteVariableAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteVariableAction>() {
			public boolean apply(WriteVariableAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
