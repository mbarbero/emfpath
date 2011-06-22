package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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

/**
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
	 * @see org.eclipse.uml2.uml.Namespace#getElementImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<ElementImport>> elementImport = NamespacePath.elementImport;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getPackageImports()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageImport>> packageImport = NamespacePath.packageImport;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedRules()
	 * @generated
	 */
	public static final Function<Namespace, EList<Constraint>> ownedRule = NamespacePath.ownedRule;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> member = NamespacePath.member;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> importedMember = NamespacePath.importedMember;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers()
	 * @generated
	 */
	public static final Function<Namespace, EList<NamedElement>> ownedMember = NamespacePath.ownedMember;

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityGroup>> subgroup = ActivityGroupPath.subgroup;

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public static final Function<ActivityGroup, ActivityGroup> superGroup = ActivityGroupPath.superGroup;

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated
	 */
	public static final Function<ActivityGroup, Activity> inActivity = ActivityGroupPath.inActivity;

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityEdge>> containedEdge = ActivityGroupPath.containedEdge;

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityNode>> containedNode = ActivityGroupPath.containedNode;

	/**
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getVariables()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<Variable>> variable = new Function<StructuredActivityNode, EList<Variable>>() {
		public EList<Variable> apply(StructuredActivityNode s) {
			return s.getVariables();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getEdges()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityEdge>> edge = new Function<StructuredActivityNode, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(StructuredActivityNode s) {
			return s.getEdges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#isMustIsolate()
	 * @generated
	 */
	public static final Predicate<StructuredActivityNode> isMustIsolate = new Predicate<StructuredActivityNode>() {
		public boolean apply(StructuredActivityNode s) {
			return s.isMustIsolate();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#getNodes()
	 * @generated
	 */
	public static final Function<StructuredActivityNode, EList<ActivityNode>> node = new Function<StructuredActivityNode, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(StructuredActivityNode s) {
			return s.getNodes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable()
	 * @generated
	 */
	public static Predicate<Namespace> validateMembersDistinguishable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamespacePath.validateMembersDistinguishable(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#createElementImport()
	 * @generated
	 */
	public static Function<Namespace, ElementImport> createElementImport(final PackageableElement element, final VisibilityKind visibility) {
		return NamespacePath.createElementImport(element, visibility);
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#createPackageImport()
	 * @generated
	 */
	public static Function<Namespace, PackageImport> createPackageImport(final Package package_, final VisibilityKind visibility) {
		return NamespacePath.createPackageImport(package_, visibility);
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedElements()
	 * @generated
	 */
	public static final Function<Namespace, EList<PackageableElement>> getImportedElements = NamespacePath.getImportedElements;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getImportedPackages()
	 * @generated
	 */
	public static final Function<Namespace, EList<Package>> getImportedPackages = NamespacePath.getImportedPackages;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#getNamesOfMember()
	 * @generated
	 */
	public static Function<Namespace, EList<String>> getNamesOfMember(final NamedElement element) {
		return NamespacePath.getNamesOfMember(element);
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	public static final Predicate<Namespace> membersAreDistinguishable = NamespacePath.membersAreDistinguishable;

	/**
	 * @see org.eclipse.uml2.uml.Namespace#importMembers()
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> importMembers(final EList<PackageableElement> imps) {
		return NamespacePath.importMembers(imps);
	}

	/**
	 * @see org.eclipse.uml2.uml.Namespace#excludeCollisions()
	 * @generated
	 */
	public static Function<Namespace, EList<PackageableElement>> excludeCollisions(final EList<PackageableElement> imps) {
		return NamespacePath.excludeCollisions(imps);
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges()
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNodesAndEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateNodesAndEdges(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained()
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateNotContained(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned()
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateGroupOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ActivityGroupPath.validateGroupOwned(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.StructuredActivityNode#validateEdges()
	 * @generated
	 */
	public static Predicate<StructuredActivityNode> validateEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuredActivityNode>() {
			public boolean apply(StructuredActivityNode s) {
				return s.validateEdges(diagnostics, context);
			}
		};
	}

}
