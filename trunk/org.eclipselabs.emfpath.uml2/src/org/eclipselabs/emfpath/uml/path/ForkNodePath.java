package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ForkNode;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ForkNode ForkNode} in a functional way.
 * <p>
 * A fork node is a control node that splits a flow into multiple concurrent flows. 
 * @see org.eclipse.uml2.uml.ForkNode
 * @generated
 */
public class ForkNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private ForkNodePath() {
		super();
	}

	
	
	/**
	 * A fork node has one incoming edge.
	true 
	 * @see org.eclipse.uml2.uml.ForkNode#validateOneIncomingEdge(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ForkNode> validateOneIncomingEdge(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ForkNode>() {
			public boolean apply(ForkNode s) {
				return s.validateOneIncomingEdge(diagnostics, context);
			}
		};
	}

	/**
	 * The edges coming into and out of a fork node must be either all object flows or all
	 * control flows.
	true 
	 * @see org.eclipse.uml2.uml.ForkNode#validateEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ForkNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ForkNode>() {
			public boolean apply(ForkNode s) {
				return s.validateEdges(diagnostics, context);
			}
		};
	}

}
