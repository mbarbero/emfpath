package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ChangeEvent ChangeEvent} in a functional way.
 * <p>
 * A change event models a change in the system configuration that makes a condition
 * true. 
 * @see org.eclipse.uml2.uml.ChangeEvent
 * @generated
 */
public class ChangeEventPath extends EventPath {

	/**
	 * @generated
	 */
	private ChangeEventPath() {
    super();
  }

	/**
	 * A Boolean-valued expression that will result in a change event whenever its value
	 * changes from false to true. 
	 * @see org.eclipse.uml2.uml.ChangeEvent#getChangeExpression()
	 * @generated
	 */
	public static final Function<ChangeEvent, ValueSpecification> changeExpression = new Function<ChangeEvent, ValueSpecification>() {
    public ValueSpecification apply(ChangeEvent s) {
      return s.getChangeExpression();
    }
  };
	
	

}
