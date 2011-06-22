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
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueExpression, EList<String>> body = new Function<OpaqueExpression, EList<String>>() {
		public EList<String> apply(OpaqueExpression s) {
			return s.getBodies();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueExpression, EList<String>> language = new Function<OpaqueExpression, EList<String>>() {
		public EList<String> apply(OpaqueExpression s) {
			return s.getLanguages();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getResult()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Parameter> result = new Function<OpaqueExpression, Parameter>() {
		public Parameter apply(OpaqueExpression s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getBehavior()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Behavior> behavior = new Function<OpaqueExpression, Behavior>() {
		public Behavior apply(OpaqueExpression s) {
			return s.getBehavior();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateLanguageBodySize()
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
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateOnlyReturnResultParameters()
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
	 * @see org.eclipse.uml2.uml.OpaqueExpression#validateOneReturnResultParameter()
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
	 * @see org.eclipse.uml2.uml.OpaqueExpression#getResult()
	 * @generated
	 */
	public static final Function<OpaqueExpression, Parameter> getResult = new Function<OpaqueExpression, Parameter>() {
		public Parameter apply(OpaqueExpression s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#value()
	 * @generated
	 */
	public static final Function<OpaqueExpression, java.lang.Integer> value = new Function<OpaqueExpression, java.lang.Integer>() {
		public java.lang.Integer apply(OpaqueExpression s) {
			return s.value();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isIntegral()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isIntegral = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isIntegral();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isPositive()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isPositive = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isPositive();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueExpression#isNonNegative()
	 * @generated
	 */
	public static final Predicate<OpaqueExpression> isNonNegative = new Predicate<OpaqueExpression>() {
		public boolean apply(OpaqueExpression s) {
			return s.isNonNegative();
		}
	};

}
