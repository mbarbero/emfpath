package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.Parameter;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActivityParameterNode ActivityParameterNode} in a functional way.
 * <p>
 * An activity parameter node is an object node for inputs and outputs to activities.
 * @see org.eclipse.uml2.uml.ActivityParameterNode
 * @generated
 */
public class ActivityParameterNodePath extends ObjectNodePath {

	/**
	 * @generated
	 */
	private ActivityParameterNodePath() {
    super();
  }

	/**
	 * The parameter the object node will be accepting or providing values for. 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#getParameter()
	 * @generated
	 */
	public static final Function<ActivityParameterNode, Parameter> parameter = new Function<ActivityParameterNode, Parameter>() {
    public Parameter apply(ActivityParameterNode s) {
      return s.getParameter();
    }
  };
	
	/**
	 * Activity parameter nodes must have parameters from the containing activity.
	true
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateHasParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateHasParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateHasParameters(diagnostics, context);
      }
    };
  }

	/**
	 * The type of an activity parameter node is the same as the type of its parameter.
	true
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateSameType(diagnostics, context);
      }
    };
  }

	/**
	 * An activity parameter node may have all incoming edges or all outgoing edges, but
	 * it must not have both incoming and outgoing edges.
	true 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateNoEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateNoEdges(diagnostics, context);
      }
    };
  }

	/**
	 * Activity parameter object nodes with no incoming edges and one or more outgoing edges
	 * must have a parameter with in or inout direction.
	
	true 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoIncomingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateNoIncomingEdges(diagnostics, context);
      }
    };
  }

	/**
	 * Activity parameter object nodes with no outgoing edges and one or more incoming edges
	 * must have a parameter with out, inout, or return direction.
	
	true 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoOutgoingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateNoOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateNoOutgoingEdges(diagnostics, context);
      }
    };
  }

	/**
	 * A parameter with direction other than inout must have at most one activity parameter
	 * node in an activity.
	true 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumOneParameterNode(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateMaximumOneParameterNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateMaximumOneParameterNode(diagnostics, context);
      }
    };
  }

	/**
	 * A parameter with direction inout must have at most two activity parameter nodes in
	 * an activity, one with incoming flows and one with outgoing flows.
	true 
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumTwoParameterNodes(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityParameterNode> validateMaximumTwoParameterNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityParameterNode>() {
      public boolean apply(ActivityParameterNode s) {
        return s.validateMaximumTwoParameterNodes(diagnostics, context);
      }
    };
  }

}
