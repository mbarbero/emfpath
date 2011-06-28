package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InteractionOperand InteractionOperand} in a functional way.
 * <p>
 * An interaction operand is contained in a combined fragment. An interaction operand
 * represents one operand of the expression given by the enclosing combined fragment.
 * @see org.eclipse.uml2.uml.InteractionOperand
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
	 * Constraint of the operand. 
	 * @see org.eclipse.uml2.uml.InteractionOperand#getGuard()
	 * @generated
	 */
	public static final Function<InteractionOperand, InteractionConstraint> guard = new Function<InteractionOperand, InteractionConstraint>() {
    public InteractionConstraint apply(InteractionOperand s) {
      return s.getGuard();
    }
  };

	/**
	 * The fragments of the operand. 
	 * @see org.eclipse.uml2.uml.InteractionOperand#getFragments()
	 * @generated
	 */
	public static final Function<InteractionOperand, EList<InteractionFragment>> fragment = new Function<InteractionOperand, EList<InteractionFragment>>() {
    public EList<InteractionFragment> apply(InteractionOperand s) {
      return s.getFragments();
    }
  };
	
	/**
	 * The guard must be placed directly prior to (above) the OccurrenceSpecification that
	 * will become the first OccurrenceSpecification within this InteractionOperand.
	true
	 * @see org.eclipse.uml2.uml.InteractionOperand#validateGuardDirectlyPrior(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InteractionOperand> validateGuardDirectlyPrior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InteractionOperand>() {
      public boolean apply(InteractionOperand s) {
        return s.validateGuardDirectlyPrior(diagnostics, context);
      }
    };
  }

	/**
	 * The guard must contain only references to values local to the Lifeline on which it
	 * resides, or values global to the whole Interaction.
	true 
	 * @see org.eclipse.uml2.uml.InteractionOperand#validateGuardContainReferences(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InteractionOperand> validateGuardContainReferences(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InteractionOperand>() {
      public boolean apply(InteractionOperand s) {
        return s.validateGuardContainReferences(diagnostics, context);
      }
    };
  }

}
