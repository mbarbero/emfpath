package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ControlFlow;

/**
 * @generated
 */
public class ControlFlowPath extends ActivityEdgePath {

	/**
	 * @generated
	 */
	private ControlFlowPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.ControlFlow#validateObjectNodes()
	 * @generated
	 */
	public static Predicate<ControlFlow> validateObjectNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ControlFlow>() {
			public boolean apply(ControlFlow s) {
				return s.validateObjectNodes(diagnostics, context);
			}
		};
	}

}
