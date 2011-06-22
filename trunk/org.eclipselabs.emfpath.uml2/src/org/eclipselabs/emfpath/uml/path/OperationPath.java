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
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = TemplateableElementPath.templateBinding;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = TemplateableElementPath.ownedTemplateSignature;

	/**
	 * @see org.eclipse.uml2.uml.Operation#getInterface()
	 * @generated
	 */
	public static final Function<Operation, Interface> interface_ = new Function<Operation, Interface>() {
		public Interface apply(Operation s) {
			return s.getInterface();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getClass_()
	 * @generated
	 */
	public static final Function<Operation, Class> class_ = new Function<Operation, Class>() {
		public Class apply(Operation s) {
			return s.getClass_();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#isQuery()
	 * @generated
	 */
	public static final Predicate<Operation> isQuery = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isQuery();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#isOrdered()
	 * @generated
	 */
	public static final Predicate<Operation> isOrdered = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isOrdered();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#isUnique()
	 * @generated
	 */
	public static final Predicate<Operation> isUnique = new Predicate<Operation>() {
		public boolean apply(Operation s) {
			return s.isUnique();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getLower()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getUpper()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getPreconditions()
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> precondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPreconditions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getPostconditions()
	 * @generated
	 */
	public static final Function<Operation, EList<Constraint>> postcondition = new Function<Operation, EList<Constraint>>() {
		public EList<Constraint> apply(Operation s) {
			return s.getPostconditions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getRedefinedOperations()
	 * @generated
	 */
	public static final Function<Operation, EList<Operation>> redefinedOperation = new Function<Operation, EList<Operation>>() {
		public EList<Operation> apply(Operation s) {
			return s.getRedefinedOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getDatatype()
	 * @generated
	 */
	public static final Function<Operation, DataType> datatype = new Function<Operation, DataType>() {
		public DataType apply(Operation s) {
			return s.getDatatype();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getBodyCondition()
	 * @generated
	 */
	public static final Function<Operation, Constraint> bodyCondition = new Function<Operation, Constraint>() {
		public Constraint apply(Operation s) {
			return s.getBodyCondition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getType()
	 * @generated
	 */
	public static final Function<Operation, Type> type = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = TemplateableElementPath.parameterableElements;

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * @see org.eclipse.uml2.uml.Operation#validateAtMostOneReturn()
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
	 * @see org.eclipse.uml2.uml.Operation#validateOnlyBodyForQuery()
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
	 * @see org.eclipse.uml2.uml.Operation#getLower()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getLower = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getLower();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getUpper()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> getUpper = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.getUpper();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#setIsOrdered()
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
	 * @see org.eclipse.uml2.uml.Operation#setIsUnique()
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
	 * @see org.eclipse.uml2.uml.Operation#setLower()
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
	 * @see org.eclipse.uml2.uml.Operation#setType()
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
	 * @see org.eclipse.uml2.uml.Operation#setUpper()
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
	 * @see org.eclipse.uml2.uml.Operation#getReturnResult()
	 * @generated
	 */
	public static final Function<Operation, Parameter> getReturnResult = new Function<Operation, Parameter>() {
		public Parameter apply(Operation s) {
			return s.getReturnResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#lowerBound()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> lowerBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.lowerBound();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#upperBound()
	 * @generated
	 */
	public static final Function<Operation, java.lang.Integer> upperBound = new Function<Operation, java.lang.Integer>() {
		public java.lang.Integer apply(Operation s) {
			return s.upperBound();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#getType()
	 * @generated
	 */
	public static final Function<Operation, Type> getType = new Function<Operation, Type>() {
		public Type apply(Operation s) {
			return s.getType();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Operation#returnResult()
	 * @generated
	 */
	public static final Function<Operation, EList<Parameter>> returnResult = new Function<Operation, EList<Parameter>>() {
		public EList<Parameter> apply(Operation s) {
			return s.returnResult();
		}
	};

}
