package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;

/**
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
	 * @see org.eclipse.uml2.uml.TimeEvent#isRelative()
	 * @generated
	 */
	public static final Predicate<TimeEvent> isRelative = new Predicate<TimeEvent>() {
		public boolean apply(TimeEvent s) {
			return s.isRelative();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TimeEvent#getWhen()
	 * @generated
	 */
	public static final Function<TimeEvent, TimeExpression> when = new Function<TimeEvent, TimeExpression>() {
		public TimeExpression apply(TimeEvent s) {
			return s.getWhen();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TimeEvent#validateWhenNonNegative()
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
	 * @see org.eclipse.uml2.uml.TimeEvent#validateStartingTime()
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
