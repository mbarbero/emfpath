package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Pin Pin} in a functional way.
 * <p>
 * A pin is a typed element and multiplicity element that provides values to actions
 * and accept result values from them.
A pin is an object node for inputs and outputs
 * to actions. 
 * @see org.eclipse.uml2.uml.Pin
 * @generated
 */
public class PinPath extends ObjectNodePath {

	/**
	 * @generated
	 */
	 PinPath() {
    super();
  }

	/**
	 * For a multivalued multiplicity, this attribute specifies whether the values in an
	 * instantiation of this element are sequentially ordered. 
	 *
	 * @see MultiplicityElementPath#isOrdered()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isOrdered()
	 * @generated
	 */
	public static final ComposablePredicate<MultiplicityElement> isOrdered = MultiplicityElementPath.isOrdered;

	/**
	 * For a multivalued multiplicity, this attributes specifies whether the values in an
	 * instantiation of this element are unique. 
	 *
	 * @see MultiplicityElementPath#isUnique()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isUnique()
	 * @generated
	 */
	public static final ComposablePredicate<MultiplicityElement> isUnique = MultiplicityElementPath.isUnique;

	/**
	 * Specifies the upper bound of the multiplicity interval. 
	 *
	 * @see MultiplicityElementPath#upper()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = MultiplicityElementPath.upper;

	/**
	 * Specifies the lower bound of the multiplicity interval. 
	 *
	 * @see MultiplicityElementPath#lower()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = MultiplicityElementPath.lower;

	/**
	 * The specification of the upper bound for this multiplicity. 
	 *
	 * @see MultiplicityElementPath#upperValue()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpperValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = MultiplicityElementPath.upperValue;

	/**
	 * The specification of the lower bound for this multiplicity. 
	 *
	 * @see MultiplicityElementPath#lowerValue()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLowerValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = MultiplicityElementPath.lowerValue;

	/**
	 * Tells whether the pins provide data to the actions, or just controls when it executes
	 * it. 
	 * @see org.eclipse.uml2.uml.Pin#isControl()
	 * @generated
	 */
	public static final ComposablePredicate<Pin> isControl = new ComposablePredicate<Pin>() {
    public boolean apply(Pin s) {
      return s.isControl();
    }
  };
	
	/**
	 * The lower bound must be a non-negative integer literal.
	lowerBound()->notEmpty()
	 * implies lowerBound() >= 0 
	 *
	 * @see MultiplicityElementPath#validateLowerGe0()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> validateLowerGe0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return MultiplicityElementPath.validateLowerGe0(diagnostics, context);
  }

	/**
	 * The upper bound must be greater than or equal to the lower bound.
	(upperBound()->notEmpty()
	 * and lowerBound()->notEmpty()) implies upperBound() >= lowerBound() 
	 *
	 * @see MultiplicityElementPath#validateUpperGeLower()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> validateUpperGeLower(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return MultiplicityElementPath.validateUpperGeLower(diagnostics, context);
  }

	/**
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating
	 * that specification must not have side effects.
	true 
	 *
	 * @see MultiplicityElementPath#validateValueSpecificationNoSideEffects()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> validateValueSpecificationNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return MultiplicityElementPath.validateValueSpecificationNoSideEffects(diagnostics, context);
  }

	/**
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then that
	 * specification must be a constant expression.
	true 
	 *
	 * @see MultiplicityElementPath#validateValueSpecificationConstant()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> validateValueSpecificationConstant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return MultiplicityElementPath.validateValueSpecificationConstant(diagnostics, context);
  }

	/**
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater
	 * than one.
	upperBound()->notEmpty()
	result = upperBound() > 1 
	 *
	 * @see MultiplicityElementPath#isMultivalued()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public static final ComposablePredicate<MultiplicityElement> isMultivalued = MultiplicityElementPath.isMultivalued;

	/**
	 * The query includesCardinality() checks whether the specified cardinality is valid
	 * for this multiplicity.
	upperBound()->notEmpty() and lowerBound()->notEmpty()
	result
	 * = (lowerBound() <= C) and (upperBound() >= C) 
	 *
	 * @see MultiplicityElementPath#includesCardinality()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesCardinality(int)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> includesCardinality(final int C) {
    return MultiplicityElementPath.includesCardinality(C);
  }

	/**
	 * The query includesMultiplicity() checks whether this multiplicity includes all the
	 * cardinalities allowed by the specified multiplicity.
	self.upperBound()->notEmpty()
	 * and self.lowerBound()->notEmpty() and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
	result
	 * = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 *
	 * @see MultiplicityElementPath#includesMultiplicity()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(MultiplicityElement)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> includesMultiplicity(final MultiplicityElement M) {
    return MultiplicityElementPath.includesMultiplicity(M);
  }

	/**
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer.
	result
	 * = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif 
	 *
	 * @see MultiplicityElementPath#lowerBound()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = MultiplicityElementPath.lowerBound;

	/**
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity
	 * as an unlimited natural.
	result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue()
	 * endif 
	 *
	 * @see MultiplicityElementPath#upperBound_()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = MultiplicityElementPath.upperBound_;

	/**
	 * The operation compatibleWith takes another multiplicity as input. It checks if one
	 * multiplicity is compatible with another.
	result = Integer.allInstances()->forAll(i
	 * : Integer | self.includesCardinality(i) implies other.includesCardinality(i)) 
	 *
	 * @see MultiplicityElementPath#compatibleWith()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(MultiplicityElement)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> compatibleWith(final MultiplicityElement other) {
    return MultiplicityElementPath.compatibleWith(other);
  }

	/**
	 * The operation is determines if the upper and lower bound of the ranges are the ones
	 * given.
	result = (lowerbound = self.lowerbound and upperbound = self.upperbound) 
	 *
	 * @see MultiplicityElementPath#is()
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is(int, int)
	 * @generated
	 */
	public static ComposablePredicate<MultiplicityElement> is(final int lowerbound, final int upperbound) {
    return MultiplicityElementPath.is(lowerbound, upperbound);
  }

	/**
	 * Control pins have a control type
	isControl implies isControlType 
	 * @see org.eclipse.uml2.uml.Pin#validateControlPins(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Pin> validateControlPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Pin>() {
      public boolean apply(Pin s) {
        return s.validateControlPins(diagnostics, context);
      }
    };
  }

}
