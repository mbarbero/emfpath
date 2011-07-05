package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Interval Interval} in a functional way.
 * <p>
 * An interval defines the range between two value specifications. 
 * @see org.eclipse.uml2.uml.Interval
 * @generated
 */
public class IntervalPath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	 IntervalPath() {
    super();
  }

	/**
	 * Refers to the ValueSpecification denoting the minimum value of the range. 
	 * @see org.eclipse.uml2.uml.Interval#getMin()
	 * @generated
	 */
	public static final Function<Interval, ValueSpecification> min = new Function<Interval, ValueSpecification>() {
    public ValueSpecification apply(Interval s) {
      return s.getMin();
    }
  };

	/**
	 * Refers to the ValueSpecification denoting the maximum value of the range. 
	 * @see org.eclipse.uml2.uml.Interval#getMax()
	 * @generated
	 */
	public static final Function<Interval, ValueSpecification> max = new Function<Interval, ValueSpecification>() {
    public ValueSpecification apply(Interval s) {
      return s.getMax();
    }
  };
	
	

}
