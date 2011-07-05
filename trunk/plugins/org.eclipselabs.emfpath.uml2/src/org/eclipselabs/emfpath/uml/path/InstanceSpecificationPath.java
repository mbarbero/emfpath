package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InstanceSpecification InstanceSpecification} in a functional way.
 * <p>
 * An instance specification is a model element that represents an instance in a modeled
 * system.
An instance specification has the capability of being a deployment target
 * in a deployment relationship, in the case that it is an instance of a node. It is
 * also has the capability of being a deployed artifact, if it is an instance of an artifact.
 * @see org.eclipse.uml2.uml.InstanceSpecification
 * @generated
 */
public class InstanceSpecificationPath extends DeploymentTargetPath {

	/**
	 * @generated
	 */
	 InstanceSpecificationPath() {
    super();
  }

	/**
	 * The formal template parameter that owns this element. 
	 *
	 * @see ParameterableElementPath#owningTemplateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 *
	 * @see ParameterableElementPath#templateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * The classifier or classifiers of the represented instance. If multiple classifiers
	 * are specified, the instance is classified by all of them. 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getClassifiers()
	 * @generated
	 */
	public static final Function<InstanceSpecification, EList<Classifier>> classifier = new Function<InstanceSpecification, EList<Classifier>>() {
    public EList<Classifier> apply(InstanceSpecification s) {
      return s.getClassifiers();
    }
  };

	/**
	 * A slot giving the value or values of a structural feature of the instance. An instance
	 * specification can have one slot per structural feature of its classifiers, including
	 * inherited features. It is not necessary to model a slot for each structural feature,
	 * in which case the instance specification is a partial description. 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getSlots()
	 * @generated
	 */
	public static final Function<InstanceSpecification, EList<Slot>> slot = new Function<InstanceSpecification, EList<Slot>>() {
    public EList<Slot> apply(InstanceSpecification s) {
      return s.getSlots();
    }
  };

	/**
	 * A specification of how to compute, derive, or construct the instance. 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getSpecification()
	 * @generated
	 */
	public static final Function<InstanceSpecification, ValueSpecification> specification = new Function<InstanceSpecification, ValueSpecification>() {
    public ValueSpecification apply(InstanceSpecification s) {
      return s.getSpecification();
    }
  };
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 *
	 * @see ParameterableElementPath#isCompatibleWith()
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static ComposablePredicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
    return ParameterableElementPath.isCompatibleWith(p);
  }

	/**
	 * The defining feature of each slot is a structural feature (directly or inherited)
	 * of a classifier of the instance specification.
	slot->forAll(s | classifier->exists
	 * (c | c.allFeatures()->includes (s.definingFeature))) 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDefiningFeature(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InstanceSpecification> validateDefiningFeature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InstanceSpecification>() {
      public boolean apply(InstanceSpecification s) {
        return s.validateDefiningFeature(diagnostics, context);
      }
    };
  }

	/**
	 * One structural feature (including the same feature inherited from multiple classifiers)
	 * is the defining feature of at most one slot in an instance specification.
	classifier->forAll(c
	 * | (c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <=
	 * 1))) 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateStructuralFeature(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InstanceSpecification> validateStructuralFeature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InstanceSpecification>() {
      public boolean apply(InstanceSpecification s) {
        return s.validateStructuralFeature(diagnostics, context);
      }
    };
  }

	/**
	 * An InstanceSpecification can be a DeploymentTarget if it is the instance specification
	 * of a Node and functions as a part in the internal structure of an encompassing Node.
	true
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDeploymentTarget(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InstanceSpecification> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InstanceSpecification>() {
      public boolean apply(InstanceSpecification s) {
        return s.validateDeploymentTarget(diagnostics, context);
      }
    };
  }

	/**
	 * An InstanceSpecification can be a DeployedArtifact if it is the instance specification
	 * of an Artifact.
	true 
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDeploymentArtifact(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InstanceSpecification> validateDeploymentArtifact(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InstanceSpecification>() {
      public boolean apply(InstanceSpecification s) {
        return s.validateDeploymentArtifact(diagnostics, context);
      }
    };
  }

}
