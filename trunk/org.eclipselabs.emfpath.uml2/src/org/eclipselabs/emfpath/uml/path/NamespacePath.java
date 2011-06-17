package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public final class NamespacePath {

	/**
	 * @generated
	 */
	private NamespacePath() {
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
	public static final Function<Namespace, EList<ElementImport>> elementImport = new Function<Namespace, EList<ElementImport>>() {
		public EList<ElementImport> apply(Namespace s) {
			return s.getElementImports();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = new Function<Namespace, EList<PackageImport>>() {
		public EList<PackageImport> apply(Namespace s) {
			return s.getPackageImports();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = new Function<Namespace, EList<Constraint>>() {
		public EList<Constraint> apply(Namespace s) {
			return s.getOwnedRules();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = new Function<Namespace, EList<NamedElement>>() {
		public EList<NamedElement> apply(Namespace s) {
			return s.getMembers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedMembers();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = new Function<Namespace, EList<NamedElement>>() {
		public EList<NamedElement> apply(Namespace s) {
			return s.getOwnedMembers();
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
		return new Predicate<Namespace>() {
			public boolean apply(Namespace s) {
				return s.validateMembersDistinguishable(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport /*false*/(final PackageableElement element, final VisibilityKind visibility) {
		return new Function<Namespace, ElementImport>() {
			public ElementImport apply(Namespace s) {
				return s.createElementImport(element, visibility);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport /*false*/(final Package package_, final VisibilityKind visibility) {
		return new Function<Namespace, PackageImport>() {
			public PackageImport apply(Namespace s) {
				return s.createPackageImport(package_, visibility);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements /*false*/ = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedElements();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages /*false*/ = new Function<Namespace, EList<Package>>() {
		public EList<Package> apply(Namespace s) {
			return s.getImportedPackages();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedMembers /*false*/ = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedMembers();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember /*false*/(final NamedElement element) {
		return new Function<Namespace, EList<String>>() {
			public EList<String> apply(Namespace s) {
				return s.getNamesOfMember(element);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Predicate<Namespace> membersAreDistinguishable = new Predicate<Namespace>() {
		public boolean apply(Namespace s) {
			return s.membersAreDistinguishable();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers /*false*/(final EList<PackageableElement> imps) {
		return new Function<Namespace, EList<PackageableElement>>() {
			public EList<PackageableElement> apply(Namespace s) {
				return s.importMembers(imps);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions /*false*/(final EList<PackageableElement> imps) {
		return new Function<Namespace, EList<PackageableElement>>() {
			public EList<PackageableElement> apply(Namespace s) {
				return s.excludeCollisions(imps);
			}
		};
	}

}
