package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.LiteralInteger;

/**
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
	 * @see org.eclipse.uml2.uml.LiteralInteger#getValue()
	 * @generated
	 */
	public static final Function<LiteralInteger, java.lang.Integer> value = new Function<LiteralInteger, java.lang.Integer>() {
		public java.lang.Integer apply(LiteralInteger s) {
			return s.getValue();
		}
	};
	
	

}
