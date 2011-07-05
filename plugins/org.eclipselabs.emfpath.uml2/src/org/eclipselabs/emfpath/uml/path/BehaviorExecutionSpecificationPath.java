package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.BehaviorExecutionSpecification BehaviorExecutionSpecification} in a functional way.
 * <p>
 * A behavior execution specification is a kind of execution specification representing
 * the execution of a behavior. 
 * @see org.eclipse.uml2.uml.BehaviorExecutionSpecification
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
	 * Behavior whose execution is occurring. 
	 * @see org.eclipse.uml2.uml.BehaviorExecutionSpecification#getBehavior()
	 * @generated
	 */
	public static final Function<BehaviorExecutionSpecification, Behavior> behavior = new Function<BehaviorExecutionSpecification, Behavior>() {
    public Behavior apply(BehaviorExecutionSpecification s) {
      return s.getBehavior();
    }
  };
	
	

}
