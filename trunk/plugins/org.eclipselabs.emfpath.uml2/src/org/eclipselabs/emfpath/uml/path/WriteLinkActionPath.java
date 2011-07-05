package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.WriteLinkAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.WriteLinkAction WriteLinkAction} in a functional way.
 * <p>
 * WriteLinkAction is an abstract class for link actions that create and destroy links.
 * @see org.eclipse.uml2.uml.WriteLinkAction
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
	 * The visibility of at least one end must allow access to the class using the action.
	true
	 * @see org.eclipse.uml2.uml.WriteLinkAction#validateAllowAccess(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<WriteLinkAction> validateAllowAccess(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<WriteLinkAction>() {
      public boolean apply(WriteLinkAction s) {
        return s.validateAllowAccess(diagnostics, context);
      }
    };
  }

}
