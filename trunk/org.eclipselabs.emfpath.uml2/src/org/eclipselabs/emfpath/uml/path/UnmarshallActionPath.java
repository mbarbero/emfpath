package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.UnmarshallAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.UnmarshallAction UnmarshallAction} in a functional way.
 * <p>
 * An unmarshall action is an action that breaks an object of a known type into outputs
 * each of which is equal to a value from a structural feature of the object. 
 * @see org.eclipse.uml2.uml.UnmarshallAction
 * @generated
 */
public class UnmarshallActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private UnmarshallActionPath() {
		super();
	}

	/**
	 * The values of the structural features of the input object. 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getResults()
	 * @generated
	 */
	public static final Function<UnmarshallAction, EList<OutputPin>> result = new Function<UnmarshallAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(UnmarshallAction s) {
			return s.getResults();
		}
	};

	/**
	 * The type of the object to be unmarshalled. 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getUnmarshallType()
	 * @generated
	 */
	public static final Function<UnmarshallAction, Classifier> unmarshallType = new Function<UnmarshallAction, Classifier>() {
		public Classifier apply(UnmarshallAction s) {
			return s.getUnmarshallType();
		}
	};

	/**
	 * The object to be unmarshalled. 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getObject()
	 * @generated
	 */
	public static final Function<UnmarshallAction, InputPin> object = new Function<UnmarshallAction, InputPin>() {
		public InputPin apply(UnmarshallAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * The type of the object input pin must be the same as the unmarshall classifier.
	true
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the object input pin is 1..1
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateMultiplicityOfObject(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateMultiplicityOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateMultiplicityOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * The number of result output pins must be the same as the number of structural features
	 * of the unmarshall classifier.
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateNumberOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateNumberOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateNumberOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * The type and ordering of each result output pin must be the same as the corresponding
	 * structural feature of the unmarshall classifier.
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateTypeAndOrdering(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateTypeAndOrdering(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of each result output pin must be compatible with the multiplicity
	 * of the corresponding structural features of the unmarshall classifier.
	
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateMultiplicityOfResult(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * The unmarshall classifier must have at least one structural feature.
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateStructuralFeature(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateStructuralFeature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateStructuralFeature(diagnostics, context);
			}
		};
	}

	/**
	 * unmarshallType must be a Classifier with ordered attributes
	true 
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateUnmarshallTypeIsClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<UnmarshallAction> validateUnmarshallTypeIsClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UnmarshallAction>() {
			public boolean apply(UnmarshallAction s) {
				return s.validateUnmarshallTypeIsClassifier(diagnostics, context);
			}
		};
	}

}
