package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;

/**
 * @generated
 */
public class InputPinPath extends PinPath {

	/**
	 * @generated
	 */
	 InputPinPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.InputPin#validateOutgoingEdgesStructuredOnly()
	 * @generated
	 */
	public static Predicate<InputPin> validateOutgoingEdgesStructuredOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InputPin>() {
			public boolean apply(InputPin s) {
				return s.validateOutgoingEdgesStructuredOnly(diagnostics, context);
			}
		};
	}

}
