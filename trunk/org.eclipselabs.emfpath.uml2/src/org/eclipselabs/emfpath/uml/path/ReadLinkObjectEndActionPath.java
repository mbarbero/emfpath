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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadLinkObjectEndAction ReadLinkObjectEndAction} in a functional way.
 * <p>
 * A read link object end action is an action that retrieves an end object from a link
 * object. 
 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction
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
	 * Gives the input pin from which the link object is obtained. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getObject()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, InputPin> object = new Function<ReadLinkObjectEndAction, InputPin>() {
		public InputPin apply(ReadLinkObjectEndAction s) {
			return s.getObject();
		}
	};

	/**
	 * Link end to be read. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getEnd()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, Property> end = new Function<ReadLinkObjectEndAction, Property>() {
		public Property apply(ReadLinkObjectEndAction s) {
			return s.getEnd();
		}
	};

	/**
	 * Pin where the result value is placed. 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkObjectEndAction, OutputPin> result = new Function<ReadLinkObjectEndAction, OutputPin>() {
		public OutputPin apply(ReadLinkObjectEndAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * The property must be an association end.
	self.end.association.notEmpty() 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateProperty(DiagnosticChain, Map)
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
	 * The association of the association end must be an association class.
	self.end.Association.oclIsKindOf(AssociationClass)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateAssociationOfAssociation(DiagnosticChain, Map)
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
	 * The ends of the association must not be static.
	self.end.association.memberEnd->forall(e
	 * | not e.isStatic) 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateEndsOfAssociation(DiagnosticChain, Map)
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
	 * The type of the object input pin is the association class that owns the association
	 * end.
	self.object.type = self.end.association 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfObject(DiagnosticChain, Map)
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
	 * The multiplicity of the object input pin is 1..1.
	self.object.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfObject(DiagnosticChain, Map)
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
	 * The type of the result output pin is the same as the type of the association end.
	self.result.type
	 * = self.end.type 
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateTypeOfResult(DiagnosticChain, Map)
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
	 * The multiplicity of the result output pin is 1..1.
	self.result.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadLinkObjectEndAction#validateMultiplicityOfResult(DiagnosticChain, Map)
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
