package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Gate;

/**
 * @generated
 */
public class GatePath extends MessageEndPath {

	/**
	 * @generated
	 */
	private GatePath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.Gate#validateMessagesActualGate()
	 * @generated
	 */
	public static Predicate<Gate> validateMessagesActualGate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Gate>() {
			public boolean apply(Gate s) {
				return s.validateMessagesActualGate(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Gate#validateMessagesCombinedFragment()
	 * @generated
	 */
	public static Predicate<Gate> validateMessagesCombinedFragment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Gate>() {
			public boolean apply(Gate s) {
				return s.validateMessagesCombinedFragment(diagnostics, context);
			}
		};
	}

}
