package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.LiteralInteger;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LiteralInteger LiteralInteger} in a functional way.
 * <p>
 * A literal integer is a specification of an integer value. 
 * @see org.eclipse.uml2.uml.LiteralInteger
 * @generated
 */
public class LiteralIntegerPath extends LiteralSpecificationPath {

	/**
	 * @generated
	 */
	private LiteralIntegerPath() {
		super();
	}

	/**
	 * The specified Integer value. 
	 * @see org.eclipse.uml2.uml.LiteralInteger#getValue()
	 * @generated
	 */
	public static final Function<LiteralInteger, java.lang.Integer> value = new Function<LiteralInteger, java.lang.Integer>() {
		public java.lang.Integer apply(LiteralInteger s) {
			return s.getValue();
		}
	};
	
	

}
