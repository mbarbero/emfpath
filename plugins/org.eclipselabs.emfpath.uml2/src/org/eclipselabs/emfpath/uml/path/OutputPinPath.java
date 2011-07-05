package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.OutputPin OutputPin} in a functional way.
 * <p>
 * An output pin is a pin that holds output values produced by an action. 
 * @see org.eclipse.uml2.uml.OutputPin
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
	 * Output pins may have incoming edges only when they are on actions that are structured
	 * nodes, and these edges may not target a node contained by the structured node.
	true
	 * @see org.eclipse.uml2.uml.OutputPin#validateIncomingEdgesStructuredOnly(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<OutputPin> validateIncomingEdgesStructuredOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<OutputPin>() {
      public boolean apply(OutputPin s) {
        return s.validateIncomingEdgesStructuredOnly(diagnostics, context);
      }
    };
  }

}
