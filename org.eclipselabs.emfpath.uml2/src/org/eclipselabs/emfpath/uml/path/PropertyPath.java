package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class PropertyPath extends StructuralFeaturePath {

	/**
	 * @generated
	 */
	 PropertyPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> end = ConnectableElementPath.end;

	/**
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = DeploymentTargetPath.deployment;

	/**
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = DeploymentTargetPath.deployedElement;

	/**
	 * @see org.eclipse.uml2.uml.Property#getClass_()
	 * @generated
	 */
	public static final Function<Property, Class> class_ = new Function<Property, Class>() {
		public Class apply(Property s) {
			return s.getClass_();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getDatatype()
	 * @generated
	 */
	public static final Function<Property, DataType> datatype = new Function<Property, DataType>() {
		public DataType apply(Property s) {
			return s.getDatatype();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isDerived()
	 * @generated
	 */
	public static final Predicate<Property> isDerived = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isDerived();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isDerivedUnion()
	 * @generated
	 */
	public static final Predicate<Property> isDerivedUnion = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isDerivedUnion();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getDefault()
	 * @generated
	 */
	public static final Function<Property, String> default_ = new Function<Property, String>() {
		public String apply(Property s) {
			return s.getDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getAggregation()
	 * @generated
	 */
	public static final Function<Property, AggregationKind> aggregation = new Function<Property, AggregationKind>() {
		public AggregationKind apply(Property s) {
			return s.getAggregation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isComposite()
	 * @generated
	 */
	public static final Predicate<Property> isComposite = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isComposite();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getRedefinedProperties()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> redefinedProperty = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getRedefinedProperties();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getOwningAssociation()
	 * @generated
	 */
	public static final Function<Property, Association> owningAssociation = new Function<Property, Association>() {
		public Association apply(Property s) {
			return s.getOwningAssociation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getDefaultValue()
	 * @generated
	 */
	public static final Function<Property, ValueSpecification> defaultValue = new Function<Property, ValueSpecification>() {
		public ValueSpecification apply(Property s) {
			return s.getDefaultValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getOpposite()
	 * @generated
	 */
	public static final Function<Property, Property> opposite = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOpposite();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getSubsettedProperties()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> subsettedProperty = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getSubsettedProperties();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getAssociation()
	 * @generated
	 */
	public static final Function<Property, Association> association = new Function<Property, Association>() {
		public Association apply(Property s) {
			return s.getAssociation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getQualifiers()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> qualifier = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getQualifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#getAssociationEnd()
	 * @generated
	 */
	public static final Function<Property, Property> associationEnd = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getAssociationEnd();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateMultiplicityOfComposite()
	 * @generated
	 */
	public static Predicate<Property> validateMultiplicityOfComposite(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateMultiplicityOfComposite(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateSubsettingContextConforms()
	 * @generated
	 */
	public static Predicate<Property> validateSubsettingContextConforms(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateSubsettingContextConforms(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateRedefinedPropertyInherited()
	 * @generated
	 */
	public static Predicate<Property> validateRedefinedPropertyInherited(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateRedefinedPropertyInherited(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateSubsettingRules()
	 * @generated
	 */
	public static Predicate<Property> validateSubsettingRules(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateSubsettingRules(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateNavigableReadonly()
	 * @generated
	 */
	public static Predicate<Property> validateNavigableReadonly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateNavigableReadonly(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateDerivedUnionIsDerived()
	 * @generated
	 */
	public static Predicate<Property> validateDerivedUnionIsDerived(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateDerivedUnionIsDerived(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateDerivedUnionIsReadOnly()
	 * @generated
	 */
	public static Predicate<Property> validateDerivedUnionIsReadOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateDerivedUnionIsReadOnly(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateSubsettedPropertyNames()
	 * @generated
	 */
	public static Predicate<Property> validateSubsettedPropertyNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateSubsettedPropertyNames(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateDeploymentTarget()
	 * @generated
	 */
	public static Predicate<Property> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateDeploymentTarget(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#validateBindingToAttribute()
	 * @generated
	 */
	public static Predicate<Property> validateBindingToAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.validateBindingToAttribute(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#getDefault()
	 * @generated
	 */
	public static final Function<Property, String> getDefault = new Function<Property, String>() {
		public String apply(Property s) {
			return s.getDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isSetDefault()
	 * @generated
	 */
	public static final Predicate<Property> isSetDefault = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isSetDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#setDefault()
	 * @generated
	 */
	public static Function<Property, Property> setDefault(final String newDefault) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setDefault(newDefault);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setIsComposite()
	 * @generated
	 */
	public static Function<Property, Property> setIsComposite(final boolean newIsComposite) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setIsComposite(newIsComposite);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setOpposite()
	 * @generated
	 */
	public static Function<Property, Property> setOpposite(final Property newOpposite) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setOpposite(newOpposite);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#unsetDefault()
	 * @generated
	 */
	public static final Function<Property, Property> unsetDefault = new Function<Property, Property>() {
		public Property apply(Property s) {
			s.unsetDefault();
			return s;
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#setIsNavigable()
	 * @generated
	 */
	public static Function<Property, Property> setIsNavigable(final boolean isNavigable) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setIsNavigable(isNavigable);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#getOtherEnd()
	 * @generated
	 */
	public static final Function<Property, Property> getOtherEnd = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOtherEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#setBooleanDefaultValue()
	 * @generated
	 */
	public static Function<Property, Property> setBooleanDefaultValue(final boolean value) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setBooleanDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setIntegerDefaultValue()
	 * @generated
	 */
	public static Function<Property, Property> setIntegerDefaultValue(final int value) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setIntegerDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setStringDefaultValue()
	 * @generated
	 */
	public static Function<Property, Property> setStringDefaultValue(final String value) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setStringDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setUnlimitedNaturalDefaultValue()
	 * @generated
	 */
	public static Function<Property, Property> setUnlimitedNaturalDefaultValue(final int value) {
		return new Function<Property, Property>() {
			public Property apply(Property s) {
				s.setUnlimitedNaturalDefaultValue(value);
				return s;
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#setNullDefaultValue()
	 * @generated
	 */
	public static final Function<Property, Property> setNullDefaultValue = new Function<Property, Property>() {
		public Property apply(Property s) {
			s.setNullDefaultValue();
			return s;
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isAttribute()
	 * @generated
	 */
	public static Predicate<Property> isAttribute(final Property p) {
		return new Predicate<Property>() {
			public boolean apply(Property s) {
				return s.isAttribute(p);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Property#getOpposite()
	 * @generated
	 */
	public static final Function<Property, Property> getOpposite = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOpposite();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#subsettingContext()
	 * @generated
	 */
	public static final Function<Property, EList<Type>> subsettingContext = new Function<Property, EList<Type>>() {
		public EList<Type> apply(Property s) {
			return s.subsettingContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Property#isNavigable()
	 * @generated
	 */
	public static final Predicate<Property> isNavigable = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isNavigable();
		}
	};

}
