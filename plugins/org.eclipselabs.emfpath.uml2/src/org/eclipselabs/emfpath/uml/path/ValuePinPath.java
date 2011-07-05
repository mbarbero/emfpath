package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ValuePin ValuePin} in a functional way.
 * <p>
 * A value pin is an input pin that provides a value by evaluating a value specification.
 * @see org.eclipse.uml2.uml.ValuePin
 * @generated
 */
public class ValuePinPath extends InputPinPath {

	/**
	 * @generated
	 */
	private ValuePinPath() {
    super();
  }

	/**
	 * Value that the pin will provide. 
	 * @see org.eclipse.uml2.uml.ValuePin#getValue()
	 * @generated
	 */
	public static final Function<ValuePin, ValueSpecification> value = new Function<ValuePin, ValueSpecification>() {
    public ValueSpecification apply(ValuePin s) {
      return s.getValue();
    }
  };
	
	/**
	 * The type of value specification must be compatible with the type of the value pin.
	true
	 * @see org.eclipse.uml2.uml.ValuePin#validateCompatibleType(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ValuePin> validateCompatibleType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ValuePin>() {
      public boolean apply(ValuePin s) {
        return s.validateCompatibleType(diagnostics, context);
      }
    };
  }

	/**
	 * Value pins have no incoming edges.
	true 
	 * @see org.eclipse.uml2.uml.ValuePin#validateNoIncomingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ValuePin> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ValuePin>() {
      public boolean apply(ValuePin s) {
        return s.validateNoIncomingEdges(diagnostics, context);
      }
    };
  }

}
