package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SignalEvent SignalEvent} in a functional way.
 * <p>
 * A signal event represents the receipt of an asynchronous signal instance. A signal
 * event may, for example, cause a state machine to trigger a transition. 
 * @see org.eclipse.uml2.uml.SignalEvent
 * @generated
 */
public class SignalEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private SignalEventPath() {
		super();
	}

	/**
	 * The specific signal that is associated with this event. 
	 * @see org.eclipse.uml2.uml.SignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<SignalEvent, Signal> signal = new Function<SignalEvent, Signal>() {
		public Signal apply(SignalEvent s) {
			return s.getSignal();
		}
	};
	
	

}
