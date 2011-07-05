package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.AddStructuralFeatureValueAction AddStructuralFeatureValueAction} in a functional way.
 * <p>
 * An add structural feature value action is a write structural feature action for adding
 * values to a structural feature. 
 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction
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
	 * Specifies whether existing values of the structural feature of the object should be
	 * removed before adding the new value. 
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#isReplaceAll()
	 * @generated
	 */
	public static final ComposablePredicate<AddStructuralFeatureValueAction> isReplaceAll = new ComposablePredicate<AddStructuralFeatureValueAction>() {
    public boolean apply(AddStructuralFeatureValueAction s) {
      return s.isReplaceAll();
    }
  };

	/**
	 * Gives the position at which to insert a new value or move an existing value in ordered
	 * structural features. The type of the pin is UnlimitedNatural, but the value cannot
	 * be zero. This pin is omitted for unordered structural features. 
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#getInsertAt()
	 * @generated
	 */
	public static final Function<AddStructuralFeatureValueAction, InputPin> insertAt = new Function<AddStructuralFeatureValueAction, InputPin>() {
    public InputPin apply(AddStructuralFeatureValueAction s) {
      return s.getInsertAt();
    }
  };
	
	/**
	 * Actions adding a value to ordered structural features must have a single input pin
	 * for the insertion point with type UnlimitedNatural and multiplicity of 1..1, otherwise
	 * the action has no input pin for the insertion point.
	let insertAtPins : Collection
	 * = self.insertAt in
	if self.structuralFeature.isOrdered = #false
	then insertAtPins->size()
	 * = 0
	else let insertAtPin : InputPin= insertAt->asSequence()->first() in
	insertAtPins->size()
	 * = 1
	and insertAtPin.type = UnlimitedNatural
	and insertAtPin.multiplicity.is(1,1))
	endif
	
	 * @see org.eclipse.uml2.uml.AddStructuralFeatureValueAction#validateUnlimitedNaturalAndMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<AddStructuralFeatureValueAction> validateUnlimitedNaturalAndMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<AddStructuralFeatureValueAction>() {
      public boolean apply(AddStructuralFeatureValueAction s) {
        return s.validateUnlimitedNaturalAndMultiplicity(diagnostics, context);
      }
    };
  }

}
