package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InitialNode InitialNode} in a functional way.
 * <p>
 * An initial node is a control node at which flow starts when the activity is invoked.
 * @see org.eclipse.uml2.uml.InitialNode
 * @generated
 */
public class InitialNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private InitialNodePath() {
    super();
  }

	
	
	/**
	 * An initial node has no incoming edges.
	true 
	 * @see org.eclipse.uml2.uml.InitialNode#validateNoIncomingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InitialNode> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InitialNode>() {
      public boolean apply(InitialNode s) {
        return s.validateNoIncomingEdges(diagnostics, context);
      }
    };
  }

	/**
	 * Only control edges can have initial nodes as source.
	true 
	 * @see org.eclipse.uml2.uml.InitialNode#validateControlEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InitialNode> validateControlEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InitialNode>() {
      public boolean apply(InitialNode s) {
        return s.validateControlEdges(diagnostics, context);
      }
    };
  }

}
