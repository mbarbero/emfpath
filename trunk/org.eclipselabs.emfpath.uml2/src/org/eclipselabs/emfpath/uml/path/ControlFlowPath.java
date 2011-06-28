package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ControlFlow ControlFlow} in a functional way.
 * <p>
 * A control flow is an edge that starts an activity node after the previous one is finished.
 * @see org.eclipse.uml2.uml.ControlFlow
 * @generated
 */
public class ControlFlowPath extends ActivityEdgePath {

	/**
	 * @generated
	 */
	private ControlFlowPath() {
    super();
  }

	
	
	/**
	 * Control flows may not have object nodes at either end, except for object nodes with
	 * control type.
	true 
	 * @see org.eclipse.uml2.uml.ControlFlow#validateObjectNodes(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ControlFlow> validateObjectNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ControlFlow>() {
      public boolean apply(ControlFlow s) {
        return s.validateObjectNodes(diagnostics, context);
      }
    };
  }

}
