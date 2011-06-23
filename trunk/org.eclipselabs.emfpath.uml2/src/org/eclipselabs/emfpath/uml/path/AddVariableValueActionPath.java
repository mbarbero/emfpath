package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.AddVariableValueAction AddVariableValueAction} in a functional way.
 * <p>
 * An add variable value action is a write variable action for adding values to a variable.
 * @see org.eclipse.uml2.uml.AddVariableValueAction
 * @generated
 */
public class AddVariableValueActionPath extends WriteVariableActionPath {

	/**
	 * @generated
	 */
	private AddVariableValueActionPath() {
		super();
	}

	/**
	 * Specifies whether existing values of the variable should be removed before adding
	 * the new value. 
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<AddVariableValueAction> isReplaceAll = new Predicate<AddVariableValueAction>() {
		public boolean apply(AddVariableValueAction s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * Gives the position at which to insert a new value or move an existing value in ordered
	 * variables. The types is UnlimitedINatural, but the value cannot be zero. This pin
	 * is omitted for unordered variables. 
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#getInsertAt()
	 * @generated
	 */
	public static final Function<AddVariableValueAction, InputPin> insertAt = new Function<AddVariableValueAction, InputPin>() {
		public InputPin apply(AddVariableValueAction s) {
			return s.getInsertAt();
		}
	};
	
	/**
	 * Actions adding values to ordered variables must have a single input pin for the insertion
	 * point with type UnlimtedNatural and multiplicity of 1..1, otherwise the action has
	 * no input pin for the insertion point.
	let insertAtPins : Collection = self.insertAt
	 * in
	if self.variable.ordering = #unordered
	then insertAtPins->size() = 0
	else let insertAtPin
	 * : InputPin = insertAt->asSequence()->first() in
	insertAtPins->size() = 1
	and insertAtPin.type
	 * = UnlimitedNatural
	and insertAtPin.multiplicity.is(1,1))
	endif
	 
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#validateSingleInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<AddVariableValueAction> validateSingleInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AddVariableValueAction>() {
			public boolean apply(AddVariableValueAction s) {
				return s.validateSingleInputPin(diagnostics, context);
			}
		};
	}

}
