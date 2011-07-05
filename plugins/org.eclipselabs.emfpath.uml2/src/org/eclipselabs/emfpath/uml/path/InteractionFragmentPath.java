package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InteractionFragment InteractionFragment} in a functional way.
 * <p>
 * InteractionFragment is an abstract notion of the most general interaction unit. An
 * interaction fragment is a piece of an interaction. Each interaction fragment is conceptually
 * like an interaction by itself. 
 * @see org.eclipse.uml2.uml.InteractionFragment
 * @generated
 */
public class InteractionFragmentPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 InteractionFragmentPath() {
    super();
  }

	/**
	 * References the Lifelines that the InteractionFragment involves. 
	 * @see org.eclipse.uml2.uml.InteractionFragment#getCovereds()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<Lifeline>> covered = new Function<InteractionFragment, EList<Lifeline>>() {
    public EList<Lifeline> apply(InteractionFragment s) {
      return s.getCovereds();
    }
  };

	/**
	 * The general ordering relationships contained in this fragment. 
	 * @see org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<GeneralOrdering>> generalOrdering = new Function<InteractionFragment, EList<GeneralOrdering>>() {
    public EList<GeneralOrdering> apply(InteractionFragment s) {
      return s.getGeneralOrderings();
    }
  };

	/**
	 * The Interaction enclosing this InteractionFragment. 
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction()
	 * @generated
	 */
	public static final Function<InteractionFragment, Interaction> enclosingInteraction = new Function<InteractionFragment, Interaction>() {
    public Interaction apply(InteractionFragment s) {
      return s.getEnclosingInteraction();
    }
  };

	/**
	 * The operand enclosing this InteractionFragment (they may nest recursively) 
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand()
	 * @generated
	 */
	public static final Function<InteractionFragment, InteractionOperand> enclosingOperand = new Function<InteractionFragment, InteractionOperand>() {
    public InteractionOperand apply(InteractionFragment s) {
      return s.getEnclosingOperand();
    }
  };
	
	

}
