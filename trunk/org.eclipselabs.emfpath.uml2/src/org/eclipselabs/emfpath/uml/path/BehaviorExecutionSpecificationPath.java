package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;

/**
 * @generated
 */
public class BehaviorExecutionSpecificationPath extends ExecutionSpecificationPath {

	/**
	 * @generated
	 */
	private BehaviorExecutionSpecificationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.BehaviorExecutionSpecification#getBehavior()
	 * @generated
	 */
	public static final Function<BehaviorExecutionSpecification, Behavior> behavior = new Function<BehaviorExecutionSpecification, Behavior>() {
		public Behavior apply(BehaviorExecutionSpecification s) {
			return s.getBehavior();
		}
	};
	
	

}
