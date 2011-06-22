package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.JoinNode#isCombineDuplicate()
	 * @generated
	 */
	public static final Predicate<JoinNode> isCombineDuplicate = new Predicate<JoinNode>() {
		public boolean apply(JoinNode s) {
			return s.isCombineDuplicate();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.JoinNode#getJoinSpec()
	 * @generated
	 */
	public static final Function<JoinNode, ValueSpecification> joinSpec = new Function<JoinNode, ValueSpecification>() {
		public ValueSpecification apply(JoinNode s) {
			return s.getJoinSpec();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.JoinNode#validateOneOutgoingEdge()
	 * @generated
	 */
	public static Predicate<JoinNode> validateOneOutgoingEdge(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<JoinNode>() {
			public boolean apply(JoinNode s) {
				return s.validateOneOutgoingEdge(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.JoinNode#validateIncomingObjectFlow()
	 * @generated
	 */
	public static Predicate<JoinNode> validateIncomingObjectFlow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<JoinNode>() {
			public boolean apply(JoinNode s) {
				return s.validateIncomingObjectFlow(diagnostics, context);
			}
		};
	}

}
