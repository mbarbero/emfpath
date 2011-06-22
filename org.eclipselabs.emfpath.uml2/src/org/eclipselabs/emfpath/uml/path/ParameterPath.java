package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class ParameterPath extends ConnectableElementPath {

	/**
	 * @generated
	 */
	private ParameterPath() {
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
	 * @see org.eclipse.uml2.uml.Parameter#getParameterSets()
	 * @generated
	 */
	public static final Function<Parameter, EList<ParameterSet>> parameterSet = new Function<Parameter, EList<ParameterSet>>() {
		public EList<ParameterSet> apply(Parameter s) {
			return s.getParameterSets();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getOperation()
	 * @generated
	 */
	public static final Function<Parameter, Operation> operation = new Function<Parameter, Operation>() {
		public Operation apply(Parameter s) {
			return s.getOperation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getDirection()
	 * @generated
	 */
	public static final Function<Parameter, ParameterDirectionKind> direction = new Function<Parameter, ParameterDirectionKind>() {
		public ParameterDirectionKind apply(Parameter s) {
			return s.getDirection();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getDefault()
	 * @generated
	 */
	public static final Function<Parameter, String> default_ = new Function<Parameter, String>() {
		public String apply(Parameter s) {
			return s.getDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getDefaultValue()
	 * @generated
	 */
	public static final Function<Parameter, ValueSpecification> defaultValue = new Function<Parameter, ValueSpecification>() {
		public ValueSpecification apply(Parameter s) {
			return s.getDefaultValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#isException()
	 * @generated
	 */
	public static final Predicate<Parameter> isException = new Predicate<Parameter>() {
		public boolean apply(Parameter s) {
			return s.isException();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#isStream()
	 * @generated
	 */
	public static final Predicate<Parameter> isStream = new Predicate<Parameter>() {
		public boolean apply(Parameter s) {
			return s.isStream();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getEffect()
	 * @generated
	 */
	public static final Function<Parameter, ParameterEffectKind> effect = new Function<Parameter, ParameterEffectKind>() {
		public ParameterEffectKind apply(Parameter s) {
			return s.getEffect();
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
	 * @see org.eclipse.uml2.uml.Parameter#validateConnectorEnd()
	 * @generated
	 */
	public static Predicate<Parameter> validateConnectorEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Parameter>() {
			public boolean apply(Parameter s) {
				return s.validateConnectorEnd(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#validateStreamAndException()
	 * @generated
	 */
	public static Predicate<Parameter> validateStreamAndException(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Parameter>() {
			public boolean apply(Parameter s) {
				return s.validateStreamAndException(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#validateNotException()
	 * @generated
	 */
	public static Predicate<Parameter> validateNotException(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Parameter>() {
			public boolean apply(Parameter s) {
				return s.validateNotException(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors()
	 * @generated
	 */
	public static Predicate<Parameter> validateReentrantBehaviors(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Parameter>() {
			public boolean apply(Parameter s) {
				return s.validateReentrantBehaviors(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#validateInAndOut()
	 * @generated
	 */
	public static Predicate<Parameter> validateInAndOut(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Parameter>() {
			public boolean apply(Parameter s) {
				return s.validateInAndOut(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#getDefault()
	 * @generated
	 */
	public static final Function<Parameter, String> getDefault = new Function<Parameter, String>() {
		public String apply(Parameter s) {
			return s.getDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#isSetDefault()
	 * @generated
	 */
	public static final Predicate<Parameter> isSetDefault = new Predicate<Parameter>() {
		public boolean apply(Parameter s) {
			return s.isSetDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setDefault()
	 * @generated
	 */
	public static Function<Parameter, Parameter> setDefault(final String newDefault) {
		return new Function<Parameter, Parameter>() {
			public Parameter apply(Parameter s) {
				s.setDefault(newDefault);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#unsetDefault()
	 * @generated
	 */
	public static final Function<Parameter, Parameter> unsetDefault = new Function<Parameter, Parameter>() {
		public Parameter apply(Parameter s) {
			s.unsetDefault();
			return s;
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue()
	 * @generated
	 */
	public static Function<Parameter, Parameter> setBooleanDefaultValue(final boolean value) {
		return new Function<Parameter, Parameter>() {
			public Parameter apply(Parameter s) {
				s.setBooleanDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue()
	 * @generated
	 */
	public static Function<Parameter, Parameter> setIntegerDefaultValue(final int value) {
		return new Function<Parameter, Parameter>() {
			public Parameter apply(Parameter s) {
				s.setIntegerDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setStringDefaultValue()
	 * @generated
	 */
	public static Function<Parameter, Parameter> setStringDefaultValue(final String value) {
		return new Function<Parameter, Parameter>() {
			public Parameter apply(Parameter s) {
				s.setStringDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue()
	 * @generated
	 */
	public static Function<Parameter, Parameter> setUnlimitedNaturalDefaultValue(final int value) {
		return new Function<Parameter, Parameter>() {
			public Parameter apply(Parameter s) {
				s.setUnlimitedNaturalDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Parameter#setNullDefaultValue()
	 * @generated
	 */
	public static final Function<Parameter, Parameter> setNullDefaultValue = new Function<Parameter, Parameter>() {
		public Parameter apply(Parameter s) {
			s.setNullDefaultValue();
			return s;
		}
	};

}
