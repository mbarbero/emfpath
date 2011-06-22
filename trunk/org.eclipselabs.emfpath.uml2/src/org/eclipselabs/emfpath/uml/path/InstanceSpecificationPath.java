package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getClassifiers()
	 * @generated
	 */
	public static final Function<InstanceSpecification, EList<Classifier>> classifier = new Function<InstanceSpecification, EList<Classifier>>() {
		public EList<Classifier> apply(InstanceSpecification s) {
			return s.getClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getSlots()
	 * @generated
	 */
	public static final Function<InstanceSpecification, EList<Slot>> slot = new Function<InstanceSpecification, EList<Slot>>() {
		public EList<Slot> apply(InstanceSpecification s) {
			return s.getSlots();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#getSpecification()
	 * @generated
	 */
	public static final Function<InstanceSpecification, ValueSpecification> specification = new Function<InstanceSpecification, ValueSpecification>() {
		public ValueSpecification apply(InstanceSpecification s) {
			return s.getSpecification();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDefiningFeature()
	 * @generated
	 */
	public static Predicate<InstanceSpecification> validateDefiningFeature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InstanceSpecification>() {
			public boolean apply(InstanceSpecification s) {
				return s.validateDefiningFeature(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateStructuralFeature()
	 * @generated
	 */
	public static Predicate<InstanceSpecification> validateStructuralFeature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InstanceSpecification>() {
			public boolean apply(InstanceSpecification s) {
				return s.validateStructuralFeature(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDeploymentTarget()
	 * @generated
	 */
	public static Predicate<InstanceSpecification> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InstanceSpecification>() {
			public boolean apply(InstanceSpecification s) {
				return s.validateDeploymentTarget(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InstanceSpecification#validateDeploymentArtifact()
	 * @generated
	 */
	public static Predicate<InstanceSpecification> validateDeploymentArtifact(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InstanceSpecification>() {
			public boolean apply(InstanceSpecification s) {
				return s.validateDeploymentArtifact(diagnostics, context);
			}
		};
	}

}
