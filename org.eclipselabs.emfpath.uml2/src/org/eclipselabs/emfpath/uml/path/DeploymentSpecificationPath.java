package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DeploymentSpecification DeploymentSpecification} in a functional way.
 * <p>
 * A deployment specification specifies a set of properties that determine execution
 * parameters of a component artifact that is deployed on a node. A deployment specification
 * can be aimed at a specific type of container. An artifact that reifies or implements
 * deployment specification properties is a deployment descriptor. 
 * @see org.eclipse.uml2.uml.DeploymentSpecification
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
	 * The location where an Artifact is deployed onto a Node. This is typically a 'directory'
	 * or 'memory address'. 
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getDeploymentLocation()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, String> deploymentLocation = new Function<DeploymentSpecification, String>() {
    public String apply(DeploymentSpecification s) {
      return s.getDeploymentLocation();
    }
  };

	/**
	 * The location where a component Artifact executes. This may be a local or remote location.
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getExecutionLocation()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, String> executionLocation = new Function<DeploymentSpecification, String>() {
    public String apply(DeploymentSpecification s) {
      return s.getExecutionLocation();
    }
  };

	/**
	 * The deployment with which the DeploymentSpecification is associated. 
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#getDeployment()
	 * @generated
	 */
	public static final Function<DeploymentSpecification, Deployment> deployment = new Function<DeploymentSpecification, Deployment>() {
    public Deployment apply(DeploymentSpecification s) {
      return s.getDeployment();
    }
  };
	
	/**
	 * The deployedElements of a DeploymentTarget that are involved in a Deployment that
	 * has an associated Deployment-Specification is a kind of Component (i.e. the configured
	 * components).
	self.deployment->forAll (d | d.location.deployedElements->forAll (de
	 * |
	  de.oclIsKindOf(Component))) 
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#validateDeployedElements(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DeploymentSpecification> validateDeployedElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DeploymentSpecification>() {
      public boolean apply(DeploymentSpecification s) {
        return s.validateDeployedElements(diagnostics, context);
      }
    };
  }

	/**
	 * The DeploymentTarget of a DeploymentSpecification is a kind of ExecutionEnvironment.
	result
	 * = self.deployment->forAll (d | d.location..oclIsKindOf(ExecutionEnvironment)) 
	 * @see org.eclipse.uml2.uml.DeploymentSpecification#validateDeploymentTarget(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DeploymentSpecification> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DeploymentSpecification>() {
      public boolean apply(DeploymentSpecification s) {
        return s.validateDeploymentTarget(diagnostics, context);
      }
    };
  }

}
