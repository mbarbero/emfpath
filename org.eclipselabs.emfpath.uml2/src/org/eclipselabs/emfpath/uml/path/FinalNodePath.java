package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FinalNode;

/**
 * @generated
 */
public class FinalNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	 FinalNodePath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.FinalNode#validateNoOutgoingEdges()
	 * @generated
	 */
	public static Predicate<FinalNode> validateNoOutgoingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<FinalNode>() {
			public boolean apply(FinalNode s) {
				return s.validateNoOutgoingEdges(diagnostics, context);
			}
		};
	}

}
