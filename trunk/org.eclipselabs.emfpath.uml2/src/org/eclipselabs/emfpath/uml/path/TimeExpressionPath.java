package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.TimeExpression#getExpr()
	 * @generated
	 */
	public static final Function<TimeExpression, ValueSpecification> expr = new Function<TimeExpression, ValueSpecification>() {
		public ValueSpecification apply(TimeExpression s) {
			return s.getExpr();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TimeExpression#getObservations()
	 * @generated
	 */
	public static final Function<TimeExpression, EList<Observation>> observation = new Function<TimeExpression, EList<Observation>>() {
		public EList<Observation> apply(TimeExpression s) {
			return s.getObservations();
		}
	};
	
	

}
