package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction RemoveStructuralFeatureValueAction} in a functional way.
 * <p>
 * A remove structural feature value action is a write structural feature action that
 * removes values from structural features. 
 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction
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
	 * Specifies whether to remove duplicates of the value in nonunique structural features.
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#isRemoveDuplicates()
	 * @generated
	 */
	public static final Predicate<RemoveStructuralFeatureValueAction> isRemoveDuplicates = new Predicate<RemoveStructuralFeatureValueAction>() {
		public boolean apply(RemoveStructuralFeatureValueAction s) {
			return s.isRemoveDuplicates();
		}
	};

	/**
	 * Specifies the position of an existing value to remove in ordered nonunique structural
	 * features. The type of the pin is UnlimitedNatural, but the value cannot be zero or
	 * unlimited. 
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#getRemoveAt()
	 * @generated
	 */
	public static final Function<RemoveStructuralFeatureValueAction, InputPin> removeAt = new Function<RemoveStructuralFeatureValueAction, InputPin>() {
		public InputPin apply(RemoveStructuralFeatureValueAction s) {
			return s.getRemoveAt();
		}
	};
	
	/**
	 * Actions removing a value from ordered nonunique structural features must have a single
	 * removeAt input pin if isRemoveDuplicates is false. It must be of type Unlimited Natural
	 * with multiplicity 1..1. Otherwise, the action has no removeAt input pin.
	
	true 
	 * @see org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction#validateNonUniqueRemoval(DiagnosticChain, Map)
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
