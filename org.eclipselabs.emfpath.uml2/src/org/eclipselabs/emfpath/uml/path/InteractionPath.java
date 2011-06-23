package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Interaction Interaction} in a functional way.
 * <p>
 * An interaction is a unit of behavior that focuses on the observable exchange of information
 * between connectable elements. 
 * @see org.eclipse.uml2.uml.Interaction
 * @generated
 */
public class InteractionPath extends BehaviorPath {

	/**
	 * @generated
	 */
	private InteractionPath() {
		super();
	}

	/**
	 * References the Lifelines that the InteractionFragment involves. 
	 *
	 * @see InteractionFragmentPath#covered()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getCovereds()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<Lifeline>> covered = InteractionFragmentPath.covered;

	/**
	 * The general ordering relationships contained in this fragment. 
	 *
	 * @see InteractionFragmentPath#generalOrdering()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<GeneralOrdering>> generalOrdering = InteractionFragmentPath.generalOrdering;

	/**
	 * The Interaction enclosing this InteractionFragment. 
	 *
	 * @see InteractionFragmentPath#enclosingInteraction()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction()
	 * @generated
	 */
	public static final Function<InteractionFragment, Interaction> enclosingInteraction = InteractionFragmentPath.enclosingInteraction;

	/**
	 * The operand enclosing this InteractionFragment (they may nest recursively) 
	 *
	 * @see InteractionFragmentPath#enclosingOperand()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand()
	 * @generated
	 */
	public static final Function<InteractionFragment, InteractionOperand> enclosingOperand = InteractionFragmentPath.enclosingOperand;

	/**
	 * Specifies the participants in this Interaction. 
	 * @see org.eclipse.uml2.uml.Interaction#getLifelines()
	 * @generated
	 */
	public static final Function<Interaction, EList<Lifeline>> lifeline = new Function<Interaction, EList<Lifeline>>() {
		public EList<Lifeline> apply(Interaction s) {
			return s.getLifelines();
		}
	};

	/**
	 * The ordered set of fragments in the Interaction. 
	 * @see org.eclipse.uml2.uml.Interaction#getFragments()
	 * @generated
	 */
	public static final Function<Interaction, EList<InteractionFragment>> fragment = new Function<Interaction, EList<InteractionFragment>>() {
		public EList<InteractionFragment> apply(Interaction s) {
			return s.getFragments();
		}
	};

	/**
	 * Actions owned by the Interaction. 
	 * @see org.eclipse.uml2.uml.Interaction#getActions()
	 * @generated
	 */
	public static final Function<Interaction, EList<Action>> action = new Function<Interaction, EList<Action>>() {
		public EList<Action> apply(Interaction s) {
			return s.getActions();
		}
	};

	/**
	 * Specifies the gates that form the message interface between this Interaction and any
	 * InteractionUses which reference it.
	 
	 * @see org.eclipse.uml2.uml.Interaction#getFormalGates()
	 * @generated
	 */
	public static final Function<Interaction, EList<Gate>> formalGate = new Function<Interaction, EList<Gate>>() {
		public EList<Gate> apply(Interaction s) {
			return s.getFormalGates();
		}
	};

	/**
	 * The Messages contained in this Interaction. 
	 * @see org.eclipse.uml2.uml.Interaction#getMessages()
	 * @generated
	 */
	public static final Function<Interaction, EList<Message>> message = new Function<Interaction, EList<Message>>() {
		public EList<Message> apply(Interaction s) {
			return s.getMessages();
		}
	};
	
	

}
