package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Namespace Namespace} in a functional way.
 * <p>
 * A namespace is an element in a model that contains a set of named elements that can
 * be identified by name. 
 * @see org.eclipse.uml2.uml.Namespace
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
	 * References the ElementImports owned by the Namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getElementImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<ElementImport>> elementImport = new Function<Namespace, EList<ElementImport>>() {
    public EList<ElementImport> apply(Namespace s) {
      return s.getElementImports();
    }
  };

	/**
	 * References the PackageImports owned by the Namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getPackageImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = new Function<Namespace, EList<PackageImport>>() {
    public EList<PackageImport> apply(Namespace s) {
      return s.getPackageImports();
    }
  };

	/**
	 * Specifies a set of Constraints owned by this Namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedRules()
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = new Function<Namespace, EList<Constraint>>() {
    public EList<Constraint> apply(Namespace s) {
      return s.getOwnedRules();
    }
  };

	/**
	 * A collection of NamedElements identifiable within the Namespace, either by being owned
	 * or by being introduced by importing or inheritance. 
	 * @see org.eclipse.uml2.uml.Namespace#getMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = new Function<Namespace, EList<NamedElement>>() {
    public EList<NamedElement> apply(Namespace s) {
      return s.getMembers();
    }
  };

	/**
	 * References the PackageableElements that are members of this Namespace as a result
	 * of either PackageImports or ElementImports. 
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = new Function<Namespace, EList<PackageableElement>>() {
    public EList<PackageableElement> apply(Namespace s) {
      return s.getImportedMembers();
    }
  };

	/**
	 * A collection of NamedElements owned by the Namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = new Function<Namespace, EList<NamedElement>>() {
    public EList<NamedElement> apply(Namespace s) {
      return s.getOwnedMembers();
    }
  };
	
	/**
	 * All the members of a Namespace are distinguishable within it.
	membersAreDistinguishable()
	 * @see org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Namespace> validateMembersDistinguishable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Namespace>() {
      public boolean apply(Namespace s) {
        return s.validateMembersDistinguishable(diagnostics, context);
      }
    };
  }

	/**
	 * Creates an import of the specified element into this namespace with the specified
	 * visibility. 
	 * @see org.eclipse.uml2.uml.Namespace#createElementImport(PackageableElement, VisibilityKind)
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
	 * Creates an import of the specified package into this namespace with the specified
	 * visibility. 
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport(Package, VisibilityKind)
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
	 * Retrieves the elements imported by this namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements = new Function<Namespace, EList<PackageableElement>>() {
    public EList<PackageableElement> apply(Namespace s) {
      return s.getImportedElements();
    }
  };

	/**
	 * Retrieves the packages imported by this namespace. 
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages = new Function<Namespace, EList<Package>>() {
    public EList<Package> apply(Namespace s) {
      return s.getImportedPackages();
    }
  };

	/**
	 * The importedMember property is derived from the ElementImports and the PackageImports.
	 * References the PackageableElements that are members of this Namespace as a result
	 * of either PackageImports or ElementImports.
	result = self.importMembers(self.elementImport.importedElement.asSet()-
	>union(self.packageImport.importedPackage->collect(p
	 * | p.visibleMembers()))) 
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedMembers = new Function<Namespace, EList<PackageableElement>>() {
    public EList<PackageableElement> apply(Namespace s) {
      return s.getImportedMembers();
    }
  };

	/**
	 * The query getNamesOfMember() takes importing into account. It gives back the set of
	 * names that an element would have in an importing namespace, either because it is owned,
	 * or if not owned then imported individually, or if not individually then from a package.
	The
	 * query getNamesOfMember() gives a set of all of the names that a member would have
	 * in a Namespace. In general a member can have multiple names in a Namespace if it is
	 * imported more than once with different aliases. The query takes account of importing.
	 * It gives back the set of names that an element would have in an importing namespace,
	 * either because it is owned, or if not owned then imported individually, or if not
	 * individually then from a package.
	result = if self.ownedMember ->includes(element)
	then
	 * Set{}->include(element.name)
	else let elementImports: ElementImport = self.elementImport->select(ei
	 * | ei.importedElement = element) in
	  if elementImports->notEmpty()
	  then elementImports->collect(el
	 * | el.getName())
	  else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))->
	 * collect(pi | pi.importedPackage.getNamesOfMember(element))
	  endif
	endif 
	 * @see org.eclipse.uml2.uml.Namespace#getNamesOfMember(NamedElement)
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
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's
	 * members are distinguishable within it.
	result = self.member->forAll( memb |
	self.member->excluding(memb)->forAll(other
	 * |
	memb.isDistinguishableFrom(other, self))) 
	 * @see org.eclipse.uml2.uml.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public static final ComposablePredicate<Namespace> membersAreDistinguishable = new ComposablePredicate<Namespace>() {
    public boolean apply(Namespace s) {
      return s.membersAreDistinguishable();
    }
  };

	/**
	 * The query importMembers() defines which of a set of PackageableElements are actually
	 * imported into the namespace. This excludes hidden ones, i.e., those which have names
	 * that conflict with names of owned members, and also excludes elements which would
	 * have the same name when imported.
	result = self.excludeCollisions(imps)->select(imp
	 * | self.ownedMember->forAll(mem |
	mem.imp.isDistinguishableFrom(mem, self))) 
	 * @see org.eclipse.uml2.uml.Namespace#importMembers(EList)
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
	 * The query excludeCollisions() excludes from a set of PackageableElements any that
	 * would not be distinguishable from each other in this namespace.
	result = imps->reject(imp1
	 * | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self))) 
	 * @see org.eclipse.uml2.uml.Namespace#excludeCollisions(EList)
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
