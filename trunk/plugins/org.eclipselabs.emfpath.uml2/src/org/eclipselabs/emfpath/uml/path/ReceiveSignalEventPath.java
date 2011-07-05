package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.ReceiveSignalEvent;
import org.eclipse.uml2.uml.Signal;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReceiveSignalEvent ReceiveSignalEvent} in a functional way.
 * <p>
 * A receive signal event specifies the event of receiving a signal by the target entity.
 * @see org.eclipse.uml2.uml.ReceiveSignalEvent
 * @generated
 */
public class ReceiveSignalEventPath extends MessageEventPath {

	/**
	 * @generated
	 */
	private ReceiveSignalEventPath() {
    super();
  }

	/**
	 * The signal associated with this event. 
	 * @see org.eclipse.uml2.uml.ReceiveSignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<ReceiveSignalEvent, Signal> signal = new Function<ReceiveSignalEvent, Signal>() {
    public Signal apply(ReceiveSignalEvent s) {
      return s.getSignal();
    }
  };
	
	

}
