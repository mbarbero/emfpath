package org.eclipse.uml2.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.DiagnosticChain;
import java.util.Map;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.TemplateableElement;

public class ClassifierPath {

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Element>> ownedElement = ElementPath.ownedElement;

	/**
	 * @generated
	 */
	public static final Function<Element, Element> owner = ElementPath.owner;

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Comment>> ownedComment = ElementPath.ownedComment;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> name = NamedElementPath.name;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, VisibilityKind> visibility = NamedElementPath.visibility;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> qualifiedName = NamedElementPath.qualifiedName;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Dependency>> clientDependency = NamedElementPath.clientDependency;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, Namespace> namespace = NamedElementPath.namespace;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, StringExpression> nameExpression = NamedElementPath.nameExpression;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<ElementImport>> elementImport = NamespacePath.elementImport;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = NamespacePath.packageImport;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = NamespacePath.ownedRule;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = NamespacePath.member;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = NamespacePath.importedMember;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = NamespacePath.ownedMember;

	/**
	 * @generated
	 */
	public static final Function<Type, Package> package_ = TypePath.package_;

	/**
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @generated
	 */
	public static final Predicate<Classifier> isAbstract = new Predicate<Classifier>() {
		public boolean apply(Classifier s) {
			return s.isAbstract();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Generalization>> generalization = new Function<Classifier, EList<Generalization>>() {
		public EList<Generalization> apply(Classifier s) {
			return s.getGeneralizations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<GeneralizationSet>> powertypeExtent = new Function<Classifier, EList<GeneralizationSet>>() {
		public EList<GeneralizationSet> apply(Classifier s) {
			return s.getPowertypeExtents();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> feature = new Function<Classifier, EList<Feature>>() {
		public EList<Feature> apply(Classifier s) {
			return s.getFeatures();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> inheritedMember = new Function<Classifier, EList<NamedElement>>() {
		public EList<NamedElement> apply(Classifier s) {
			return s.getInheritedMembers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> redefinedClassifier = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getRedefinedClassifiers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> general = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getGenerals();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Substitution>> substitution = new Function<Classifier, EList<Substitution>>() {
		public EList<Substitution> apply(Classifier s) {
			return s.getSubstitutions();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> attribute = new Function<Classifier, EList<Property>>() {
		public EList<Property> apply(Classifier s) {
			return s.getAttributes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, CollaborationUse> representation = new Function<Classifier, CollaborationUse>() {
		public CollaborationUse apply(Classifier s) {
			return s.getRepresentation();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<CollaborationUse>> collaborationUse = new Function<Classifier, EList<CollaborationUse>>() {
		public EList<CollaborationUse> apply(Classifier s) {
			return s.getCollaborationUses();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> ownedUseCase = new Function<Classifier, EList<UseCase>>() {
		public EList<UseCase> apply(Classifier s) {
			return s.getOwnedUseCases();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> useCase = new Function<Classifier, EList<UseCase>>() {
		public EList<UseCase> apply(Classifier s) {
			return s.getUseCases();
		}
	};
	
	/**
	 * @generated
	 */
	public static Predicate<Element> validateNotOwnSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ElementPath.validateNotOwnSelf(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> validateHasOwner(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ElementPath.validateHasOwner(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> hasKeyword(final String keyword) {
		return ElementPath.hasKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<String>> getKeywords = ElementPath.getKeywords;

	/**
	 * @generated
	 */
	public static Predicate<Element> addKeyword(final String keyword) {
		return ElementPath.addKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> removeKeyword(final String keyword) {
		return ElementPath.removeKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, Package> getNearestPackage = ElementPath.getNearestPackage;

	/**
	 * @generated
	 */
	public static final Function<Element, Model> getModel = ElementPath.getModel;

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplicable(final Stereotype stereotype) {
		return ElementPath.isStereotypeApplicable(stereotype);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeRequired(final Stereotype stereotype) {
		return ElementPath.isStereotypeRequired(stereotype);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplied(final Stereotype stereotype) {
		return ElementPath.isStereotypeApplied(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EObject> applyStereotype(final Stereotype stereotype) {
		return ElementPath.applyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EObject> unapplyStereotype(final Stereotype stereotype) {
		return ElementPath.unapplyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getApplicableStereotypes = ElementPath.getApplicableStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getApplicableStereotype(final String qualifiedName) {
		return ElementPath.getApplicableStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<EObject>> getStereotypeApplications = ElementPath.getStereotypeApplications;

	/**
	 * @generated
	 */
	public static Function<Element, EObject> getStereotypeApplication(final Stereotype stereotype) {
		return ElementPath.getStereotypeApplication(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getRequiredStereotypes = ElementPath.getRequiredStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getRequiredStereotype(final String qualifiedName) {
		return ElementPath.getRequiredStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getAppliedStereotypes = ElementPath.getAppliedStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedStereotype(final String qualifiedName) {
		return ElementPath.getAppliedStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EList<Stereotype>> getAppliedSubstereotypes(final Stereotype stereotype) {
		return ElementPath.getAppliedSubstereotypes(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedSubstereotype(final Stereotype stereotype, final String qualifiedName) {
		return ElementPath.getAppliedSubstereotype(stereotype, qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> hasValue(final Stereotype stereotype, final String propertyName) {
		return ElementPath.hasValue(stereotype, propertyName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Object> getValue(final Stereotype stereotype, final String propertyName) {
		return ElementPath.getValue(stereotype, propertyName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EAnnotation> createEAnnotation(final String source) {
		return ElementPath.createEAnnotation(source);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Relationship>> getRelationships = ElementPath.getRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<Relationship>> getRelationships(final EClass eClass) {
		return ElementPath.getRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships = ElementPath.getSourceDirectedRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships(final EClass eClass) {
		return ElementPath.getSourceDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships = ElementPath.getTargetDirectedRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships(final EClass eClass) {
		return ElementPath.getTargetDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Element>> allOwnedElements = ElementPath.allOwnedElements;

	/**
	 * @generated
	 */
	public static final Predicate<Element> mustBeOwned = ElementPath.mustBeOwned;

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasNoQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateHasNoQualifiedName(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateHasQualifiedName(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateVisibilityNeedsOwnership(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateVisibilityNeedsOwnership(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Dependency> createDependency(final NamedElement supplier) {
		return NamedElementPath.createDependency(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel = NamedElementPath.getLabel;

	/**
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel(final boolean localize) {
		return NamedElementPath.getLabel(localize);
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage(final NamedElement supplier) {
		return NamedElementPath.createUsage(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName = NamedElementPath.getQualifiedName;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces = NamedElementPath.allNamespaces;

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
		return NamedElementPath.isDistinguishableFrom(n, ns);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> separator = NamedElementPath.separator;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages = NamedElementPath.allOwningPackages;

	/**
	 * @generated
	 */
	public static Predicate<Namespace> validateMembersDistinguishable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamespacePath.validateMembersDistinguishable(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport(final PackageableElement element, final VisibilityKind visibility) {
		return NamespacePath.createElementImport(element, visibility);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport(final Package package_, final VisibilityKind visibility) {
		return NamespacePath.createPackageImport(package_, visibility);
	}

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements = NamespacePath.getImportedElements;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages = NamespacePath.getImportedPackages;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedMembers = NamespacePath.getImportedMembers;

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember(final NamedElement element) {
		return NamespacePath.getNamesOfMember(element);
	}

	/**
	 * @generated
	 */
	public static final Predicate<Namespace> membersAreDistinguishable = NamespacePath.membersAreDistinguishable;

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers(final EList<PackageableElement> imps) {
		return NamespacePath.importMembers(imps);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions(final EList<PackageableElement> imps) {
		return NamespacePath.excludeCollisions(imps);
	}

	/**
	 * @generated
	 */
	public static Function<Type, Association> createAssociation(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Type end1Type, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
		return TypePath.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * @generated
	 */
	public static final Function<Type, EList<Association>> getAssociations = TypePath.getAssociations;

	/**
	 * @generated
	 */
	public static Predicate<Type> conformsTo(final Type other) {
		return TypePath.conformsTo(other);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
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
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> getAllAttributes = new Function<Classifier, EList<Property>>() {
		public EList<Property> apply(Classifier s) {
			return s.getAllAttributes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getOperations = new Function<Classifier, EList<Operation>>() {
		public EList<Operation> apply(Classifier s) {
			return s.getOperations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getAllOperations = new Function<Classifier, EList<Operation>>() {
		public EList<Operation> apply(Classifier s) {
			return s.getAllOperations();
		}
	};

	/**
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
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getUsedInterfaces = new Function<Classifier, EList<Interface>>() {
		public EList<Interface> apply(Classifier s) {
			return s.getUsedInterfaces();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getAllUsedInterfaces = new Function<Classifier, EList<Interface>>() {
		public EList<Interface> apply(Classifier s) {
			return s.getAllUsedInterfaces();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> getGenerals = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.getGenerals();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> getInheritedMembers = new Function<Classifier, EList<NamedElement>>() {
		public EList<NamedElement> apply(Classifier s) {
			return s.getInheritedMembers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> allFeatures = new Function<Classifier, EList<Feature>>() {
		public EList<Feature> apply(Classifier s) {
			return s.allFeatures();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> parents = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.parents();
		}
	};

	/**
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
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> allParents = new Function<Classifier, EList<Classifier>>() {
		public EList<Classifier> apply(Classifier s) {
			return s.allParents();
		}
	};

}
