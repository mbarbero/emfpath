package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Trigger;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Trigger Trigger} in a functional way.
 * <p>
 * A trigger relates an event to a behavior that may affect an instance of the classifier.
A
 * trigger specification may be qualified by the port on which the event occurred. 
 * @see org.eclipse.uml2.uml.Trigger
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
	 * The event that causes the trigger. 
	 * @see org.eclipse.uml2.uml.Trigger#getEvent()
	 * @generated
	 */
	public static final Function<Trigger, Event> event = new Function<Trigger, Event>() {
    public Event apply(Trigger s) {
      return s.getEvent();
    }
  };

	/**
	 * A optional port of the receiver object on which the behavioral feature is invoked.
	 * @see org.eclipse.uml2.uml.Trigger#getPorts()
	 * @generated
	 */
	public static final Function<Trigger, EList<Port>> port = new Function<Trigger, EList<Port>>() {
    public EList<Port> apply(Trigger s) {
      return s.getPorts();
    }
  };
	
	

}
