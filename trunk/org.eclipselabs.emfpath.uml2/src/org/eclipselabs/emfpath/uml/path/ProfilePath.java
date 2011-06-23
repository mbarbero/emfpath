package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Profile Profile} in a functional way.
 * <p>
 * A profile defines limited extensions to a reference metamodel with the purpose of
 * adapting the metamodel to a specific platform or domain. 
 * @see org.eclipse.uml2.uml.Profile
 * @generated
 */
public class ProfilePath extends PackagePath {

	/**
	 * @generated
	 */
	private ProfilePath() {
		super();
	}

	/**
	 * References the Stereotypes that are owned by the Profile. 
	 * @see org.eclipse.uml2.uml.Profile#getOwnedStereotypes()
	 * @generated
	 */
	public static final Function<Profile, EList<Stereotype>> ownedStereotype = new Function<Profile, EList<Stereotype>>() {
		public EList<Stereotype> apply(Profile s) {
			return s.getOwnedStereotypes();
		}
	};

	/**
	 * References a metaclass that may be extended. 
	 * @see org.eclipse.uml2.uml.Profile#getMetaclassReferences()
	 * @generated
	 */
	public static final Function<Profile, EList<ElementImport>> metaclassReference = new Function<Profile, EList<ElementImport>>() {
		public EList<ElementImport> apply(Profile s) {
			return s.getMetaclassReferences();
		}
	};

	/**
	 * References a package containing (directly or indirectly) metaclasses that may be extended.
	 * @see org.eclipse.uml2.uml.Profile#getMetamodelReferences()
	 * @generated
	 */
	public static final Function<Profile, EList<PackageImport>> metamodelReference = new Function<Profile, EList<PackageImport>>() {
		public EList<PackageImport> apply(Profile s) {
			return s.getMetamodelReferences();
		}
	};
	
	/**
	 * An element imported as a metaclassReference is not specialized or generalized in a
	 * Profile.
	self.metaclassReference.importedElement->
	  select(c | c.oclIsKindOf(Classifier)
	 * and
	    (c.generalization.namespace = self or
	      (c.specialization.namespace
	 * = self) )->isEmpty() 
	 * @see org.eclipse.uml2.uml.Profile#validateMetaclassReferenceNotSpecialized(DiagnosticChain, Map)
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
	 * All elements imported either as metaclassReferences or through metamodelReferences
	 * are members of the same base reference metamodel.
	self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages())->
	
	 *  union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty() 
	 * @see org.eclipse.uml2.uml.Profile#validateReferencesSameMetamodel(DiagnosticChain, Map)
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
	 * Creates and returns an instance of (the Ecore representation of) the specified classifier
	 * defined in this profile. 
	 * @see org.eclipse.uml2.uml.Profile#create(Classifier)
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
	 * Creates a(n) (abstract) stereotype with the specified name as an owned stereotype
	 * of this profile. 
	 * @see org.eclipse.uml2.uml.Profile#createOwnedStereotype(String, boolean)
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
	 * Determines whether this profile is defined. 
	 * @see org.eclipse.uml2.uml.Profile#isDefined()
	 * @generated
	 */
	public static final Predicate<Profile> isDefined = new Predicate<Profile>() {
		public boolean apply(Profile s) {
			return s.isDefined();
		}
	};

	/**
	 * Defines this profile by (re)creating Ecore representations of its current contents.
	 * @see org.eclipse.uml2.uml.Profile#define()
	 * @generated
	 */
	public static final Function<Profile, EPackage> define = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.define();
		}
	};

	/**
	 * Defines this profile by (re)creating Ecore representations of its current contents,
	 * using the specified options, diagnostics, and context. 
	 * @see org.eclipse.uml2.uml.Profile#define(Map, DiagnosticChain, Map)
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
	 * Retrieves the current definition (Ecore representation) of this profile. 
	 * @see org.eclipse.uml2.uml.Profile#getDefinition()
	 * @generated
	 */
	public static final Function<Profile, EPackage> getDefinition = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.getDefinition();
		}
	};

	/**
	 * Retrieves the current definition (Ecore representation) of the specified named element
	 * in this profile. 
	 * @see org.eclipse.uml2.uml.Profile#getDefinition(NamedElement)
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
	 * Retrieves the metaclasses referenced by this profile. 
	 * @see org.eclipse.uml2.uml.Profile#getReferencedMetaclasses()
	 * @generated
	 */
	public static final Function<Profile, EList<Class>> getReferencedMetaclasses = new Function<Profile, EList<Class>>() {
		public EList<Class> apply(Profile s) {
			return s.getReferencedMetaclasses();
		}
	};

	/**
	 * Retrieves the metamodels referenced by this profile. 
	 * @see org.eclipse.uml2.uml.Profile#getReferencedMetamodels()
	 * @generated
	 */
	public static final Function<Profile, EList<Model>> getReferencedMetamodels = new Function<Profile, EList<Model>>() {
		public EList<Model> apply(Profile s) {
			return s.getReferencedMetamodels();
		}
	};

	/**
	 * Retrieves the extensions owned by this profile, excluding non-required extensions
	 * if indicated. 
	 * @see org.eclipse.uml2.uml.Profile#getOwnedExtensions(boolean)
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
