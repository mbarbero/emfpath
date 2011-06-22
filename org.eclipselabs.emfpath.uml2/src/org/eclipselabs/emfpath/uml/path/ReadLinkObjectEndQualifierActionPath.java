package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction;

/**
 * @generated
 */
public class ReadLinkObjectEndQualifierActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadLinkObjectEndQualifierActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getObject()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, InputPin> object = new Function<ReadLinkObjectEndQualifierAction, InputPin>() {
		public InputPin apply(ReadLinkObjectEndQualifierAction s) {
			return s.getObject();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, OutputPin> result = new Function<ReadLinkObjectEndQualifierAction, OutputPin>() {
		public OutputPin apply(ReadLinkObjectEndQualifierAction s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getQualifier()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, Property> qualifier = new Function<ReadLinkObjectEndQualifierAction, Property>() {
		public Property apply(ReadLinkObjectEndQualifierAction s) {
			return s.getQualifier();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateQualifierAttribute()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateQualifierAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateQualifierAttribute(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateAssociationOfAssociation()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateAssociationOfAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateAssociationOfAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateEndsOfAssociation()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateEndsOfAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateEndsOfAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateTypeOfObject()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateTypeOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateTypeOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfQualifier()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateMultiplicityOfQualifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateMultiplicityOfQualifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfObject()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateMultiplicityOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateMultiplicityOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateSameType()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfResult()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndQualifierAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndQualifierAction>() {
			public boolean apply(ReadLinkObjectEndQualifierAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

}
