package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Interval#getMin()
	 * @generated
	 */
	public static final Function<Interval, ValueSpecification> min = new Function<Interval, ValueSpecification>() {
		public ValueSpecification apply(Interval s) {
			return s.getMin();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interval#getMax()
	 * @generated
	 */
	public static final Function<Interval, ValueSpecification> max = new Function<Interval, ValueSpecification>() {
		public ValueSpecification apply(Interval s) {
			return s.getMax();
		}
	};
	
	

}
