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
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActivityNode ActivityNode} in a functional way.
 * <p>
 * ActivityNode is an abstract class for points in the flow of an activity connected
 * by edges. 
 * @see org.eclipse.uml2.uml.ActivityNode
 * @generated
 */
public class ActivityNodePath extends RedefinableElementPath {

	/**
	 * @generated
	 */
	 ActivityNodePath() {
		super();
	}

	/**
	 * Structured activity node containing the node. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getInStructuredNode()
	 * @generated
	 */
	public static final Function<ActivityNode, StructuredActivityNode> inStructuredNode = new Function<ActivityNode, StructuredActivityNode>() {
		public StructuredActivityNode apply(ActivityNode s) {
			return s.getInStructuredNode();
		}
	};

	/**
	 * Activity containing the node. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getActivity()
	 * @generated
	 */
	public static final Function<ActivityNode, Activity> activity = new Function<ActivityNode, Activity>() {
		public Activity apply(ActivityNode s) {
			return s.getActivity();
		}
	};

	/**
	 * Edges that have the node as source. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getOutgoings()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> outgoing = new Function<ActivityNode, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityNode s) {
			return s.getOutgoings();
		}
	};

	/**
	 * Edges that have the node as target. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getIncomings()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> incoming = new Function<ActivityNode, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityNode s) {
			return s.getIncomings();
		}
	};

	/**
	 * Partitions containing the node. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getInPartitions()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityPartition>> inPartition = new Function<ActivityNode, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(ActivityNode s) {
			return s.getInPartitions();
		}
	};

	/**
	 * Interruptible regions containing the node. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getInInterruptibleRegions()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<InterruptibleActivityRegion>> inInterruptibleRegion = new Function<ActivityNode, EList<InterruptibleActivityRegion>>() {
		public EList<InterruptibleActivityRegion> apply(ActivityNode s) {
			return s.getInInterruptibleRegions();
		}
	};

	/**
	 * Groups containing the node. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getInGroups()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityGroup>> inGroup = new Function<ActivityNode, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(ActivityNode s) {
			return s.getInGroups();
		}
	};

	/**
	 * Inherited nodes replaced by this node in a specialization of the activity. 
	 * @see org.eclipse.uml2.uml.ActivityNode#getRedefinedNodes()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityNode>> redefinedNode = new Function<ActivityNode, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(ActivityNode s) {
			return s.getRedefinedNodes();
		}
	};
	
	/**
	 * Activity nodes may be owned by at most one structured node.
	true 
	 * @see org.eclipse.uml2.uml.ActivityNode#validateOwnedStructuredNode(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ActivityNode> validateOwnedStructuredNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityNode>() {
			public boolean apply(ActivityNode s) {
				return s.validateOwnedStructuredNode(diagnostics, context);
			}
		};
	}

	/**
	 * Activity nodes can only be owned by activities or groups.
	true 
	 * @see org.eclipse.uml2.uml.ActivityNode#validateOwned(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ActivityNode> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityNode>() {
			public boolean apply(ActivityNode s) {
				return s.validateOwned(diagnostics, context);
			}
		};
	}

}
