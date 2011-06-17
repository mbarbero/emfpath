package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public final class LoopNodePath {

	/**
	 * @generated
	 */
	private LoopNodePath() {
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
	public static final Function<Action, EList<OutputPin>> output = ActionPath.output;

	/**
	 * @generated
	 */
	public static final Function<Action, EList<InputPin>> input = ActionPath.input;

	/**
	 * @generated
	 */
	public static final Function<Action, Classifier> context = ActionPath.context;

	/**
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPrecondition = ActionPath.localPrecondition;

	/**
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPostcondition = ActionPath.localPostcondition;

	/**
	 * @generated
	 */
	public static final Function<ExecutableNode, EList<ExceptionHandler>> handler = ExecutableNodePath.handler;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, StructuredActivityNode> inStructuredNode = ActivityNodePath.inStructuredNode;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, Activity> activity = ActivityNodePath.activity;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> outgoing = ActivityNodePath.outgoing;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> incoming = ActivityNodePath.incoming;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityPartition>> inPartition = ActivityNodePath.inPartition;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<InterruptibleActivityRegion>> inInterruptibleRegion = ActivityNodePath.inInterruptibleRegion;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityGroup>> inGroup = ActivityNodePath.inGroup;

	/**
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityNode>> redefinedNode = ActivityNodePath.redefinedNode;

	/**
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<Variable>> variable = StructuredActivityNodePath.variable;

	/**
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityEdge>> edge = StructuredActivityNodePath.edge;

	/**
	 * @generated
	 */
	public static final Predicate<StructuredActivityNode> isMustIsolate = StructuredActivityNodePath.isMustIsolate;

	/**
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityNode>> node = StructuredActivityNodePath.node;

	/**
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityGroup>> subgroup = ActivityGroupPath.subgroup;

	/**
	 * @generated
	 */
	public static final Function<ActivityGroup, ActivityGroup> superGroup = ActivityGroupPath.superGroup;

	/**
	 * @generated
	 */
	public static final Function<ActivityGroup, Activity> inActivity = ActivityGroupPath.inActivity;

	/**
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityEdge>> containedEdge = ActivityGroupPath.containedEdge;

	/**
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityNode>> containedNode = ActivityGroupPath.containedNode;

	/**
	 * @generated
	 */
	public static final Predicate<LoopNode> isTestedFirst = new Predicate<LoopNode>() {
		public boolean apply(LoopNode s) {
			return s.isTestedFirst();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> bodyPart = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getBodyParts();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> setupPart = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getSetupParts();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, OutputPin> decider = new Function<LoopNode, OutputPin>() {
		public OutputPin apply(LoopNode s) {
			return s.getDecider();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> test = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getTests();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> result = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getResults();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> loopVariable = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getLoopVariables();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> bodyOutput = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getBodyOutputs();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LoopNode, EList<InputPin>> loopVariableInput = new Function<LoopNode, EList<InputPin>>() {
		public EList<InputPin> apply(LoopNode s) {
			return s.getLoopVariableInputs();
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
	public static Predicate<ActivityNode> validateOwnedStructuredNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityNodePath.validateOwnedStructuredNode(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityNode> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityNodePath.validateOwned(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<StructuredActivityNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return StructuredActivityNodePath.validateEdges(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNodesAndEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateNodesAndEdges(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateNotContained(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateGroupOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateGroupOwned(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LoopNode> validateInputEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateInputEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<LoopNode> validateBodyOutputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateBodyOutputPins(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<LoopNode> validateResultNoIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateResultNoIncoming(diagnostics, context);
			}
		};
	}

}
