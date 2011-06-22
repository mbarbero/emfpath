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
	 * @see org.eclipse.uml2.uml.PackageImport#getVisibility()
	 * @generated
	 */
	public static final Function<PackageImport, VisibilityKind> visibility = new Function<PackageImport, VisibilityKind>() {
		public VisibilityKind apply(PackageImport s) {
			return s.getVisibility();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.PackageImport#getImportedPackage()
	 * @generated
	 */
	public static final Function<PackageImport, Package> importedPackage = new Function<PackageImport, Package>() {
		public Package apply(PackageImport s) {
			return s.getImportedPackage();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.PackageImport#getImportingNamespace()
	 * @generated
	 */
	public static final Function<PackageImport, Namespace> importingNamespace = new Function<PackageImport, Namespace>() {
		public Namespace apply(PackageImport s) {
			return s.getImportingNamespace();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.PackageImport#validatePublicOrPrivate()
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
