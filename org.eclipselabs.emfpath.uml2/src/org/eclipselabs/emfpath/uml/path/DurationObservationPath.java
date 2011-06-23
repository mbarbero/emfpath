package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DurationObservation DurationObservation} in a functional way.
 * <p>
 * A duration observation is a reference to a duration during an execution. It points
 * out the element(s) in the model to observe and whether the observations are when this
 * model element is entered or when it is exited. 
 * @see org.eclipse.uml2.uml.DurationObservation
 * @generated
 */
public class DurationObservationPath extends ObservationPath {

	/**
	 * @generated
	 */
	private DurationObservationPath() {
		super();
	}

	/**
	 * The observation is determined by the entering or exiting of the event element during
	 * execution. 
	 * @see org.eclipse.uml2.uml.DurationObservation#getEvents()
	 * @generated
	 */
	public static final Function<DurationObservation, EList<NamedElement>> event = new Function<DurationObservation, EList<NamedElement>>() {
		public EList<NamedElement> apply(DurationObservation s) {
			return s.getEvents();
		}
	};

	/**
	 * The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i]
	 * is true, then the corresponding observation event is the first time instant the execution
	 * enters event[i]. If firstEvent[i] is false, then the corresponding observation event
	 * is the time instant the execution exits event[i]. Default value is true applied when
	 * event[i] refers an element that represents only one time instant. 
	 * @see org.eclipse.uml2.uml.DurationObservation#getFirstEvents()
	 * @generated
	 */
	public static final Function<DurationObservation, EList<java.lang.Boolean>> firstEvent = new Function<DurationObservation, EList<java.lang.Boolean>>() {
		public EList<java.lang.Boolean> apply(DurationObservation s) {
			return s.getFirstEvents();
		}
	};
	
	/**
	 * The multiplicity of firstEvent must be 2 if the multiplicity of event is 2. Otherwise
	 * the multiplicity of firstEvent is 0.
	if (event->size() = 2)
	  then (firstEvent->size()
	 * = 2) else (firstEvent->size() = 0) 
	 * @see org.eclipse.uml2.uml.DurationObservation#validateFirstEventMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<DurationObservation> validateFirstEventMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DurationObservation>() {
			public boolean apply(DurationObservation s) {
				return s.validateFirstEventMultiplicity(diagnostics, context);
			}
		};
	}

}
