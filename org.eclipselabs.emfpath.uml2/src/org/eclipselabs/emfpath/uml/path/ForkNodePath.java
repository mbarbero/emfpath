package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ForkNode;

/**
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
	 * @see org.eclipse.uml2.uml.ForkNode#validateOneIncomingEdge()
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
	 * @see org.eclipse.uml2.uml.ForkNode#validateEdges()
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
