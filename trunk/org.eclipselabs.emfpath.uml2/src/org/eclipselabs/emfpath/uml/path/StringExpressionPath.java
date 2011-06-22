package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * @generated
 */
public class StringExpressionPath extends ExpressionPath {

	/**
	 * @generated
	 */
	private StringExpressionPath() {
		super();
	}

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
	 * @see org.eclipse.uml2.uml.StringExpression#getSubExpressions()
	 * @generated
	 */
	public static final Function<StringExpression, EList<StringExpression>> subExpression = new Function<StringExpression, EList<StringExpression>>() {
		public EList<StringExpression> apply(StringExpression s) {
			return s.getSubExpressions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StringExpression#getOwningExpression()
	 * @generated
	 */
	public static final Function<StringExpression, StringExpression> owningExpression = new Function<StringExpression, StringExpression>() {
		public StringExpression apply(StringExpression s) {
			return s.getOwningExpression();
		}
	};
	
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
	 * @see org.eclipse.uml2.uml.StringExpression#validateOperands()
	 * @generated
	 */
	public static Predicate<StringExpression> validateOperands(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StringExpression>() {
			public boolean apply(StringExpression s) {
				return s.validateOperands(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StringExpression#validateSubexpressions()
	 * @generated
	 */
	public static Predicate<StringExpression> validateSubexpressions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StringExpression>() {
			public boolean apply(StringExpression s) {
				return s.validateSubexpressions(diagnostics, context);
			}
		};
	}

}
