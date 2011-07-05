package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CreateLinkAction CreateLinkAction} in a functional way.
 * <p>
 * A create link action is a write link action for creating links. 
 * @see org.eclipse.uml2.uml.CreateLinkAction
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
	 * The association cannot be an abstract classifier.
	self.association().isAbstract =
	 * #false 
	 * @see org.eclipse.uml2.uml.CreateLinkAction#validateAssociationNotAbstract(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CreateLinkAction> validateAssociationNotAbstract(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CreateLinkAction>() {
      public boolean apply(CreateLinkAction s) {
        return s.validateAssociationNotAbstract(diagnostics, context);
      }
    };
  }

}
