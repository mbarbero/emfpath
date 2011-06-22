package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Variable;

/**
 * @generated
 */
public class VariablePath extends ConnectableElementPath {

	/**
	 * @generated
	 */
	private VariablePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isOrdered()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isOrdered = MultiplicityElementPath.isOrdered;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isUnique()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isUnique = MultiplicityElementPath.isUnique;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = MultiplicityElementPath.upper;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = MultiplicityElementPath.lower;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpperValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = MultiplicityElementPath.upperValue;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLowerValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = MultiplicityElementPath.lowerValue;

	/**
	 * @see org.eclipse.uml2.uml.Variable#getScope()
	 * @generated
	 */
	public static final Function<Variable, StructuredActivityNode> scope = new Function<Variable, StructuredActivityNode>() {
		public StructuredActivityNode apply(Variable s) {
			return s.getScope();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Variable#getActivityScope()
	 * @generated
	 */
	public static final Function<Variable, Activity> activityScope = new Function<Variable, Activity>() {
		public Activity apply(Variable s) {
			return s.getActivityScope();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateLowerGe0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateLowerGe0(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateUpperGeLower(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateUpperGeLower(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateValueSpecificationNoSideEffects(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationConstant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateValueSpecificationConstant(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isMultivalued = MultiplicityElementPath.isMultivalued;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesCardinality()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesCardinality(final int C) {
		return MultiplicityElementPath.includesCardinality(C);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesMultiplicity(final MultiplicityElement M) {
		return MultiplicityElementPath.includesMultiplicity(M);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = MultiplicityElementPath.lowerBound;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = MultiplicityElementPath.upperBound_;

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> compatibleWith(final MultiplicityElement other) {
		return MultiplicityElementPath.compatibleWith(other);
	}

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is()
	 * @generated
	 */
	public static Predicate<MultiplicityElement> is(final int lowerbound, final int upperbound) {
		return MultiplicityElementPath.is(lowerbound, upperbound);
	}

	/**
	 * @see org.eclipse.uml2.uml.Variable#validateOwned()
	 * @generated
	 */
	public static Predicate<Variable> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Variable>() {
			public boolean apply(Variable s) {
				return s.validateOwned(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Variable#isAccessibleBy()
	 * @generated
	 */
	public static Predicate<Variable> isAccessibleBy(final Action a) {
		return new Predicate<Variable>() {
			public boolean apply(Variable s) {
				return s.isAccessibleBy(a);
			}
		};
	}

}
