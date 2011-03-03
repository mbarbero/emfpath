package org.eclipse.uml2.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.DiagnosticChain;
import java.util.Map;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.RedefinableElement;
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
import org.eclipse.uml2.uml.ObjectFlow;

public class ObjectFlowPath {

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
	public static final Function<ActivityEdge, ActivityNode> source = ActivityEdgePath.source;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, ActivityNode> target = ActivityEdgePath.target;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityEdge>> redefinedEdge = ActivityEdgePath.redefinedEdge;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityPartition>> inPartition = ActivityEdgePath.inPartition;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> guard = ActivityEdgePath.guard;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> weight = ActivityEdgePath.weight;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, InterruptibleActivityRegion> interrupts = ActivityEdgePath.interrupts;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, StructuredActivityNode> inStructuredNode = ActivityEdgePath.inStructuredNode;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityGroup>> inGroup = ActivityEdgePath.inGroup;

	/**
	 * @generated
	 */
	public static final Function<ActivityEdge, Activity> activity = ActivityEdgePath.activity;

	/**
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMulticast = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMulticast();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMultireceive = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMultireceive();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> transformation = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getTransformation();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> selection = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getSelection();
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
	public static Predicate<ActivityEdge> validateSourceAndTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityEdgePath.validateSourceAndTarget(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityEdge> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityEdgePath.validateOwned(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ActivityEdge> validateStructuredNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityEdgePath.validateStructuredNode(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateNoActions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateNoActions(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateCompatibleTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateCompatibleTypes(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSameUpperBounds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSameUpperBounds(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTarget(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTransformationBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTransformationBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSelectionBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSelectionBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateInputAndOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateInputAndOutputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateIsMulticastOrIsMultireceive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateIsMulticastOrIsMultireceive(diagnostics, context);
			}
		};
	}

}
