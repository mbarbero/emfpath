package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExtensionEnd;

/**
 * @generated
 */
public class ExtensionEndPath extends PropertyPath {

	/**
	 * @generated
	 */
	private ExtensionEndPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.ExtensionEnd#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<ExtensionEnd> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExtensionEnd>() {
			public boolean apply(ExtensionEnd s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ExtensionEnd#validateAggregation()
	 * @generated
	 */
	public static Predicate<ExtensionEnd> validateAggregation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExtensionEnd>() {
			public boolean apply(ExtensionEnd s) {
				return s.validateAggregation(diagnostics, context);
			}
		};
	}

}
