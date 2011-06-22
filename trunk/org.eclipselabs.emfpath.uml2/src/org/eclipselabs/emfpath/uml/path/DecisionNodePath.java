package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ObjectFlow;

/**
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
	 * @see org.eclipse.uml2.uml.DecisionNode#getDecisionInput()
	 * @generated
	 */
	public static final Function<DecisionNode, Behavior> decisionInput = new Function<DecisionNode, Behavior>() {
		public Behavior apply(DecisionNode s) {
			return s.getDecisionInput();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#getDecisionInputFlow()
	 * @generated
	 */
	public static final Function<DecisionNode, ObjectFlow> decisionInputFlow = new Function<DecisionNode, ObjectFlow>() {
		public ObjectFlow apply(DecisionNode s) {
			return s.getDecisionInputFlow();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingOutgoingEdges()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateIncomingOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateIncomingOutgoingEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateEdges()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateDecisionInputFlowIncoming()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateDecisionInputFlowIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateDecisionInputFlowIncoming(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateParameters()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateParameters(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateZeroInputParameters()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateZeroInputParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateZeroInputParameters(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingObjectOneInputParameter()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateIncomingObjectOneInputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateIncomingObjectOneInputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateIncomingControlOneInputParameter()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateIncomingControlOneInputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateIncomingControlOneInputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DecisionNode#validateTwoInputParameters()
	 * @generated
	 */
	public static Predicate<DecisionNode> validateTwoInputParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DecisionNode>() {
			public boolean apply(DecisionNode s) {
				return s.validateTwoInputParameters(diagnostics, context);
			}
		};
	}

}
