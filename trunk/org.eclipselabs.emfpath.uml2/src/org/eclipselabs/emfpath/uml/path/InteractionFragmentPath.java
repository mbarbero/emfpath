package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;

/**
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
	 * @see org.eclipse.uml2.uml.InteractionFragment#getCovereds()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<Lifeline>> covered = new Function<InteractionFragment, EList<Lifeline>>() {
		public EList<Lifeline> apply(InteractionFragment s) {
			return s.getCovereds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getGeneralOrderings()
	 * @generated
	 */
	public static final Function<InteractionFragment, EList<GeneralOrdering>> generalOrdering = new Function<InteractionFragment, EList<GeneralOrdering>>() {
		public EList<GeneralOrdering> apply(InteractionFragment s) {
			return s.getGeneralOrderings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction()
	 * @generated
	 */
	public static final Function<InteractionFragment, Interaction> enclosingInteraction = new Function<InteractionFragment, Interaction>() {
		public Interaction apply(InteractionFragment s) {
			return s.getEnclosingInteraction();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingOperand()
	 * @generated
	 */
	public static final Function<InteractionFragment, InteractionOperand> enclosingOperand = new Function<InteractionFragment, InteractionOperand>() {
		public InteractionOperand apply(InteractionFragment s) {
			return s.getEnclosingOperand();
		}
	};
	
	

}
