package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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

/**
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
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

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
	 * @see org.eclipse.uml2.uml.Type#getPackage()
	 * @generated
	 */
	public static final Function<Type, Package> package_ = TypePath.package_;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * @see org.eclipse.uml2.uml.Classifier#isAbstract()
	 * @generated
	 */
	public static final Predicate<Classifier> isAbstract = new Predicate<Classifier>() {
		public boolean apply(Classifier s) {
			return s.isAbstract();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getGeneralizations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Generalization>> generalization = new Function<Classifier, EList<Generalization>>() {
		public EList<Generalization> apply(Classifier s) {
			return s.getGeneralizations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getPowertypeExtents()
	 * @generated
	 */
	public static final Function<Classifier, EList<GeneralizationSet>> powertypeExtent = new Function<Classifier, EList<GeneralizationSet>>() {
		public EList<GeneralizationSet> apply(Classifier s) {
			return s.getPowertypeExtents();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getFeatures()
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> feature = new Function<Classifier, EList<Feature>>() {
		public EList<Feature> apply(Classifier s) {
			return s.getFeatures();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> inheritedMember = new Function<Classifier, EList<NamedElement>>() {
		public EList<NamedElement> apply(Classifier s) {
			return s.getInheritedMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getRedefinedClassifiers()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> redefinedClassifier = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getRedefinedClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> general = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getGenerals();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getSubstitutions()
	 * @generated
	 */
	public static final Function<Classifier, EList<Substitution>> substitution = new Function<Classifier, EList<Substitution>>() {
		public EList<Substitution> apply(Classifier s) {
			return s.getSubstitutions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getAttributes()
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> attribute = new Function<Classifier, EList<Property>>() {
		public EList<Property> apply(Classifier s) {
			return s.getAttributes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getRepresentation()
	 * @generated
	 */
	public static final Function<Classifier, CollaborationUse> representation = new Function<Classifier, CollaborationUse>() {
		public CollaborationUse apply(Classifier s) {
			return s.getRepresentation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getCollaborationUses()
	 * @generated
	 */
	public static final Function<Classifier, EList<CollaborationUse>> collaborationUse = new Function<Classifier, EList<CollaborationUse>>() {
		public EList<CollaborationUse> apply(Classifier s) {
			return s.getCollaborationUses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getOwnedUseCases()
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> ownedUseCase = new Function<Classifier, EList<UseCase>>() {
		public EList<UseCase> apply(Classifier s) {
			return s.getOwnedUseCases();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getUseCases()
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> useCase = new Function<Classifier, EList<UseCase>>() {
		public EList<UseCase> apply(Classifier s) {
			return s.getUseCases();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.Type#createAssociation()
	 * @generated
	 */
	public static Function<Type, Association> createAssociation(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Type end1Type, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
		return TypePath.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * @see org.eclipse.uml2.uml.Type#getAssociations()
	 * @generated
	 */
	public static final Function<Type, EList<Association>> getAssociations = TypePath.getAssociations;

	/**
	 * @see org.eclipse.uml2.uml.Type#conformsTo()
	 * @generated
	 */
	public static Predicate<Type> conformsTo(final Type other) {
		return TypePath.conformsTo(other);
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * @see org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization()
	 * @generated
	 */
	public static Predicate<Classifier> validateNoCyclesInGeneralization(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.validateNoCyclesInGeneralization(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#validateGeneralizationHierarchies()
	 * @generated
	 */
	public static Predicate<Classifier> validateGeneralizationHierarchies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.validateGeneralizationHierarchies(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#validateSpecializeType()
	 * @generated
	 */
	public static Predicate<Classifier> validateSpecializeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.validateSpecializeType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet()
	 * @generated
	 */
	public static Predicate<Classifier> validateMapsToGeneralizationSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.validateMapsToGeneralizationSet(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getAllAttributes()
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> getAllAttributes = new Function<Classifier, EList<Property>>() {
		public EList<Property> apply(Classifier s) {
			return s.getAllAttributes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getOperations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getOperations = new Function<Classifier, EList<Operation>>() {
		public EList<Operation> apply(Classifier s) {
			return s.getOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getAllOperations()
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getAllOperations = new Function<Classifier, EList<Operation>>() {
		public EList<Operation> apply(Classifier s) {
			return s.getAllOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getOperation()
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
	 * @see org.eclipse.uml2.uml.Classifier#getOperation()
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
	 * @see org.eclipse.uml2.uml.Classifier#getUsedInterfaces()
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getUsedInterfaces = new Function<Classifier, EList<Interface>>() {
		public EList<Interface> apply(Classifier s) {
			return s.getUsedInterfaces();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces()
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getAllUsedInterfaces = new Function<Classifier, EList<Interface>>() {
		public EList<Interface> apply(Classifier s) {
			return s.getAllUsedInterfaces();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getGenerals()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> getGenerals = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getGenerals();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> getInheritedMembers = new Function<Classifier, EList<NamedElement>>() {
		public EList<NamedElement> apply(Classifier s) {
			return s.getInheritedMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#allFeatures()
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> allFeatures = new Function<Classifier, EList<Feature>>() {
		public EList<Feature> apply(Classifier s) {
			return s.allFeatures();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#parents()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> parents = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.parents();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Classifier#inheritableMembers()
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
	 * @see org.eclipse.uml2.uml.Classifier#hasVisibilityOf()
	 * @generated
	 */
	public static Predicate<Classifier> hasVisibilityOf(final NamedElement n) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.hasVisibilityOf(n);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#conformsTo()
	 * @generated
	 */
	public static Predicate<Classifier> conformsTo(final Classifier other) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.conformsTo(other);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#inherit()
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
	 * @see org.eclipse.uml2.uml.Classifier#maySpecializeType()
	 * @generated
	 */
	public static Predicate<Classifier> maySpecializeType(final Classifier c) {
		return new Predicate<Classifier>() {
			public boolean apply(Classifier s) {
				return s.maySpecializeType(c);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Classifier#allParents()
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> allParents = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.allParents();
		}
	};

}
