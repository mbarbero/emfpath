package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;

/**
 * @generated
 */
public class ReadIsClassifiedObjectActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadIsClassifiedObjectActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#isDirect()
	 * @generated
	 */
	public static final Predicate<ReadIsClassifiedObjectAction> isDirect = new Predicate<ReadIsClassifiedObjectAction>() {
		public boolean apply(ReadIsClassifiedObjectAction s) {
			return s.isDirect();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getClassifier()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, Classifier> classifier = new Function<ReadIsClassifiedObjectAction, Classifier>() {
		public Classifier apply(ReadIsClassifiedObjectAction s) {
			return s.getClassifier();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getResult()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, OutputPin> result = new Function<ReadIsClassifiedObjectAction, OutputPin>() {
		public OutputPin apply(ReadIsClassifiedObjectAction s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getObject()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, InputPin> object = new Function<ReadIsClassifiedObjectAction, InputPin>() {
		public InputPin apply(ReadIsClassifiedObjectAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfInput()
	 * @generated
	 */
	public static Predicate<ReadIsClassifiedObjectAction> validateMultiplicityOfInput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadIsClassifiedObjectAction>() {
			public boolean apply(ReadIsClassifiedObjectAction s) {
				return s.validateMultiplicityOfInput(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateNoType()
	 * @generated
	 */
	public static Predicate<ReadIsClassifiedObjectAction> validateNoType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadIsClassifiedObjectAction>() {
			public boolean apply(ReadIsClassifiedObjectAction s) {
				return s.validateNoType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfOutput()
	 * @generated
	 */
	public static Predicate<ReadIsClassifiedObjectAction> validateMultiplicityOfOutput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadIsClassifiedObjectAction>() {
			public boolean apply(ReadIsClassifiedObjectAction s) {
				return s.validateMultiplicityOfOutput(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateBooleanResult()
	 * @generated
	 */
	public static Predicate<ReadIsClassifiedObjectAction> validateBooleanResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadIsClassifiedObjectAction>() {
			public boolean apply(ReadIsClassifiedObjectAction s) {
				return s.validateBooleanResult(diagnostics, context);
			}
		};
	}

}
