package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadExtentAction ReadExtentAction} in a functional way.
 * <p>
 * A read extent action is an action that retrieves the current instances of a classifier.
 * @see org.eclipse.uml2.uml.ReadExtentAction
 * @generated
 */
public class ReadExtentActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadExtentActionPath() {
    super();
  }

	/**
	 * The runtime instances of the classifier. 
	 * @see org.eclipse.uml2.uml.ReadExtentAction#getResult()
	 * @generated
	 */
	public static final Function<ReadExtentAction, OutputPin> result = new Function<ReadExtentAction, OutputPin>() {
    public OutputPin apply(ReadExtentAction s) {
      return s.getResult();
    }
  };

	/**
	 * The classifier whose instances are to be retrieved. 
	 * @see org.eclipse.uml2.uml.ReadExtentAction#getClassifier()
	 * @generated
	 */
	public static final Function<ReadExtentAction, Classifier> classifier = new Function<ReadExtentAction, Classifier>() {
    public Classifier apply(ReadExtentAction s) {
      return s.getClassifier();
    }
  };
	
	/**
	 * The type of the result output pin is the classifier.
	true 
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadExtentAction> validateTypeIsClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadExtentAction>() {
      public boolean apply(ReadExtentAction s) {
        return s.validateTypeIsClassifier(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the result output pin is 0..*.
	self.result.multiplicity.is(0,#null)
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadExtentAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadExtentAction>() {
      public boolean apply(ReadExtentAction s) {
        return s.validateMultiplicityOfResult(diagnostics, context);
      }
    };
  }

}
