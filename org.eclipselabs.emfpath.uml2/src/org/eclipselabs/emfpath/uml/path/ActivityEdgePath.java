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
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class ActivityEdgePath extends RedefinableElementPath {

	/**
	 * @generated
	 */
	 ActivityEdgePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getSource()
	 * @generated
	 */
	public static final Function<ActivityEdge, ActivityNode> source = new Function<ActivityEdge, ActivityNode>() {
		public ActivityNode apply(ActivityEdge s) {
			return s.getSource();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getTarget()
	 * @generated
	 */
	public static final Function<ActivityEdge, ActivityNode> target = new Function<ActivityEdge, ActivityNode>() {
		public ActivityNode apply(ActivityEdge s) {
			return s.getTarget();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getRedefinedEdges()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityEdge>> redefinedEdge = new Function<ActivityEdge, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityEdge s) {
			return s.getRedefinedEdges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInPartitions()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityPartition>> inPartition = new Function<ActivityEdge, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(ActivityEdge s) {
			return s.getInPartitions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getGuard()
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> guard = new Function<ActivityEdge, ValueSpecification>() {
		public ValueSpecification apply(ActivityEdge s) {
			return s.getGuard();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getWeight()
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> weight = new Function<ActivityEdge, ValueSpecification>() {
		public ValueSpecification apply(ActivityEdge s) {
			return s.getWeight();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInterrupts()
	 * @generated
	 */
	public static final Function<ActivityEdge, InterruptibleActivityRegion> interrupts = new Function<ActivityEdge, InterruptibleActivityRegion>() {
		public InterruptibleActivityRegion apply(ActivityEdge s) {
			return s.getInterrupts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode()
	 * @generated
	 */
	public static final Function<ActivityEdge, StructuredActivityNode> inStructuredNode = new Function<ActivityEdge, StructuredActivityNode>() {
		public StructuredActivityNode apply(ActivityEdge s) {
			return s.getInStructuredNode();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInGroups()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityGroup>> inGroup = new Function<ActivityEdge, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(ActivityEdge s) {
			return s.getInGroups();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#getActivity()
	 * @generated
	 */
	public static final Function<ActivityEdge, Activity> activity = new Function<ActivityEdge, Activity>() {
		public Activity apply(ActivityEdge s) {
			return s.getActivity();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateSourceAndTarget()
	 * @generated
	 */
	public static Predicate<ActivityEdge> validateSourceAndTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityEdge>() {
			public boolean apply(ActivityEdge s) {
				return s.validateSourceAndTarget(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateOwned()
	 * @generated
	 */
	public static Predicate<ActivityEdge> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityEdge>() {
			public boolean apply(ActivityEdge s) {
				return s.validateOwned(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateStructuredNode()
	 * @generated
	 */
	public static Predicate<ActivityEdge> validateStructuredNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityEdge>() {
			public boolean apply(ActivityEdge s) {
				return s.validateStructuredNode(diagnostics, context);
			}
		};
	}

}
