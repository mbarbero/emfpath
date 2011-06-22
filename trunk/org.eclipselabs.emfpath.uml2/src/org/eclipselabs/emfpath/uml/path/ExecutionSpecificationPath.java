package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * @generated
 */
public class ExecutionSpecificationPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 ExecutionSpecificationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#getStart()
	 * @generated
	 */
	public static final Function<ExecutionSpecification, OccurrenceSpecification> start = new Function<ExecutionSpecification, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(ExecutionSpecification s) {
			return s.getStart();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#getFinish()
	 * @generated
	 */
	public static final Function<ExecutionSpecification, OccurrenceSpecification> finish = new Function<ExecutionSpecification, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(ExecutionSpecification s) {
			return s.getFinish();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#validateSameLifeline()
	 * @generated
	 */
	public static Predicate<ExecutionSpecification> validateSameLifeline(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExecutionSpecification>() {
			public boolean apply(ExecutionSpecification s) {
				return s.validateSameLifeline(diagnostics, context);
			}
		};
	}

}
