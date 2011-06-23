package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Deployment Deployment} in a functional way.
 * <p>
 * A deployment is the allocation of an artifact or artifact instance to a deployment
 * target.
A component deployment is the deployment of one or more artifacts or artifact
 * instances to a deployment target, optionally parameterized by a deployment specification.
 * Examples are executables and configuration files. 
 * @see org.eclipse.uml2.uml.Deployment
 * @generated
 */
public class DeploymentPath extends DependencyPath {

	/**
	 * @generated
	 */
	private DeploymentPath() {
		super();
	}

	/**
	 * The Artifacts that are deployed onto a Node. This association specializes the supplier
	 * association. 
	 * @see org.eclipse.uml2.uml.Deployment#getDeployedArtifacts()
	 * @generated
	 */
	public static final Function<Deployment, EList<DeployedArtifact>> deployedArtifact = new Function<Deployment, EList<DeployedArtifact>>() {
		public EList<DeployedArtifact> apply(Deployment s) {
			return s.getDeployedArtifacts();
		}
	};

	/**
	 * The specification of properties that parameterize the deployment and execution of
	 * one or more Artifacts. 
	 * @see org.eclipse.uml2.uml.Deployment#getConfigurations()
	 * @generated
	 */
	public static final Function<Deployment, EList<DeploymentSpecification>> configuration = new Function<Deployment, EList<DeploymentSpecification>>() {
		public EList<DeploymentSpecification> apply(Deployment s) {
			return s.getConfigurations();
		}
	};

	/**
	 * The DeployedTarget which is the target of a Deployment. 
	 * @see org.eclipse.uml2.uml.Deployment#getLocation()
	 * @generated
	 */
	public static final Function<Deployment, DeploymentTarget> location = new Function<Deployment, DeploymentTarget>() {
		public DeploymentTarget apply(Deployment s) {
			return s.getLocation();
		}
	};
	
	

}
