package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Duration Duration} in a functional way.
 * <p>
 * Duration defines a value specification that specifies the temporal distance between
 * two time instants. 
 * @see org.eclipse.uml2.uml.Duration
 * @generated
 */
public class DurationPath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	private DurationPath() {
    super();
  }

	/**
	 * The value of the Duration. 
	 * @see org.eclipse.uml2.uml.Duration#getExpr()
	 * @generated
	 */
	public static final Function<Duration, ValueSpecification> expr = new Function<Duration, ValueSpecification>() {
    public ValueSpecification apply(Duration s) {
      return s.getExpr();
    }
  };

	/**
	 * Refers to the time and duration observations that are involved in expr. 
	 * @see org.eclipse.uml2.uml.Duration#getObservations()
	 * @generated
	 */
	public static final Function<Duration, EList<Observation>> observation = new Function<Duration, EList<Observation>>() {
    public EList<Observation> apply(Duration s) {
      return s.getObservations();
    }
  };
	
	

}
