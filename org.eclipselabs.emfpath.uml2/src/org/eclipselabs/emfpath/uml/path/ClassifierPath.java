package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UseCase;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Classifier Classifier} in a functional way.
 * <p>
 * A classifier is a classification of instances - it describes a set of instances that
 * have features in common. A classifier can specify a generalization hierarchy by referencing
 * its general classifiers.
A classifier has the capability to own collaboration uses.
 * These collaboration uses link a collaboration with the classifier to give a description
 * of the workings of the classifier.
A classifier has the capability to own use cases.
 * Although the owning classifier typically represents the subject to which the owned
 * use cases apply, this is not necessarily the case. In principle, the same use case
 * can be applied to multiple subjects, as identified by the subject association role
 * of a use case.
Classifier is defined to be a kind of templateable element so that
 * a classifier can be parameterized. It is also defined to be a kind of parameterable
 * element so that a classifier can be a formal template parameter. 
 * @see org.eclipse.uml2.uml.Classifier
 * @generated
 */
public class ClassifierPath extends NamespacePath {

	/**
	 * @generated
	 */
	 ClassifierPath() {
    super();
  }

	/**
	 * Indicates whether it is possible to further specialize a RedefinableElement. If the
	 * value is true, then it is not possible to further specialize the RedefinableElement.
	 *
	 * @see RedefinableElementPath#isLeaf()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final ComposablePredicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * The redefinable element that is being redefined by this element. 
	 *
	 * @see RedefinableElementPath#redefinedElement()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * References the contexts that this element may be redefined from. 
	 *
	 * @see RedefinableElementPath#redefinitionContext()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

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
	 * Specifies the owning package of this classifier, if any. 
	 *
	 * @see TypePath#package_()
	 * @see org.eclipse.uml2.uml.Type#getPackage()
	 * @generated
	 */
	public static final Function<Type, Package> package_ = TypePath.package_;

	/**
	 * The optional bindings from this element to templates. 
	 *
	 * @see TemplateableElementPath#templateBinding()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * The optional template signature specifying the formal template parameters. 
	 *
	 * @see TemplateableElementPath#ownedTemplateSignature()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * If true, the Classifier does not provide a complete declaration and can typically
	 * not be instantiated. An abstract classifier is intended to be used by other classifiers
	 * e.g. as the target of general metarelationships or generalization relationships.
	
	 * @see org.eclipse.uml2.uml.Classifier#isAbstract()
	 * @generated
	 */
	public static final ComposablePredicate<Classifier> isAbstract = new ComposablePredicate<Classifier>() {
    public boolean apply(Classifier s) {
      return s.isAbstract();
    }
  };

	/**
	 * Specifies the Generalization relationships for this Classifier. These Generalizations
	 * navigaten to more general classifiers in the generalization hierarchy. 
	 * @see org.eclipse.uml2.uml.Classifier#getGeneralizations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Generalization>> generalization = new Function<Classifier, EList<Generalization>>() {
    public EList<Generalization> apply(Classifier s) {
      return s.getGeneralizations();
    }
  };

	/**
	 * Designates the GeneralizationSet of which the associated Classifier is a power type.
	 * @see org.eclipse.uml2.uml.Classifier#getPowertypeExtents()
	 * @generated
	 */
	public static final Function<Classifier, EList<GeneralizationSet>> powertypeExtent = new Function<Classifier, EList<GeneralizationSet>>() {
    public EList<GeneralizationSet> apply(Classifier s) {
      return s.getPowertypeExtents();
    }
  };

	/**
	 * Note that there may be members of the Classifier that are of the type Feature but
	 * are not included in this association, e.g. inherited features.
	Specifies each feature
	 * defined in the classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getFeatures()
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> feature = new Function<Classifier, EList<Feature>>() {
    public EList<Feature> apply(Classifier s) {
      return s.getFeatures();
    }
  };

	/**
	 * Specifies all elements inherited by this classifier from the general classifiers.
	 * @see org.eclipse.uml2.uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> inheritedMember = new Function<Classifier, EList<NamedElement>>() {
    public EList<NamedElement> apply(Classifier s) {
      return s.getInheritedMembers();
    }
  };

	/**
	 * References the Classifiers that are redefined by this Classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getRedefinedClassifiers()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> redefinedClassifier = new Function<Classifier, EList<Classifier>>() {
    public EList<Classifier> apply(Classifier s) {
      return s.getRedefinedClassifiers();
    }
  };

	/**
	 * References the general classifier in the Generalization relationship.
	Specifies the
	 * general Classifiers for this Classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> general = new Function<Classifier, EList<Classifier>>() {
    public EList<Classifier> apply(Classifier s) {
      return s.getGenerals();
    }
  };

	/**
	 * References the substitutions that are owned by this Classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getSubstitutions()
	 * @generated
	 */
	public static final Function<Classifier, EList<Substitution>> substitution = new Function<Classifier, EList<Substitution>>() {
    public EList<Substitution> apply(Classifier s) {
      return s.getSubstitutions();
    }
  };

	/**
	 * Refers to all of the Properties that are direct (i.e. not inherited or imported) attributes
	 * of the classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getAttributes()
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> attribute = new Function<Classifier, EList<Property>>() {
    public EList<Property> apply(Classifier s) {
      return s.getAttributes();
    }
  };

	/**
	 * References a collaboration use which indicates the collaboration that represents this
	 * classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getRepresentation()
	 * @generated
	 */
	public static final Function<Classifier, CollaborationUse> representation = new Function<Classifier, CollaborationUse>() {
    public CollaborationUse apply(Classifier s) {
      return s.getRepresentation();
    }
  };

	/**
	 * References the collaboration uses owned by the classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getCollaborationUses()
	 * @generated
	 */
	public static final Function<Classifier, EList<CollaborationUse>> collaborationUse = new Function<Classifier, EList<CollaborationUse>>() {
    public EList<CollaborationUse> apply(Classifier s) {
      return s.getCollaborationUses();
    }
  };

	/**
	 * References the use cases owned by this classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getOwnedUseCases()
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> ownedUseCase = new Function<Classifier, EList<UseCase>>() {
    public EList<UseCase> apply(Classifier s) {
      return s.getOwnedUseCases();
    }
  };

	/**
	 * The set of use cases for which this Classifier is the subject. 
	 * @see org.eclipse.uml2.uml.Classifier#getUseCases()
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> useCase = new Function<Classifier, EList<UseCase>>() {
    public EList<UseCase> apply(Classifier s) {
      return s.getUseCases();
    }
  };
	
	/**
	 * At least one of the redefinition contexts of the redefining element must be a specialization
	 * of at least one of the redefinition contexts for each redefined element.
	self.redefinedElement->forAll(e
	 * | self.isRedefinitionContextValid(e)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
  }

	/**
	 * A redefining element must be consistent with each redefined element.
	self.redefinedElement->forAll(re
	 * | re.isConsistentWith(self)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionConsistent()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
  }

	/**
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context
	 * in which redefinition is possible, whether redefinition would be logically consistent.
	 * By default, this is false; this operation must be overridden for subclasses of RedefinableElement
	 * to define the consistency conditions.
	redefinee.isRedefinitionContextValid(self)
	result
	 * = false 
	 *
	 * @see RedefinableElementPath#isConsistentWith()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
    return RedefinableElementPath.isConsistentWith(redefinee);
  }

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of this RedefinableElement are properly related to the redefinition contexts of the
	 * specified RedefinableElement to allow this element to redefine the other. By default
	 * at least one of the redefinition contexts of this element must be a specialization
	 * of at least one of the redefinition contexts of the specified element.
	result = redefinitionContext->exists(c
	 * | c.allParents()->includes(redefined.redefinitionContext))) 
	 *
	 * @see RedefinableElementPath#isRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public static ComposablePredicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
    return RedefinableElementPath.isRedefinitionContextValid(redefined);
  }

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
	public static ComposablePredicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
    return ParameterableElementPath.isCompatibleWith(p);
  }

	/**
	 * Creates a(n) (binary) association between this type and the specified other type,
	 * with the specified navigabilities, aggregations, names, lower bounds, and upper bounds,
	 * and owned by this type's nearest package. 
	 *
	 * @see TypePath#createAssociation()
	 * @see org.eclipse.uml2.uml.Type#createAssociation(boolean, AggregationKind, String, int, int, Type, boolean, AggregationKind, String, int, int)
	 * @generated
	 */
	public static Function<Type, Association> createAssociation(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Type end1Type, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
    return TypePath.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
  }

	/**
	 * Retrieves the associations in which this type is involved. 
	 *
	 * @see TypePath#getAssociations()
	 * @see org.eclipse.uml2.uml.Type#getAssociations()
	 * @generated
	 */
	public static final Function<Type, EList<Association>> getAssociations = TypePath.getAssociations;

	/**
	 * The query conformsTo() gives true for a type that conforms to another. By default,
	 * two types do not conform to each other. This query is intended to be redefined for
	 * specific conformance situations.
	result = false 
	 *
	 * @see TypePath#conformsTo()
	 * @see org.eclipse.uml2.uml.Type#conformsTo(Type)
	 * @generated
	 */
	public static ComposablePredicate<Type> conformsTo(final Type other) {
    return TypePath.conformsTo(other);
  }

	/**
	 * The query parameterableElements() returns the set of elements that may be used as
	 * the parametered elements for a template parameter of this templateable element. By
	 * default, this set includes all the owned elements. Subclasses may override this operation
	 * if they choose to restrict the set of parameterable elements.
	result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 *
	 * @see TemplateableElementPath#parameterableElements()
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * The query isTemplate() returns whether this templateable element is actually a template.
	result
	 * = ownedTemplateSignature->notEmpty() 
	 *
	 * @see TemplateableElementPath#isTemplate()
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final ComposablePredicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be
	 * both a transitively general and transitively specific classifier of the same classifier.
	not
	 * self.allParents()->includes(self) 
	 * @see org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> validateNoCyclesInGeneralization(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.validateNoCyclesInGeneralization(diagnostics, context);
      }
    };
  }

	/**
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be
	 * both a transitively general and transitively specific classifier of the same classifier.
	not
	 * self.allParents()->includes(self) 
	 * @see org.eclipse.uml2.uml.Classifier#validateGeneralizationHierarchies(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> validateGeneralizationHierarchies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.validateGeneralizationHierarchies(diagnostics, context);
      }
    };
  }

	/**
	 * A classifier may only specialize classifiers of a valid type.
	self.parents()->forAll(c
	 * | self.maySpecializeType(c)) 
	 * @see org.eclipse.uml2.uml.Classifier#validateSpecializeType(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> validateSpecializeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.validateSpecializeType(diagnostics, context);
      }
    };
  }

	/**
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general
	 * Classifier in any of the Generalization relationships defined for that GeneralizationSet.
	 * In other words, a power type may not be an instance of itself nor may its instances
	 * also be its subclasses.
	true 
	 * @see org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> validateMapsToGeneralizationSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.validateMapsToGeneralizationSet(diagnostics, context);
      }
    };
  }

	/**
	 * Retrieves all the attributes of this classifier, including those inherited from its
	 * parents. 
	 * @see org.eclipse.uml2.uml.Classifier#getAllAttributes()
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> getAllAttributes = new Function<Classifier, EList<Property>>() {
    public EList<Property> apply(Classifier s) {
      return s.getAllAttributes();
    }
  };

	/**
	 * Retrieves the operations of this classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getOperations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getOperations = new Function<Classifier, EList<Operation>>() {
    public EList<Operation> apply(Classifier s) {
      return s.getOperations();
    }
  };

	/**
	 * Retrieves all the operations of this classifier, including those inherited from its
	 * parents. 
	 * @see org.eclipse.uml2.uml.Classifier#getAllOperations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getAllOperations = new Function<Classifier, EList<Operation>>() {
    public EList<Operation> apply(Classifier s) {
      return s.getAllOperations();
    }
  };

	/**
	 * Retrieves the first operation with the specified name, parameter names, and parameter
	 * types from this classifier. 
	 * @see org.eclipse.uml2.uml.Classifier#getOperation(String, EList, EList)
	 * @generated
	 */
	public static Function<Classifier, Operation> getOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes) {
    return new Function<Classifier, Operation>() {
      public Operation apply(Classifier s) {
        return s.getOperation(name, parameterNames, parameterTypes);
      }
    };
  }

	/**
	 * Retrieves the first operation with the specified name, parameter names, and parameter
	 * types from this classifier, ignoring case if indicated. 
	 * @see org.eclipse.uml2.uml.Classifier#getOperation(String, EList, EList, boolean)
	 * @generated
	 */
	public static Function<Classifier, Operation> getOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final boolean ignoreCase) {
    return new Function<Classifier, Operation>() {
      public Operation apply(Classifier s) {
        return s.getOperation(name, parameterNames, parameterTypes, ignoreCase);
      }
    };
  }

	/**
	 * Retrieves the interfaces on which this classifier has a usage dependency. 
	 * @see org.eclipse.uml2.uml.Classifier#getUsedInterfaces()
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getUsedInterfaces = new Function<Classifier, EList<Interface>>() {
    public EList<Interface> apply(Classifier s) {
      return s.getUsedInterfaces();
    }
  };

	/**
	 * Retrieves all the interfaces on which this classifier or any of its parents has a
	 * usage dependency. 
	 * @see org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces()
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getAllUsedInterfaces = new Function<Classifier, EList<Interface>>() {
    public EList<Interface> apply(Classifier s) {
      return s.getAllUsedInterfaces();
    }
  };

	/**
	 * The general classifiers are the classifiers referenced by the generalization relationships.
	result
	 * = self.parents() 
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> getGenerals = new Function<Classifier, EList<Classifier>>() {
    public EList<Classifier> apply(Classifier s) {
      return s.getGenerals();
    }
  };

	/**
	 * The inheritedMember association is derived by inheriting the inheritable members of
	 * the parents.
	result = self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * @see org.eclipse.uml2.uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> getInheritedMembers = new Function<Classifier, EList<NamedElement>>() {
    public EList<NamedElement> apply(Classifier s) {
      return s.getInheritedMembers();
    }
  };

	/**
	 * The query allFeatures() gives all of the features in the namespace of the classifier.
	 * In general, through mechanisms such as inheritance, this will be a larger set than
	 * feature.
	result = member->select(oclIsKindOf(Feature)) 
	 * @see org.eclipse.uml2.uml.Classifier#allFeatures()
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> allFeatures = new Function<Classifier, EList<Feature>>() {
    public EList<Feature> apply(Classifier s) {
      return s.allFeatures();
    }
  };

	/**
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	result
	 * = generalization.general 
	 * @see org.eclipse.uml2.uml.Classifier#parents()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> parents = new Function<Classifier, EList<Classifier>>() {
    public EList<Classifier> apply(Classifier s) {
      return s.parents();
    }
  };

	/**
	 * The query inheritableMembers() gives all of the members of a classifier that may be
	 * inherited in one of its descendants, subject to whatever visibility restrictions apply.
	c.allParents()->includes(self)
	result
	 * = member->select(m | c.hasVisibilityOf(m)) 
	 * @see org.eclipse.uml2.uml.Classifier#inheritableMembers(Classifier)
	 * @generated
	 */
	public static Function<Classifier, EList<NamedElement>> inheritableMembers(final Classifier c) {
    return new Function<Classifier, EList<NamedElement>>() {
      public EList<NamedElement> apply(Classifier s) {
        return s.inheritableMembers(c);
      }
    };
  }

	/**
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier.
	 * By default all are visible. It is only called when the argument is something owned
	 * by a parent.
	self.allParents()->collect(c | c.member)->includes(n)
	result = if (self.inheritedMember->includes(n))
	 * then (n.visibility <> #private) else true 
	 * @see org.eclipse.uml2.uml.Classifier#hasVisibilityOf(NamedElement)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> hasVisibilityOf(final NamedElement n) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.hasVisibilityOf(n);
      }
    };
  }

	/**
	 * The query conformsTo() gives true for a classifier that defines a type that conforms
	 * to another. This is used, for example, in the specification of signature conformance
	 * for operations.
	result = (self=other) or (self.allParents()->includes(other)) 
	 * @see org.eclipse.uml2.uml.Classifier#conformsTo(Classifier)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> conformsTo(final Classifier other) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.conformsTo(other);
      }
    };
  }

	/**
	 * The inherit operation is overridden to exclude redefined properties.
	The query inherit()
	 * defines how to inherit a set of elements. Here the operation is defined to inherit
	 * them all. It is intended to be redefined in circumstances where inheritance is affected
	 * by redefinition.
	result = inhs 
	 * @see org.eclipse.uml2.uml.Classifier#inherit(EList)
	 * @generated
	 */
	public static Function<Classifier, EList<NamedElement>> inherit(final EList<NamedElement> inhs) {
    return new Function<Classifier, EList<NamedElement>>() {
      public EList<NamedElement> apply(Classifier s) {
        return s.inherit(inhs);
      }
    };
  }

	/**
	 * The query maySpecializeType() determines whether this classifier may have a generalization
	 * relationship to classifiers of the specified type. By default a classifier may specialize
	 * classifiers of the same or a more general type. It is intended to be redefined by
	 * classifiers that have different specialization constraints.
	result = self.oclIsKindOf(c.oclType)
	 * @see org.eclipse.uml2.uml.Classifier#maySpecializeType(Classifier)
	 * @generated
	 */
	public static ComposablePredicate<Classifier> maySpecializeType(final Classifier c) {
    return new ComposablePredicate<Classifier>() {
      public boolean apply(Classifier s) {
        return s.maySpecializeType(c);
      }
    };
  }

	/**
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized
	 * Classifier.
	result = self.parents()->union(self.parents()->collect(p | p.allParents())
	 * @see org.eclipse.uml2.uml.Classifier#allParents()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> allParents = new Function<Classifier, EList<Classifier>>() {
    public EList<Classifier> apply(Classifier s) {
      return s.allParents();
    }
  };

}
