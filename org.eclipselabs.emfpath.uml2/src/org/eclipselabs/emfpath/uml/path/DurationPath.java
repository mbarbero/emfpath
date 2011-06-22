package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Duration#getExpr()
	 * @generated
	 */
	public static final Function<Duration, ValueSpecification> expr = new Function<Duration, ValueSpecification>() {
		public ValueSpecification apply(Duration s) {
			return s.getExpr();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Duration#getObservations()
	 * @generated
	 */
	public static final Function<Duration, EList<Observation>> observation = new Function<Duration, EList<Observation>>() {
		public EList<Observation> apply(Duration s) {
			return s.getObservations();
		}
	};
	
	

}
