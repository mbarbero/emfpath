package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExtensionEnd ExtensionEnd} in a functional way.
 * <p>
 * An extension end is used to tie an extension to a stereotype when extending a metaclass.
The
 * default multiplicity of an extension end is 0..1. 
 * @see org.eclipse.uml2.uml.ExtensionEnd
 * @generated
 */
public class ExtensionEndPath extends PropertyPath {

	/**
	 * @generated
	 */
	private ExtensionEndPath() {
    super();
  }

	
	
	/**
	 * The multiplicity of ExtensionEnd is 0..1 or 1.
	(self->lowerBound() = 0 or self->lowerBound()
	 * = 1) and self->upperBound() = 1 
	 * @see org.eclipse.uml2.uml.ExtensionEnd#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExtensionEnd> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExtensionEnd>() {
      public boolean apply(ExtensionEnd s) {
        return s.validateMultiplicity(diagnostics, context);
      }
    };
  }

	/**
	 * The aggregation of an ExtensionEnd is composite.
	self.aggregation = #composite 
	 * @see org.eclipse.uml2.uml.ExtensionEnd#validateAggregation(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExtensionEnd> validateAggregation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExtensionEnd>() {
      public boolean apply(ExtensionEnd s) {
        return s.validateAggregation(diagnostics, context);
      }
    };
  }

}
