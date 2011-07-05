package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.WriteStructuralFeatureAction WriteStructuralFeatureAction} in a functional way.
 * <p>
 * WriteStructuralFeatureAction is an abstract class for structural feature actions that
 * change structural feature values. 
 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction
 * @generated
 */
public class WriteStructuralFeatureActionPath extends StructuralFeatureActionPath {

	/**
	 * @generated
	 */
	 WriteStructuralFeatureActionPath() {
    super();
  }

	/**
	 * Value to be added or removed from the structural feature. 
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#getValue()
	 * @generated
	 */
	public static final Function<WriteStructuralFeatureAction, InputPin> value = new Function<WriteStructuralFeatureAction, InputPin>() {
    public InputPin apply(WriteStructuralFeatureAction s) {
      return s.getValue();
    }
  };

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<WriteStructuralFeatureAction, OutputPin> result = new Function<WriteStructuralFeatureAction, OutputPin>() {
    public OutputPin apply(WriteStructuralFeatureAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * The type input pin is the same as the classifier of the structural feature.
	self.value.type
	 * = self.structuralFeature.featuringClassifier 
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<WriteStructuralFeatureAction> validateInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<WriteStructuralFeatureAction>() {
      public boolean apply(WriteStructuralFeatureAction s) {
        return s.validateInputPin(diagnostics, context);
      }
    };
  }

	/**
	 * The type of the result output pin is the same as the type of the inherited object
	 * input pin.
	result->notEmpty() implies self.result.type = self.object.type 
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateTypeOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<WriteStructuralFeatureAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<WriteStructuralFeatureAction>() {
      public boolean apply(WriteStructuralFeatureAction s) {
        return s.validateTypeOfResult(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the result output pin must be 1..1.
	result->notEmpty() implies
	 * self.result.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateMultiplicityOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<WriteStructuralFeatureAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<WriteStructuralFeatureAction>() {
      public boolean apply(WriteStructuralFeatureAction s) {
        return s.validateMultiplicityOfResult(diagnostics, context);
      }
    };
  }

}
