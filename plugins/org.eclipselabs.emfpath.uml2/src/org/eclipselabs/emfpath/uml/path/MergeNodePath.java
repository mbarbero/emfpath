package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.MergeNode MergeNode} in a functional way.
 * <p>
 * A merge node is a control node that brings together multiple alternate flows. It is
 * not used to synchronize concurrent flows but to accept one among several alternate
 * flows. 
 * @see org.eclipse.uml2.uml.MergeNode
 * @generated
 */
public class MergeNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private MergeNodePath() {
    super();
  }

	
	
	/**
	 * A merge node has one outgoing edge.
	true 
	 * @see org.eclipse.uml2.uml.MergeNode#validateOneOutgoingEdge(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MergeNode> validateOneOutgoingEdge(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<MergeNode>() {
      public boolean apply(MergeNode s) {
        return s.validateOneOutgoingEdge(diagnostics, context);
      }
    };
  }

	/**
	 * The edges coming into and out of a merge node must be either all object flows or all
	 * control flows.
	true 
	 * @see org.eclipse.uml2.uml.MergeNode#validateEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MergeNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<MergeNode>() {
      public boolean apply(MergeNode s) {
        return s.validateEdges(diagnostics, context);
      }
    };
  }

}
