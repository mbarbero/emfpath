package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.MultiplicityElement MultiplicityElement} in a functional way.
 * <p>
 * A multiplicity is a definition of an inclusive interval of non-negative integers beginning
 * with a lower bound and ending with a (possibly infinite) upper bound. A multiplicity
 * element embeds this information to specify the allowable cardinalities for an instantiation
 * of this element. 
 * @see org.eclipse.uml2.uml.MultiplicityElement
 * @generated
 */
public class MultiplicityElementPath extends ElementPath {

	/**
	 * @generated
	 */
	 MultiplicityElementPath() {
		super();
	}

	/**
	 * For a multivalued multiplicity, this attribute specifies whether the values in an
	 * instantiation of this element are sequentially ordered. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isOrdered()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isOrdered = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isOrdered();
		}
	};

	/**
	 * For a multivalued multiplicity, this attributes specifies whether the values in an
	 * instantiation of this element are unique. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isUnique()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isUnique = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isUnique();
		}
	};

	/**
	 * Specifies the upper bound of the multiplicity interval. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * Specifies the lower bound of the multiplicity interval. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * The specification of the upper bound for this multiplicity. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpperValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getUpperValue();
		}
	};

	/**
	 * The specification of the lower bound for this multiplicity. 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLowerValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getLowerValue();
		}
	};
	
	/**
	 * The lower bound must be a non-negative integer literal.
	lowerBound()->notEmpty()
	 * implies lowerBound() >= 0 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateLowerGe0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateLowerGe0(diagnostics, context);
			}
		};
	}

	/**
	 * The upper bound must be greater than or equal to the lower bound.
	(upperBound()->notEmpty()
	 * and lowerBound()->notEmpty()) implies upperBound() >= lowerBound() 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateUpperGeLower(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateUpperGeLower(diagnostics, context);
			}
		};
	}

	/**
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating
	 * that specification must not have side effects.
	true 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateValueSpecificationNoSideEffects(diagnostics, context);
			}
		};
	}

	/**
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then that
	 * specification must be a constant expression.
	true 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationConstant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateValueSpecificationConstant(diagnostics, context);
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setLower(int)
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setLower(final int newLower) {
		return new Function<MultiplicityElement, MultiplicityElement>() {
			public MultiplicityElement apply(MultiplicityElement s) {
				s.setLower(newLower);
				return s;
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setUpper(int)
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setUpper(final int newUpper) {
		return new Function<MultiplicityElement, MultiplicityElement>() {
			public MultiplicityElement apply(MultiplicityElement s) {
				s.setUpper(newUpper);
				return s;
			}
		};
	}

	/**
	 * The derived lower attribute must equal the lowerBound.
	result = lowerBound() 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getLower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * The derived upper attribute must equal the upperBound.
	result = upperBound() 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getUpper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater
	 * than one.
	upperBound()->notEmpty()
	result = upperBound() > 1 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isMultivalued = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isMultivalued();
		}
	};

	/**
	 * The query includesCardinality() checks whether the specified cardinality is valid
	 * for this multiplicity.
	upperBound()->notEmpty() and lowerBound()->notEmpty()
	result
	 * = (lowerBound() <= C) and (upperBound() >= C) 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesCardinality(int)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesCardinality(final int C) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.includesCardinality(C);
			}
		};
	}

	/**
	 * The query includesMultiplicity() checks whether this multiplicity includes all the
	 * cardinalities allowed by the specified multiplicity.
	self.upperBound()->notEmpty()
	 * and self.lowerBound()->notEmpty() and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
	result
	 * = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(MultiplicityElement)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesMultiplicity(final MultiplicityElement M) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.includesMultiplicity(M);
			}
		};
	}

	/**
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer.
	result
	 * = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.lowerBound();
		}
	};

	/**
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity
	 * as an unlimited natural.
	result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue()
	 * endif 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.upperBound();
		}
	};

	/**
	 * The operation compatibleWith takes another multiplicity as input. It checks if one
	 * multiplicity is compatible with another.
	result = Integer.allInstances()->forAll(i
	 * : Integer | self.includesCardinality(i) implies other.includesCardinality(i)) 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(MultiplicityElement)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> compatibleWith(final MultiplicityElement other) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.compatibleWith(other);
			}
		};
	}

	/**
	 * The operation is determines if the upper and lower bound of the ranges are the ones
	 * given.
	result = (lowerbound = self.lowerbound and upperbound = self.upperbound) 
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is(int, int)
	 * @generated
	 */
	public static Predicate<MultiplicityElement> is(final int lowerbound, final int upperbound) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.is(lowerbound, upperbound);
			}
		};
	}

}
