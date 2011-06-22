package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InitialNode;

/**
 * @generated
 */
public class InitialNodePath extends ControlNodePath {

	/**
	 * @generated
	 */
	private InitialNodePath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.InitialNode#validateNoIncomingEdges()
	 * @generated
	 */
	public static Predicate<InitialNode> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InitialNode>() {
			public boolean apply(InitialNode s) {
				return s.validateNoIncomingEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InitialNode#validateControlEdges()
	 * @generated
	 */
	public static Predicate<InitialNode> validateControlEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InitialNode>() {
			public boolean apply(InitialNode s) {
				return s.validateControlEdges(diagnostics, context);
			}
		};
	}

}
