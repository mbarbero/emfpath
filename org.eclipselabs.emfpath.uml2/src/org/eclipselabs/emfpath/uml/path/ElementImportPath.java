package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public class ElementImportPath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private ElementImportPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#getVisibility()
	 * @generated
	 */
	public static final Function<ElementImport, VisibilityKind> visibility = new Function<ElementImport, VisibilityKind>() {
		public VisibilityKind apply(ElementImport s) {
			return s.getVisibility();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#getAlias()
	 * @generated
	 */
	public static final Function<ElementImport, String> alias = new Function<ElementImport, String>() {
		public String apply(ElementImport s) {
			return s.getAlias();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#getImportedElement()
	 * @generated
	 */
	public static final Function<ElementImport, PackageableElement> importedElement = new Function<ElementImport, PackageableElement>() {
		public PackageableElement apply(ElementImport s) {
			return s.getImportedElement();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#getImportingNamespace()
	 * @generated
	 */
	public static final Function<ElementImport, Namespace> importingNamespace = new Function<ElementImport, Namespace>() {
		public Namespace apply(ElementImport s) {
			return s.getImportingNamespace();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ElementImport#validateVisibilityPublicOrPrivate()
	 * @generated
	 */
	public static Predicate<ElementImport> validateVisibilityPublicOrPrivate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ElementImport>() {
			public boolean apply(ElementImport s) {
				return s.validateVisibilityPublicOrPrivate(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#validateImportedElementIsPublic()
	 * @generated
	 */
	public static Predicate<ElementImport> validateImportedElementIsPublic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ElementImport>() {
			public boolean apply(ElementImport s) {
				return s.validateImportedElementIsPublic(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ElementImport#getName()
	 * @generated
	 */
	public static final Function<ElementImport, String> getName = new Function<ElementImport, String>() {
		public String apply(ElementImport s) {
			return s.getName();
		}
	};

}
