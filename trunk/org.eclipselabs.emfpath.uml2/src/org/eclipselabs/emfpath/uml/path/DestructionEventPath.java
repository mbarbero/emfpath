package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DestructionEvent;

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
	public static Predicate<DestructionEvent> validateNoOccurrenceSpecificationsBelow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DestructionEvent>() {
			public boolean apply(DestructionEvent s) {
				return s.validateNoOccurrenceSpecificationsBelow(diagnostics, context);
			}
		};
	}

}
