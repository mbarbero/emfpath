package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.PartDecomposition PartDecomposition} in a functional way.
 * <p>
 * A part decomposition is a description of the internal interactions of one lifeline
 * relative to an interaction. 
 * @see org.eclipse.uml2.uml.PartDecomposition
 * @generated
 */
public class PartDecompositionPath extends InteractionUsePath {

	/**
	 * @generated
	 */
	private PartDecompositionPath() {
    super();
  }

	
	
	/**
	 * PartDecompositions apply only to Parts that are Parts of Internal Structures not to
	 * Parts of Collaborations.
	true 
	 * @see org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<PartDecomposition> validatePartsOfInternalStructures(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<PartDecomposition>() {
      public boolean apply(PartDecomposition s) {
        return s.validatePartsOfInternalStructures(diagnostics, context);
      }
    };
  }

	/**
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Within
	 * X there is a sequence of constructs along L (such constructs are CombinedFragments,
	 * InteractionUse and (plain) OccurrenceSpecifications). Then a corresponding sequence
	 * of constructs must appear within D, matched one-to-one in the same order.
	
	i) CombinedFragment
	 * covering L are matched with an extra-global CombinedFragment in D
	ii) An InteractionUse
	 * covering L are matched with a global (i.e. covering all Lifelines) InteractionUse
	 * in D.
	iii) A plain OccurrenceSpecification on L is considered an actualGate that
	 * must be matched by a formalGate of D
	
	true 
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateAssume(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<PartDecomposition> validateAssume(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<PartDecomposition>() {
      public boolean apply(PartDecomposition s) {
        return s.validateAssume(diagnostics, context);
      }
    };
  }

	/**
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Assume
	 * also that there is within X an
	InteractionUse (say) U that covers L. According to
	 * the constraint above U will have a counterpart CU within D. Within the Interaction
	 * referenced by U, L should also be decomposed, and the decomposition should reference
	 * CU. (This rule is called commutativity of decomposition)
	
	true 
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<PartDecomposition> validateCommutativityOfDecomposition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<PartDecomposition>() {
      public boolean apply(PartDecomposition s) {
        return s.validateCommutativityOfDecomposition(diagnostics, context);
      }
    };
  }

}
