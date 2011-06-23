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
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Variable;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Activity Activity} in a functional way.
 * <p>
 * An activity is the specification of parameterized behavior as the coordinated sequencing
 * of subordinate units whose individual elements are actions. 
 * @see org.eclipse.uml2.uml.Activity
 * @generated
 */
public class ActivityPath extends BehaviorPath {

	/**
	 * @generated
	 */
	private ActivityPath() {
		super();
	}

	/**
	 * Top-level structured nodes in the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getStructuredNodes()
	 * @generated
	 */
	public static final Function<Activity, EList<StructuredActivityNode>> structuredNode = new Function<Activity, EList<StructuredActivityNode>>() {
		public EList<StructuredActivityNode> apply(Activity s) {
			return s.getStructuredNodes();
		}
	};

	/**
	 * Top-level variables in the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getVariables()
	 * @generated
	 */
	public static final Function<Activity, EList<Variable>> variable = new Function<Activity, EList<Variable>>() {
		public EList<Variable> apply(Activity s) {
			return s.getVariables();
		}
	};

	/**
	 * Nodes coordinated by the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getNodes()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityNode>> node = new Function<Activity, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(Activity s) {
			return s.getNodes();
		}
	};

	/**
	 * If true, this activity must not make any changes to variables outside the activity
	 * or to objects. (This is an assertion, not an executable property. It may be used by
	 * an execution engine to optimize model execution. If the assertion is violated by the
	 * action, then the model is ill-formed.) The default is false (an activity may make
	 * nonlocal changes). 
	 * @see org.eclipse.uml2.uml.Activity#isReadOnly()
	 * @generated
	 */
	public static final Predicate<Activity> isReadOnly = new Predicate<Activity>() {
		public boolean apply(Activity s) {
			return s.isReadOnly();
		}
	};

	/**
	 * Edges expressing flow between nodes of the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getEdges()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityEdge>> edge = new Function<Activity, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(Activity s) {
			return s.getEdges();
		}
	};

	/**
	 * Top-level partitions in the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getPartitions()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityPartition>> partition = new Function<Activity, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(Activity s) {
			return s.getPartitions();
		}
	};

	/**
	 * If true, all invocations of the activity are handled by the same execution. 
	 * @see org.eclipse.uml2.uml.Activity#isSingleExecution()
	 * @generated
	 */
	public static final Predicate<Activity> isSingleExecution = new Predicate<Activity>() {
		public boolean apply(Activity s) {
			return s.isSingleExecution();
		}
	};

	/**
	 * Top-level groups in the activity. 
	 * @see org.eclipse.uml2.uml.Activity#getGroups()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityGroup>> group = new Function<Activity, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(Activity s) {
			return s.getGroups();
		}
	};
	
	/**
	 * The groups of an activity have no supergroups.
	true 
	 * @see org.eclipse.uml2.uml.Activity#validateNoSupergroups(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Activity> validateNoSupergroups(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Activity>() {
			public boolean apply(Activity s) {
				return s.validateNoSupergroups(diagnostics, context);
			}
		};
	}

	/**
	 * The nodes of the activity must include one ActivityParameterNode for each parameter.
	true
	 * @see org.eclipse.uml2.uml.Activity#validateActivityParameterNode(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Activity> validateActivityParameterNode(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Activity>() {
			public boolean apply(Activity s) {
				return s.validateActivityParameterNode(diagnostics, context);
			}
		};
	}

	/**
	 * An activity cannot be autonomous and have a classifier or behavioral feature context
	 * at the same time.
	true 
	 * @see org.eclipse.uml2.uml.Activity#validateAutonomous(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Activity> validateAutonomous(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Activity>() {
			public boolean apply(Activity s) {
				return s.validateAutonomous(diagnostics, context);
			}
		};
	}

}
