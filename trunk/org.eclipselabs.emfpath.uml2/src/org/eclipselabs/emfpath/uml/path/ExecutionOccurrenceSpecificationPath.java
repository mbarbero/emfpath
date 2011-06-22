package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.ExecutionOccurrenceSpecification#getExecution()
	 * @generated
	 */
	public static final Function<ExecutionOccurrenceSpecification, ExecutionSpecification> execution = new Function<ExecutionOccurrenceSpecification, ExecutionSpecification>() {
		public ExecutionSpecification apply(ExecutionOccurrenceSpecification s) {
			return s.getExecution();
		}
	};
	
	

}
