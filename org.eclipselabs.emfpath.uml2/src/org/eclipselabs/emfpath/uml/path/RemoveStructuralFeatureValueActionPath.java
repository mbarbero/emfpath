package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;

/**
 * @generated
 */
public class RemoveStructuralFeatureValueActionPath extends WriteStructuralFeatureActionPath {

	/**
	 * @generated
	 */
	private RemoveStructuralFeatureValueActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#isRemoveDuplicates()
	 * @generated
	 */
	public static final Predicate<RemoveStructuralFeatureValueAction> isRemoveDuplicates = new Predicate<RemoveStructuralFeatureValueAction>() {
		public boolean apply(RemoveStructuralFeatureValueAction s) {
			return s.isRemoveDuplicates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#getRemoveAt()
	 * @generated
	 */
	public static final Function<RemoveStructuralFeatureValueAction, InputPin> removeAt = new Function<RemoveStructuralFeatureValueAction, InputPin>() {
		public InputPin apply(RemoveStructuralFeatureValueAction s) {
			return s.getRemoveAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateNonUniqueRemoval()
	 * @generated
	 */
	public static Predicate<RemoveStructuralFeatureValueAction> validateNonUniqueRemoval(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<RemoveStructuralFeatureValueAction>() {
			public boolean apply(RemoveStructuralFeatureValueAction s) {
				return s.validateNonUniqueRemoval(diagnostics, context);
			}
		};
	}

}
