package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.WriteLinkAction;

/**
 * @generated
 */
public class WriteLinkActionPath extends LinkActionPath {

	/**
	 * @generated
	 */
	 WriteLinkActionPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.WriteLinkAction#validateAllowAccess()
	 * @generated
	 */
	public static Predicate<WriteLinkAction> validateAllowAccess(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteLinkAction>() {
			public boolean apply(WriteLinkAction s) {
				return s.validateAllowAccess(diagnostics, context);
			}
		};
	}

}
