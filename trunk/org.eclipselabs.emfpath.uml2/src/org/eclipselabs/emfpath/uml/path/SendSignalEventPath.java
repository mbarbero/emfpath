package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.SendSignalEvent;
import org.eclipse.uml2.uml.Signal;

/**
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
	 * @see org.eclipse.uml2.uml.SendSignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<SendSignalEvent, Signal> signal = new Function<SendSignalEvent, Signal>() {
		public Signal apply(SendSignalEvent s) {
			return s.getSignal();
		}
	};
	
	

}
