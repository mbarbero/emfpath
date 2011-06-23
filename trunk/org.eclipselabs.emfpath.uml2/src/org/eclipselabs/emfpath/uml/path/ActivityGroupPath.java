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

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActivityGroup ActivityGroup} in a functional way.
 * <p>
 * ActivityGroup is an abstract class for defining sets of nodes and edges in an activity.
 * @see org.eclipse.uml2.uml.ActivityGroup
 * @generated
 */
public class ActivityGroupPath extends ElementPath {

	/**
	 * @generated
	 */
	 ActivityGroupPath() {
		super();
	}

	/**
	 * Groups immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityGroup>> subgroup = new Function<ActivityGroup, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(ActivityGroup s) {
			return s.getSubgroups();
		}
	};

	/**
	 * Group immediately containing the group. 
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public static final Function<ActivityGroup, ActivityGroup> superGroup = new Function<ActivityGroup, ActivityGroup>() {
		public ActivityGroup apply(ActivityGroup s) {
			return s.getSuperGroup();
		}
	};

	/**
	 * Activity containing the group. 
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated
	 */
	public static final Function<ActivityGroup, Activity> inActivity = new Function<ActivityGroup, Activity>() {
		public Activity apply(ActivityGroup s) {
			return s.getInActivity();
		}
	};

	/**
	 * Edges immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityEdge>> containedEdge = new Function<ActivityGroup, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityGroup s) {
			return s.getContainedEdges();
		}
	};

	/**
	 * Nodes immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityNode>> containedNode = new Function<ActivityGroup, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(ActivityGroup s) {
			return s.getContainedNodes();
		}
	};
	
	/**
	 * All nodes and edges of the group must be in the same activity as the group.
	true
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNodesAndEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityGroup>() {
			public boolean apply(ActivityGroup s) {
				return s.validateNodesAndEdges(diagnostics, context);
			}
		};
	}

	/**
	 * No node or edge in a group may be contained by its subgroups or its containing groups,
	 * transitively.
	true 
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityGroup>() {
			public boolean apply(ActivityGroup s) {
				return s.validateNotContained(diagnostics, context);
			}
		};
	}

	/**
	 * Groups may only be owned by activities or groups.
	true 
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ActivityGroup> validateGroupOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityGroup>() {
			public boolean apply(ActivityGroup s) {
				return s.validateGroupOwned(diagnostics, context);
			}
		};
	}

}
