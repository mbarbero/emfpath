package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Expression Expression} in a functional way.
 * <p>
 * An expression is a structured tree of symbols that denotes a (possibly empty) set
 * of values when evaluated in a context.
An expression represents a node in an expression
 * tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly
 * empty sequence of operands which are value specifications. 
 * @see org.eclipse.uml2.uml.Expression
 * @generated
 */
public class ExpressionPath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	 ExpressionPath() {
		super();
	}

	/**
	 * The symbol associated with the node in the expression tree. 
	 * @see org.eclipse.uml2.uml.Expression#getSymbol()
	 * @generated
	 */
	public static final Function<Expression, String> symbol = new Function<Expression, String>() {
		public String apply(Expression s) {
			return s.getSymbol();
		}
	};

	/**
	 * Specifies a sequence of operands. 
	 * @see org.eclipse.uml2.uml.Expression#getOperands()
	 * @generated
	 */
	public static final Function<Expression, EList<ValueSpecification>> operand = new Function<Expression, EList<ValueSpecification>>() {
		public EList<ValueSpecification> apply(Expression s) {
			return s.getOperands();
		}
	};
	
	

}
