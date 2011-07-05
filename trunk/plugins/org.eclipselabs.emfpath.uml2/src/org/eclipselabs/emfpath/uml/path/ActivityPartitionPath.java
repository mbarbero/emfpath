package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Element;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ActivityPartition ActivityPartition} in a functional way.
 * <p>
 * An activity partition is a kind of activity group for identifying actions that have
 * some characteristic in common. 
 * @see org.eclipse.uml2.uml.ActivityPartition
 * @generated
 */
public class ActivityPartitionPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private ActivityPartitionPath() {
    super();
  }

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
	 * Tells whether the partition groups other partitions along a dimension. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#isDimension()
	 * @generated
	 */
	public static final ComposablePredicate<ActivityPartition> isDimension = new ComposablePredicate<ActivityPartition>() {
    public boolean apply(ActivityPartition s) {
      return s.isDimension();
    }
  };

	/**
	 * Tells whether the partition represents an entity to which the partitioning structure
	 * does not apply. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#isExternal()
	 * @generated
	 */
	public static final ComposablePredicate<ActivityPartition> isExternal = new ComposablePredicate<ActivityPartition>() {
    public boolean apply(ActivityPartition s) {
      return s.isExternal();
    }
  };

	/**
	 * Nodes immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#getNodes()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityNode>> node = new Function<ActivityPartition, EList<ActivityNode>>() {
    public EList<ActivityNode> apply(ActivityPartition s) {
      return s.getNodes();
    }
  };

	/**
	 * Partitions immediately contained in the partition. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSubpartitions()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityPartition>> subpartition = new Function<ActivityPartition, EList<ActivityPartition>>() {
    public EList<ActivityPartition> apply(ActivityPartition s) {
      return s.getSubpartitions();
    }
  };

	/**
	 * Partition immediately containing the partition. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSuperPartition()
	 * @generated
	 */
	public static final Function<ActivityPartition, ActivityPartition> superPartition = new Function<ActivityPartition, ActivityPartition>() {
    public ActivityPartition apply(ActivityPartition s) {
      return s.getSuperPartition();
    }
  };

	/**
	 * An element constraining behaviors invoked by nodes in the partition. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#getRepresents()
	 * @generated
	 */
	public static final Function<ActivityPartition, Element> represents = new Function<ActivityPartition, Element>() {
    public Element apply(ActivityPartition s) {
      return s.getRepresents();
    }
  };

	/**
	 * Edges immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.ActivityPartition#getEdges()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityEdge>> edge = new Function<ActivityPartition, EList<ActivityEdge>>() {
    public EList<ActivityEdge> apply(ActivityPartition s) {
      return s.getEdges();
    }
  };
	
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
	 * A partition with isDimension = true may not be contained by another partition.
	true
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateDimensionNotContained(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityPartition> validateDimensionNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityPartition>() {
      public boolean apply(ActivityPartition s) {
        return s.validateDimensionNotContained(diagnostics, context);
      }
    };
  }

	/**
	 * If a partition represents a part, then all the non-external partitions in the same
	 * dimension and at the same level of nesting in that dimension must represent parts
	 * directly contained in the internal structure of the same classifier.
	true 
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPart(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityPartition> validateRepresentsPart(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityPartition>() {
      public boolean apply(ActivityPartition s) {
        return s.validateRepresentsPart(diagnostics, context);
      }
    };
  }

	/**
	 * If a non-external partition represents a classifier and is contained in another partition,
	 * then the containing partition must represent a classifier, and the classifier of the
	 * subpartition must be nested in the classifier represented by the containing partition,
	 * or be at the contained end of a strong composition association with the classifier
	 * represented by the containing partition.
	true 
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityPartition> validateRepresentsClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityPartition>() {
      public boolean apply(ActivityPartition s) {
        return s.validateRepresentsClassifier(diagnostics, context);
      }
    };
  }

	/**
	 * If a partition represents a part and is contained by another partition, then the part
	 * must be of a classifier represented by the containing partition, or of a classifier
	 * that is the type of a part representing the containing partition.
	true 
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPartAndIsContained(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ActivityPartition> validateRepresentsPartAndIsContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ActivityPartition>() {
      public boolean apply(ActivityPartition s) {
        return s.validateRepresentsPartAndIsContained(diagnostics, context);
      }
    };
  }

}
