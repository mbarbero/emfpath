package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.RemoveVariableValueAction RemoveVariableValueAction} in a functional way.
 * <p>
 * A remove variable value action is a write variable action that removes values from
 * variables. 
 * @see org.eclipse.uml2.uml.RemoveVariableValueAction
 * @generated
 */
public class RemoveVariableValueActionPath extends WriteVariableActionPath {

	/**
	 * @generated
	 */
	private RemoveVariableValueActionPath() {
    super();
  }

	/**
	 * Specifies whether to remove duplicates of the value in nonunique variables. 
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#isRemoveDuplicates()
	 * @generated
	 */
	public static final ComposablePredicate<RemoveVariableValueAction> isRemoveDuplicates = new ComposablePredicate<RemoveVariableValueAction>() {
    public boolean apply(RemoveVariableValueAction s) {
      return s.isRemoveDuplicates();
    }
  };

	/**
	 * Specifies the position of an existing value to remove in ordered nonunique variables.
	 * The type of the pin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#getRemoveAt()
	 * @generated
	 */
	public static final Function<RemoveVariableValueAction, InputPin> removeAt = new Function<RemoveVariableValueAction, InputPin>() {
    public InputPin apply(RemoveVariableValueAction s) {
      return s.getRemoveAt();
    }
  };
	
	/**
	 * Actions removing a value from ordered nonunique variables must have a single removeAt
	 * input pin if isRemoveDuplicates is false. It must be of type UnlimitedNatural with
	 * multiplicity of 1..1, otherwise the action has no removeAt input pin.
	true 
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#validateUnlimitedNatural(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<RemoveVariableValueAction> validateUnlimitedNatural(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<RemoveVariableValueAction>() {
      public boolean apply(RemoveVariableValueAction s) {
        return s.validateUnlimitedNatural(diagnostics, context);
      }
    };
  }

}
