package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DeploymentTarget DeploymentTarget} in a functional way.
 * <p>
 * A deployment target is the location for a deployed artifact. 
 * @see org.eclipse.uml2.uml.DeploymentTarget
 * @generated
 */
public class DeploymentTargetPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 DeploymentTargetPath() {
		super();
	}

	/**
	 * The set of Deployments for a DeploymentTarget. 
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = new Function<DeploymentTarget, EList<Deployment>>() {
		public EList<Deployment> apply(DeploymentTarget s) {
			return s.getDeployments();
		}
	};

	/**
	 * The set of elements that are manifested in an Artifact that is involved in Deployment
	 * to a DeploymentTarget. 
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = new Function<DeploymentTarget, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(DeploymentTarget s) {
			return s.getDeployedElements();
		}
	};
	
	/**
	 * result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> getDeployedElements = new Function<DeploymentTarget, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(DeploymentTarget s) {
			return s.getDeployedElements();
		}
	};

}
