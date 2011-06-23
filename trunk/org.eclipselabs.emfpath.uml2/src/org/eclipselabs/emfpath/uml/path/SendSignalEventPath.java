package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.Signal;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SendSignalEvent SendSignalEvent} in a functional way.
 * <p>
 * A send signal event models the sending of a signal. 
 * @see org.eclipse.uml2.uml.SendSignalEvent
 * @generated
 */
public class SendSignalEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private SendSignalEventPath() {
		super();
	}

	/**
	 * The signal associated with this event. 
	 * @see org.eclipse.uml2.uml.SendSignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<SendSignalEvent, Signal> signal = new Function<SendSignalEvent, Signal>() {
		public Signal apply(SendSignalEvent s) {
			return s.getSignal();
		}
	};
	
	

}
