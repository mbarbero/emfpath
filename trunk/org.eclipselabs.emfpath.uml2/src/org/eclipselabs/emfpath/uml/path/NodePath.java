package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Node Node} in a functional way.
 * <p>
 * A node is computational resource upon which artifacts may be deployed for execution.
Nodes
 * can be interconnected through communication paths to define network structures. 
 * @see org.eclipse.uml2.uml.Node
 * @generated
 */
public class NodePath extends ClassPath {

	/**
	 * @generated
	 */
	 NodePath() {
		super();
	}

	/**
	 * The set of Deployments for a DeploymentTarget. 
	 *
	 * @see DeploymentTargetPath#deployment()
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = DeploymentTargetPath.deployment;

	/**
	 * The set of elements that are manifested in an Artifact that is involved in Deployment
	 * to a DeploymentTarget. 
	 *
	 * @see DeploymentTargetPath#deployedElement()
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = DeploymentTargetPath.deployedElement;

	/**
	 * The Nodes that are defined (nested) within the Node. 
	 * @see org.eclipse.uml2.uml.Node#getNestedNodes()
	 * @generated
	 */
	public static final Function<Node, EList<Node>> nestedNode = new Function<Node, EList<Node>>() {
		public EList<Node> apply(Node s) {
			return s.getNestedNodes();
		}
	};
	
	/**
	 * The internal structure of a Node (if defined) consists solely of parts of type Node.
	true
	 * @see org.eclipse.uml2.uml.Node#validateInternalStructure(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Node> validateInternalStructure(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Node>() {
			public boolean apply(Node s) {
				return s.validateInternalStructure(diagnostics, context);
			}
		};
	}

	/**
	 * Creates a (binary) communication path between this node and the specified other node,
	 * with the specified navigabilities, aggregations, names, lower bounds, and upper bounds,
	 * and owned by this node's nearest package. 
	 * @see org.eclipse.uml2.uml.Node#createCommunicationPath(boolean, AggregationKind, String, int, int, Node, boolean, AggregationKind, String, int, int)
	 * @generated
	 */
	public static Function<Node, CommunicationPath> createCommunicationPath(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Node end1Node, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
		return new Function<Node, CommunicationPath>() {
			public CommunicationPath apply(Node s) {
				return s.createCommunicationPath(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Node, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
			}
		};
	}

	/**
	 * Retrieves the communication paths in which this node is involved. 
	 * @see org.eclipse.uml2.uml.Node#getCommunicationPaths()
	 * @generated
	 */
	public static final Function<Node, EList<CommunicationPath>> getCommunicationPaths = new Function<Node, EList<CommunicationPath>>() {
		public EList<CommunicationPath> apply(Node s) {
			return s.getCommunicationPaths();
		}
	};

}
