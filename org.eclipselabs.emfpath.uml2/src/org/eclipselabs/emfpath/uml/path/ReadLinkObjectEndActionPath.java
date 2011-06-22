package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ReadLinkObjectEndAction;

/**
 * @generated
 */
public class ReadLinkObjectEndActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadLinkObjectEndActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getObject()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, InputPin> object = new Function<ReadLinkObjectEndAction, InputPin>() {
		public InputPin apply(ReadLinkObjectEndAction s) {
			return s.getObject();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getEnd()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, Property> end = new Function<ReadLinkObjectEndAction, Property>() {
		public Property apply(ReadLinkObjectEndAction s) {
			return s.getEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, OutputPin> result = new Function<ReadLinkObjectEndAction, OutputPin>() {
		public OutputPin apply(ReadLinkObjectEndAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateProperty()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateProperty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateProperty(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateAssociationOfAssociation()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateAssociationOfAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateAssociationOfAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateEndsOfAssociation()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateEndsOfAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateEndsOfAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfObject()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateTypeOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateTypeOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfObject()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateMultiplicityOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateMultiplicityOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfResult()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateTypeOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfResult()
	 * @generated
	 */
	public static Predicate<ReadLinkObjectEndAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkObjectEndAction>() {
			public boolean apply(ReadLinkObjectEndAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

}
