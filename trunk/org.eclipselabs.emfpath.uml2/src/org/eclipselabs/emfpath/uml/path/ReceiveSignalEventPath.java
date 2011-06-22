package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ReceiveSignalEvent;
import org.eclipse.uml2.uml.Signal;

/**
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
	 * @see org.eclipse.uml2.uml.ReceiveSignalEvent#getSignal()
	 * @generated
	 */
	public static final Function<ReceiveSignalEvent, Signal> signal = new Function<ReceiveSignalEvent, Signal>() {
		public Signal apply(ReceiveSignalEvent s) {
			return s.getSignal();
		}
	};
	
	

}
