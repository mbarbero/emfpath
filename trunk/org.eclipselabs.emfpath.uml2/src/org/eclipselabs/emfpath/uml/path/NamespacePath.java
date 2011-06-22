package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public class NamespacePath extends NamedElementPath {

	/**
	 * @generated
	 */
	 NamespacePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getElementImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<ElementImport>> elementImport = new Function<Namespace, EList<ElementImport>>() {
		public EList<ElementImport> apply(Namespace s) {
			return s.getElementImports();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getPackageImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = new Function<Namespace, EList<PackageImport>>() {
		public EList<PackageImport> apply(Namespace s) {
			return s.getPackageImports();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedRules()
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = new Function<Namespace, EList<Constraint>>() {
		public EList<Constraint> apply(Namespace s) {
			return s.getOwnedRules();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = new Function<Namespace, EList<NamedElement>>() {
		public EList<NamedElement> apply(Namespace s) {
			return s.getMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = new Function<Namespace, EList<NamedElement>>() {
		public EList<NamedElement> apply(Namespace s) {
			return s.getOwnedMembers();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable()
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
	 * @see org.eclipse.uml2.uml.Namespace#createElementImport()
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport(final PackageableElement element, final VisibilityKind visibility) {
		return new Function<Namespace, ElementImport>() {
			public ElementImport apply(Namespace s) {
				return s.createElementImport(element, visibility);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport()
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport(final Package package_, final VisibilityKind visibility) {
		return new Function<Namespace, PackageImport>() {
			public PackageImport apply(Namespace s) {
				return s.createPackageImport(package_, visibility);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages = new Function<Namespace, EList<Package>>() {
		public EList<Package> apply(Namespace s) {
			return s.getImportedPackages();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedMembers = new Function<Namespace, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Namespace s) {
			return s.getImportedMembers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getNamesOfMember()
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember(final NamedElement element) {
		return new Function<Namespace, EList<String>>() {
			public EList<String> apply(Namespace s) {
				return s.getNamesOfMember(element);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public static final Predicate<Namespace> membersAreDistinguishable = new Predicate<Namespace>() {
		public boolean apply(Namespace s) {
			return s.membersAreDistinguishable();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Namespace#importMembers()
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers(final EList<PackageableElement> imps) {
		return new Function<Namespace, EList<PackageableElement>>() {
			public EList<PackageableElement> apply(Namespace s) {
				return s.importMembers(imps);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#excludeCollisions()
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions(final EList<PackageableElement> imps) {
		return new Function<Namespace, EList<PackageableElement>>() {
			public EList<PackageableElement> apply(Namespace s) {
				return s.excludeCollisions(imps);
			}
		};
	}

}
