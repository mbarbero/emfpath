package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TimeExpression TimeExpression} in a functional way.
 * <p>
 * A time expression defines a value specification that represents a time value. 
 * @see org.eclipse.uml2.uml.TimeExpression
 * @generated
 */
public class TimeExpressionPath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	private TimeExpressionPath() {
    super();
  }

	/**
	 * The value of the time expression. 
	 * @see org.eclipse.uml2.uml.TimeExpression#getExpr()
	 * @generated
	 */
	public static final Function<TimeExpression, ValueSpecification> expr = new Function<TimeExpression, ValueSpecification>() {
    public ValueSpecification apply(TimeExpression s) {
      return s.getExpr();
    }
  };

	/**
	 * Refers to the time and duration observations that are involved in expr. 
	 * @see org.eclipse.uml2.uml.TimeExpression#getObservations()
	 * @generated
	 */
	public static final Function<TimeExpression, EList<Observation>> observation = new Function<TimeExpression, EList<Observation>>() {
    public EList<Observation> apply(TimeExpression s) {
      return s.getObservations();
    }
  };
	
	

}
