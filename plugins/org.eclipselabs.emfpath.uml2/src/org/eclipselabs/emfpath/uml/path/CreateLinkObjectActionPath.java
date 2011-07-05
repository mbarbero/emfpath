package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreateLinkObjectAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CreateLinkObjectAction CreateLinkObjectAction} in a functional way.
 * <p>
 * A create link object action creates a link object. 
 * @see org.eclipse.uml2.uml.CreateLinkObjectAction
 * @generated
 */
public class CreateLinkObjectActionPath extends CreateLinkActionPath {

	/**
	 * @generated
	 */
	private CreateLinkObjectActionPath() {
    super();
  }

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#getResult()
	 * @generated
	 */
	public static final Function<CreateLinkObjectAction, OutputPin> result = new Function<CreateLinkObjectAction, OutputPin>() {
    public OutputPin apply(CreateLinkObjectAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * The association must be an association class.
	self.association().oclIsKindOf(Class)
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateAssociationClass(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CreateLinkObjectAction> validateAssociationClass(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CreateLinkObjectAction>() {
      public boolean apply(CreateLinkObjectAction s) {
        return s.validateAssociationClass(diagnostics, context);
      }
    };
  }

	/**
	 * The type of the result pin must be the same as the association of the action.
	self.result.type
	 * = self.association() 
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateTypeOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CreateLinkObjectAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CreateLinkObjectAction>() {
      public boolean apply(CreateLinkObjectAction s) {
        return s.validateTypeOfResult(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the output pin is 1..1.
	self.result.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CreateLinkObjectAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CreateLinkObjectAction>() {
      public boolean apply(CreateLinkObjectAction s) {
        return s.validateMultiplicity(diagnostics, context);
      }
    };
  }

}
