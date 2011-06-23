package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectFlow;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ObjectFlow ObjectFlow} in a functional way.
 * <p>
 * An object flow is an activity edge that can have objects or data passing along it.
Object
 * flows have support for multicast/receive, token selection from object nodes, and transformation
 * of tokens. 
 * @see org.eclipse.uml2.uml.ObjectFlow
 * @generated
 */
public class ObjectFlowPath extends ActivityEdgePath {

	/**
	 * @generated
	 */
	private ObjectFlowPath() {
		super();
	}

	/**
	 * Tells whether the objects in the flow are passed by multicasting. 
	 * @see org.eclipse.uml2.uml.ObjectFlow#isMulticast()
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMulticast = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMulticast();
		}
	};

	/**
	 * Tells whether the objects in the flow are gathered from respondents to multicasting.
	 * @see org.eclipse.uml2.uml.ObjectFlow#isMultireceive()
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMultireceive = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMultireceive();
		}
	};

	/**
	 * Changes or replaces data tokens flowing along edge. 
	 * @see org.eclipse.uml2.uml.ObjectFlow#getTransformation()
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> transformation = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getTransformation();
		}
	};

	/**
	 * Selects tokens from a source object node. 
	 * @see org.eclipse.uml2.uml.ObjectFlow#getSelection()
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> selection = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getSelection();
		}
	};
	
	/**
	 * Object flows may not have actions at either end.
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateNoActions(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateNoActions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateNoActions(diagnostics, context);
			}
		};
	}

	/**
	 * Object nodes connected by an object flow, with optionally intervening control nodes,
	 * must have compatible types. In particular, the downstream object node type must be
	 * the same or a supertype of the upstream object node type.
	
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateCompatibleTypes(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateCompatibleTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateCompatibleTypes(diagnostics, context);
			}
		};
	}

	/**
	 * Object nodes connected by an object flow, with optionally intervening control nodes,
	 * must have the same upper bounds.
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateSameUpperBounds(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSameUpperBounds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSameUpperBounds(diagnostics, context);
			}
		};
	}

	/**
	 * An edge with constant weight may not target an object node, or lead to an object node
	 * downstream with no intervening actions, that has an upper bound less than the weight.
	true
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateTarget(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTarget(diagnostics, context);
			}
		};
	}

	/**
	 * A transformation behavior has one input parameter and one output parameter. The input
	 * parameter must be the same as or a supertype of the type of object token coming from
	 * the source end. The output parameter must be the same or a subtype of the type of
	 * object token expected downstream. The behavior cannot have side effects.
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateTransformationBehaviour(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTransformationBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTransformationBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * An object flow may have a selection behavior only if has an object node as a source.
	true
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateSelectionBehaviour(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSelectionBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSelectionBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * A selection behavior has one input parameter and one output parameter. The input parameter
	 * must be a bag of elements of the same as or a supertype of the type of source object
	 * node. The output parameter must be the same or a subtype of the type of source object
	 * node. The behavior cannot have side effects.
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateInputAndOutputParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateInputAndOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateInputAndOutputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * isMulticast and isMultireceive cannot both be true.
	true 
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateIsMulticastOrIsMultireceive(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateIsMulticastOrIsMultireceive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateIsMulticastOrIsMultireceive(diagnostics, context);
			}
		};
	}

}
