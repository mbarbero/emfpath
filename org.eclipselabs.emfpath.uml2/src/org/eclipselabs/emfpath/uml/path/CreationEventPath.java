package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreationEvent;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CreationEvent CreationEvent} in a functional way.
 * <p>
 * A creation event models the creation of an object. 
 * @see org.eclipse.uml2.uml.CreationEvent
 * @generated
 */
public class CreationEventPath extends EventPath {

	/**
	 * @generated
	 */
	private CreationEventPath() {
    super();
  }

	
	
	/**
	 * No othet OccurrenceSpecification may appear above an OccurrenceSpecification which
	 * references a CreationEvent on a given Lifeline in an InteractionOperand.
	true 
	 * @see org.eclipse.uml2.uml.CreationEvent#validateNoOccurrenceAbove(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CreationEvent> validateNoOccurrenceAbove(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CreationEvent>() {
      public boolean apply(CreationEvent s) {
        return s.validateNoOccurrenceAbove(diagnostics, context);
      }
    };
  }

}
