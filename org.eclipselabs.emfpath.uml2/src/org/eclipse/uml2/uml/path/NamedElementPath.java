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
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Comment;

public class NamedElementPath {

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
	public static final Function<NamedElement, String> name = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, VisibilityKind> visibility = new Function<NamedElement, VisibilityKind>() {
		public VisibilityKind apply(NamedElement s) {
			return s.getVisibility();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> qualifiedName = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getQualifiedName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Dependency>> clientDependency = new Function<NamedElement, EList<Dependency>>() {
		public EList<Dependency> apply(NamedElement s) {
			return s.getClientDependencies();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, Namespace> namespace = new Function<NamedElement, Namespace>() {
		public Namespace apply(NamedElement s) {
			return s.getNamespace();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, StringExpression> nameExpression = new Function<NamedElement, StringExpression>() {
		public StringExpression apply(NamedElement s) {
			return s.getNameExpression();
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
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateHasNoQualifiedName(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateHasQualifiedName(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateVisibilityNeedsOwnership(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateVisibilityNeedsOwnership(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Dependency> createDependency(final NamedElement supplier) {
		return new Function<NamedElement, Dependency>() {
			public Dependency apply(NamedElement s) {
				return s.createDependency(supplier);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getLabel();
		}
	};

	/**
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel(final boolean localize) {
		return new Function<NamedElement, String>() {
			public String apply(NamedElement s) {
				return s.getLabel(localize);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage(final NamedElement supplier) {
		return new Function<NamedElement, Usage>() {
			public Usage apply(NamedElement s) {
				return s.createUsage(supplier);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getQualifiedName();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces = new Function<NamedElement, EList<Namespace>>() {
		public EList<Namespace> apply(NamedElement s) {
			return s.allNamespaces();
		}
	};

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.isDistinguishableFrom(n, ns);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> separator = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.separator();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages = new Function<NamedElement, EList<Package>>() {
		public EList<Package> apply(NamedElement s) {
			return s.allOwningPackages();
		}
	};

}
