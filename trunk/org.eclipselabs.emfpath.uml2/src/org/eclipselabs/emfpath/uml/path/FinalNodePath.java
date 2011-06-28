package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FinalNode;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.FinalNode FinalNode} in a functional way.
 * <p>
 * A final node is an abstract control node at which a flow in an activity stops. 
 * @see org.eclipse.uml2.uml.FinalNode
 * @generated
 */
public class FinalNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	 FinalNodePath() {
    super();
  }

	
	
	/**
	 * A final node has no outgoing edges.
	true 
	 * @see org.eclipse.uml2.uml.FinalNode#validateNoOutgoingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<FinalNode> validateNoOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<FinalNode>() {
      public boolean apply(FinalNode s) {
        return s.validateNoOutgoingEdges(diagnostics, context);
      }
    };
  }

}
