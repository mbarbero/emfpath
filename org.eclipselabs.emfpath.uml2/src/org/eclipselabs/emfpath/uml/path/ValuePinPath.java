package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.ValuePin#getValue()
	 * @generated
	 */
	public static final Function<ValuePin, ValueSpecification> value = new Function<ValuePin, ValueSpecification>() {
		public ValueSpecification apply(ValuePin s) {
			return s.getValue();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ValuePin#validateCompatibleType()
	 * @generated
	 */
	public static Predicate<ValuePin> validateCompatibleType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ValuePin>() {
			public boolean apply(ValuePin s) {
				return s.validateCompatibleType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ValuePin#validateNoIncomingEdges()
	 * @generated
	 */
	public static Predicate<ValuePin> validateNoIncomingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ValuePin>() {
			public boolean apply(ValuePin s) {
				return s.validateNoIncomingEdges(diagnostics, context);
			}
		};
	}

}
