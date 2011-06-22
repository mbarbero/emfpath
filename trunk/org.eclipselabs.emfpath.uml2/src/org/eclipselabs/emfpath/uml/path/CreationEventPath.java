package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreationEvent;

/**
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
	 * @see org.eclipse.uml2.uml.CreationEvent#validateNoOccurrenceAbove()
	 * @generated
	 */
	public static Predicate<CreationEvent> validateNoOccurrenceAbove(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreationEvent>() {
			public boolean apply(CreationEvent s) {
				return s.validateNoOccurrenceAbove(diagnostics, context);
			}
		};
	}

}
