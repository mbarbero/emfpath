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
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = DeploymentTargetPath.deployment;

	/**
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = DeploymentTargetPath.deployedElement;

	/**
	 * @see org.eclipse.uml2.uml.Node#getNestedNodes()
	 * @generated
	 */
	public static final Function<Node, EList<Node>> nestedNode = new Function<Node, EList<Node>>() {
		public EList<Node> apply(Node s) {
			return s.getNestedNodes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Node#validateInternalStructure()
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
	 * @see org.eclipse.uml2.uml.Node#createCommunicationPath()
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
	 * @see org.eclipse.uml2.uml.Node#getCommunicationPaths()
	 * @generated
	 */
	public static final Function<Node, EList<CommunicationPath>> getCommunicationPaths = new Function<Node, EList<CommunicationPath>>() {
		public EList<CommunicationPath> apply(Node s) {
			return s.getCommunicationPaths();
		}
	};

}
