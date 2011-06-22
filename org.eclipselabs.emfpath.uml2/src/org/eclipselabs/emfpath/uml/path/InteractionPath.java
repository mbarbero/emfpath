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
	 * @see org.eclipse.uml2.uml.InteractionFragment#getCovereds()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<Lifeline>> covered = InteractionFragmentPath.covered;

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<GeneralOrdering>> generalOrdering = InteractionFragmentPath.generalOrdering;

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction()
	 * @generated
	 */
	public static final Function<InteractionFragment, Interaction> enclosingInteraction = InteractionFragmentPath.enclosingInteraction;

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand()
	 * @generated
	 */
	public static final Function<InteractionFragment, InteractionOperand> enclosingOperand = InteractionFragmentPath.enclosingOperand;

	/**
	 * @see org.eclipse.uml2.uml.Interaction#getLifelines()
	 * @generated
	 */
	public static final Function<Interaction, EList<Lifeline>> lifeline = new Function<Interaction, EList<Lifeline>>() {
		public EList<Lifeline> apply(Interaction s) {
			return s.getLifelines();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interaction#getFragments()
	 * @generated
	 */
	public static final Function<Interaction, EList<InteractionFragment>> fragment = new Function<Interaction, EList<InteractionFragment>>() {
		public EList<InteractionFragment> apply(Interaction s) {
			return s.getFragments();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interaction#getActions()
	 * @generated
	 */
	public static final Function<Interaction, EList<Action>> action = new Function<Interaction, EList<Action>>() {
		public EList<Action> apply(Interaction s) {
			return s.getActions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interaction#getFormalGates()
	 * @generated
	 */
	public static final Function<Interaction, EList<Gate>> formalGate = new Function<Interaction, EList<Gate>>() {
		public EList<Gate> apply(Interaction s) {
			return s.getFormalGates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interaction#getMessages()
	 * @generated
	 */
	public static final Function<Interaction, EList<Message>> message = new Function<Interaction, EList<Message>>() {
		public EList<Message> apply(Interaction s) {
			return s.getMessages();
		}
	};
	
	

}
