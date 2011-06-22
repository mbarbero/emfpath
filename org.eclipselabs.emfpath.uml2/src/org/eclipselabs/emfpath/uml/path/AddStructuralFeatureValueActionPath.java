package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * @generated
 */
public class AddStructuralFeatureValueActionPath extends WriteStructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private AddStructuralFeatureValueActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<AddStructuralFeatureValueAction> isReplaceAll = new Predicate<AddStructuralFeatureValueAction>() {
		public boolean apply(AddStructuralFeatureValueAction s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#getInsertAt()
	 * @generated
	 */
	public static final Function<AddStructuralFeatureValueAction, InputPin> insertAt = new Function<AddStructuralFeatureValueAction, InputPin>() {
		public InputPin apply(AddStructuralFeatureValueAction s) {
			return s.getInsertAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#validateUnlimitedNaturalAndMultiplicity()
	 * @generated
	 */
	public static Predicate<AddStructuralFeatureValueAction> validateUnlimitedNaturalAndMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AddStructuralFeatureValueAction>() {
			public boolean apply(AddStructuralFeatureValueAction s) {
				return s.validateUnlimitedNaturalAndMultiplicity(diagnostics, context);
			}
		};
	}

}
