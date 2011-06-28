package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ClearStructuralFeatureAction ClearStructuralFeatureAction} in a functional way.
 * <p>
 * A clear structural feature action is a structural feature action that removes all
 * values of a structural feature. 
 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction
 * @generated
 */
public class ClearStructuralFeatureActionPath extends StructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private ClearStructuralFeatureActionPath() {
    super();
  }

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<ClearStructuralFeatureAction, OutputPin> result = new Function<ClearStructuralFeatureAction, OutputPin>() {
    public OutputPin apply(ClearStructuralFeatureAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * The type of the result output pin is the same as the type of the inherited object
	 * input pin.
	result->notEmpty() implies self.result.type = self.object.type 
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#validateTypeOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ClearStructuralFeatureAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ClearStructuralFeatureAction>() {
      public boolean apply(ClearStructuralFeatureAction s) {
        return s.validateTypeOfResult(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the result output pin must be 1..1.
	result->notEmpty() implies
	 * self.result.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#validateMultiplicityOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ClearStructuralFeatureAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ClearStructuralFeatureAction>() {
      public boolean apply(ClearStructuralFeatureAction s) {
        return s.validateMultiplicityOfResult(diagnostics, context);
      }
    };
  }

}
