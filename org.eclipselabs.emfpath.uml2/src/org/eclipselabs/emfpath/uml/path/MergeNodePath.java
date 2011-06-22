package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MergeNode;

/**
 * @generated
 */
public class MergeNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private MergeNodePath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.MergeNode#validateOneOutgoingEdge()
	 * @generated
	 */
	public static Predicate<MergeNode> validateOneOutgoingEdge(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MergeNode>() {
			public boolean apply(MergeNode s) {
				return s.validateOneOutgoingEdge(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.MergeNode#validateEdges()
	 * @generated
	 */
	public static Predicate<MergeNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MergeNode>() {
			public boolean apply(MergeNode s) {
				return s.validateEdges(diagnostics, context);
			}
		};
	}

}
