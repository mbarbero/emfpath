package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;

/**
 * @generated
 */
public class InteractionOperandPath extends NamespacePath {

	/**
	 * @generated
	 */
	private InteractionOperandPath() {
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
	 * @see org.eclipse.uml2.uml.InteractionOperand#getGuard()
	 * @generated
	 */
	public static final Function<InteractionOperand, InteractionConstraint> guard = new Function<InteractionOperand, InteractionConstraint>() {
		public InteractionConstraint apply(InteractionOperand s) {
			return s.getGuard();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionOperand#getFragments()
	 * @generated
	 */
	public static final Function<InteractionOperand, EList<InteractionFragment>> fragment = new Function<InteractionOperand, EList<InteractionFragment>>() {
		public EList<InteractionFragment> apply(InteractionOperand s) {
			return s.getFragments();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InteractionOperand#validateGuardDirectlyPrior()
	 * @generated
	 */
	public static Predicate<InteractionOperand> validateGuardDirectlyPrior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionOperand>() {
			public boolean apply(InteractionOperand s) {
				return s.validateGuardDirectlyPrior(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InteractionOperand#validateGuardContainReferences()
	 * @generated
	 */
	public static Predicate<InteractionOperand> validateGuardContainReferences(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionOperand>() {
			public boolean apply(InteractionOperand s) {
				return s.validateGuardContainReferences(diagnostics, context);
			}
		};
	}

}
