package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.LiteralString;

/**
 * @generated
 */
public class LiteralStringPath extends LiteralSpecificationPath {

	/**
	 * @generated
	 */
	private LiteralStringPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LiteralString#getValue()
	 * @generated
	 */
	public static final Function<LiteralString, String> value = new Function<LiteralString, String>() {
		public String apply(LiteralString s) {
			return s.getValue();
		}
	};
	
	

}
