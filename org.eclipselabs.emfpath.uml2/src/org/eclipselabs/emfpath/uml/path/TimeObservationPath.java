package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.TimeObservation;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TimeObservation TimeObservation} in a functional way.
 * <p>
 * A time observation is a reference to a time instant during an execution. It points
 * out the element in the model to observe and whether the observation is when this model
 * element is entered or when it is exited. 
 * @see org.eclipse.uml2.uml.TimeObservation
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
	 * The observation is determined by the entering or exiting of the event element during
	 * execution. 
	 * @see org.eclipse.uml2.uml.TimeObservation#getEvent()
	 * @generated
	 */
	public static final Function<TimeObservation, NamedElement> event = new Function<TimeObservation, NamedElement>() {
		public NamedElement apply(TimeObservation s) {
			return s.getEvent();
		}
	};

	/**
	 * The value of firstEvent is related to event. If firstEvent is true, then the corresponding
	 * observation event is the first time instant the execution enters event. If firstEvent
	 * is false, then the corresponding observation event is the time instant the execution
	 * exits event. 
	 * @see org.eclipse.uml2.uml.TimeObservation#isFirstEvent()
	 * @generated
	 */
	public static final Predicate<TimeObservation> isFirstEvent = new Predicate<TimeObservation>() {
		public boolean apply(TimeObservation s) {
			return s.isFirstEvent();
		}
	};
	
	

}
