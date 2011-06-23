package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InputPin InputPin} in a functional way.
 * <p>
 * An input pin is a pin that holds input values to be consumed by an action. 
 * @see org.eclipse.uml2.uml.InputPin
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
	 * Input pins may have outgoing edges only when they are on actions that are structured
	 * nodes, and these edges must target a node contained by the structured node.
	true
	 * @see org.eclipse.uml2.uml.InputPin#validateOutgoingEdgesStructuredOnly(DiagnosticChain, Map)
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
