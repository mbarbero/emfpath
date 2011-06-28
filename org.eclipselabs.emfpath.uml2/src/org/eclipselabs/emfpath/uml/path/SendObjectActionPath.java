package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.SendObjectAction;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SendObjectAction SendObjectAction} in a functional way.
 * <p>
 * A send object action is an action that transmits an object to the target object, where
 * it may invoke behavior such as the firing of state machine transitions or the execution
 * of an activity. The value of the object is available to the execution of invoked behaviors.
 * The requestor continues execution immediately. Any reply message is ignored and is
 * not transmitted to the requestor. 
 * @see org.eclipse.uml2.uml.SendObjectAction
 * @generated
 */
public class SendObjectActionPath extends InvocationActionPath {

	/**
	 * @generated
	 */
	private SendObjectActionPath() {
    super();
  }

	/**
	 * The target object to which the object is sent. 
	 * @see org.eclipse.uml2.uml.SendObjectAction#getTarget()
	 * @generated
	 */
	public static final Function<SendObjectAction, InputPin> target = new Function<SendObjectAction, InputPin>() {
    public InputPin apply(SendObjectAction s) {
      return s.getTarget();
    }
  };

	/**
	 * The request object, which is transmitted to the target object. The object may be copied
	 * in transmission, so identity might not be preserved. 
	 * @see org.eclipse.uml2.uml.SendObjectAction#getRequest()
	 * @generated
	 */
	public static final Function<SendObjectAction, InputPin> request = new Function<SendObjectAction, InputPin>() {
    public InputPin apply(SendObjectAction s) {
      return s.getRequest();
    }
  };
	
	

}
