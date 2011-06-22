package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.TimeObservation;

/**
 * @generated
 */
public class TimeObservationPath extends ObservationPath {

	/**
	 * @generated
	 */
	private TimeObservationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TimeObservation#getEvent()
	 * @generated
	 */
	public static final Function<TimeObservation, NamedElement> event = new Function<TimeObservation, NamedElement>() {
		public NamedElement apply(TimeObservation s) {
			return s.getEvent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TimeObservation#isFirstEvent()
	 * @generated
	 */
	public static final Predicate<TimeObservation> isFirstEvent = new Predicate<TimeObservation>() {
		public boolean apply(TimeObservation s) {
			return s.isFirstEvent();
		}
	};
	
	

}
