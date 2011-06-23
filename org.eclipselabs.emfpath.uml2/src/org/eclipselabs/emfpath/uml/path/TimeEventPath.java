package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TimeEvent TimeEvent} in a functional way.
 * <p>
 * A time event specifies a point in time. At the specified time, the event occurs.
A
 * time event can be defined relative to entering the current state of the executing
 * state machine. 
 * @see org.eclipse.uml2.uml.TimeEvent
 * @generated
 */
public class TimeEventPath extends EventPath {

	/**
	 * @generated
	 */
	private TimeEventPath() {
		super();
	}

	/**
	 * Specifies whether it is relative or absolute time. 
	 * @see org.eclipse.uml2.uml.TimeEvent#isRelative()
	 * @generated
	 */
	public static final Predicate<TimeEvent> isRelative = new Predicate<TimeEvent>() {
		public boolean apply(TimeEvent s) {
			return s.isRelative();
		}
	};

	/**
	 * Specifies the corresponding time deadline. 
	 * @see org.eclipse.uml2.uml.TimeEvent#getWhen()
	 * @generated
	 */
	public static final Function<TimeEvent, TimeExpression> when = new Function<TimeEvent, TimeExpression>() {
		public TimeExpression apply(TimeEvent s) {
			return s.getWhen();
		}
	};
	
	/**
	 * The ValueSpecification when must return a non-negative Integer.
	true 
	 * @see org.eclipse.uml2.uml.TimeEvent#validateWhenNonNegative(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TimeEvent> validateWhenNonNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TimeEvent>() {
			public boolean apply(TimeEvent s) {
				return s.validateWhenNonNegative(diagnostics, context);
			}
		};
	}

	/**
	 * The starting time for a relative time event may only be omitted for a time event that
	 * is the trigger of a state machine.
	true 
	 * @see org.eclipse.uml2.uml.TimeEvent#validateStartingTime(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TimeEvent> validateStartingTime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TimeEvent>() {
			public boolean apply(TimeEvent s) {
				return s.validateStartingTime(diagnostics, context);
			}
		};
	}

}
