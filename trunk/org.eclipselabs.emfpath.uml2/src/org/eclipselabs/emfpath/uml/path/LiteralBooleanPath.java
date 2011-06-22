package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.LiteralBoolean;

/**
 * @generated
 */
public class LiteralBooleanPath extends LiteralSpecificationPath {

	/**
	 * @generated
	 */
	private LiteralBooleanPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LiteralBoolean#isValue()
	 * @generated
	 */
	public static final Predicate<LiteralBoolean> isValue = new Predicate<LiteralBoolean>() {
		public boolean apply(LiteralBoolean s) {
			return s.isValue();
		}
	};
	
	

}
