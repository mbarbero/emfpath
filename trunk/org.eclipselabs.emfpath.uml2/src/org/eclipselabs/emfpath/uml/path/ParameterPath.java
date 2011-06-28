package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Parameter Parameter} in a functional way.
 * <p>
 * A parameter is a specification of an argument used to pass information into or out
 * of an invocation of a behavioral feature.
Parameters are allowed to be treated as
 * connectable elements.
Parameters have support for streaming, exceptions, and parameter
 * sets. 
 * @see org.eclipse.uml2.uml.Parameter
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
	 * The parameter sets containing the parameter. See ParameterSet. 
	 * @see org.eclipse.uml2.uml.Parameter#getParameterSets()
	 * @generated
	 */
	public static final Function<Parameter, EList<ParameterSet>> parameterSet = new Function<Parameter, EList<ParameterSet>>() {
    public EList<ParameterSet> apply(Parameter s) {
      return s.getParameterSets();
    }
  };

	/**
	 * References the Operation owning this parameter. 
	 * @see org.eclipse.uml2.uml.Parameter#getOperation()
	 * @generated
	 */
	public static final Function<Parameter, Operation> operation = new Function<Parameter, Operation>() {
    public Operation apply(Parameter s) {
      return s.getOperation();
    }
  };

	/**
	 * Indicates whether a parameter is being sent into or out of a behavioral element. 
	 * @see org.eclipse.uml2.uml.Parameter#getDirection()
	 * @generated
	 */
	public static final Function<Parameter, ParameterDirectionKind> direction = new Function<Parameter, ParameterDirectionKind>() {
    public ParameterDirectionKind apply(Parameter s) {
      return s.getDirection();
    }
  };

	/**
	 * Specifies a String that represents a value to be used when no argument is supplied
	 * for the Parameter. 
	 * @see org.eclipse.uml2.uml.Parameter#getDefault()
	 * @generated
	 */
	public static final Function<Parameter, String> default_ = new Function<Parameter, String>() {
    public String apply(Parameter s) {
      return s.getDefault();
    }
  };

	/**
	 * Specifies a ValueSpecification that represents a value to be used when no argument
	 * is supplied for the Parameter. 
	 * @see org.eclipse.uml2.uml.Parameter#getDefaultValue()
	 * @generated
	 */
	public static final Function<Parameter, ValueSpecification> defaultValue = new Function<Parameter, ValueSpecification>() {
    public ValueSpecification apply(Parameter s) {
      return s.getDefaultValue();
    }
  };

	/**
	 * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
	 * @see org.eclipse.uml2.uml.Parameter#isException()
	 * @generated
	 */
	public static final ComposablePredicate<Parameter> isException = new ComposablePredicate<Parameter>() {
    public boolean apply(Parameter s) {
      return s.isException();
    }
  };

	/**
	 * Tells whether an input parameter may accept values while its behavior is executing,
	 * or whether an output parameter post values while the behavior is executing. 
	 * @see org.eclipse.uml2.uml.Parameter#isStream()
	 * @generated
	 */
	public static final ComposablePredicate<Parameter> isStream = new ComposablePredicate<Parameter>() {
    public boolean apply(Parameter s) {
      return s.isStream();
    }
  };

	/**
	 * Specifies the effect that the owner of the parameter has on values passed in or out
	 * of the parameter. 
	 * @see org.eclipse.uml2.uml.Parameter#getEffect()
	 * @generated
	 */
	public static final Function<Parameter, ParameterEffectKind> effect = new Function<Parameter, ParameterEffectKind>() {
    public ParameterEffectKind apply(Parameter s) {
      return s.getEffect();
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
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	self.end.notEmpty()
	 * implies self.collaboration.notEmpty() 
	 * @see org.eclipse.uml2.uml.Parameter#validateConnectorEnd(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Parameter> validateConnectorEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Parameter>() {
      public boolean apply(Parameter s) {
        return s.validateConnectorEnd(diagnostics, context);
      }
    };
  }

	/**
	 * A parameter cannot be a stream and exception at the same time.
	true 
	 * @see org.eclipse.uml2.uml.Parameter#validateStreamAndException(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Parameter> validateStreamAndException(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Parameter>() {
      public boolean apply(Parameter s) {
        return s.validateStreamAndException(diagnostics, context);
      }
    };
  }

	/**
	 * An input parameter cannot be an exception.
	true 
	 * @see org.eclipse.uml2.uml.Parameter#validateNotException(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Parameter> validateNotException(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Parameter>() {
      public boolean apply(Parameter s) {
        return s.validateNotException(diagnostics, context);
      }
    };
  }

	/**
	 * Reentrant behaviors cannot have stream parameters.
	true 
	 * @see org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Parameter> validateReentrantBehaviors(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Parameter>() {
      public boolean apply(Parameter s) {
        return s.validateReentrantBehaviors(diagnostics, context);
      }
    };
  }

	/**
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return
	 * parameters may have a create effect.
	true 
	 * @see org.eclipse.uml2.uml.Parameter#validateInAndOut(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Parameter> validateInAndOut(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Parameter>() {
      public boolean apply(Parameter s) {
        return s.validateInAndOut(diagnostics, context);
      }
    };
  }

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Parameter#getDefault()
	 * @generated
	 */
	public static final Function<Parameter, String> getDefault = new Function<Parameter, String>() {
    public String apply(Parameter s) {
      return s.getDefault();
    }
  };

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Parameter#isSetDefault()
	 * @generated
	 */
	public static final ComposablePredicate<Parameter> isSetDefault = new ComposablePredicate<Parameter>() {
    public boolean apply(Parameter s) {
      return s.isSetDefault();
    }
  };

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Parameter#setDefault(String)
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
	 * 
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
	 * Sets the default value for this parameter to the specified Boolean value. 
	 * @see org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue(boolean)
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
	 * Sets the default value for this parameter to the specified integer value. 
	 * @see org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue(int)
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
	 * Sets the default value for this parameter to the specified string value. 
	 * @see org.eclipse.uml2.uml.Parameter#setStringDefaultValue(String)
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
	 * Sets the default value for this parameter to the specified unlimited natural value.
	 * @see org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue(int)
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
	 * Sets the default value for this parameter to the null value. 
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
