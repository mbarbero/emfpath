package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;

/**
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
	 * @see org.eclipse.uml2.uml.Deployment#getDeployedArtifacts()
	 * @generated
	 */
	public static final Function<Deployment, EList<DeployedArtifact>> deployedArtifact = new Function<Deployment, EList<DeployedArtifact>>() {
		public EList<DeployedArtifact> apply(Deployment s) {
			return s.getDeployedArtifacts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Deployment#getConfigurations()
	 * @generated
	 */
	public static final Function<Deployment, EList<DeploymentSpecification>> configuration = new Function<Deployment, EList<DeploymentSpecification>>() {
		public EList<DeploymentSpecification> apply(Deployment s) {
			return s.getConfigurations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Deployment#getLocation()
	 * @generated
	 */
	public static final Function<Deployment, DeploymentTarget> location = new Function<Deployment, DeploymentTarget>() {
		public DeploymentTarget apply(Deployment s) {
			return s.getLocation();
		}
	};
	
	

}
