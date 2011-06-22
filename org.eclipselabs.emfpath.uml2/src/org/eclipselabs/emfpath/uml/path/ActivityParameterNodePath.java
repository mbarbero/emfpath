package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.Parameter;

/**
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
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#getParameter()
	 * @generated
	 */
	public static final Function<ActivityParameterNode, Parameter> parameter = new Function<ActivityParameterNode, Parameter>() {
		public Parameter apply(ActivityParameterNode s) {
			return s.getParameter();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateHasParameters()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateHasParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateHasParameters(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateSameType()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoEdges()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateNoEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateNoEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoIncomingEdges()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateNoIncomingEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateNoOutgoingEdges()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateNoOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateNoOutgoingEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumOneParameterNode()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateMaximumOneParameterNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateMaximumOneParameterNode(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityParameterNode#validateMaximumTwoParameterNodes()
	 * @generated
	 */
	public static Predicate<ActivityParameterNode> validateMaximumTwoParameterNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityParameterNode>() {
			public boolean apply(ActivityParameterNode s) {
				return s.validateMaximumTwoParameterNodes(diagnostics, context);
			}
		};
	}

}
