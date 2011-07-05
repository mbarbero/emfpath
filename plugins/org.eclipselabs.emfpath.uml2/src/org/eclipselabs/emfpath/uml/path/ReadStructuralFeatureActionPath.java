package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadStructuralFeatureAction ReadStructuralFeatureAction} in a functional way.
 * <p>
 * A read structural feature action is a structural feature action that retrieves the
 * values of a structural feature. 
 * @see org.eclipse.uml2.uml.ReadStructuralFeatureAction
 * @generated
 */
public class ReadStructuralFeatureActionPath extends StructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private ReadStructuralFeatureActionPath() {
    super();
  }

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.ReadStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<ReadStructuralFeatureAction, OutputPin> result = new Function<ReadStructuralFeatureAction, OutputPin>() {
    public OutputPin apply(ReadStructuralFeatureAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * The type and ordering of the result output pin are the same as the type and ordering
	 * of the structural feature.
	self.result.type = self.structuralFeature.type
	and self.result.ordering
	 * = self.structuralFeature.ordering
	 
	 * @see org.eclipse.uml2.uml.ReadStructuralFeatureAction#validateTypeAndOrdering(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadStructuralFeatureAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadStructuralFeatureAction>() {
      public boolean apply(ReadStructuralFeatureAction s) {
        return s.validateTypeAndOrdering(diagnostics, context);
      }
    };
  }

}
