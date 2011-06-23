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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.AcceptEventAction AcceptEventAction} in a functional way.
 * <p>
 * A accept event action is an action that waits for the occurrence of an event meeting
 * specified conditions. 
 * @see org.eclipse.uml2.uml.AcceptEventAction
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
	 * Indicates whether there is a single output pin for the event, or multiple output pins
	 * for attributes of the event. 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#isUnmarshall()
	 * @generated
	 */
	public static final Predicate<AcceptEventAction> isUnmarshall = new Predicate<AcceptEventAction>() {
		public boolean apply(AcceptEventAction s) {
			return s.isUnmarshall();
		}
	};

	/**
	 * Pins holding the received event objects or their attributes. Event objects may be
	 * copied in transmission, so identity might not be preserved. 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#getResults()
	 * @generated
	 */
	public static final Function<AcceptEventAction, EList<OutputPin>> result = new Function<AcceptEventAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(AcceptEventAction s) {
			return s.getResults();
		}
	};

	/**
	 * The type of events accepted by the action, as specified by triggers. For triggers
	 * with signal events, a signal of the specified type or any subtype of the specified
	 * signal type is accepted. 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#getTriggers()
	 * @generated
	 */
	public static final Function<AcceptEventAction, EList<Trigger>> trigger = new Function<AcceptEventAction, EList<Trigger>>() {
		public EList<Trigger> apply(AcceptEventAction s) {
			return s.getTriggers();
		}
	};
	
	/**
	 * AcceptEventActions may have no input pins.
	true 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(DiagnosticChain, Map)
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
	 * There are no output pins if the trigger events are only ChangeEvents, or if they are
	 * only CallEvents when this action is an instance of AcceptEventAction and not an instance
	 * of a descendant of AcceptEventAction (such as AcceptCallAction).
	true 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(DiagnosticChain, Map)
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
	 * If the trigger events are all TimeEvents, there is exactly one output pin.
	true 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents(DiagnosticChain, Map)
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
	 * If isUnmarshall is true, there must be exactly one trigger for events of type SignalEvent.
	 * The number of result output pins must be the same as the number of attributes of the
	 * signal. The type and ordering of each result output pin must be the same as the corresponding
	 * attribute of the signal. The multiplicity of each result output pin must be compatible
	 * with the multiplicity of the corresponding attribute.
	true 
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(DiagnosticChain, Map)
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
