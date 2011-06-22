package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.StateInvariant;

/**
 * @generated
 */
public class StateInvariantPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	private StateInvariantPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.StateInvariant#getInvariant()
	 * @generated
	 */
	public static final Function<StateInvariant, Constraint> invariant = new Function<StateInvariant, Constraint>() {
		public Constraint apply(StateInvariant s) {
			return s.getInvariant();
		}
	};
	
	

}
