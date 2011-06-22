package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class OutputPinPath extends PinPath {

	/**
	 * @generated
	 */
	private OutputPinPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.OutputPin#validateIncomingEdgesStructuredOnly()
	 * @generated
	 */
	public static Predicate<OutputPin> validateIncomingEdgesStructuredOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<OutputPin>() {
			public boolean apply(OutputPin s) {
				return s.validateIncomingEdgesStructuredOnly(diagnostics, context);
			}
		};
	}

}
