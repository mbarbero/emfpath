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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadIsClassifiedObjectAction ReadIsClassifiedObjectAction} in a functional way.
 * <p>
 * A read is classified object action is an action that determines whether a runtime
 * object is classified by a given classifier. 
 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction
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
	 * Indicates whether the classifier must directly classify the input object. 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#isDirect()
	 * @generated
	 */
	public static final Predicate<ReadIsClassifiedObjectAction> isDirect = new Predicate<ReadIsClassifiedObjectAction>() {
		public boolean apply(ReadIsClassifiedObjectAction s) {
			return s.isDirect();
		}
	};

	/**
	 * The classifier against which the classification of the input object is tested. 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getClassifier()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, Classifier> classifier = new Function<ReadIsClassifiedObjectAction, Classifier>() {
		public Classifier apply(ReadIsClassifiedObjectAction s) {
			return s.getClassifier();
		}
	};

	/**
	 * After termination of the action, will hold the result of the test. 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getResult()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, OutputPin> result = new Function<ReadIsClassifiedObjectAction, OutputPin>() {
		public OutputPin apply(ReadIsClassifiedObjectAction s) {
			return s.getResult();
		}
	};

	/**
	 * Holds the object whose classification is to be tested. 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#getObject()
	 * @generated
	 */
	public static final Function<ReadIsClassifiedObjectAction, InputPin> object = new Function<ReadIsClassifiedObjectAction, InputPin>() {
		public InputPin apply(ReadIsClassifiedObjectAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * The multiplicity of the input pin is 1..1.
	self.object.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfInput(DiagnosticChain, Map)
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
	 * The input pin has no type.
	self.object.type->isEmpty() 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateNoType(DiagnosticChain, Map)
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
	 * The multiplicity of the output pin is 1..1.
	self.result.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfOutput(DiagnosticChain, Map)
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
	 * The type of the output pin is Boolean
	self.result.type = Boolean 
	 * @see org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateBooleanResult(DiagnosticChain, Map)
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
