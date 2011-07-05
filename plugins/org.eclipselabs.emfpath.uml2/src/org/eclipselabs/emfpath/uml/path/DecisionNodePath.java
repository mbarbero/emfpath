package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DecisionNode DecisionNode} in a functional way.
 * <p>
 * A decision node is a control node that chooses between outgoing flows. 
 * @see org.eclipse.uml2.uml.DecisionNode
 * @generated
 */
public class DecisionNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private DecisionNodePath() {
    super();
  }

	/**
	 * Provides input to guard specifications on edges outgoing from the decision node. 
	 * @see org.eclipse.uml2.uml.DecisionNode#getDecisionInput()
	 * @generated
	 */
	public static final Function<DecisionNode, Behavior> decisionInput = new Function<DecisionNode, Behavior>() {
    public Behavior apply(DecisionNode s) {
      return s.getDecisionInput();
    }
  };

	/**
	 * An additional edge incoming to the decision node that provides a decision input value.
	 * @see org.eclipse.uml2.uml.DecisionNode#getDecisionInputFlow()
	 * @generated
	 */
	public static final Function<DecisionNode, ObjectFlow> decisionInputFlow = new Function<DecisionNode, ObjectFlow>() {
    public ObjectFlow apply(DecisionNode s) {
      return s.getDecisionInputFlow();
    }
  };
	
	/**
	 * A decision node has one or two incoming edges and at least one outgoing edge.
	true
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateIncomingOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateIncomingOutgoingEdges(diagnostics, context);
      }
    };
  }

	/**
	 * The edges coming into and out of a decision node, other than the decision input flow
	 * (if any), must be either all object flows or all control flows.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateEdges(diagnostics, context);
      }
    };
  }

	/**
	 * The decisionInputFlow of a decision node must be an incoming edge of the decision
	 * node.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateDecisionInputFlowIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateDecisionInputFlowIncoming(diagnostics, context);
      }
    };
  }

	/**
	 * A decision input behavior has no output parameters, no in-out parameters and one return
	 * parameter.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateParameters(diagnostics, context);
      }
    };
  }

	/**
	 * If the decision node has no decision input flow and an incoming control flow, then
	 * a decision input behavior has zero input parameters.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateZeroInputParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateZeroInputParameters(diagnostics, context);
      }
    };
  }

	/**
	 * If the decision node has no decision input flow and an incoming object flow, then
	 * a decision input behavior has one input parameter whose type is the same as or a supertype
	 * of the type of object tokens offered on the incoming edge.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateIncomingObjectOneInputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateIncomingObjectOneInputParameter(diagnostics, context);
      }
    };
  }

	/**
	 * If the decision node has a decision input flow and an incoming control flow, then
	 * a decision input behavior has one input parameter whose type is the same as or a supertype
	 * of the type of object tokens offered on the decision input flow.
	true 
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateIncomingControlOneInputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateIncomingControlOneInputParameter(diagnostics, context);
      }
    };
  }

	/**
	 * If the decision node has a decision input flow and an second incoming object flow,
	 * then a decision input behavior has two input parameters, the first of which has a
	 * type that is the same as or a supertype of the type of the type of object tokens offered
	 * on the nondecision input flow and the second of which has a type that is the same
	 * as or a supertype of the type of object tokens offered on the decision input flow.
	true
	 * @see org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DecisionNode> validateTwoInputParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DecisionNode>() {
      public boolean apply(DecisionNode s) {
        return s.validateTwoInputParameters(diagnostics, context);
      }
    };
  }

}
