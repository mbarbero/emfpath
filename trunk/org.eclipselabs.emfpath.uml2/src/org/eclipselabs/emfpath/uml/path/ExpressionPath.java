package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Expression#getSymbol()
	 * @generated
	 */
	public static final Function<Expression, String> symbol = new Function<Expression, String>() {
		public String apply(Expression s) {
			return s.getSymbol();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Expression#getOperands()
	 * @generated
	 */
	public static final Function<Expression, EList<ValueSpecification>> operand = new Function<Expression, EList<ValueSpecification>>() {
		public EList<ValueSpecification> apply(Expression s) {
			return s.getOperands();
		}
	};
	
	

}
