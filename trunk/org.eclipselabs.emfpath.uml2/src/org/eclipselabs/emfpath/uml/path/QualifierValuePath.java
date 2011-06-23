package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.QualifierValue QualifierValue} in a functional way.
 * <p>
 * A qualifier value is not an action. It is an element that identifies links. It gives
 * a single qualifier within a link end data specification. 
 * @see org.eclipse.uml2.uml.QualifierValue
 * @generated
 */
public class QualifierValuePath extends ElementPath {

	/**
	 * @generated
	 */
	private QualifierValuePath() {
		super();
	}

	/**
	 * Attribute representing the qualifier for which the value is to be specified. 
	 * @see org.eclipse.uml2.uml.QualifierValue#getQualifier()
	 * @generated
	 */
	public static final Function<QualifierValue, Property> qualifier = new Function<QualifierValue, Property>() {
		public Property apply(QualifierValue s) {
			return s.getQualifier();
		}
	};

	/**
	 * Input pin from which the specified value for the qualifier is taken. 
	 * @see org.eclipse.uml2.uml.QualifierValue#getValue()
	 * @generated
	 */
	public static final Function<QualifierValue, InputPin> value = new Function<QualifierValue, InputPin>() {
		public InputPin apply(QualifierValue s) {
			return s.getValue();
		}
	};
	
	/**
	 * The qualifier attribute must be a qualifier of the association end of the link-end
	 * data.
	self.LinkEndData.end->collect(qualifier)->includes(self.qualifier) 
	 * @see org.eclipse.uml2.uml.QualifierValue#validateQualifierAttribute(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<QualifierValue> validateQualifierAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<QualifierValue>() {
			public boolean apply(QualifierValue s) {
				return s.validateQualifierAttribute(diagnostics, context);
			}
		};
	}

	/**
	 * The type of the qualifier value input pin is the same as the type of the qualifier
	 * attribute.
	self.value.type = self.qualifier.type 
	 * @see org.eclipse.uml2.uml.QualifierValue#validateTypeOfQualifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<QualifierValue> validateTypeOfQualifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<QualifierValue>() {
			public boolean apply(QualifierValue s) {
				return s.validateTypeOfQualifier(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the qualifier value input pin is "1..1".
	self.value.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.QualifierValue#validateMultiplicityOfQualifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<QualifierValue> validateMultiplicityOfQualifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<QualifierValue>() {
			public boolean apply(QualifierValue s) {
				return s.validateMultiplicityOfQualifier(diagnostics, context);
			}
		};
	}

}
