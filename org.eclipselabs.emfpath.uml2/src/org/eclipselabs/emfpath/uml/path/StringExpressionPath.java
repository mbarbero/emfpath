package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StringExpression StringExpression} in a functional way.
 * <p>
 * An expression that specifies a string value that is derived by concatenating a set
 * of sub string expressions, some of which might be template parameters. 
 * @see org.eclipse.uml2.uml.StringExpression
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
	 * The StringExpressions that constitute this StringExpression. 
	 * @see org.eclipse.uml2.uml.StringExpression#getSubExpressions()
	 * @generated
	 */
	public static final Function<StringExpression, EList<StringExpression>> subExpression = new Function<StringExpression, EList<StringExpression>>() {
    public EList<StringExpression> apply(StringExpression s) {
      return s.getSubExpressions();
    }
  };

	/**
	 * The string expression of which this expression is a substring. 
	 * @see org.eclipse.uml2.uml.StringExpression#getOwningExpression()
	 * @generated
	 */
	public static final Function<StringExpression, StringExpression> owningExpression = new Function<StringExpression, StringExpression>() {
    public StringExpression apply(StringExpression s) {
      return s.getOwningExpression();
    }
  };
	
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
	public static final ComposablePredicate<TemplateableElement> isTemplate = TemplateableElementPath.isTemplate;

	/**
	 * All the operands of a StringExpression must be LiteralStrings
	operand->forAll (op
	 * | op.oclIsKindOf (LiteralString)) 
	 * @see org.eclipse.uml2.uml.StringExpression#validateOperands(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StringExpression> validateOperands(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StringExpression>() {
      public boolean apply(StringExpression s) {
        return s.validateOperands(diagnostics, context);
      }
    };
  }

	/**
	 * If a StringExpression has sub-expressions, it cannot have operands and vice versa
	 * (this avoids the problem of having to
	define a collating sequence between operands
	 * and subexpressions).
	
	if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty()
	 * @see org.eclipse.uml2.uml.StringExpression#validateSubexpressions(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StringExpression> validateSubexpressions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StringExpression>() {
      public boolean apply(StringExpression s) {
        return s.validateSubexpressions(diagnostics, context);
      }
    };
  }

}
