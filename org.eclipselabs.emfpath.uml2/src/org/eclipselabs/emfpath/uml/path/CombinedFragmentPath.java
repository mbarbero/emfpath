package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CombinedFragment CombinedFragment} in a functional way.
 * <p>
 * A combined fragment defines an expression of interaction fragments. A combined fragment
 * is defined by an interaction operator and corresponding interaction operands. Through
 * the use of combined fragments the user will be able to describe a number of traces
 * in a compact and concise manner. 
 * @see org.eclipse.uml2.uml.CombinedFragment
 * @generated
 */
public class CombinedFragmentPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 CombinedFragmentPath() {
    super();
  }

	/**
	 * Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 * @see org.eclipse.uml2.uml.CombinedFragment#getInteractionOperator()
	 * @generated
	 */
	public static final Function<CombinedFragment, InteractionOperatorKind> interactionOperator = new Function<CombinedFragment, InteractionOperatorKind>() {
    public InteractionOperatorKind apply(CombinedFragment s) {
      return s.getInteractionOperator();
    }
  };

	/**
	 * The set of operands of the combined fragment. 
	 * @see org.eclipse.uml2.uml.CombinedFragment#getOperands()
	 * @generated
	 */
	public static final Function<CombinedFragment, EList<InteractionOperand>> operand = new Function<CombinedFragment, EList<InteractionOperand>>() {
    public EList<InteractionOperand> apply(CombinedFragment s) {
      return s.getOperands();
    }
  };

	/**
	 * Specifies the gates that form the interface between this CombinedFragment and its
	 * surroundings 
	 * @see org.eclipse.uml2.uml.CombinedFragment#getCfragmentGates()
	 * @generated
	 */
	public static final Function<CombinedFragment, EList<Gate>> cfragmentGate = new Function<CombinedFragment, EList<Gate>>() {
    public EList<Gate> apply(CombinedFragment s) {
      return s.getCfragmentGates();
    }
  };
	
	/**
	 * If the interactionOperator is opt, loop, break, or neg there must be exactly one operand
	true
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateOptLoopBreakNeg(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CombinedFragment> validateOptLoopBreakNeg(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CombinedFragment>() {
      public boolean apply(CombinedFragment s) {
        return s.validateOptLoopBreakNeg(diagnostics, context);
      }
    };
  }

	/**
	 * The InteractionConstraint with minint and maxint only apply when attached to an InteractionOperand
	 * where the interactionOperator is loop.
	true 
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateMinintAndMaxint(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CombinedFragment> validateMinintAndMaxint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CombinedFragment>() {
      public boolean apply(CombinedFragment s) {
        return s.validateMinintAndMaxint(diagnostics, context);
      }
    };
  }

	/**
	 * If the interactionOperator is break, the corresponding InteractionOperand must cover
	 * all Lifelines within the enclosing InteractionFragment.
	true 
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateBreak(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CombinedFragment> validateBreak(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CombinedFragment>() {
      public boolean apply(CombinedFragment s) {
        return s.validateBreak(diagnostics, context);
      }
    };
  }

	/**
	 * The interaction operators 'consider' and 'ignore' can only be used for the CombineIgnoreFragment
	 * subtype of CombinedFragment
	((interactionOperator = #consider) or (interactionOperator
	 * = #ignore)) implies oclsisTypeOf(CombineIgnoreFragment) 
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateConsiderAndIgnore(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<CombinedFragment> validateConsiderAndIgnore(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<CombinedFragment>() {
      public boolean apply(CombinedFragment s) {
        return s.validateConsiderAndIgnore(diagnostics, context);
      }
    };
  }

}
