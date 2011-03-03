package org.eclipse.uml2.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.DiagnosticChain;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.emf.ecore.EPackage;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.TemplateableElement;

public class ProfilePath {

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
	public static final Function<Package, EList<Type>> ownedType = PackagePath.ownedType;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageMerge>> packageMerge = PackagePath.packageMerge;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> packagedElement = PackagePath.packagedElement;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Package>> nestedPackage = PackagePath.nestedPackage;

	/**
	 * @generated
	 */
	public static final Function<Package, Package> nestingPackage = PackagePath.nestingPackage;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> profileApplication = PackagePath.profileApplication;

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
	public static final Function<Profile, EList<Stereotype>> ownedStereotype = new Function<Profile, EList<Stereotype>>() {
		public EList<Stereotype> apply(Profile s) {
			return s.getOwnedStereotypes();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Profile, EList<ElementImport>> metaclassReference = new Function<Profile, EList<ElementImport>>() {
		public EList<ElementImport> apply(Profile s) {
			return s.getMetaclassReferences();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Profile, EList<PackageImport>> metamodelReference = new Function<Profile, EList<PackageImport>>() {
		public EList<PackageImport> apply(Profile s) {
			return s.getMetamodelReferences();
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
	public static Predicate<Package> validateElementsPublicOrPrivate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PackagePath.validateElementsPublicOrPrivate(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<Package, Class> createOwnedClass(final String name, final boolean isAbstract) {
		return PackagePath.createOwnedClass(name, isAbstract);
	}

	/**
	 * @generated
	 */
	public static Function<Package, Enumeration> createOwnedEnumeration(final String name) {
		return PackagePath.createOwnedEnumeration(name);
	}

	/**
	 * @generated
	 */
	public static Function<Package, PrimitiveType> createOwnedPrimitiveType(final String name) {
		return PackagePath.createOwnedPrimitiveType(name);
	}

	/**
	 * @generated
	 */
	public static Function<Package, Interface> createOwnedInterface(final String name) {
		return PackagePath.createOwnedInterface(name);
	}

	/**
	 * @generated
	 */
	public static Predicate<Package> isProfileApplied(final Profile profile) {
		return PackagePath.isProfileApplied(profile);
	}

	/**
	 * @generated
	 */
	public static Function<Package, EList<EObject>> applyProfile(final Profile profile) {
		return PackagePath.applyProfile(profile);
	}

	/**
	 * @generated
	 */
	public static Function<Package, EList<EObject>> unapplyProfile(final Profile profile) {
		return PackagePath.unapplyProfile(profile);
	}

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAppliedProfiles = PackagePath.getAppliedProfiles;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAllAppliedProfiles = PackagePath.getAllAppliedProfiles;

	/**
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile(final String qualifiedName) {
		return PackagePath.getAppliedProfile(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile(final String qualifiedName, final boolean recurse) {
		return PackagePath.getAppliedProfile(qualifiedName, recurse);
	}

	/**
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> getAllProfileApplications = PackagePath.getAllProfileApplications;

	/**
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication(final Profile profile) {
		return PackagePath.getProfileApplication(profile);
	}

	/**
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication(final Profile profile, final boolean recurse) {
		return PackagePath.getProfileApplication(profile, recurse);
	}

	/**
	 * @generated
	 */
	public static final Predicate<Package> isModelLibrary = PackagePath.isModelLibrary;

	/**
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> visibleMembers = PackagePath.visibleMembers;

	/**
	 * @generated
	 */
	public static Predicate<Package> makesVisible(final NamedElement el) {
		return PackagePath.makesVisible(el);
	}

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
	public static Predicate<Profile> validateMetaclassReferenceNotSpecialized(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Profile>() {
			public boolean apply(Profile s) {
				return s.validateMetaclassReferenceNotSpecialized(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<Profile> validateReferencesSameMetamodel(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Profile>() {
			public boolean apply(Profile s) {
				return s.validateReferencesSameMetamodel(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Profile, EObject> create(final Classifier classifier) {
		return new Function<Profile, EObject>() {
			public EObject apply(Profile s) {
				return s.create(classifier);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<Profile, Stereotype> createOwnedStereotype(final String name, final boolean isAbstract) {
		return new Function<Profile, Stereotype>() {
			public Stereotype apply(Profile s) {
				return s.createOwnedStereotype(name, isAbstract);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Predicate<Profile> isDefined = new Predicate<Profile>() {
		public boolean apply(Profile s) {
			return s.isDefined();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Profile, EPackage> define = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.define();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Profile, EPackage> define(final Map<String, String> options, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Function<Profile, EPackage>() {
			public EPackage apply(Profile s) {
				return s.define(options, diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Profile, EPackage> getDefinition = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.getDefinition();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Profile, ENamedElement> getDefinition(final NamedElement namedElement) {
		return new Function<Profile, ENamedElement>() {
			public ENamedElement apply(Profile s) {
				return s.getDefinition(namedElement);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<Profile, EList<Class>> getReferencedMetaclasses = new Function<Profile, EList<Class>>() {
		public EList<Class> apply(Profile s) {
			return s.getReferencedMetaclasses();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<Profile, EList<Model>> getReferencedMetamodels = new Function<Profile, EList<Model>>() {
		public EList<Model> apply(Profile s) {
			return s.getReferencedMetamodels();
		}
	};

	/**
	 * @generated
	 */
	public static Function<Profile, EList<Extension>> getOwnedExtensions(final boolean requiredOnly) {
		return new Function<Profile, EList<Extension>>() {
			public EList<Extension> apply(Profile s) {
				return s.getOwnedExtensions(requiredOnly);
			}
		};
	}

}
