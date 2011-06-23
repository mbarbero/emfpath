package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RaiseExceptionAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.RaiseExceptionAction RaiseExceptionAction} in a functional way.
 * <p>
 * A raise exception action is an action that causes an exception to occur. The input
 * value becomes the exception object. 
 * @see org.eclipse.uml2.uml.RaiseExceptionAction
 * @generated
 */
public class RaiseExceptionActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private RaiseExceptionActionPath() {
		super();
	}

	/**
	 * An input pin whose value becomes an exception object. 
	 * @see org.eclipse.uml2.uml.RaiseExceptionAction#getException()
	 * @generated
	 */
	public static final Function<RaiseExceptionAction, InputPin> exception = new Function<RaiseExceptionAction, InputPin>() {
		public InputPin apply(RaiseExceptionAction s) {
			return s.getException();
		}
	};
	
	

}
