package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;

/**
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
	 * @see org.eclipse.uml2.uml.SignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<SignalEvent, Signal> signal = new Function<SignalEvent, Signal>() {
		public Signal apply(SignalEvent s) {
			return s.getSignal();
		}
	};
	
	

}
