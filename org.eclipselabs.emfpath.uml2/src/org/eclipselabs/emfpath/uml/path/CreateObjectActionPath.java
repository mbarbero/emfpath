package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CreateObjectAction CreateObjectAction} in a functional way.
 * <p>
 * A create object action is an action that creates an object that conforms to a statically
 * specified classifier and puts it on an output pin at runtime. 
 * @see org.eclipse.uml2.uml.CreateObjectAction
 * @generated
 */
public class CreateObjectActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private CreateObjectActionPath() {
		super();
	}

	/**
	 * Classifier to be instantiated. 
	 * @see org.eclipse.uml2.uml.CreateObjectAction#getClassifier()
	 * @generated
	 */
	public static final Function<CreateObjectAction, Classifier> classifier = new Function<CreateObjectAction, Classifier>() {
		public Classifier apply(CreateObjectAction s) {
			return s.getClassifier();
		}
	};

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.CreateObjectAction#getResult()
	 * @generated
	 */
	public static final Function<CreateObjectAction, OutputPin> result = new Function<CreateObjectAction, OutputPin>() {
		public OutputPin apply(CreateObjectAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * The classifier cannot be abstract.
	not (self.classifier.isAbstract = #true) 
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAbstract(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<CreateObjectAction> validateClassifierNotAbstract(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateObjectAction>() {
			public boolean apply(CreateObjectAction s) {
				return s.validateClassifierNotAbstract(diagnostics, context);
			}
		};
	}

	/**
	 * The classifier cannot be an association class
	not self.classifier.oclIsKindOf(AssociationClass)
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAssociationClass(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<CreateObjectAction> validateClassifierNotAssociationClass(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateObjectAction>() {
			public boolean apply(CreateObjectAction s) {
				return s.validateClassifierNotAssociationClass(diagnostics, context);
			}
		};
	}

	/**
	 * The type of the result pin must be the same as the classifier of the action.
	self.result.type
	 * = self.classifier 
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<CreateObjectAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateObjectAction>() {
			public boolean apply(CreateObjectAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the output pin is 1..1.
	self.result.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<CreateObjectAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateObjectAction>() {
			public boolean apply(CreateObjectAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
