package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FunctionBehavior;

/**
 * @generated
 */
public class FunctionBehaviorPath extends OpaqueBehaviorPath {

	/**
	 * @generated
	 */
	private FunctionBehaviorPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter()
	 * @generated
	 */
	public static Predicate<FunctionBehavior> validateOneOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FunctionBehavior>() {
			public boolean apply(FunctionBehavior s) {
				return s.validateOneOutputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters()
	 * @generated
	 */
	public static Predicate<FunctionBehavior> validateTypesOfParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FunctionBehavior>() {
			public boolean apply(FunctionBehavior s) {
				return s.validateTypesOfParameters(diagnostics, context);
			}
		};
	}

}
