package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#getMinint()
	 * @generated
	 */
	public static final Function<InteractionConstraint, ValueSpecification> minint = new Function<InteractionConstraint, ValueSpecification>() {
		public ValueSpecification apply(InteractionConstraint s) {
			return s.getMinint();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionConstraint#getMaxint()
	 * @generated
	 */
	public static final Function<InteractionConstraint, ValueSpecification> maxint = new Function<InteractionConstraint, ValueSpecification>() {
		public ValueSpecification apply(InteractionConstraint s) {
			return s.getMaxint();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateDynamicVariables()
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateGlobalData()
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMinintMaxint()
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMinintNonNegative()
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMaxintPositive()
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
	 * @see org.eclipse.uml2.uml.InteractionConstraint#validateMaxintGreaterEqualMinint()
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
