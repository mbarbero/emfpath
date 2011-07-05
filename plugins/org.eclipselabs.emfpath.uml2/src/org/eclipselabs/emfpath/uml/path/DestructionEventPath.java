package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DestructionEvent;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DestructionEvent DestructionEvent} in a functional way.
 * <p>
 * A destruction event models the destruction of an object. 
 * @see org.eclipse.uml2.uml.DestructionEvent
 * @generated
 */
public class DestructionEventPath extends EventPath {

	/**
	 * @generated
	 */
	private DestructionEventPath() {
    super();
  }

	
	
	/**
	 * No other OccurrenceSpecifications may appear below an OccurrenceSpecification which
	 * references a DestructionEvent on a given Lifeline in an InteractionOperand.
	true
	 * @see org.eclipse.uml2.uml.DestructionEvent#validateNoOccurrenceSpecificationsBelow(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DestructionEvent> validateNoOccurrenceSpecificationsBelow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DestructionEvent>() {
      public boolean apply(DestructionEvent s) {
        return s.validateNoOccurrenceSpecificationsBelow(diagnostics, context);
      }
    };
  }

}
