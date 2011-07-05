package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TimeConstraint TimeConstraint} in a functional way.
 * <p>
 * A time constraint is a constraint that refers to a time interval. 
 * @see org.eclipse.uml2.uml.TimeConstraint
 * @generated
 */
public class TimeConstraintPath extends IntervalConstraintPath {

	/**
	 * @generated
	 */
	private TimeConstraintPath() {
    super();
  }

	/**
	 * The value of firstEvent is related to constrainedElement. If firstEvent is true, then
	 * the corresponding observation event is the first time instant the execution enters
	 * constrainedElement. If firstEvent is false, then the corresponding observation event
	 * is the last time instant the execution is within constrainedElement. 
	 * @see org.eclipse.uml2.uml.TimeConstraint#isFirstEvent()
	 * @generated
	 */
	public static final ComposablePredicate<TimeConstraint> isFirstEvent = new ComposablePredicate<TimeConstraint>() {
    public boolean apply(TimeConstraint s) {
      return s.isFirstEvent();
    }
  };
	
	

}
