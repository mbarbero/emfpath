package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.PackageableElement;

/**
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
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployments()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = new Function<DeploymentTarget, EList<Deployment>>() {
		public EList<Deployment> apply(DeploymentTarget s) {
			return s.getDeployments();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = new Function<DeploymentTarget, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(DeploymentTarget s) {
			return s.getDeployedElements();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> getDeployedElements = new Function<DeploymentTarget, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(DeploymentTarget s) {
			return s.getDeployedElements();
		}
	};

}
