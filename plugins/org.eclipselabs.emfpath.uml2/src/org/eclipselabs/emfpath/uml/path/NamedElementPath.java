package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.NamedElement NamedElement} in a functional way.
 * <p>
 * A named element is an element in a model that may have a name.
A named element supports
 * using a string expression to specify its name. This allows names of model elements
 * to involve template parameters. The actual name is evaluated from the string expression
 * only when it is sensible to do so (e.g., when a template is bound). 
 * @see org.eclipse.uml2.uml.NamedElement
 * @generated
 */
public class NamedElementPath extends ElementPath {

	/**
	 * @generated
	 */
	 NamedElementPath() {
    super();
  }

	/**
	 * The name of the NamedElement. 
	 * @see org.eclipse.uml2.uml.NamedElement#getName()
	 * @generated
	 */
	public static final Function<NamedElement, String> name = new Function<NamedElement, String>() {
    public String apply(NamedElement s) {
      return s.getName();
    }
  };

	/**
	 * Determines where the NamedElement appears within different Namespaces within the overall
	 * model, and its accessibility. 
	 * @see org.eclipse.uml2.uml.NamedElement#getVisibility()
	 * @generated
	 */
	public static final Function<NamedElement, VisibilityKind> visibility = new Function<NamedElement, VisibilityKind>() {
    public VisibilityKind apply(NamedElement s) {
      return s.getVisibility();
    }
  };

	/**
	 * A name which allows the NamedElement to be identified within a hierarchy of nested
	 * Namespaces. It is constructed from the names of the containing namespaces starting
	 * at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * @see org.eclipse.uml2.uml.NamedElement#getQualifiedName()
	 * @generated
	 */
	public static final Function<NamedElement, String> qualifiedName = new Function<NamedElement, String>() {
    public String apply(NamedElement s) {
      return s.getQualifiedName();
    }
  };

	/**
	 * Indicates the dependencies that reference the client. 
	 * @see org.eclipse.uml2.uml.NamedElement#getClientDependencies()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Dependency>> clientDependency = new Function<NamedElement, EList<Dependency>>() {
    public EList<Dependency> apply(NamedElement s) {
      return s.getClientDependencies();
    }
  };

	/**
	 * Specifies the namespace that owns the NamedElement. 
	 * @see org.eclipse.uml2.uml.NamedElement#getNamespace()
	 * @generated
	 */
	public static final Function<NamedElement, Namespace> namespace = new Function<NamedElement, Namespace>() {
    public Namespace apply(NamedElement s) {
      return s.getNamespace();
    }
  };

	/**
	 * The string expression used to define the name of this named element. 
	 * @see org.eclipse.uml2.uml.NamedElement#getNameExpression()
	 * @generated
	 */
	public static final Function<NamedElement, StringExpression> nameExpression = new Function<NamedElement, StringExpression>() {
    public StringExpression apply(NamedElement s) {
      return s.getNameExpression();
    }
  };
	
	/**
	 * If there is no name, or one of the containing namespaces has no name, there is no
	 * qualified name.
	(self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
	
	 *  implies self.qualifiedName->isEmpty() 
	 * @see org.eclipse.uml2.uml.NamedElement#validateHasNoQualifiedName(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<NamedElement> validateHasNoQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<NamedElement>() {
      public boolean apply(NamedElement s) {
        return s.validateHasNoQualifiedName(diagnostics, context);
      }
    };
  }

	/**
	 * When there is a name, and all of the containing namespaces have a name, the qualified
	 * name is constructed from the names of the containing namespaces.
	(self.name->notEmpty()
	 * and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
	  self.qualifiedName
	 * = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * @see org.eclipse.uml2.uml.NamedElement#validateHasQualifiedName(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<NamedElement> validateHasQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<NamedElement>() {
      public boolean apply(NamedElement s) {
        return s.validateHasQualifiedName(diagnostics, context);
      }
    };
  }

	/**
	 * If a NamedElement is not owned by a Namespace, it does not have a visibility.
	namespace->isEmpty()
	 * implies visibility->isEmpty() 
	 * @see org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<NamedElement> validateVisibilityNeedsOwnership(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<NamedElement>() {
      public boolean apply(NamedElement s) {
        return s.validateVisibilityNeedsOwnership(diagnostics, context);
      }
    };
  }

	/**
	 * Creates a dependency between this named element and the specified supplier, owned
	 * by this named element's nearest package. 
	 * @see org.eclipse.uml2.uml.NamedElement#createDependency(NamedElement)
	 * @generated
	 */
	public static Function<NamedElement, Dependency> createDependency(final NamedElement supplier) {
    return new Function<NamedElement, Dependency>() {
      public Dependency apply(NamedElement s) {
        return s.createDependency(supplier);
      }
    };
  }

	/**
	 * Retrieves a localized label for this named element. 
	 * @see org.eclipse.uml2.uml.NamedElement#getLabel()
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel = new Function<NamedElement, String>() {
    public String apply(NamedElement s) {
      return s.getLabel();
    }
  };

	/**
	 * Retrieves a label for this named element, localized if indicated. 
	 * @see org.eclipse.uml2.uml.NamedElement#getLabel(boolean)
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel(final boolean localize) {
    return new Function<NamedElement, String>() {
      public String apply(NamedElement s) {
        return s.getLabel(localize);
      }
    };
  }

	/**
	 * Creates a usage between this named element and the specified supplier, owned by this
	 * named element's nearest package. 
	 * @see org.eclipse.uml2.uml.NamedElement#createUsage(NamedElement)
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage(final NamedElement supplier) {
    return new Function<NamedElement, Usage>() {
      public Usage apply(NamedElement s) {
        return s.createUsage(supplier);
      }
    };
  }

	/**
	 * When there is a name, and all of the containing namespaces have a name, the qualified
	 * name is constructed from the names of the containing namespaces.
	result = if self.name->notEmpty()
	 * and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()
	then 
	    self.allNamespaces()->iterate(
	 * ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	else
	
	 *    Set{}
	endif 
	 * @see org.eclipse.uml2.uml.NamedElement#getQualifiedName()
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName = new Function<NamedElement, String>() {
    public String apply(NamedElement s) {
      return s.getQualifiedName();
    }
  };

	/**
	 * The query allNamespaces() gives the sequence of namespaces in which the NamedElement
	 * is nested, working outwards.
	result = if self.namespace->isEmpty()
	then Sequence{}
	else
	 * self.namespace.allNamespaces()->prepend(self.namespace)
	endif 
	 * @see org.eclipse.uml2.uml.NamedElement#allNamespaces()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces = new Function<NamedElement, EList<Namespace>>() {
    public EList<Namespace> apply(NamedElement s) {
      return s.allNamespaces();
    }
  };

	/**
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically
	 * co-exist within a Namespace. By default, two named elements are distinguishable if
	 * (a) they have unrelated types or (b) they have related types but different names.
	result
	 * = if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
	then ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	else
	 * true
	endif 
	 * @see org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom(NamedElement, Namespace)
	 * @generated
	 */
	public static ComposablePredicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
    return new ComposablePredicate<NamedElement>() {
      public boolean apply(NamedElement s) {
        return s.isDistinguishableFrom(n, ns);
      }
    };
  }

	/**
	 * The query separator() gives the string that is used to separate names when constructing
	 * a qualified name.
	result = '::' 
	 * @see org.eclipse.uml2.uml.NamedElement#separator()
	 * @generated
	 */
	public static final Function<NamedElement, String> separator = new Function<NamedElement, String>() {
    public String apply(NamedElement s) {
      return s.separator();
    }
  };

	/**
	 * The query allOwningPackages() returns all the directly or indirectly owning packages.
	result
	 * = self.namespace->select(p | p.oclIsKindOf(Package))->union(p.allOwningPackages())
	 * @see org.eclipse.uml2.uml.NamedElement#allOwningPackages()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages = new Function<NamedElement, EList<Package>>() {
    public EList<Package> apply(NamedElement s) {
      return s.allOwningPackages();
    }
  };

}
