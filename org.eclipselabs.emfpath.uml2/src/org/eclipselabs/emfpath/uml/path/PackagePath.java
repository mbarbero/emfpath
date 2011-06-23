package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Package Package} in a functional way.
 * <p>
 * A package is used to group elements, and provides a namespace for the grouped elements.
A
 * package can have one or more profile applications to indicate which profiles have
 * been applied. Because a profile is a package, it is possible to apply a profile not
 * only to packages, but also to profiles.
Package specializes TemplateableElement and
 * PackageableElement specializes ParameterableElement to specify that a package can
 * be used as a template and a PackageableElement as a template parameter. 
 * @see org.eclipse.uml2.uml.Package
 * @generated
 */
public class PackagePath extends NamespacePath {

	/**
	 * @generated
	 */
	 PackagePath() {
		super();
	}

	/**
	 * The formal template parameter that owns this element. 
	 *
	 * @see ParameterableElementPath#owningTemplateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 *
	 * @see ParameterableElementPath#templateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * The optional bindings from this element to templates. 
	 *
	 * @see TemplateableElementPath#templateBinding()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * The optional template signature specifying the formal template parameters. 
	 *
	 * @see TemplateableElementPath#ownedTemplateSignature()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * References the packaged elements that are Types. 
	 * @see org.eclipse.uml2.uml.Package#getOwnedTypes()
	 * @generated
	 */
	public static final Function<Package, EList<Type>> ownedType = new Function<Package, EList<Type>>() {
		public EList<Type> apply(Package s) {
			return s.getOwnedTypes();
		}
	};

	/**
	 * References the PackageMerges that are owned by this Package. 
	 * @see org.eclipse.uml2.uml.Package#getPackageMerges()
	 * @generated
	 */
	public static final Function<Package, EList<PackageMerge>> packageMerge = new Function<Package, EList<PackageMerge>>() {
		public EList<PackageMerge> apply(Package s) {
			return s.getPackageMerges();
		}
	};

	/**
	 * Specifies the packageable elements that are owned by this Package. 
	 * @see org.eclipse.uml2.uml.Package#getPackagedElements()
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> packagedElement = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.getPackagedElements();
		}
	};

	/**
	 * References the packaged elements that are Packages. 
	 * @see org.eclipse.uml2.uml.Package#getNestedPackages()
	 * @generated
	 */
	public static final Function<Package, EList<Package>> nestedPackage = new Function<Package, EList<Package>>() {
		public EList<Package> apply(Package s) {
			return s.getNestedPackages();
		}
	};

	/**
	 * References the Package that owns this Package. 
	 * @see org.eclipse.uml2.uml.Package#getNestingPackage()
	 * @generated
	 */
	public static final Function<Package, Package> nestingPackage = new Function<Package, Package>() {
		public Package apply(Package s) {
			return s.getNestingPackage();
		}
	};

	/**
	 * References the ProfileApplications that indicate which profiles have been applied
	 * to the Package. 
	 * @see org.eclipse.uml2.uml.Package#getProfileApplications()
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> profileApplication = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getProfileApplications();
		}
	};
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 *
	 * @see ParameterableElementPath#isCompatibleWith()
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * The query parameterableElements() returns the set of elements that may be used as
	 * the parametered elements for a template parameter of this templateable element. By
	 * default, this set includes all the owned elements. Subclasses may override this operation
	 * if they choose to restrict the set of parameterable elements.
	result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 *
	 * @see TemplateableElementPath#parameterableElements()
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * The query isTemplate() returns whether this templateable element is actually a template.
	result
	 * = ownedTemplateSignature->notEmpty() 
	 *
	 * @see TemplateableElementPath#isTemplate()
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * If an element that is owned by a package has visibility, it is public or private.
	self.ownedElements->forAll(e
	 * | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * @see org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(DiagnosticChain, Map)
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
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
	 * @see org.eclipse.uml2.uml.Package#createOwnedClass(String, boolean)
	 * @generated
	 */
	public static Function<Package, Class> createOwnedClass(final String name, final boolean isAbstract) {
		return new Function<Package, Class>() {
			public Class apply(Package s) {
				return s.createOwnedClass(name, isAbstract);
			}
		};
	}

	/**
	 * Creates a enumeration with the specified name as an owned type of this package. 
	 * @see org.eclipse.uml2.uml.Package#createOwnedEnumeration(String)
	 * @generated
	 */
	public static Function<Package, Enumeration> createOwnedEnumeration(final String name) {
		return new Function<Package, Enumeration>() {
			public Enumeration apply(Package s) {
				return s.createOwnedEnumeration(name);
			}
		};
	}

	/**
	 * Creates a primitive type with the specified name as an owned type of this package.
	 * @see org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(String)
	 * @generated
	 */
	public static Function<Package, PrimitiveType> createOwnedPrimitiveType(final String name) {
		return new Function<Package, PrimitiveType>() {
			public PrimitiveType apply(Package s) {
				return s.createOwnedPrimitiveType(name);
			}
		};
	}

	/**
	 * Creates an interface with the specified name as an owned type of this package. 
	 * @see org.eclipse.uml2.uml.Package#createOwnedInterface(String)
	 * @generated
	 */
	public static Function<Package, Interface> createOwnedInterface(final String name) {
		return new Function<Package, Interface>() {
			public Interface apply(Package s) {
				return s.createOwnedInterface(name);
			}
		};
	}

	/**
	 * Determines whether the specified profile is applied to this package. 
	 * @see org.eclipse.uml2.uml.Package#isProfileApplied(Profile)
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
	 * Applies the current definition of the specified profile to this package and automatically
	 * applies required stereotypes in the profile to elements within this package's namespace
	 * hieararchy. If a different definition is already applied, automatically migrates any
	 * associated stereotype values on a "best effort" basis (matching classifiers and structural
	 * features by name). 
	 * @see org.eclipse.uml2.uml.Package#applyProfile(Profile)
	 * @generated
	 */
	public static Function<Package, EList<EObject>> applyProfile(final Profile profile) {
		return new Function<Package, EList<EObject>>() {
			public EList<EObject> apply(Package s) {
				return s.applyProfile(profile);
			}
		};
	}

	/**
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes
	 * in the profile from elements within this package's namespace hieararchy. 
	 * @see org.eclipse.uml2.uml.Package#unapplyProfile(Profile)
	 * @generated
	 */
	public static Function<Package, EList<EObject>> unapplyProfile(final Profile profile) {
		return new Function<Package, EList<EObject>>() {
			public EList<EObject> apply(Package s) {
				return s.unapplyProfile(profile);
			}
		};
	}

	/**
	 * Retrieves the profiles that are applied to this package. 
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfiles()
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAppliedProfiles = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAppliedProfiles();
		}
	};

	/**
	 * Retrieves all the profiles that are applied to this package, including profiles applied
	 * to its nesting package(s). 
	 * @see org.eclipse.uml2.uml.Package#getAllAppliedProfiles()
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAllAppliedProfiles = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAllAppliedProfiles();
		}
	};

	/**
	 * Retrieves the profile with the specified qualified name that is applied to this package,
	 * or null if no such profile is applied. 
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile(String)
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile(final String qualifiedName) {
		return new Function<Package, Profile>() {
			public Profile apply(Package s) {
				return s.getAppliedProfile(qualifiedName);
			}
		};
	}

	/**
	 * Retrieves the profile with the specified qualified name that is applied to this package
	 * or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile(String, boolean)
	 * @generated
	 */
	public static Function<Package, Profile> getAppliedProfile(final String qualifiedName, final boolean recurse) {
		return new Function<Package, Profile>() {
			public Profile apply(Package s) {
				return s.getAppliedProfile(qualifiedName, recurse);
			}
		};
	}

	/**
	 * Retrieves all the profile applications for this package, including profile applications
	 * for its nesting package(s). 
	 * @see org.eclipse.uml2.uml.Package#getAllProfileApplications()
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> getAllProfileApplications = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getAllProfileApplications();
		}
	};

	/**
	 * Retrieves the application of the specified profile to this package, or null if no
	 * such profile is applied. 
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication(Profile)
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication(final Profile profile) {
		return new Function<Package, ProfileApplication>() {
			public ProfileApplication apply(Package s) {
				return s.getProfileApplication(profile);
			}
		};
	}

	/**
	 * Retrieves the application of the specified profile to this package or any of its nesting
	 * packages (if indicated), or null if no such profile is applied. 
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication(Profile, boolean)
	 * @generated
	 */
	public static Function<Package, ProfileApplication> getProfileApplication(final Profile profile, final boolean recurse) {
		return new Function<Package, ProfileApplication>() {
			public ProfileApplication apply(Package s) {
				return s.getProfileApplication(profile, recurse);
			}
		};
	}

	/**
	 * Determines whether this package is a model library. 
	 * @see org.eclipse.uml2.uml.Package#isModelLibrary()
	 * @generated
	 */
	public static final Predicate<Package> isModelLibrary = new Predicate<Package>() {
		public boolean apply(Package s) {
			return s.isModelLibrary();
		}
	};

	/**
	 * The query visibleMembers() defines which members of a Package can be accessed outside
	 * it.
	result = member->select( m | self.makesVisible(m)) 
	 * @see org.eclipse.uml2.uml.Package#visibleMembers()
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> visibleMembers = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.visibleMembers();
		}
	};

	/**
	 * The query makesVisible() defines whether a Package makes an element visible outside
	 * itself. Elements with no visibility and elements with public visibility are made visible.
	self.member->includes(el)
	result
	 * = (ownedMember->includes(el)) or
	(elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el))
	 * or
	(packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())
	 * @see org.eclipse.uml2.uml.Package#makesVisible(NamedElement)
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
