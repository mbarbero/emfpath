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
import org.eclipse.uml2.uml.Element;

/**
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
	 * @see org.eclipse.uml2.uml.ActivityPartition#isDimension()
	 * @generated
	 */
	public static final Predicate<ActivityPartition> isDimension = new Predicate<ActivityPartition>() {
		public boolean apply(ActivityPartition s) {
			return s.isDimension();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#isExternal()
	 * @generated
	 */
	public static final Predicate<ActivityPartition> isExternal = new Predicate<ActivityPartition>() {
		public boolean apply(ActivityPartition s) {
			return s.isExternal();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#getNodes()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityNode>> node = new Function<ActivityPartition, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(ActivityPartition s) {
			return s.getNodes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSubpartitions()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityPartition>> subpartition = new Function<ActivityPartition, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(ActivityPartition s) {
			return s.getSubpartitions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#getSuperPartition()
	 * @generated
	 */
	public static final Function<ActivityPartition, ActivityPartition> superPartition = new Function<ActivityPartition, ActivityPartition>() {
		public ActivityPartition apply(ActivityPartition s) {
			return s.getSuperPartition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#getRepresents()
	 * @generated
	 */
	public static final Function<ActivityPartition, Element> represents = new Function<ActivityPartition, Element>() {
		public Element apply(ActivityPartition s) {
			return s.getRepresents();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#getEdges()
	 * @generated
	 */
	public static final Function<ActivityPartition, EList<ActivityEdge>> edge = new Function<ActivityPartition, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(ActivityPartition s) {
			return s.getEdges();
		}
	};
	
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
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateDimensionNotContained()
	 * @generated
	 */
	public static Predicate<ActivityPartition> validateDimensionNotContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityPartition>() {
			public boolean apply(ActivityPartition s) {
				return s.validateDimensionNotContained(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPart()
	 * @generated
	 */
	public static Predicate<ActivityPartition> validateRepresentsPart(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityPartition>() {
			public boolean apply(ActivityPartition s) {
				return s.validateRepresentsPart(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsClassifier()
	 * @generated
	 */
	public static Predicate<ActivityPartition> validateRepresentsClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityPartition>() {
			public boolean apply(ActivityPartition s) {
				return s.validateRepresentsClassifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ActivityPartition#validateRepresentsPartAndIsContained()
	 * @generated
	 */
	public static Predicate<ActivityPartition> validateRepresentsPartAndIsContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ActivityPartition>() {
			public boolean apply(ActivityPartition s) {
				return s.validateRepresentsPartAndIsContained(diagnostics, context);
			}
		};
	}

}
