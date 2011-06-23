package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.PackageImport PackageImport} in a functional way.
 * <p>
 * A package import is a relationship that allows the use of unqualified names to refer
 * to package members from other namespaces. 
 * @see org.eclipse.uml2.uml.PackageImport
 * @generated
 */
public class PackageImportPath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private PackageImportPath() {
		super();
	}

	/**
	 * Specifies the visibility of the imported PackageableElements within the importing
	 * Namespace, i.e., whether imported elements will in turn be visible to other packages
	 * that use that importingPackage as an importedPackage. If the PackageImport is public,
	 * the imported elements will be visible outside the package, while if it is private
	 * they will not. 
	 * @see org.eclipse.uml2.uml.PackageImport#getVisibility()
	 * @generated
	 */
	public static final Function<PackageImport, VisibilityKind> visibility = new Function<PackageImport, VisibilityKind>() {
		public VisibilityKind apply(PackageImport s) {
			return s.getVisibility();
		}
	};

	/**
	 * Specifies the Package whose members are imported into a Namespace. 
	 * @see org.eclipse.uml2.uml.PackageImport#getImportedPackage()
	 * @generated
	 */
	public static final Function<PackageImport, Package> importedPackage = new Function<PackageImport, Package>() {
		public Package apply(PackageImport s) {
			return s.getImportedPackage();
		}
	};

	/**
	 * Specifies the Namespace that imports the members from a Package. 
	 * @see org.eclipse.uml2.uml.PackageImport#getImportingNamespace()
	 * @generated
	 */
	public static final Function<PackageImport, Namespace> importingNamespace = new Function<PackageImport, Namespace>() {
		public Namespace apply(PackageImport s) {
			return s.getImportingNamespace();
		}
	};
	
	/**
	 * The visibility of a PackageImport is either public or private.
	self.visibility =
	 * #public or self.visibility = #private 
	 * @see org.eclipse.uml2.uml.PackageImport#validatePublicOrPrivate(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<PackageImport> validatePublicOrPrivate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<PackageImport>() {
			public boolean apply(PackageImport s) {
				return s.validatePublicOrPrivate(diagnostics, context);
			}
		};
	}

}
