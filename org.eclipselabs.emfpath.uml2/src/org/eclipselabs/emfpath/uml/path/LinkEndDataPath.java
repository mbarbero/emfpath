package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;

/**
 * @generated
 */
public class LinkEndDataPath extends ElementPath {

	/**
	 * @generated
	 */
	 LinkEndDataPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#getValue()
	 * @generated
	 */
	public static final Function<LinkEndData, InputPin> value = new Function<LinkEndData, InputPin>() {
		public InputPin apply(LinkEndData s) {
			return s.getValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#getEnd()
	 * @generated
	 */
	public static final Function<LinkEndData, Property> end = new Function<LinkEndData, Property>() {
		public Property apply(LinkEndData s) {
			return s.getEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#getQualifiers()
	 * @generated
	 */
	public static final Function<LinkEndData, EList<QualifierValue>> qualifier = new Function<LinkEndData, EList<QualifierValue>>() {
		public EList<QualifierValue> apply(LinkEndData s) {
			return s.getQualifiers();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#validatePropertyIsAssociationEnd()
	 * @generated
	 */
	public static Predicate<LinkEndData> validatePropertyIsAssociationEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndData>() {
			public boolean apply(LinkEndData s) {
				return s.validatePropertyIsAssociationEnd(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#validateSameType()
	 * @generated
	 */
	public static Predicate<LinkEndData> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndData>() {
			public boolean apply(LinkEndData s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<LinkEndData> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndData>() {
			public boolean apply(LinkEndData s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#validateQualifiers()
	 * @generated
	 */
	public static Predicate<LinkEndData> validateQualifiers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndData>() {
			public boolean apply(LinkEndData s) {
				return s.validateQualifiers(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndData#validateEndObjectInputPin()
	 * @generated
	 */
	public static Predicate<LinkEndData> validateEndObjectInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndData>() {
			public boolean apply(LinkEndData s) {
				return s.validateEndObjectInputPin(diagnostics, context);
			}
		};
	}

}
