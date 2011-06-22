package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreateLinkAction;

/**
 * @generated
 */
public class CreateLinkActionPath extends WriteLinkActionPath {

	/**
	 * @generated
	 */
	 CreateLinkActionPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.CreateLinkAction#validateAssociationNotAbstract()
	 * @generated
	 */
	public static Predicate<CreateLinkAction> validateAssociationNotAbstract(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateLinkAction>() {
			public boolean apply(CreateLinkAction s) {
				return s.validateAssociationNotAbstract(diagnostics, context);
			}
		};
	}

}
