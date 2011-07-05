package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ObjectNode ObjectNode} in a functional way.
 * <p>
 * An object node is an abstract activity node that is part of defining object flow in
 * an activity.
Object nodes have support for token selection, limitation on the number
 * of tokens, specifying the state required for tokens, and carrying control values.
 * @see org.eclipse.uml2.uml.ObjectNode
 * @generated
 */
public class ObjectNodePath extends ActivityNodePath {

	/**
	 * @generated
	 */
	 ObjectNodePath() {
    super();
  }

	/**
	 * This information is derived from the return result for this Operation.
	The type of
	 * the TypedElement. 
	 *
	 * @see TypedElementPath#type()
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = TypedElementPath.type;

	/**
	 * Tells whether and how the tokens in the object node are ordered for selection to traverse
	 * edges outgoing from the object node. 
	 * @see org.eclipse.uml2.uml.ObjectNode#getOrdering()
	 * @generated
	 */
	public static final Function<ObjectNode, ObjectNodeOrderingKind> ordering = new Function<ObjectNode, ObjectNodeOrderingKind>() {
    public ObjectNodeOrderingKind apply(ObjectNode s) {
      return s.getOrdering();
    }
  };

	/**
	 * Tells whether the type of the object node is to be treated as control. 
	 * @see org.eclipse.uml2.uml.ObjectNode#isControlType()
	 * @generated
	 */
	public static final ComposablePredicate<ObjectNode> isControlType = new ComposablePredicate<ObjectNode>() {
    public boolean apply(ObjectNode s) {
      return s.isControlType();
    }
  };

	/**
	 * The maximum number of tokens allowed in the node. Objects cannot flow into the node
	 * if the upper bound is reached. 
	 * @see org.eclipse.uml2.uml.ObjectNode#getUpperBound()
	 * @generated
	 */
	public static final Function<ObjectNode, ValueSpecification> upperBound = new Function<ObjectNode, ValueSpecification>() {
    public ValueSpecification apply(ObjectNode s) {
      return s.getUpperBound();
    }
  };

	/**
	 * The required states of the object available at this point in the activity. 
	 * @see org.eclipse.uml2.uml.ObjectNode#getInStates()
	 * @generated
	 */
	public static final Function<ObjectNode, EList<State>> inState = new Function<ObjectNode, EList<State>>() {
    public EList<State> apply(ObjectNode s) {
      return s.getInStates();
    }
  };

	/**
	 * Selects tokens for outgoing edges. 
	 * @see org.eclipse.uml2.uml.ObjectNode#getSelection()
	 * @generated
	 */
	public static final Function<ObjectNode, Behavior> selection = new Function<ObjectNode, Behavior>() {
    public Behavior apply(ObjectNode s) {
      return s.getSelection();
    }
  };
	
	/**
	 * All edges coming into or going out of object nodes must be object flow edges.
	true
	 * @see org.eclipse.uml2.uml.ObjectNode#validateObjectFlowEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ObjectNode> validateObjectFlowEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ObjectNode>() {
      public boolean apply(ObjectNode s) {
        return s.validateObjectFlowEdges(diagnostics, context);
      }
    };
  }

	/**
	 * Object nodes are not unique typed elements
	isUnique = false 
	 * @see org.eclipse.uml2.uml.ObjectNode#validateNotUnique(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ObjectNode> validateNotUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ObjectNode>() {
      public boolean apply(ObjectNode s) {
        return s.validateNotUnique(diagnostics, context);
      }
    };
  }

	/**
	 * If an object node has a selection behavior, then the ordering of the object node is
	 * ordered, and vice versa.
	true 
	 * @see org.eclipse.uml2.uml.ObjectNode#validateSelectionBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ObjectNode> validateSelectionBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ObjectNode>() {
      public boolean apply(ObjectNode s) {
        return s.validateSelectionBehavior(diagnostics, context);
      }
    };
  }

	/**
	 * A selection behavior has one input parameter and one output parameter. The input parameter
	 * must be a bag of elements of the same type as the object node or a supertype of the
	 * type of object node. The output parameter must be the same or a subtype of the type
	 * of object node. The behavior cannot have side effects.
	true 
	 * @see org.eclipse.uml2.uml.ObjectNode#validateInputOutputParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ObjectNode> validateInputOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ObjectNode>() {
      public boolean apply(ObjectNode s) {
        return s.validateInputOutputParameter(diagnostics, context);
      }
    };
  }

}
