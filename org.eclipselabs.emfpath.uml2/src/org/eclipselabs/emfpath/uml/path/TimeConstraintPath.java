package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.TimeConstraint;

/**
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
	 * @see org.eclipse.uml2.uml.TimeConstraint#isFirstEvent()
	 * @generated
	 */
	public static final Predicate<TimeConstraint> isFirstEvent = new Predicate<TimeConstraint>() {
		public boolean apply(TimeConstraint s) {
			return s.isFirstEvent();
		}
	};
	
	

}
