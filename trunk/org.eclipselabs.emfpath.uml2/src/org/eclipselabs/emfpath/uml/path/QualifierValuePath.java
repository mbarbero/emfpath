package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;

/**
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
	 * @see org.eclipse.uml2.uml.QualifierValue#getQualifier()
	 * @generated
	 */
	public static final Function<QualifierValue, Property> qualifier = new Function<QualifierValue, Property>() {
		public Property apply(QualifierValue s) {
			return s.getQualifier();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.QualifierValue#getValue()
	 * @generated
	 */
	public static final Function<QualifierValue, InputPin> value = new Function<QualifierValue, InputPin>() {
		public InputPin apply(QualifierValue s) {
			return s.getValue();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.QualifierValue#validateQualifierAttribute()
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
	 * @see org.eclipse.uml2.uml.QualifierValue#validateTypeOfQualifier()
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
	 * @see org.eclipse.uml2.uml.QualifierValue#validateMultiplicityOfQualifier()
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
