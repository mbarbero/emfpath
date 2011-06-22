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
	 * @see org.eclipse.uml2.uml.Profile#getOwnedStereotypes()
	 * @generated
	 */
	public static final Function<Profile, EList<Stereotype>> ownedStereotype = new Function<Profile, EList<Stereotype>>() {
		public EList<Stereotype> apply(Profile s) {
			return s.getOwnedStereotypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#getMetaclassReferences()
	 * @generated
	 */
	public static final Function<Profile, EList<ElementImport>> metaclassReference = new Function<Profile, EList<ElementImport>>() {
		public EList<ElementImport> apply(Profile s) {
			return s.getMetaclassReferences();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#getMetamodelReferences()
	 * @generated
	 */
	public static final Function<Profile, EList<PackageImport>> metamodelReference = new Function<Profile, EList<PackageImport>>() {
		public EList<PackageImport> apply(Profile s) {
			return s.getMetamodelReferences();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Profile#validateMetaclassReferenceNotSpecialized()
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
	 * @see org.eclipse.uml2.uml.Profile#validateReferencesSameMetamodel()
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
	 * @see org.eclipse.uml2.uml.Profile#create()
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
	 * @see org.eclipse.uml2.uml.Profile#createOwnedStereotype()
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
	 * @see org.eclipse.uml2.uml.Profile#isDefined()
	 * @generated
	 */
	public static final Predicate<Profile> isDefined = new Predicate<Profile>() {
		public boolean apply(Profile s) {
			return s.isDefined();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#define()
	 * @generated
	 */
	public static final Function<Profile, EPackage> define = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.define();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#define()
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
	 * @see org.eclipse.uml2.uml.Profile#getDefinition()
	 * @generated
	 */
	public static final Function<Profile, EPackage> getDefinition = new Function<Profile, EPackage>() {
		public EPackage apply(Profile s) {
			return s.getDefinition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#getDefinition()
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
	 * @see org.eclipse.uml2.uml.Profile#getReferencedMetaclasses()
	 * @generated
	 */
	public static final Function<Profile, EList<Class>> getReferencedMetaclasses = new Function<Profile, EList<Class>>() {
		public EList<Class> apply(Profile s) {
			return s.getReferencedMetaclasses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#getReferencedMetamodels()
	 * @generated
	 */
	public static final Function<Profile, EList<Model>> getReferencedMetamodels = new Function<Profile, EList<Model>>() {
		public EList<Model> apply(Profile s) {
			return s.getReferencedMetamodels();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Profile#getOwnedExtensions()
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
