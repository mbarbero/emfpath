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
	 * @see org.eclipse.uml2.uml.Activity#getStructuredNodes()
	 * @generated
	 */
	public static final Function<Activity, EList<StructuredActivityNode>> structuredNode = new Function<Activity, EList<StructuredActivityNode>>() {
		public EList<StructuredActivityNode> apply(Activity s) {
			return s.getStructuredNodes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#getVariables()
	 * @generated
	 */
	public static final Function<Activity, EList<Variable>> variable = new Function<Activity, EList<Variable>>() {
		public EList<Variable> apply(Activity s) {
			return s.getVariables();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#getNodes()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityNode>> node = new Function<Activity, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(Activity s) {
			return s.getNodes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#isReadOnly()
	 * @generated
	 */
	public static final Predicate<Activity> isReadOnly = new Predicate<Activity>() {
		public boolean apply(Activity s) {
			return s.isReadOnly();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#getEdges()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityEdge>> edge = new Function<Activity, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(Activity s) {
			return s.getEdges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#getPartitions()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityPartition>> partition = new Function<Activity, EList<ActivityPartition>>() {
		public EList<ActivityPartition> apply(Activity s) {
			return s.getPartitions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#isSingleExecution()
	 * @generated
	 */
	public static final Predicate<Activity> isSingleExecution = new Predicate<Activity>() {
		public boolean apply(Activity s) {
			return s.isSingleExecution();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Activity#getGroups()
	 * @generated
	 */
	public static final Function<Activity, EList<ActivityGroup>> group = new Function<Activity, EList<ActivityGroup>>() {
		public EList<ActivityGroup> apply(Activity s) {
			return s.getGroups();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Activity#validateNoSupergroups()
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
	 * @see org.eclipse.uml2.uml.Activity#validateActivityParameterNode()
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
	 * @see org.eclipse.uml2.uml.Activity#validateAutonomous()
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
