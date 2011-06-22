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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getResults()
	 * @generated
	 */
	public static final Function<UnmarshallAction, EList<OutputPin>> result = new Function<UnmarshallAction, EList<OutputPin>>() {
		public EList<OutputPin> apply(UnmarshallAction s) {
			return s.getResults();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getUnmarshallType()
	 * @generated
	 */
	public static final Function<UnmarshallAction, Classifier> unmarshallType = new Function<UnmarshallAction, Classifier>() {
		public Classifier apply(UnmarshallAction s) {
			return s.getUnmarshallType();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.UnmarshallAction#getObject()
	 * @generated
	 */
	public static final Function<UnmarshallAction, InputPin> object = new Function<UnmarshallAction, InputPin>() {
		public InputPin apply(UnmarshallAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateSameType()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateMultiplicityOfObject()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateNumberOfResult()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateTypeAndOrdering()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateMultiplicityOfResult()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateStructuralFeature()
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
	 * @see org.eclipse.uml2.uml.UnmarshallAction#validateUnmarshallTypeIsClassifier()
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
