package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;

/**
 * @generated
 */
public class ReadStructuralFeatureActionPath extends StructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private ReadStructuralFeatureActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadStructuralFeatureAction#getResult()
	 * @generated
	 */
	public static final Function<ReadStructuralFeatureAction, OutputPin> result = new Function<ReadStructuralFeatureAction, OutputPin>() {
		public OutputPin apply(ReadStructuralFeatureAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadStructuralFeatureAction#validateTypeAndOrdering()
	 * @generated
	 */
	public static Predicate<ReadStructuralFeatureAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadStructuralFeatureAction>() {
			public boolean apply(ReadStructuralFeatureAction s) {
				return s.validateTypeAndOrdering(diagnostics, context);
			}
		};
	}

}
