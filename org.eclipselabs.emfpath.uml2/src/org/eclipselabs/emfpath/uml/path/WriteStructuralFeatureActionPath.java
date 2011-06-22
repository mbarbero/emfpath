package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;

/**
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
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#getValue()
	 * @generated
	 */
	public static final Function<WriteStructuralFeatureAction, InputPin> value = new Function<WriteStructuralFeatureAction, InputPin>() {
		public InputPin apply(WriteStructuralFeatureAction s) {
			return s.getValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<WriteStructuralFeatureAction, OutputPin> result = new Function<WriteStructuralFeatureAction, OutputPin>() {
		public OutputPin apply(WriteStructuralFeatureAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateInputPin()
	 * @generated
	 */
	public static Predicate<WriteStructuralFeatureAction> validateInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteStructuralFeatureAction>() {
			public boolean apply(WriteStructuralFeatureAction s) {
				return s.validateInputPin(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateTypeOfResult()
	 * @generated
	 */
	public static Predicate<WriteStructuralFeatureAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteStructuralFeatureAction>() {
			public boolean apply(WriteStructuralFeatureAction s) {
				return s.validateTypeOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.WriteStructuralFeatureAction#validateMultiplicityOfResult()
	 * @generated
	 */
	public static Predicate<WriteStructuralFeatureAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<WriteStructuralFeatureAction>() {
			public boolean apply(WriteStructuralFeatureAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

}
