package org.eclipse.uml2.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.emf.common.util.DiagnosticChain;
import java.util.Map;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Classifier;
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
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Feature;

public class OperationPath {

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
	public static final Predicate<Feature> isStatic = FeaturePath.isStatic;

	/**
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = FeaturePath.featuringClassifier;

	/**
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Parameter>> ownedParameter = BehavioralFeaturePath.ownedParameter;

	/**
	 * @generated
	 */
	public static final Predicate<BehavioralFeature> isAbstract = BehavioralFeaturePath.isAbstract;

	/**
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Behavior>> method = BehavioralFeaturePath.method;

	/**
	 * @generated
	 */
	public static final Function<BehavioralFeature, CallConcurrencyKind> concurrency = BehavioralFeaturePath.concurrency;

	/**
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Type>> raisedException = BehavioralFeaturePath.raisedException;

	/**
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<ParameterSet>> ownedParameterSet = BehavioralFeaturePath.ownedParameterSet;

	/**
	 * @generated
	 */
	public static final Function<Operation, Interface> interface_ = new Function<Operation, Interface>() {
		public Interface apply(Operation s) {
			return s.getInterface();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, Class> class_ = new Function<Operation, Class>() {
		public Class apply(Operation s) {
			return s.getClass_();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<Operation> isQuery = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isQuery();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<Operation> isOrdered = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isOrdered();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<Operation> isUnique = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isUnique();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> precondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPreconditions();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> postcondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPostconditions();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, EList<Operation>> redefinedOperation = new Function<Operation, EList<Operation>>() {
		public EList<Operation> apply(Operation s) {
			return s.getRedefinedOperations();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, DataType> datatype = new Function<Operation, DataType>() {
		public DataType apply(Operation s) {
			return s.getDatatype();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, Constraint> bodyCondition = new Function<Operation, Constraint>() {
		public Constraint apply(Operation s) {
			return s.getBodyCondition();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, Type> type = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
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
	public static Function<BehavioralFeature, Parameter> createReturnResult(final String name, final Type type) {
		return BehavioralFeaturePath.createReturnResult(name, type);
	}

	/**
	 * @generated
	 */
	public static Predicate<Operation> validateAtMostOneReturn(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Operation>() {
			public boolean apply(Operation s) {
				return s.validateAtMostOneReturn(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<Operation> validateOnlyBodyForQuery(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Operation>() {
			public boolean apply(Operation s) {
				return s.validateOnlyBodyForQuery(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getLower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getUpper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, Parameter> getReturnResult = new Function<Operation, Parameter>() {
		public Parameter apply(Operation s) {
			return s.getReturnResult();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lowerBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.lowerBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upperBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.upperBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, Type> getType = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Operation, EList<Parameter>> returnResult = new Function<Operation, EList<Parameter>>() {
		public EList<Parameter> apply(Operation s) {
			return s.returnResult();
		}
	};

}
