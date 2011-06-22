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
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * @see org.eclipse.uml2.uml.Package#getOwnedTypes()
	 * @generated
	 */
	public static final Function<Package, EList<Type>> ownedType = new Function<Package, EList<Type>>() {
		public EList<Type> apply(Package s) {
			return s.getOwnedTypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getPackageMerges()
	 * @generated
	 */
	public static final Function<Package, EList<PackageMerge>> packageMerge = new Function<Package, EList<PackageMerge>>() {
		public EList<PackageMerge> apply(Package s) {
			return s.getPackageMerges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getPackagedElements()
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> packagedElement = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.getPackagedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getNestedPackages()
	 * @generated
	 */
	public static final Function<Package, EList<Package>> nestedPackage = new Function<Package, EList<Package>>() {
		public EList<Package> apply(Package s) {
			return s.getNestedPackages();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getNestingPackage()
	 * @generated
	 */
	public static final Function<Package, Package> nestingPackage = new Function<Package, Package>() {
		public Package apply(Package s) {
			return s.getNestingPackage();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getProfileApplications()
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> profileApplication = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getProfileApplications();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * @see org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate()
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
	 * @see org.eclipse.uml2.uml.Package#createOwnedClass()
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
	 * @see org.eclipse.uml2.uml.Package#createOwnedEnumeration()
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
	 * @see org.eclipse.uml2.uml.Package#createOwnedPrimitiveType()
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
	 * @see org.eclipse.uml2.uml.Package#createOwnedInterface()
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
	 * @see org.eclipse.uml2.uml.Package#isProfileApplied()
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
	 * @see org.eclipse.uml2.uml.Package#applyProfile()
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
	 * @see org.eclipse.uml2.uml.Package#unapplyProfile()
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
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfiles()
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAppliedProfiles = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAppliedProfiles();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getAllAppliedProfiles()
	 * @generated
	 */
	public static final Function<Package, EList<Profile>> getAllAppliedProfiles = new Function<Package, EList<Profile>>() {
		public EList<Profile> apply(Package s) {
			return s.getAllAppliedProfiles();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile()
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
	 * @see org.eclipse.uml2.uml.Package#getAppliedProfile()
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
	 * @see org.eclipse.uml2.uml.Package#getAllProfileApplications()
	 * @generated
	 */
	public static final Function<Package, EList<ProfileApplication>> getAllProfileApplications = new Function<Package, EList<ProfileApplication>>() {
		public EList<ProfileApplication> apply(Package s) {
			return s.getAllProfileApplications();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication()
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
	 * @see org.eclipse.uml2.uml.Package#getProfileApplication()
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
	 * @see org.eclipse.uml2.uml.Package#isModelLibrary()
	 * @generated
	 */
	public static final Predicate<Package> isModelLibrary = new Predicate<Package>() {
		public boolean apply(Package s) {
			return s.isModelLibrary();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#visibleMembers()
	 * @generated
	 */
	public static final Function<Package, EList<PackageableElement>> visibleMembers = new Function<Package, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Package s) {
			return s.visibleMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Package#makesVisible()
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
