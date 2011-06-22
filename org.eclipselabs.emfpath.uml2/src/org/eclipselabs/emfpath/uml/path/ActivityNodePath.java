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
	 * @see org.eclipse.uml2.uml.ActivityNode#getInStructuredNode()
	 * @generated
	 */
	public static final Function<ActivityNode, StructuredActivityNode> inStructuredNode = new Function<ActivityNode, StructuredActivityNode>() {
		public StructuredActivityNode apply(ActivityNode s) {
			return s.getInStructuredNode();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getActivity()
	 * @generated
	 */
	public static final Function<ActivityNode, Activity> activity = new Function<ActivityNode, Activity>() {
		public Activity apply(ActivityNode s) {
			return s.getActivity();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getOutgoings()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> outgoing = new Function<ActivityNode, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityNode s) {
			return s.getOutgoings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getIncomings()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityEdge>> incoming = new Function<ActivityNode, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityNode s) {
			return s.getIncomings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getInPartitions()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityPartition>> inPartition = new Function<ActivityNode, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(ActivityNode s) {
			return s.getInPartitions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getInInterruptibleRegions()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<InterruptibleActivityRegion>> inInterruptibleRegion = new Function<ActivityNode, EList<InterruptibleActivityRegion>>() {
		public EList<InterruptibleActivityRegion> apply(ActivityNode s) {
			return s.getInInterruptibleRegions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getInGroups()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityGroup>> inGroup = new Function<ActivityNode, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(ActivityNode s) {
			return s.getInGroups();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#getRedefinedNodes()
	 * @generated
	 */
	public static final Function<ActivityNode, EList<ActivityNode>> redefinedNode = new Function<ActivityNode, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(ActivityNode s) {
			return s.getRedefinedNodes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActivityNode#validateOwnedStructuredNode()
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
	 * @see org.eclipse.uml2.uml.ActivityNode#validateOwned()
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
