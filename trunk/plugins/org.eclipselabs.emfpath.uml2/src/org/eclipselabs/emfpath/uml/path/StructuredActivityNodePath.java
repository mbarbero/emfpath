package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StructuredActivityNode StructuredActivityNode} in a functional way.
 * <p>
 * A structured activity node is an executable activity node that may have an expansion
 * into subordinate nodes as an activity group. The subordinate nodes must belong to
 * only one structured activity node, although they may be nested.
Because of the concurrent
 * nature of the execution of actions within and across activities, it can be difficult
 * to guarantee the consistent access and modification of object memory. In order to
 * avoid race conditions or other concurrency-related problems, it is sometimes necessary
 * to isolate the effects of a group of actions from the effects of actions outside the
 * group. This may be indicated by setting the mustIsolate attribute to true on a structured
 * activity node. If a structured activity node is "isolated," then any object used by
 * an action within the node cannot be accessed by any action outside the node until
 * the structured activity node as a whole completes. Any concurrent actions that would
 * result in accessing such objects are required to have their execution deferred until
 * the completion of the node. 
 * @see org.eclipse.uml2.uml.StructuredActivityNode
 * @generated
 */
public class StructuredActivityNodePath extends ActionPath {

	/**
	 * @generated
	 */
	 StructuredActivityNodePath() {
    super();
  }

	/**
	 * References the ElementImports owned by the Namespace. 
	 *
	 * @see NamespacePath#elementImport()
	 * @see org.eclipse.uml2.uml.Namespace#getElementImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<ElementImport>> elementImport = NamespacePath.elementImport;

	/**
	 * References the PackageImports owned by the Namespace. 
	 *
	 * @see NamespacePath#packageImport()
	 * @see org.eclipse.uml2.uml.Namespace#getPackageImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = NamespacePath.packageImport;

	/**
	 * Specifies a set of Constraints owned by this Namespace. 
	 *
	 * @see NamespacePath#ownedRule()
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedRules()
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = NamespacePath.ownedRule;

	/**
	 * A collection of NamedElements identifiable within the Namespace, either by being owned
	 * or by being introduced by importing or inheritance. 
	 *
	 * @see NamespacePath#member()
	 * @see org.eclipse.uml2.uml.Namespace#getMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = NamespacePath.member;

	/**
	 * References the PackageableElements that are members of this Namespace as a result
	 * of either PackageImports or ElementImports. 
	 *
	 * @see NamespacePath#importedMember()
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = NamespacePath.importedMember;

	/**
	 * A collection of NamedElements owned by the Namespace. 
	 *
	 * @see NamespacePath#ownedMember()
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = NamespacePath.ownedMember;

	/**
	 * Groups immediately contained in the group. 
	 *
	 * @see ActivityGroupPath#subgroup()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityGroup>> subgroup = ActivityGroupPath.subgroup;

	/**
	 * Group immediately containing the group. 
	 *
	 * @see ActivityGroupPath#superGroup()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public static final Function<ActivityGroup, ActivityGroup> superGroup = ActivityGroupPath.superGroup;

	/**
	 * Activity containing the group. 
	 *
	 * @see ActivityGroupPath#inActivity()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated
	 */
	public static final Function<ActivityGroup, Activity> inActivity = ActivityGroupPath.inActivity;

	/**
	 * Edges immediately contained in the group. 
	 *
	 * @see ActivityGroupPath#containedEdge()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityEdge>> containedEdge = ActivityGroupPath.containedEdge;

	/**
	 * Nodes immediately contained in the group. 
	 *
	 * @see ActivityGroupPath#containedNode()
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityNode>> containedNode = ActivityGroupPath.containedNode;

	/**
	 * A variable defined in the scope of the structured activity node. It has no value and
	 * may not be accessed 
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getVariables()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<Variable>> variable = new Function<StructuredActivityNode, EList<Variable>>() {
    public EList<Variable> apply(StructuredActivityNode s) {
      return s.getVariables();
    }
  };

	/**
	 * Edges immediately contained in the structured node. 
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getEdges()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityEdge>> edge = new Function<StructuredActivityNode, EList<ActivityEdge>>() {
    public EList<ActivityEdge> apply(StructuredActivityNode s) {
      return s.getEdges();
    }
  };

	/**
	 * If true, then the actions in the node execute in isolation from actions outside the
	 * node. 
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate()
	 * @generated
	 */
	public static final ComposablePredicate<StructuredActivityNode> isMustIsolate = new ComposablePredicate<StructuredActivityNode>() {
    public boolean apply(StructuredActivityNode s) {
      return s.isMustIsolate();
    }
  };

	/**
	 * Nodes immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getNodes()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityNode>> node = new Function<StructuredActivityNode, EList<ActivityNode>>() {
    public EList<ActivityNode> apply(StructuredActivityNode s) {
      return s.getNodes();
    }
  };
	
	/**
	 * All the members of a Namespace are distinguishable within it.
	membersAreDistinguishable()
	 *
	 * @see NamespacePath#validateMembersDistinguishable()
	 * @see org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Namespace> validateMembersDistinguishable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return NamespacePath.validateMembersDistinguishable(diagnostics, context);
  }

	/**
	 * Creates an import of the specified element into this namespace with the specified
	 * visibility. 
	 *
	 * @see NamespacePath#createElementImport()
	 * @see org.eclipse.uml2.uml.Namespace#createElementImport(PackageableElement, VisibilityKind)
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport(final PackageableElement element, final VisibilityKind visibility) {
    return NamespacePath.createElementImport(element, visibility);
  }

	/**
	 * Creates an import of the specified package into this namespace with the specified
	 * visibility. 
	 *
	 * @see NamespacePath#createPackageImport()
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport(Package, VisibilityKind)
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport(final Package package_, final VisibilityKind visibility) {
    return NamespacePath.createPackageImport(package_, visibility);
  }

	/**
	 * Retrieves the elements imported by this namespace. 
	 *
	 * @see NamespacePath#getImportedElements()
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements = NamespacePath.getImportedElements;

	/**
	 * Retrieves the packages imported by this namespace. 
	 *
	 * @see NamespacePath#getImportedPackages()
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages = NamespacePath.getImportedPackages;

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
	 *
	 * @see NamespacePath#getNamesOfMember()
	 * @see org.eclipse.uml2.uml.Namespace#getNamesOfMember(NamedElement)
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember(final NamedElement element) {
    return NamespacePath.getNamesOfMember(element);
  }

	/**
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's
	 * members are distinguishable within it.
	result = self.member->forAll( memb |
	self.member->excluding(memb)->forAll(other
	 * |
	memb.isDistinguishableFrom(other, self))) 
	 *
	 * @see NamespacePath#membersAreDistinguishable()
	 * @see org.eclipse.uml2.uml.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public static final ComposablePredicate<Namespace> membersAreDistinguishable = NamespacePath.membersAreDistinguishable;

	/**
	 * The query importMembers() defines which of a set of PackageableElements are actually
	 * imported into the namespace. This excludes hidden ones, i.e., those which have names
	 * that conflict with names of owned members, and also excludes elements which would
	 * have the same name when imported.
	result = self.excludeCollisions(imps)->select(imp
	 * | self.ownedMember->forAll(mem |
	mem.imp.isDistinguishableFrom(mem, self))) 
	 *
	 * @see NamespacePath#importMembers()
	 * @see org.eclipse.uml2.uml.Namespace#importMembers(EList)
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers(final EList<PackageableElement> imps) {
    return NamespacePath.importMembers(imps);
  }

	/**
	 * The query excludeCollisions() excludes from a set of PackageableElements any that
	 * would not be distinguishable from each other in this namespace.
	result = imps->reject(imp1
	 * | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self))) 
	 *
	 * @see NamespacePath#excludeCollisions()
	 * @see org.eclipse.uml2.uml.Namespace#excludeCollisions(EList)
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions(final EList<PackageableElement> imps) {
    return NamespacePath.excludeCollisions(imps);
  }

	/**
	 * All nodes and edges of the group must be in the same activity as the group.
	true
	 *
	 * @see ActivityGroupPath#validateNodesAndEdges()
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityGroup> validateNodesAndEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return ActivityGroupPath.validateNodesAndEdges(diagnostics, context);
  }

	/**
	 * No node or edge in a group may be contained by its subgroups or its containing groups,
	 * transitively.
	true 
	 *
	 * @see ActivityGroupPath#validateNotContained()
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityGroup> validateNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return ActivityGroupPath.validateNotContained(diagnostics, context);
  }

	/**
	 * Groups may only be owned by activities or groups.
	true 
	 *
	 * @see ActivityGroupPath#validateGroupOwned()
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityGroup> validateGroupOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return ActivityGroupPath.validateGroupOwned(diagnostics, context);
  }

	/**
	 * The edges owned by a structured node must have source and target nodes in the structured
	 * node, and vice versa.
	true 
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#validateEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StructuredActivityNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StructuredActivityNode>() {
      public boolean apply(StructuredActivityNode s) {
        return s.validateEdges(diagnostics, context);
      }
    };
  }

}
