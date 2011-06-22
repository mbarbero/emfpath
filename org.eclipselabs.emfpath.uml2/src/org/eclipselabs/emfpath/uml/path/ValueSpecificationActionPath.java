package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
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
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#getValue()
	 * @generated
	 */
	public static final Function<ValueSpecificationAction, ValueSpecification> value = new Function<ValueSpecificationAction, ValueSpecification>() {
		public ValueSpecification apply(ValueSpecificationAction s) {
			return s.getValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#getResult()
	 * @generated
	 */
	public static final Function<ValueSpecificationAction, OutputPin> result = new Function<ValueSpecificationAction, OutputPin>() {
		public OutputPin apply(ValueSpecificationAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateCompatibleType()
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
	 * @see org.eclipse.uml2.uml.ValueSpecificationAction#validateMultiplicity()
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
