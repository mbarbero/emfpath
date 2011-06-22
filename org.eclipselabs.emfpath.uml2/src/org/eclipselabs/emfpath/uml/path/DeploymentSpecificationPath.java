package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;

/**
 * @generated
 */
public class DeploymentSpecificationPath extends ArtifactPath {

	/**
	 * @generated
	 */
	private DeploymentSpecificationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, String> deploymentLocation = new Function<DeploymentSpecification, String>() {
		public String apply(DeploymentSpecification s) {
			return s.getDeploymentLocation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, String> executionLocation = new Function<DeploymentSpecification, String>() {
		public String apply(DeploymentSpecification s) {
			return s.getExecutionLocation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getDeployment()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, Deployment> deployment = new Function<DeploymentSpecification, Deployment>() {
		public Deployment apply(DeploymentSpecification s) {
			return s.getDeployment();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#validateDeployedElements()
	 * @generated
	 */
	public static Predicate<DeploymentSpecification> validateDeployedElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DeploymentSpecification>() {
			public boolean apply(DeploymentSpecification s) {
				return s.validateDeployedElements(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#validateDeploymentTarget()
	 * @generated
	 */
	public static Predicate<DeploymentSpecification> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DeploymentSpecification>() {
			public boolean apply(DeploymentSpecification s) {
				return s.validateDeploymentTarget(diagnostics, context);
			}
		};
	}

}
