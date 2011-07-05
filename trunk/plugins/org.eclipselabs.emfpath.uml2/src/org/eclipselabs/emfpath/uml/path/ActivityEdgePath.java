package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActivityEdge ActivityEdge} in a functional way.
 * <p>
 * An activity edge is an abstract class for directed connections between two activity
 * nodes.
Activity edges can be contained in interruptible regions. 
 * @see org.eclipse.uml2.uml.ActivityEdge
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
	 * Node from which tokens are taken when they traverse the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getSource()
	 * @generated
	 */
	public static final Function<ActivityEdge, ActivityNode> source = new Function<ActivityEdge, ActivityNode>() {
    public ActivityNode apply(ActivityEdge s) {
      return s.getSource();
    }
  };

	/**
	 * Node to which tokens are put when they traverse the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getTarget()
	 * @generated
	 */
	public static final Function<ActivityEdge, ActivityNode> target = new Function<ActivityEdge, ActivityNode>() {
    public ActivityNode apply(ActivityEdge s) {
      return s.getTarget();
    }
  };

	/**
	 * Inherited edges replaced by this edge in a specialization of the activity. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getRedefinedEdges()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityEdge>> redefinedEdge = new Function<ActivityEdge, EList<ActivityEdge>>() {
    public EList<ActivityEdge> apply(ActivityEdge s) {
      return s.getRedefinedEdges();
    }
  };

	/**
	 * Partitions containing the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInPartitions()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityPartition>> inPartition = new Function<ActivityEdge, EList<ActivityPartition>>() {
    public EList<ActivityPartition> apply(ActivityEdge s) {
      return s.getInPartitions();
    }
  };

	/**
	 * Specification evaluated at runtime to determine if the edge can be traversed. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getGuard()
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> guard = new Function<ActivityEdge, ValueSpecification>() {
    public ValueSpecification apply(ActivityEdge s) {
      return s.getGuard();
    }
  };

	/**
	 * The minimum number of tokens that must traverse the edge at the same time. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getWeight()
	 * @generated
	 */
	public static final Function<ActivityEdge, ValueSpecification> weight = new Function<ActivityEdge, ValueSpecification>() {
    public ValueSpecification apply(ActivityEdge s) {
      return s.getWeight();
    }
  };

	/**
	 * Region that the edge can interrupt. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInterrupts()
	 * @generated
	 */
	public static final Function<ActivityEdge, InterruptibleActivityRegion> interrupts = new Function<ActivityEdge, InterruptibleActivityRegion>() {
    public InterruptibleActivityRegion apply(ActivityEdge s) {
      return s.getInterrupts();
    }
  };

	/**
	 * Structured activity node containing the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInStructuredNode()
	 * @generated
	 */
	public static final Function<ActivityEdge, StructuredActivityNode> inStructuredNode = new Function<ActivityEdge, StructuredActivityNode>() {
    public StructuredActivityNode apply(ActivityEdge s) {
      return s.getInStructuredNode();
    }
  };

	/**
	 * Groups containing the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getInGroups()
	 * @generated
	 */
	public static final Function<ActivityEdge, EList<ActivityGroup>> inGroup = new Function<ActivityEdge, EList<ActivityGroup>>() {
    public EList<ActivityGroup> apply(ActivityEdge s) {
      return s.getInGroups();
    }
  };

	/**
	 * Activity containing the edge. 
	 * @see org.eclipse.uml2.uml.ActivityEdge#getActivity()
	 * @generated
	 */
	public static final Function<ActivityEdge, Activity> activity = new Function<ActivityEdge, Activity>() {
    public Activity apply(ActivityEdge s) {
      return s.getActivity();
    }
  };
	
	/**
	 * The source and target of an edge must be in the same activity as the edge.
	true 
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateSourceAndTarget(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityEdge> validateSourceAndTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityEdge>() {
      public boolean apply(ActivityEdge s) {
        return s.validateSourceAndTarget(diagnostics, context);
      }
    };
  }

	/**
	 * Activity edges may be owned only by activities or groups.
	true 
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateOwned(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityEdge> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityEdge>() {
      public boolean apply(ActivityEdge s) {
        return s.validateOwned(diagnostics, context);
      }
    };
  }

	/**
	 * Activity edges may be owned by at most one structured node.
	true 
	 * @see org.eclipse.uml2.uml.ActivityEdge#validateStructuredNode(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityEdge> validateStructuredNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityEdge>() {
      public boolean apply(ActivityEdge s) {
        return s.validateStructuredNode(diagnostics, context);
      }
    };
  }

}
