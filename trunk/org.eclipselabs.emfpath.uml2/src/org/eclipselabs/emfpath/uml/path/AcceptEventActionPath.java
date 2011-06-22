package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Trigger;

/**
 * @generated
 */
public class AcceptEventActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 AcceptEventActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#isUnmarshall()
	 * @generated
	 */
	public static final Predicate<AcceptEventAction> isUnmarshall = new Predicate<AcceptEventAction>() {
		public boolean apply(AcceptEventAction s) {
			return s.isUnmarshall();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#getResults()
	 * @generated
	 */
	public static final Function<AcceptEventAction, EList<OutputPin>> result = new Function<AcceptEventAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(AcceptEventAction s) {
			return s.getResults();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#getTriggers()
	 * @generated
	 */
	public static final Function<AcceptEventAction, EList<Trigger>> trigger = new Function<AcceptEventAction, EList<Trigger>>() {
		public EList<Trigger> apply(AcceptEventAction s) {
			return s.getTriggers();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins()
	 * @generated
	 */
	public static Predicate<AcceptEventAction> validateNoInputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptEventAction>() {
			public boolean apply(AcceptEventAction s) {
				return s.validateNoInputPins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins()
	 * @generated
	 */
	public static Predicate<AcceptEventAction> validateNoOutputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptEventAction>() {
			public boolean apply(AcceptEventAction s) {
				return s.validateNoOutputPins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents()
	 * @generated
	 */
	public static Predicate<AcceptEventAction> validateTriggerEvents(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptEventAction>() {
			public boolean apply(AcceptEventAction s) {
				return s.validateTriggerEvents(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents()
	 * @generated
	 */
	public static Predicate<AcceptEventAction> validateUnmarshallSignalEvents(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AcceptEventAction>() {
			public boolean apply(AcceptEventAction s) {
				return s.validateUnmarshallSignalEvents(diagnostics, context);
			}
		};
	}

}
