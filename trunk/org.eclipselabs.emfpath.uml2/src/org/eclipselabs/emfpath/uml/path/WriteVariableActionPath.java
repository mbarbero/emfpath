package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.WriteVariableAction;

/**
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
	 * @see org.eclipse.uml2.uml.WriteVariableAction#getValue()
	 * @generated
	 */
	public static final Function<WriteVariableAction, InputPin> value = new Function<WriteVariableAction, InputPin>() {
		public InputPin apply(WriteVariableAction s) {
			return s.getValue();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.WriteVariableAction#validateSameType()
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
	 * @see org.eclipse.uml2.uml.WriteVariableAction#validateMultiplicity()
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
