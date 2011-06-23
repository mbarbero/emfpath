package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ValueSpecificationAction ValueSpecificationAction} in a functional way.
 * <p>
 * A value specification action is an action that evaluates a value specification. 
 * @see org.eclipse.uml2.uml.ValueSpecificationAction
 * @generated
 */
public class ValueSpecificationActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ValueSpecificationActionPath() {
		super();
	}

	/**
	 * Value specification to be evaluated. 
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#getValue()
	 * @generated
	 */
	public static final Function<ValueSpecificationAction, ValueSpecification> value = new Function<ValueSpecificationAction, ValueSpecification>() {
		public ValueSpecification apply(ValueSpecificationAction s) {
			return s.getValue();
		}
	};

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#getResult()
	 * @generated
	 */
	public static final Function<ValueSpecificationAction, OutputPin> result = new Function<ValueSpecificationAction, OutputPin>() {
		public OutputPin apply(ValueSpecificationAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * The type of value specification must be compatible with the type of the result pin.
	true
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateCompatibleType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ValueSpecificationAction> validateCompatibleType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ValueSpecificationAction>() {
			public boolean apply(ValueSpecificationAction s) {
				return s.validateCompatibleType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the result pin is 1..1
	true 
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ValueSpecificationAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ValueSpecificationAction>() {
			public boolean apply(ValueSpecificationAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
