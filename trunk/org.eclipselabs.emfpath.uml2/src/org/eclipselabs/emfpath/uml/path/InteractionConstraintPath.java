package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InteractionConstraint InteractionConstraint} in a functional way.
 * <p>
 * An interaction constraint is a Boolean expression that guards an operand in a combined
 * fragment. 
 * @see org.eclipse.uml2.uml.InteractionConstraint
 * @generated
 */
public class InteractionConstraintPath extends ConstraintPath {

	/**
	 * @generated
	 */
	private InteractionConstraintPath() {
		super();
	}

	/**
	 * The minimum number of iterations of a loop 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#getMinint()
	 * @generated
	 */
	public static final Function<InteractionConstraint, ValueSpecification> minint = new Function<InteractionConstraint, ValueSpecification>() {
		public ValueSpecification apply(InteractionConstraint s) {
			return s.getMinint();
		}
	};

	/**
	 * The maximum number of iterations of a loop 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#getMaxint()
	 * @generated
	 */
	public static final Function<InteractionConstraint, ValueSpecification> maxint = new Function<InteractionConstraint, ValueSpecification>() {
		public ValueSpecification apply(InteractionConstraint s) {
			return s.getMaxint();
		}
	};
	
	/**
	 * The dynamic variables that take part in the constraint must be owned by the ConnectableElement
	 * corresponding to the covered Lifeline.
	true 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateDynamicVariables(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateDynamicVariables(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateDynamicVariables(diagnostics, context);
			}
		};
	}

	/**
	 * The constraint may contain references to global data or write-once data.
	true 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateGlobalData(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateGlobalData(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateGlobalData(diagnostics, context);
			}
		};
	}

	/**
	 * Minint/maxint can only be present if the InteractionConstraint is associated with
	 * the operand of a loop CombinedFragment.
	true 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMinintMaxint(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateMinintMaxint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateMinintMaxint(diagnostics, context);
			}
		};
	}

	/**
	 * If minint is specified, then the expression must evaluate to a non-negative integer.
	true
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMinintNonNegative(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateMinintNonNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateMinintNonNegative(diagnostics, context);
			}
		};
	}

	/**
	 * If maxint is specified, then the expression must evaluate to a positive integer.
	true
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMaxintPositive(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateMaxintPositive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateMaxintPositive(diagnostics, context);
			}
		};
	}

	/**
	 * If maxint is specified, then minint must be specified and the evaluation of maxint
	 * must be >= the evaluation of minint
	true 
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMaxintGreaterEqualMinint(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InteractionConstraint> validateMaxintGreaterEqualMinint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionConstraint>() {
			public boolean apply(InteractionConstraint s) {
				return s.validateMaxintGreaterEqualMinint(diagnostics, context);
			}
		};
	}

}
