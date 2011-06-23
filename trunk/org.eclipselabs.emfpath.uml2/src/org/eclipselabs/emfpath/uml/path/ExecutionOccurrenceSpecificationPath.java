package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExecutionOccurrenceSpecification ExecutionOccurrenceSpecification} in a functional way.
 * <p>
 * An execution occurrence specification represents moments in time at which actions
 * or behaviors start or finish. 
 * @see org.eclipse.uml2.uml.ExecutionOccurrenceSpecification
 * @generated
 */
public class ExecutionOccurrenceSpecificationPath extends OccurrenceSpecificationPath {

	/**
	 * @generated
	 */
	private ExecutionOccurrenceSpecificationPath() {
		super();
	}

	/**
	 * References the execution specification describing the execution that is started or
	 * finished at this execution event. 
	 * @see org.eclipse.uml2.uml.ExecutionOccurrenceSpecification#getExecution()
	 * @generated
	 */
	public static final Function<ExecutionOccurrenceSpecification, ExecutionSpecification> execution = new Function<ExecutionOccurrenceSpecification, ExecutionSpecification>() {
		public ExecutionSpecification apply(ExecutionOccurrenceSpecification s) {
			return s.getExecution();
		}
	};
	
	

}
