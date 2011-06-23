package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.LiteralUnlimitedNatural;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LiteralUnlimitedNatural LiteralUnlimitedNatural} in a functional way.
 * <p>
 * A literal unlimited natural is a specification of an unlimited natural number. 
 * @see org.eclipse.uml2.uml.LiteralUnlimitedNatural
 * @generated
 */
public class LiteralUnlimitedNaturalPath extends LiteralSpecificationPath {

	/**
	 * @generated
	 */
	private LiteralUnlimitedNaturalPath() {
		super();
	}

	/**
	 * The specified UnlimitedNatural value. 
	 * @see org.eclipse.uml2.uml.LiteralUnlimitedNatural#getValue()
	 * @generated
	 */
	public static final Function<LiteralUnlimitedNatural, java.lang.Integer> value = new Function<LiteralUnlimitedNatural, java.lang.Integer>() {
		public java.lang.Integer apply(LiteralUnlimitedNatural s) {
			return s.getValue();
		}
	};
	
	

}
