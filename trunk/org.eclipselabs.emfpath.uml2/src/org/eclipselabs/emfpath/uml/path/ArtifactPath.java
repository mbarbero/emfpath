package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public final class ArtifactPath {

	/**
	 * @generated
	 */
	private ArtifactPath() {
		// prevent instantiation
	}

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
	public static final Predicate<Classifier> isAbstract = ClassifierPath.isAbstract;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Generalization>> generalization = ClassifierPath.generalization;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<GeneralizationSet>> powertypeExtent = ClassifierPath.powertypeExtent;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> feature = ClassifierPath.feature;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> inheritedMember = ClassifierPath.inheritedMember;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> redefinedClassifier = ClassifierPath.redefinedClassifier;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> general = ClassifierPath.general;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Substitution>> substitution = ClassifierPath.substitution;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> attribute = ClassifierPath.attribute;

	/**
	 * @generated
	 */
	public static final Function<Classifier, CollaborationUse> representation = ClassifierPath.representation;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<CollaborationUse>> collaborationUse = ClassifierPath.collaborationUse;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> ownedUseCase = ClassifierPath.ownedUseCase;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<UseCase>> useCase = ClassifierPath.useCase;

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
	public static final Function<Artifact, String> fileName = new Function<Artifact, String>() {
		public String apply(Artifact s) {
			return s.getFileName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Artifact, EList<Artifact>> nestedArtifact = new Function<Artifact, EList<Artifact>>() {
		public EList<Artifact> apply(Artifact s) {
			return s.getNestedArtifacts();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Artifact, EList<Manifestation>> manifestation = new Function<Artifact, EList<Manifestation>>() {
		public EList<Manifestation> apply(Artifact s) {
			return s.getManifestations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Artifact, EList<Operation>> ownedOperation = new Function<Artifact, EList<Operation>>() {
		public EList<Operation> apply(Artifact s) {
			return s.getOwnedOperations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Artifact, EList<Property>> ownedAttribute = new Function<Artifact, EList<Property>>() {
		public EList<Property> apply(Artifact s) {
			return s.getOwnedAttributes();
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
	public static final Function<Element, EList<String>> getKeywords /*false*/ = ElementPath.getKeywords /*false*/;

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
	public static final Function<Element, Package> getNearestPackage /*false*/ = ElementPath.getNearestPackage /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Element, Model> getModel /*false*/ = ElementPath.getModel /*false*/;

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
	public static Function<Element, EObject> applyStereotype /*false*/(final Stereotype stereotype) {
		return ElementPath.applyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EObject> unapplyStereotype /*false*/(final Stereotype stereotype) {
		return ElementPath.unapplyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getApplicableStereotypes /*false*/ = ElementPath.getApplicableStereotypes /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getApplicableStereotype /*false*/(final String qualifiedName) {
		return ElementPath.getApplicableStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<EObject>> getStereotypeApplications /*false*/ = ElementPath.getStereotypeApplications /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, EObject> getStereotypeApplication /*false*/(final Stereotype stereotype) {
		return ElementPath.getStereotypeApplication(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getRequiredStereotypes /*false*/ = ElementPath.getRequiredStereotypes /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getRequiredStereotype /*false*/(final String qualifiedName) {
		return ElementPath.getRequiredStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getAppliedStereotypes /*false*/ = ElementPath.getAppliedStereotypes /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedStereotype /*false*/(final String qualifiedName) {
		return ElementPath.getAppliedStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EList<Stereotype>> getAppliedSubstereotypes /*false*/(final Stereotype stereotype) {
		return ElementPath.getAppliedSubstereotypes(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedSubstereotype /*false*/(final Stereotype stereotype, final String qualifiedName) {
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
	public static Function<Element, Object> getValue /*false*/(final Stereotype stereotype, final String propertyName) {
		return ElementPath.getValue(stereotype, propertyName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EAnnotation> createEAnnotation /*false*/(final String source) {
		return ElementPath.createEAnnotation(source);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Relationship>> getRelationships /*false*/ = ElementPath.getRelationships /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, EList<Relationship>> getRelationships /*false*/(final EClass eClass) {
		return ElementPath.getRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships /*false*/ = ElementPath.getSourceDirectedRelationships /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships /*false*/(final EClass eClass) {
		return ElementPath.getSourceDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships /*false*/ = ElementPath.getTargetDirectedRelationships /*false*/;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships /*false*/(final EClass eClass) {
		return ElementPath.getTargetDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Element>> allOwnedElements /*false*/ = ElementPath.allOwnedElements /*false*/;

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
	public static Function<NamedElement, Dependency> createDependency /*false*/(final NamedElement supplier) {
		return NamedElementPath.createDependency(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel /*false*/ = NamedElementPath.getLabel /*false*/;

	/**
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel /*false*/(final boolean localize) {
		return NamedElementPath.getLabel(localize);
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage /*false*/(final NamedElement supplier) {
		return NamedElementPath.createUsage(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName /*false*/ = NamedElementPath.getQualifiedName /*false*/;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces /*false*/ = NamedElementPath.allNamespaces /*false*/;

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
		return NamedElementPath.isDistinguishableFrom(n, ns);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> separator /*false*/ = NamedElementPath.separator /*false*/;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages /*false*/ = NamedElementPath.allOwningPackages /*false*/;

	/**
	 * @generated
	 */
	public static Predicate<Namespace> validateMembersDistinguishable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamespacePath.validateMembersDistinguishable(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport /*false*/(final PackageableElement element, final VisibilityKind visibility) {
		return NamespacePath.createElementImport(element, visibility);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport /*false*/(final Package package_, final VisibilityKind visibility) {
		return NamespacePath.createPackageImport(package_, visibility);
	}

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements /*false*/ = NamespacePath.getImportedElements /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages /*false*/ = NamespacePath.getImportedPackages /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedMembers /*false*/ = NamespacePath.getImportedMembers /*false*/;

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember /*false*/(final NamedElement element) {
		return NamespacePath.getNamesOfMember(element);
	}

	/**
	 * @generated
	 */
	public static final Predicate<Namespace> membersAreDistinguishable = NamespacePath.membersAreDistinguishable;

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers /*false*/(final EList<PackageableElement> imps) {
		return NamespacePath.importMembers(imps);
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions /*false*/(final EList<PackageableElement> imps) {
		return NamespacePath.excludeCollisions(imps);
	}

	/**
	 * @generated
	 */
	public static Function<Type, Association> createAssociation /*false*/(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Type end1Type, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
		return TypePath.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * @generated
	 */
	public static final Function<Type, EList<Association>> getAssociations /*false*/ = TypePath.getAssociations /*false*/;

	/**
	 * @generated
	 */
	public static Predicate<Type> conformsTo(final Type other) {
		return TypePath.conformsTo(other);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> validateNoCyclesInGeneralization(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ClassifierPath.validateNoCyclesInGeneralization(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> validateGeneralizationHierarchies(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ClassifierPath.validateGeneralizationHierarchies(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> validateSpecializeType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ClassifierPath.validateSpecializeType(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> validateMapsToGeneralizationSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ClassifierPath.validateMapsToGeneralizationSet(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Property>> getAllAttributes /*false*/ = ClassifierPath.getAllAttributes /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getOperations /*false*/ = ClassifierPath.getOperations /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Operation>> getAllOperations /*false*/ = ClassifierPath.getAllOperations /*false*/;

	/**
	 * @generated
	 */
	public static Function<Classifier, Operation> getOperation /*false*/(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes) {
		return ClassifierPath.getOperation(name, parameterNames, parameterTypes);
	}

	/**
	 * @generated
	 */
	public static Function<Classifier, Operation> getOperation /*false*/(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final boolean ignoreCase) {
		return ClassifierPath.getOperation(name, parameterNames, parameterTypes, ignoreCase);
	}

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getUsedInterfaces /*false*/ = ClassifierPath.getUsedInterfaces /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Interface>> getAllUsedInterfaces /*false*/ = ClassifierPath.getAllUsedInterfaces /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> getGenerals /*false*/ = ClassifierPath.getGenerals /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<NamedElement>> getInheritedMembers /*false*/ = ClassifierPath.getInheritedMembers /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Feature>> allFeatures /*false*/ = ClassifierPath.allFeatures /*false*/;

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> parents /*false*/ = ClassifierPath.parents /*false*/;

	/**
	 * @generated
	 */
	public static Function<Classifier, EList<NamedElement>> inheritableMembers /*false*/(final Classifier c) {
		return ClassifierPath.inheritableMembers(c);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> hasVisibilityOf(final NamedElement n) {
		return ClassifierPath.hasVisibilityOf(n);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> conformsTo(final Classifier other) {
		return ClassifierPath.conformsTo(other);
	}

	/**
	 * @generated
	 */
	public static Function<Classifier, EList<NamedElement>> inherit /*false*/(final EList<NamedElement> inhs) {
		return ClassifierPath.inherit(inhs);
	}

	/**
	 * @generated
	 */
	public static Predicate<Classifier> maySpecializeType(final Classifier c) {
		return ClassifierPath.maySpecializeType(c);
	}

	/**
	 * @generated
	 */
	public static final Function<Classifier, EList<Classifier>> allParents /*false*/ = ClassifierPath.allParents /*false*/;

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
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements /*false*/ = TemplateableElementPath.parameterableElements /*false*/;

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
	public static Function<Artifact, Operation> createOwnedOperation /*false*/(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final Type returnType) {
		return new Function<Artifact, Operation>() {
			public Operation apply(Artifact s) {
				return s.createOwnedOperation(name, parameterNames, parameterTypes, returnType);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Artifact, Property> createOwnedAttribute /*false*/(final String name, final Type type, final int lower, final int upper) {
		return new Function<Artifact, Property>() {
			public Property apply(Artifact s) {
				return s.createOwnedAttribute(name, type, lower, upper);
			}
		};
	}

}