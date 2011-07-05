package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.StateInvariant;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StateInvariant StateInvariant} in a functional way.
 * <p>
 * A state invariant is a runtime constraint on the participants of the interaction.
 * It may be used to specify a variety of different kinds of constraints, such as values
 * of attributes or variables, internal or external states, and so on. A state invariant
 * is an interaction fragment and it is placed on a lifeline. 
 * @see org.eclipse.uml2.uml.StateInvariant
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
	 * A Constraint that should hold at runtime for this StateInvariant 
	 * @see org.eclipse.uml2.uml.StateInvariant#getInvariant()
	 * @generated
	 */
	public static final Function<StateInvariant, Constraint> invariant = new Function<StateInvariant, Constraint>() {
    public Constraint apply(StateInvariant s) {
      return s.getInvariant();
    }
  };
	
	

}
