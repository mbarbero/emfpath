package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ElementImport ElementImport} in a functional way.
 * <p>
 * An element import identifies an element in another package, and allows the element
 * to be referenced using its name without a qualifier. 
 * @see org.eclipse.uml2.uml.ElementImport
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
	 * Specifies the visibility of the imported PackageableElement within the importing Package.
	 * The default visibility is the same as that of the imported element. If the imported
	 * element does not have a visibility, it is possible to add visibility to the element
	 * import. 
	 * @see org.eclipse.uml2.uml.ElementImport#getVisibility()
	 * @generated
	 */
	public static final Function<ElementImport, VisibilityKind> visibility = new Function<ElementImport, VisibilityKind>() {
    public VisibilityKind apply(ElementImport s) {
      return s.getVisibility();
    }
  };

	/**
	 * Specifies the name that should be added to the namespace of the importing package
	 * in lieu of the name of the imported packagable element. The aliased name must not
	 * clash with any other member name in the importing package. By default, no alias is
	 * used. 
	 * @see org.eclipse.uml2.uml.ElementImport#getAlias()
	 * @generated
	 */
	public static final Function<ElementImport, String> alias = new Function<ElementImport, String>() {
    public String apply(ElementImport s) {
      return s.getAlias();
    }
  };

	/**
	 * Specifies the PackageableElement whose name is to be added to a Namespace. 
	 * @see org.eclipse.uml2.uml.ElementImport#getImportedElement()
	 * @generated
	 */
	public static final Function<ElementImport, PackageableElement> importedElement = new Function<ElementImport, PackageableElement>() {
    public PackageableElement apply(ElementImport s) {
      return s.getImportedElement();
    }
  };

	/**
	 * Specifies the Namespace that imports a PackageableElement from another Package. 
	 * @see org.eclipse.uml2.uml.ElementImport#getImportingNamespace()
	 * @generated
	 */
	public static final Function<ElementImport, Namespace> importingNamespace = new Function<ElementImport, Namespace>() {
    public Namespace apply(ElementImport s) {
      return s.getImportingNamespace();
    }
  };
	
	/**
	 * The visibility of an ElementImport is either public or private.
	self.visibility =
	 * #public or self.visibility = #private 
	 * @see org.eclipse.uml2.uml.ElementImport#validateVisibilityPublicOrPrivate(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ElementImport> validateVisibilityPublicOrPrivate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ElementImport>() {
      public boolean apply(ElementImport s) {
        return s.validateVisibilityPublicOrPrivate(diagnostics, context);
      }
    };
  }

	/**
	 * An importedElement has either public visibility or no visibility at all.
	self.importedElement.visibility.notEmpty()
	 * implies self.importedElement.visibility = #public 
	 * @see org.eclipse.uml2.uml.ElementImport#validateImportedElementIsPublic(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ElementImport> validateImportedElementIsPublic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ElementImport>() {
      public boolean apply(ElementImport s) {
        return s.validateImportedElementIsPublic(diagnostics, context);
      }
    };
  }

	/**
	 * The query getName() returns the name under which the imported PackageableElement will
	 * be known in the importing namespace.
	result = if self.alias->notEmpty() then
	  self.alias
	else
	
	 *  self.importedElement.name
	endif 
	 * @see org.eclipse.uml2.uml.ElementImport#getName()
	 * @generated
	 */
	public static final Function<ElementImport, String> getName = new Function<ElementImport, String>() {
    public String apply(ElementImport s) {
      return s.getName();
    }
  };

}
