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
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSubgroups()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityGroup>> subgroup = new Function<ActivityGroup, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(ActivityGroup s) {
			return s.getSubgroups();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getSuperGroup()
	 * @generated
	 */
	public static final Function<ActivityGroup, ActivityGroup> superGroup = new Function<ActivityGroup, ActivityGroup>() {
		public ActivityGroup apply(ActivityGroup s) {
			return s.getSuperGroup();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getInActivity()
	 * @generated
	 */
	public static final Function<ActivityGroup, Activity> inActivity = new Function<ActivityGroup, Activity>() {
		public Activity apply(ActivityGroup s) {
			return s.getInActivity();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedEdges()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityEdge>> containedEdge = new Function<ActivityGroup, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityGroup s) {
			return s.getContainedEdges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#getContainedNodes()
	 * @generated
	 */
	public static final Function<ActivityGroup, EList<ActivityNode>> containedNode = new Function<ActivityGroup, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(ActivityGroup s) {
			return s.getContainedNodes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNodesAndEdges()
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
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateNotContained()
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
	 * @see org.eclipse.uml2.uml.ActivityGroup#validateGroupOwned()
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
