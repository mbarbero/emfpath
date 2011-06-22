package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DestructionEvent;

/**
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
	 * @see org.eclipse.uml2.uml.DestructionEvent#validateNoOccurrenceSpecificationsBelow()
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
