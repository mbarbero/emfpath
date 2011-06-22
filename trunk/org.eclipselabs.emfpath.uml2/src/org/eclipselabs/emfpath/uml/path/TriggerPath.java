package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Trigger;

/**
 * @generated
 */
public class TriggerPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private TriggerPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Trigger#getEvent()
	 * @generated
	 */
	public static final Function<Trigger, Event> event = new Function<Trigger, Event>() {
		public Event apply(Trigger s) {
			return s.getEvent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Trigger#getPorts()
	 * @generated
	 */
	public static final Function<Trigger, EList<Port>> port = new Function<Trigger, EList<Port>>() {
		public EList<Port> apply(Trigger s) {
			return s.getPorts();
		}
	};
	
	

}
