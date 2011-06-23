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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Property Property} in a functional way.
 * <p>
 * A property is a structural feature of a classifier that characterizes instances of
 * the classifier. A property related by ownedAttribute to a classifier (other than an
 * association) represents an attribute and might also represent an association end.
 * It relates an instance of the class to a value or set of values of the type of the
 * attribute. A property related by memberEnd or its specializations to an association
 * represents an end of the association. The type of the property is the type of the
 * end of the association.
A property represents a set of instances that are owned by
 * a containing classifier instance.
A property has the capability of being a deployment
 * target in a deployment relationship. This enables modeling the deployment to hierarchical
 * nodes that have properties functioning as internal parts.
Property represents a declared
 * state of one or more instances in terms of a named relationship to a value or values.
 * When a property is an attribute of a classifier, the value or values are related to
 * the instance of the classifier by being held in slots of the instance. When a property
 * is an association end, the value or values are related to the instance or instances
 * at the other end(s) of the association. The range of valid values represented by the
 * property can be controlled by setting the property's type.
Property specializes ParameterableElement
 * to specify that a property can be exposed as a formal template parameter, and provided
 * as an actual parameter in a binding of a template. 
 * @see org.eclipse.uml2.uml.Property
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
	 * The formal template parameter that owns this element. 
	 *
	 * @see ParameterableElementPath#owningTemplateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 *
	 * @see ParameterableElementPath#templateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * Denotes a connector that attaches to this connectable element. 
	 *
	 * @see ConnectableElementPath#end()
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> end = ConnectableElementPath.end;

	/**
	 * The set of Deployments for a DeploymentTarget. 
	 *
	 * @see DeploymentTargetPath#deployment()
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = DeploymentTargetPath.deployment;

	/**
	 * The set of elements that are manifested in an Artifact that is involved in Deployment
	 * to a DeploymentTarget. 
	 *
	 * @see DeploymentTargetPath#deployedElement()
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = DeploymentTargetPath.deployedElement;

	/**
	 * References the Class that owns the Property. 
	 * @see org.eclipse.uml2.uml.Property#getClass_()
	 * @generated
	 */
	public static final Function<Property, Class> class_ = new Function<Property, Class>() {
		public Class apply(Property s) {
			return s.getClass_();
		}
	};

	/**
	 * The DataType that owns this Property. 
	 * @see org.eclipse.uml2.uml.Property#getDatatype()
	 * @generated
	 */
	public static final Function<Property, DataType> datatype = new Function<Property, DataType>() {
		public DataType apply(Property s) {
			return s.getDatatype();
		}
	};

	/**
	 * If isDerived is true, the value of the attribute is derived from information elsewhere.
	Specifies
	 * whether the Property is derived, i.e., whether its value or values can be computed
	 * from other information. 
	 * @see org.eclipse.uml2.uml.Property#isDerived()
	 * @generated
	 */
	public static final Predicate<Property> isDerived = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isDerived();
		}
	};

	/**
	 * Specifies whether the property is derived as the union of all of the properties that
	 * are constrained to subset it. 
	 * @see org.eclipse.uml2.uml.Property#isDerivedUnion()
	 * @generated
	 */
	public static final Predicate<Property> isDerivedUnion = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isDerivedUnion();
		}
	};

	/**
	 * Specifies a String that represents a value to be used when no argument is supplied
	 * for the Property.
	A String that is evaluated to give a default value for the Property
	 * when an object of the owning Classifier is instantiated. 
	 * @see org.eclipse.uml2.uml.Property#getDefault()
	 * @generated
	 */
	public static final Function<Property, String> default_ = new Function<Property, String>() {
		public String apply(Property s) {
			return s.getDefault();
		}
	};

	/**
	 * Specifies the kind of aggregation that applies to the Property. 
	 * @see org.eclipse.uml2.uml.Property#getAggregation()
	 * @generated
	 */
	public static final Function<Property, AggregationKind> aggregation = new Function<Property, AggregationKind>() {
		public AggregationKind apply(Property s) {
			return s.getAggregation();
		}
	};

	/**
	 * If isComposite is true, the object containing the attribute is a container for the
	 * object or value contained in the attribute.
	This is a derived value, indicating whether
	 * the aggregation of the Property is composite or not. 
	 * @see org.eclipse.uml2.uml.Property#isComposite()
	 * @generated
	 */
	public static final Predicate<Property> isComposite = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isComposite();
		}
	};

	/**
	 * References the properties that are redefined by this property. 
	 * @see org.eclipse.uml2.uml.Property#getRedefinedProperties()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> redefinedProperty = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getRedefinedProperties();
		}
	};

	/**
	 * References the owning association of this property, if any. 
	 * @see org.eclipse.uml2.uml.Property#getOwningAssociation()
	 * @generated
	 */
	public static final Function<Property, Association> owningAssociation = new Function<Property, Association>() {
		public Association apply(Property s) {
			return s.getOwningAssociation();
		}
	};

	/**
	 * A ValueSpecification that is evaluated to give a default value for the Property when
	 * an object of the owning Classifier is instantiated. 
	 * @see org.eclipse.uml2.uml.Property#getDefaultValue()
	 * @generated
	 */
	public static final Function<Property, ValueSpecification> defaultValue = new Function<Property, ValueSpecification>() {
		public ValueSpecification apply(Property s) {
			return s.getDefaultValue();
		}
	};

	/**
	 * In the case where the property is one navigable end of a binary association with both
	 * ends navigable, this gives the other end. 
	 * @see org.eclipse.uml2.uml.Property#getOpposite()
	 * @generated
	 */
	public static final Function<Property, Property> opposite = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOpposite();
		}
	};

	/**
	 * References the properties of which this property is constrained to be a subset. 
	 * @see org.eclipse.uml2.uml.Property#getSubsettedProperties()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> subsettedProperty = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getSubsettedProperties();
		}
	};

	/**
	 * References the association of which this property is a member, if any. 
	 * @see org.eclipse.uml2.uml.Property#getAssociation()
	 * @generated
	 */
	public static final Function<Property, Association> association = new Function<Property, Association>() {
		public Association apply(Property s) {
			return s.getAssociation();
		}
	};

	/**
	 * An optional list of ordered qualifier attributes for the end. If the list is empty,
	 * then the Association is not qualified. 
	 * @see org.eclipse.uml2.uml.Property#getQualifiers()
	 * @generated
	 */
	public static final Function<Property, EList<Property>> qualifier = new Function<Property, EList<Property>>() {
		public EList<Property> apply(Property s) {
			return s.getQualifiers();
		}
	};

	/**
	 * Designates the optional association end that owns a qualifier attribute. 
	 * @see org.eclipse.uml2.uml.Property#getAssociationEnd()
	 * @generated
	 */
	public static final Function<Property, Property> associationEnd = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getAssociationEnd();
		}
	};
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 *
	 * @see ParameterableElementPath#isCompatibleWith()
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * A multiplicity of a composite aggregation must not have an upper bound greater than
	 * 1.
	A multiplicity on an aggregate end of a composite aggregation must not have an
	 * upper bound greater than 1.
	isComposite implies (upperBound()->isEmpty() or upperBound()
	 * <= 1) 
	 * @see org.eclipse.uml2.uml.Property#validateMultiplicityOfComposite(DiagnosticChain, Map)
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
	 * Subsetting may only occur when the context of the subsetting property conforms to
	 * the context of the subsetted property.
	self.subsettedProperty->notEmpty() implies
	
	 *  (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |
	
	 *    self.subsettedProperty->forAll(sp |
	      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * @see org.eclipse.uml2.uml.Property#validateSubsettingContextConforms(DiagnosticChain, Map)
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
	 * A redefined property must be inherited from a more general classifier containing the
	 * redefining property.
	if (redefinedProperty->notEmpty()) then
	  (redefinitionContext->notEmpty()
	 * and
	      redefinedProperty->forAll(rp|
	        ((redefinitionContext->collect(fc|
	
	 *          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))
	 * @see org.eclipse.uml2.uml.Property#validateRedefinedPropertyInherited(DiagnosticChain, Map)
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
	 * A subsetting property may strengthen the type of the subsetted property, and its upper
	 * bound may be less.
	self.subsettedProperty->forAll(sp |
	  self.type.conformsTo(sp.type)
	 * and
	    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	
	 *      self.upperBound()<=sp.upperBound() )) 
	 * @see org.eclipse.uml2.uml.Property#validateSubsettingRules(DiagnosticChain, Map)
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
	 * Only a navigable property can be marked as readOnly.
	isReadOnly implies isNavigable()
	 * @see org.eclipse.uml2.uml.Property#validateNavigableReadonly(DiagnosticChain, Map)
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
	 * A derived union is derived.
	isDerivedUnion implies isDerived 
	 * @see org.eclipse.uml2.uml.Property#validateDerivedUnionIsDerived(DiagnosticChain, Map)
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
	 * A derived union is read only.
	isDerivedUnion implies isReadOnly 
	 * @see org.eclipse.uml2.uml.Property#validateDerivedUnionIsReadOnly(DiagnosticChain, Map)
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
	 * A property may not subset a property with the same name.
	true 
	 * @see org.eclipse.uml2.uml.Property#validateSubsettedPropertyNames(DiagnosticChain, Map)
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
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part
	 * in the internal structure of an encompassing Node.
	true 
	 * @see org.eclipse.uml2.uml.Property#validateDeploymentTarget(DiagnosticChain, Map)
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
	 * A binding of a property template parameter representing an attribute must be to an
	 * attribute.
	(isAttribute(self) and (templateParameterSubstitution->notEmpty())
	 
	 * implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal))) 
	 * @see org.eclipse.uml2.uml.Property#validateBindingToAttribute(DiagnosticChain, Map)
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
	 * 
	 * @see org.eclipse.uml2.uml.Property#getDefault()
	 * @generated
	 */
	public static final Function<Property, String> getDefault = new Function<Property, String>() {
		public String apply(Property s) {
			return s.getDefault();
		}
	};

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Property#isSetDefault()
	 * @generated
	 */
	public static final Predicate<Property> isSetDefault = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isSetDefault();
		}
	};

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Property#setDefault(String)
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
	 * 
	 * @see org.eclipse.uml2.uml.Property#setIsComposite(boolean)
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
	 * 
	 * @see org.eclipse.uml2.uml.Property#setOpposite(Property)
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
	 * 
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
	 * Sets the navigability of this property as indicated. 
	 * @see org.eclipse.uml2.uml.Property#setIsNavigable(boolean)
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
	 * Retrieves the other end of the (binary) association in which this property is a member
	 * end. 
	 * @see org.eclipse.uml2.uml.Property#getOtherEnd()
	 * @generated
	 */
	public static final Function<Property, Property> getOtherEnd = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOtherEnd();
		}
	};

	/**
	 * Sets the default value for this property to the specified Boolean value. 
	 * @see org.eclipse.uml2.uml.Property#setBooleanDefaultValue(boolean)
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
	 * Sets the default value for this property to the specified integer value. 
	 * @see org.eclipse.uml2.uml.Property#setIntegerDefaultValue(int)
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
	 * Sets the default value for this property to the specified string value. 
	 * @see org.eclipse.uml2.uml.Property#setStringDefaultValue(String)
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
	 * Sets the default value for this property to the specified unlimited natural value.
	 * @see org.eclipse.uml2.uml.Property#setUnlimitedNaturalDefaultValue(int)
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
	 * Sets the default value for this property to the null value. 
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
	 * The query isAttribute() is true if the Property is defined as an attribute of some
	 * classifier.
	result = Classifier.allInstances->exists(c | c.attribute->includes(p))
	 * @see org.eclipse.uml2.uml.Property#isAttribute(Property)
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
	 * If this property is owned by a class, associated with a binary association, and the
	 * other end of the association is also owned by a class, then opposite gives the other
	 * end.
	result = if owningAssociation->isEmpty() and association.memberEnd->size() =
	 * 2
	  then
	    let otherEnd = (association.memberEnd - self)->any() in
	      if otherEnd.owningAssociation->isEmpty()
	 * then otherEnd else Set{} endif
	    else Set {}
	    endif 
	 * @see org.eclipse.uml2.uml.Property#getOpposite()
	 * @generated
	 */
	public static final Function<Property, Property> getOpposite = new Function<Property, Property>() {
		public Property apply(Property s) {
			return s.getOpposite();
		}
	};

	/**
	 * The query subsettingContext() gives the context for subsetting a property. It consists,
	 * in the case of an attribute, of the corresponding classifier, and in the case of an
	 * association end, all of the classifiers at the other ends.
	result = if association->notEmpty()
	then
	 * association.endType-type
	else if classifier->notEmpty() then Set{classifier} else
	 * Set{} endif
	endif 
	 * @see org.eclipse.uml2.uml.Property#subsettingContext()
	 * @generated
	 */
	public static final Function<Property, EList<Type>> subsettingContext = new Function<Property, EList<Type>>() {
		public EList<Type> apply(Property s) {
			return s.subsettingContext();
		}
	};

	/**
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	result
	 * = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)
	 * @see org.eclipse.uml2.uml.Property#isNavigable()
	 * @generated
	 */
	public static final Predicate<Property> isNavigable = new Predicate<Property>() {
		public boolean apply(Property s) {
			return s.isNavigable();
		}
	};

}
