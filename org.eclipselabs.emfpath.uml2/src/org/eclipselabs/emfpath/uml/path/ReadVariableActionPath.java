package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadVariableAction;

/**
 * @generated
 */
public class ReadVariableActionPath extends VariableActionPath {

	/**
	 * @generated
	 */
	private ReadVariableActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadVariableAction#getResult()
	 * @generated
	 */
	public static final Function<ReadVariableAction, OutputPin> result = new Function<ReadVariableAction, OutputPin>() {
		public OutputPin apply(ReadVariableAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadVariableAction#validateTypeAndOrdering()
	 * @generated
	 */
	public static Predicate<ReadVariableAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadVariableAction>() {
			public boolean apply(ReadVariableAction s) {
				return s.validateTypeAndOrdering(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadVariableAction#validateCompatibleMultiplicity()
	 * @generated
	 */
	public static Predicate<ReadVariableAction> validateCompatibleMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadVariableAction>() {
			public boolean apply(ReadVariableAction s) {
				return s.validateCompatibleMultiplicity(diagnostics, context);
			}
		};
	}

}
