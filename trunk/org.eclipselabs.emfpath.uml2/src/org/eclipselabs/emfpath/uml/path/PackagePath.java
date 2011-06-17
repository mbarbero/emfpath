package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public final class PackagePath {

	/**
	 * @generated
	 */
	private PackagePath() {
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
	public static final Function<Package, EList<Type>> ownedType = new Function<Package, EList<Type>>() {
		public EList<Type> apply(Package s) {
			return s.getOwnedTypes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageMerge>> packageMerge = new Function<Package, EList<PackageMerge>>() {
		public EList<PackageMerge> apply(Package s) {
			return s.getPackageMerges();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> packagedElement = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.getPackagedElements();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Package>> nestedPackage = new Function<Package, EList<Package>>() {
		public EList<Package> apply(Package s) {
			return s.getNestedPackages();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, Package> nestingPackage = new Function<Package, Package>() {
		public Package apply(Package s) {
			return s.getNestingPackage();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> profileApplication = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getProfileApplications();
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
	public static Predicate<Package> validateElementsPublicOrPrivate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Package>() {
			public boolean apply(Package s) {
				return s.validateElementsPublicOrPrivate(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, Class> createOwnedClass /*false*/(final String name, final boolean isAbstract) {
		return new Function<Package, Class>() {
			public Class apply(Package s) {
				return s.createOwnedClass(name, isAbstract);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, Enumeration> createOwnedEnumeration /*false*/(final String name) {
		return new Function<Package, Enumeration>() {
			public Enumeration apply(Package s) {
				return s.createOwnedEnumeration(name);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, PrimitiveType> createOwnedPrimitiveType /*false*/(final String name) {
		return new Function<Package, PrimitiveType>() {
			public PrimitiveType apply(Package s) {
				return s.createOwnedPrimitiveType(name);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, Interface> createOwnedInterface /*false*/(final String name) {
		return new Function<Package, Interface>() {
			public Interface apply(Package s) {
				return s.createOwnedInterface(name);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<Package> isProfileApplied(final Profile profile) {
		return new Predicate<Package>() {
			public boolean apply(Package s) {
				return s.isProfileApplied(profile);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, EList<EObject>> applyProfile /*false*/(final Profile profile) {
		return new Function<Package, EList<EObject>>() {
			public EList<EObject> apply(Package s) {
				return s.applyProfile(profile);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, EList<EObject>> unapplyProfile /*false*/(final Profile profile) {
		return new Function<Package, EList<EObject>>() {
			public EList<EObject> apply(Package s) {
				return s.unapplyProfile(profile);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAppliedProfiles /*false*/ = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAppliedProfiles();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAllAppliedProfiles /*false*/ = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAllAppliedProfiles();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile /*false*/(final String qualifiedName) {
		return new Function<Package, Profile>() {
			public Profile apply(Package s) {
				return s.getAppliedProfile(qualifiedName);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile /*false*/(final String qualifiedName, final boolean recurse) {
		return new Function<Package, Profile>() {
			public Profile apply(Package s) {
				return s.getAppliedProfile(qualifiedName, recurse);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> getAllProfileApplications /*false*/ = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getAllProfileApplications();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication /*false*/(final Profile profile) {
		return new Function<Package, ProfileApplication>() {
			public ProfileApplication apply(Package s) {
				return s.getProfileApplication(profile);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication /*false*/(final Profile profile, final boolean recurse) {
		return new Function<Package, ProfileApplication>() {
			public ProfileApplication apply(Package s) {
				return s.getProfileApplication(profile, recurse);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Predicate<Package> isModelLibrary = new Predicate<Package>() {
		public boolean apply(Package s) {
			return s.isModelLibrary();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> visibleMembers /*false*/ = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.visibleMembers();
		}
	};

	/**
	 * @generated
	 */
	public static Predicate<Package> makesVisible(final NamedElement el) {
		return new Predicate<Package>() {
			public boolean apply(Package s) {
				return s.makesVisible(el);
			}
		};
	}

}
