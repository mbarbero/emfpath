package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.LiteralString;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LiteralString LiteralString} in a functional way.
 * <p>
 * A literal string is a specification of a string value. 
 * @see org.eclipse.uml2.uml.LiteralString
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
	 * The specified String value. 
	 * @see org.eclipse.uml2.uml.LiteralString#getValue()
	 * @generated
	 */
	public static final Function<LiteralString, String> value = new Function<LiteralString, String>() {
		public String apply(LiteralString s) {
			return s.getValue();
		}
	};
	
	

}
