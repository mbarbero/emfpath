package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.OutputPin;

/**
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
	 * @see org.eclipse.uml2.uml.CreateObjectAction#getClassifier()
	 * @generated
	 */
	public static final Function<CreateObjectAction, Classifier> classifier = new Function<CreateObjectAction, Classifier>() {
		public Classifier apply(CreateObjectAction s) {
			return s.getClassifier();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CreateObjectAction#getResult()
	 * @generated
	 */
	public static final Function<CreateObjectAction, OutputPin> result = new Function<CreateObjectAction, OutputPin>() {
		public OutputPin apply(CreateObjectAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAbstract()
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
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAssociationClass()
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
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateSameType()
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
	 * @see org.eclipse.uml2.uml.CreateObjectAction#validateMultiplicity()
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
