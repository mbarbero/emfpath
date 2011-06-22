package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isOrdered()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isOrdered = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isOrdered();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isUnique()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isUnique = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isUnique();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpperValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getUpperValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLowerValue()
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getLowerValue();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setLower()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setUpper()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getLower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getUpper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isMultivalued = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isMultivalued();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesCardinality()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.lowerBound();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.upperBound();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith()
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
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is()
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
