package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.JoinNode JoinNode} in a functional way.
 * <p>
 * A join node is a control node that synchronizes multiple flows.
Join nodes have a
 * Boolean value specification using the names of the incoming edges to specify the conditions
 * under which the join will emit a token. 
 * @see org.eclipse.uml2.uml.JoinNode
 * @generated
 */
public class JoinNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private JoinNodePath() {
    super();
  }

	/**
	 * Tells whether tokens having objects with the same identity are combined into one by
	 * the join. 
	 * @see org.eclipse.uml2.uml.JoinNode#isCombineDuplicate()
	 * @generated
	 */
	public static final ComposablePredicate<JoinNode> isCombineDuplicate = new ComposablePredicate<JoinNode>() {
    public boolean apply(JoinNode s) {
      return s.isCombineDuplicate();
    }
  };

	/**
	 * A specification giving the conditions under which the join with emit a token. Default
	 * is "and". 
	 * @see org.eclipse.uml2.uml.JoinNode#getJoinSpec()
	 * @generated
	 */
	public static final Function<JoinNode, ValueSpecification> joinSpec = new Function<JoinNode, ValueSpecification>() {
    public ValueSpecification apply(JoinNode s) {
      return s.getJoinSpec();
    }
  };
	
	/**
	 * A join node has one outgoing edge.
	self.outgoing->size() = 1 
	 * @see org.eclipse.uml2.uml.JoinNode#validateOneOutgoingEdge(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<JoinNode> validateOneOutgoingEdge(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<JoinNode>() {
      public boolean apply(JoinNode s) {
        return s.validateOneOutgoingEdge(diagnostics, context);
      }
    };
  }

	/**
	 * If a join node has an incoming object flow, it must have an outgoing object flow,
	 * otherwise, it must have an outgoing control flow.
	(self.incoming.select(e | e.isTypeOf(ObjectFlow)->notEmpty()
	 * implies
	  self.outgoing.isTypeOf(ObjectFlow)) and
	    (self.incoming.select(e |
	 * e.isTypeOf(ObjectFlow)->empty() implies
	      self.outgoing.isTypeOf(ControlFlow))
	 * @see org.eclipse.uml2.uml.JoinNode#validateIncomingObjectFlow(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<JoinNode> validateIncomingObjectFlow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<JoinNode>() {
      public boolean apply(JoinNode s) {
        return s.validateIncomingObjectFlow(diagnostics, context);
      }
    };
  }

}
