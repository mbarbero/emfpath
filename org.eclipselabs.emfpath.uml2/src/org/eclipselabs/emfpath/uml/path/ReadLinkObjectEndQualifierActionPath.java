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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction ReadLinkObjectEndQualifierAction} in a functional way.
 * <p>
 * A read link object end qualifier action is an action that retrieves a qualifier end
 * value from a link object. 
 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction
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
	 * Gives the input pin from which the link object is obtained. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getObject()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, InputPin> object = new Function<ReadLinkObjectEndQualifierAction, InputPin>() {
		public InputPin apply(ReadLinkObjectEndQualifierAction s) {
			return s.getObject();
		}
	};

	/**
	 * Pin where the result value is placed. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, OutputPin> result = new Function<ReadLinkObjectEndQualifierAction, OutputPin>() {
		public OutputPin apply(ReadLinkObjectEndQualifierAction s) {
			return s.getResult();
		}
	};

	/**
	 * The attribute representing the qualifier to be read. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getQualifier()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndQualifierAction, Property> qualifier = new Function<ReadLinkObjectEndQualifierAction, Property>() {
		public Property apply(ReadLinkObjectEndQualifierAction s) {
			return s.getQualifier();
		}
	};
	
	/**
	 * The qualifier attribute must be a qualifier attribute of an association end.
	self.qualifier.associationEnd->size()
	 * = 1 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateQualifierAttribute(DiagnosticChain, Map)
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
	 * The association of the association end of the qualifier attribute must be an association
	 * class.
	self.qualifier.associationEnd.association.oclIsKindOf(AssociationClass) 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateAssociationOfAssociation(DiagnosticChain, Map)
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
	 * The ends of the association must not be static.
	self.qualifier.associationEnd.association.memberEnd->forall(e
	 * | not e.isStatic) 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateEndsOfAssociation(DiagnosticChain, Map)
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
	 * The type of the object input pin is the association class that owns the association
	 * end that has the given qualifier attribute.
	self.object.type = self.qualifier.associationEnd.association
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateTypeOfObject(DiagnosticChain, Map)
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
	 * The multiplicity of the qualifier attribute is 1..1.
	self.qualifier.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfQualifier(DiagnosticChain, Map)
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
	 * The multiplicity of the object input pin is 1..1.
	self.object.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfObject(DiagnosticChain, Map)
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
	 * The type of the result output pin is the same as the type of the qualifier attribute.
	self.result.type
	 * = self.qualifier.type 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateSameType(DiagnosticChain, Map)
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
	 * The multiplicity of the result output pin is 1..1.
	self.result.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#validateMultiplicityOfResult(DiagnosticChain, Map)
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
