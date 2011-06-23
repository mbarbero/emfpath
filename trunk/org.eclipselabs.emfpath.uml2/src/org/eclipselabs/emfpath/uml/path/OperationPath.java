package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Operation Operation} in a functional way.
 * <p>
 * An operation is a behavioral feature of a classifier that specifies the name, type,
 * parameters, and constraints for invoking an associated behavior.
An operation may
 * invoke both the execution of method behaviors as well as other behavioral responses.
Operation
 * specializes TemplateableElement in order to support specification of template operations
 * and bound operations. Operation specializes ParameterableElement to specify that an
 * operation can be exposed as a formal template parameter, and provided as an actual
 * parameter in a binding of a template. 
 * @see org.eclipse.uml2.uml.Operation
 * @generated
 */
public class OperationPath extends BehavioralFeaturePath {

	/**
	 * @generated
	 */
	private OperationPath() {
		super();
	}

	/**
	 * The formal template parameter that owns this element. 
	 *
	 * @see ParameterableElementPath#owningTemplateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 *
	 * @see ParameterableElementPath#templateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * The optional bindings from this element to templates. 
	 *
	 * @see TemplateableElementPath#templateBinding()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * The optional template signature specifying the formal template parameters. 
	 *
	 * @see TemplateableElementPath#ownedTemplateSignature()
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * The Interface that owns this Operation. 
	 * @see org.eclipse.uml2.uml.Operation#getInterface()
	 * @generated
	 */
	public static final Function<Operation, Interface> interface_ = new Function<Operation, Interface>() {
		public Interface apply(Operation s) {
			return s.getInterface();
		}
	};

	/**
	 * The class that owns the operation. 
	 * @see org.eclipse.uml2.uml.Operation#getClass_()
	 * @generated
	 */
	public static final Function<Operation, Class> class_ = new Function<Operation, Class>() {
		public Class apply(Operation s) {
			return s.getClass_();
		}
	};

	/**
	 * Specifies whether an execution of the BehavioralFeature leaves the state of the system
	 * unchanged (isQuery=true) or whether side effects may occur (isQuery=false). 
	 * @see org.eclipse.uml2.uml.Operation#isQuery()
	 * @generated
	 */
	public static final Predicate<Operation> isQuery = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isQuery();
		}
	};

	/**
	 * This information is derived from the return result for this Operation.
	Specifies
	 * whether the return parameter is ordered or not, if present. 
	 * @see org.eclipse.uml2.uml.Operation#isOrdered()
	 * @generated
	 */
	public static final Predicate<Operation> isOrdered = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isOrdered();
		}
	};

	/**
	 * This information is derived from the return result for this Operation.
	Specifies
	 * whether the return parameter is unique or not, if present. 
	 * @see org.eclipse.uml2.uml.Operation#isUnique()
	 * @generated
	 */
	public static final Predicate<Operation> isUnique = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isUnique();
		}
	};

	/**
	 * This information is derived from the return result for this Operation.
	Specifies
	 * the lower multiplicity of the return parameter, if present. 
	 * @see org.eclipse.uml2.uml.Operation#getLower()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * This information is derived from the return result for this Operation.
	Specifies
	 * the upper multiplicity of the return parameter, if present. 
	 * @see org.eclipse.uml2.uml.Operation#getUpper()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * An optional set of Constraints on the state of the system when the Operation is invoked.
	 * @see org.eclipse.uml2.uml.Operation#getPreconditions()
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> precondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPreconditions();
		}
	};

	/**
	 * An optional set of Constraints specifying the state of the system when the Operation
	 * is completed. 
	 * @see org.eclipse.uml2.uml.Operation#getPostconditions()
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> postcondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPostconditions();
		}
	};

	/**
	 * References the Operations that are redefined by this Operation. 
	 * @see org.eclipse.uml2.uml.Operation#getRedefinedOperations()
	 * @generated
	 */
	public static final Function<Operation, EList<Operation>> redefinedOperation = new Function<Operation, EList<Operation>>() {
		public EList<Operation> apply(Operation s) {
			return s.getRedefinedOperations();
		}
	};

	/**
	 * The DataType that owns this Operation. 
	 * @see org.eclipse.uml2.uml.Operation#getDatatype()
	 * @generated
	 */
	public static final Function<Operation, DataType> datatype = new Function<Operation, DataType>() {
		public DataType apply(Operation s) {
			return s.getDatatype();
		}
	};

	/**
	 * An optional Constraint on the result values of an invocation of this Operation. 
	 * @see org.eclipse.uml2.uml.Operation#getBodyCondition()
	 * @generated
	 */
	public static final Function<Operation, Constraint> bodyCondition = new Function<Operation, Constraint>() {
		public Constraint apply(Operation s) {
			return s.getBodyCondition();
		}
	};

	/**
	 * This information is derived from the return result for this Operation.
	Specifies
	 * the return result of the operation, if present. 
	 * @see org.eclipse.uml2.uml.Operation#getType()
	 * @generated
	 */
	public static final Function<Operation, Type> type = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
		}
	};
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 *
	 * @see ParameterableElementPath#isCompatibleWith()
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * The query parameterableElements() returns the set of elements that may be used as
	 * the parametered elements for a template parameter of this templateable element. By
	 * default, this set includes all the owned elements. Subclasses may override this operation
	 * if they choose to restrict the set of parameterable elements.
	result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 *
	 * @see TemplateableElementPath#parameterableElements()
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * The query isTemplate() returns whether this templateable element is actually a template.
	result
	 * = ownedTemplateSignature->notEmpty() 
	 *
	 * @see TemplateableElementPath#isTemplate()
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * An operation can have at most one return parameter; i.e., an owned parameter with
	 * the direction set to 'return'
	self.ownedParameter->select(par | par.direction = #return)->size()
	 * <= 1 
	 * @see org.eclipse.uml2.uml.Operation#validateAtMostOneReturn(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Operation> validateAtMostOneReturn(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Operation>() {
			public boolean apply(Operation s) {
				return s.validateAtMostOneReturn(diagnostics, context);
			}
		};
	}

	/**
	 * A bodyCondition can only be specified for a query operation.
	bodyCondition->notEmpty()
	 * implies isQuery 
	 * @see org.eclipse.uml2.uml.Operation#validateOnlyBodyForQuery(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Operation> validateOnlyBodyForQuery(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Operation>() {
			public boolean apply(Operation s) {
				return s.validateOnlyBodyForQuery(diagnostics, context);
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#getLower()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getLower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#getUpper()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getUpper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#setIsOrdered(boolean)
	 * @generated
	 */
	public static Function<Operation, Operation> setIsOrdered(final boolean newIsOrdered) {
		return new Function<Operation, Operation>() {
			public Operation apply(Operation s) {
				s.setIsOrdered(newIsOrdered);
				return s;
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#setIsUnique(boolean)
	 * @generated
	 */
	public static Function<Operation, Operation> setIsUnique(final boolean newIsUnique) {
		return new Function<Operation, Operation>() {
			public Operation apply(Operation s) {
				s.setIsUnique(newIsUnique);
				return s;
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#setLower(int)
	 * @generated
	 */
	public static Function<Operation, Operation> setLower(final int newLower) {
		return new Function<Operation, Operation>() {
			public Operation apply(Operation s) {
				s.setLower(newLower);
				return s;
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#setType(Type)
	 * @generated
	 */
	public static Function<Operation, Operation> setType(final Type newType) {
		return new Function<Operation, Operation>() {
			public Operation apply(Operation s) {
				s.setType(newType);
				return s;
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Operation#setUpper(int)
	 * @generated
	 */
	public static Function<Operation, Operation> setUpper(final int newUpper) {
		return new Function<Operation, Operation>() {
			public Operation apply(Operation s) {
				s.setUpper(newUpper);
				return s;
			}
		};
	}

	/**
	 * Retrieves the (only) return result parameter for this operation. 
	 * @see org.eclipse.uml2.uml.Operation#getReturnResult()
	 * @generated
	 */
	public static final Function<Operation, Parameter> getReturnResult = new Function<Operation, Parameter>() {
		public Parameter apply(Operation s) {
			return s.getReturnResult();
		}
	};

	/**
	 * If this operation has a return parameter, lower equals the value of lower for that
	 * parameter. Otherwise lower is not defined.
	result = if returnResult()->notEmpty()
	 * then returnResult()->any().lower else Set{} endif 
	 * @see org.eclipse.uml2.uml.Operation#lowerBound()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lowerBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.lowerBound();
		}
	};

	/**
	 * If this operation has a return parameter, upper equals the value of upper for that
	 * parameter. Otherwise upper is not defined.
	result = if returnResult()->notEmpty()
	 * then returnResult()->any().upper else Set{} endif 
	 * @see org.eclipse.uml2.uml.Operation#upperBound()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upperBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.upperBound();
		}
	};

	/**
	 * If this operation has a return parameter, type equals the value of type for that parameter.
	 * Otherwise type is not defined.
	result = if returnResult()->notEmpty() then returnResult()->any().type
	 * else Set{} endif 
	 * @see org.eclipse.uml2.uml.Operation#getType()
	 * @generated
	 */
	public static final Function<Operation, Type> getType = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
		}
	};

	/**
	 * The query returnResult() returns the set containing the return parameter of the Operation
	 * if one exists, otherwise, it returns an empty set
	result = ownedParameter->select
	 * (par | par.direction = #return) 
	 * @see org.eclipse.uml2.uml.Operation#returnResult()
	 * @generated
	 */
	public static final Function<Operation, EList<Parameter>> returnResult = new Function<Operation, EList<Parameter>>() {
		public EList<Parameter> apply(Operation s) {
			return s.returnResult();
		}
	};

}
