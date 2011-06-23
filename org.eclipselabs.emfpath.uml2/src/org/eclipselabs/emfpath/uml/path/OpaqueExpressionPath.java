package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Parameter;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.OpaqueExpression OpaqueExpression} in a functional way.
 * <p>
 * An opaque expression is an uninterpreted textual statement that denotes a (possibly
 * empty) set of values when evaluated in a context.
Provides a mechanism for precisely
 * defining the behavior of an opaque expression. An opaque expression is defined by
 * a behavior restricted to return one result. 
 * @see org.eclipse.uml2.uml.OpaqueExpression
 * @generated
 */
public class OpaqueExpressionPath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	private OpaqueExpressionPath() {
		super();
	}

	/**
	 * The text of the expression, possibly in multiple languages. 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueExpression, EList<String>> body = new Function<OpaqueExpression, EList<String>>() {
		public EList<String> apply(OpaqueExpression s) {
			return s.getBodies();
		}
	};

	/**
	 * Specifies the languages in which the expression is stated. The interpretation of the
	 * expression body depends on the languages. If the languages are unspecified, they might
	 * be implicit from the expression body or the context. Languages are matched to body
	 * strings by order. 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueExpression, EList<String>> language = new Function<OpaqueExpression, EList<String>>() {
		public EList<String> apply(OpaqueExpression s) {
			return s.getLanguages();
		}
	};

	/**
	 * Restricts an opaque expression to return exactly one return result. When the invocation
	 * of the opaque expression completes, a single set of values is returned to its owner.
	 * This association is derived from the single return result parameter of the associated
	 * behavior. 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getResult()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Parameter> result = new Function<OpaqueExpression, Parameter>() {
		public Parameter apply(OpaqueExpression s) {
			return s.getResult();
		}
	};

	/**
	 * Specifies the behavior of the opaque expression. 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getBehavior()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Behavior> behavior = new Function<OpaqueExpression, Behavior>() {
		public Behavior apply(OpaqueExpression s) {
			return s.getBehavior();
		}
	};
	
	/**
	 * If the language attribute is not empty, then the size of the body and language arrays
	 * must be the same.
	language->notEmpty() implies (body->size() = language->size())
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateLanguageBodySize(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<OpaqueExpression> validateLanguageBodySize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<OpaqueExpression>() {
			public boolean apply(OpaqueExpression s) {
				return s.validateLanguageBodySize(diagnostics, context);
			}
		};
	}

	/**
	 * The behavior may only have return result parameters.
	self.behavior.notEmpty() implies
	
	 *  self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty() 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateOnlyReturnResultParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<OpaqueExpression> validateOnlyReturnResultParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<OpaqueExpression>() {
			public boolean apply(OpaqueExpression s) {
				return s.validateOnlyReturnResultParameters(diagnostics, context);
			}
		};
	}

	/**
	 * The behavior must have exactly one return result parameter.
	self.behavior.notEmpty()
	 * implies
	  self.behavior.ownedParameter->select(p | p.direction=#return)->size() =
	 * 1 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateOneReturnResultParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<OpaqueExpression> validateOneReturnResultParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<OpaqueExpression>() {
			public boolean apply(OpaqueExpression s) {
				return s.validateOneReturnResultParameter(diagnostics, context);
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getResult()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Parameter> getResult = new Function<OpaqueExpression, Parameter>() {
		public Parameter apply(OpaqueExpression s) {
			return s.getResult();
		}
	};

	/**
	 * The query value() gives an integer value for an expression intended to produce one.
	self.isIntegral()
	true
	 * @see org.eclipse.uml2.uml.OpaqueExpression#value()
	 * @generated
	 */
	public static final Function<OpaqueExpression, java.lang.Integer> value = new Function<OpaqueExpression, java.lang.Integer>() {
		public java.lang.Integer apply(OpaqueExpression s) {
			return s.value();
		}
	};

	/**
	 * The query isIntegral() tells whether an expression is intended to produce an integer.
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isIntegral()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isIntegral = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isIntegral();
		}
	};

	/**
	 * The query isPositive() tells whether an integer expression has a positive value.
	self.isIntegral()
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isPositive()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isPositive = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isPositive();
		}
	};

	/**
	 * The query isNonNegative() tells whether an integer expression has a non-negative value.
	self.isIntegral()
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isNonNegative()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isNonNegative = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isNonNegative();
		}
	};

}
