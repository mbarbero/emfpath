package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class ClearStructuralFeatureActionPath extends StructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private ClearStructuralFeatureActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<ClearStructuralFeatureAction, OutputPin> result = new Function<ClearStructuralFeatureAction, OutputPin>() {
		public OutputPin apply(ClearStructuralFeatureAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#validateTypeOfResult()
	 * @generated
	 */
	public static Predicate<ClearStructuralFeatureAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ClearStructuralFeatureAction>() {
			public boolean apply(ClearStructuralFeatureAction s) {
				return s.validateTypeOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ClearStructuralFeatureAction#validateMultiplicityOfResult()
	 * @generated
	 */
	public static Predicate<ClearStructuralFeatureAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ClearStructuralFeatureAction>() {
			public boolean apply(ClearStructuralFeatureAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

}
