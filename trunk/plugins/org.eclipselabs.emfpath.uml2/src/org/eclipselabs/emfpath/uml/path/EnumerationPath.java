package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Enumeration Enumeration} in a functional way.
 * <p>
 * An enumeration is a data type whose values are enumerated in the model as enumeration
 * literals. 
 * @see org.eclipse.uml2.uml.Enumeration
 * @generated
 */
public class EnumerationPath extends DataTypePath {

	/**
	 * @generated
	 */
	private EnumerationPath() {
    super();
  }

	/**
	 * The ordered set of literals for this Enumeration. 
	 * @see org.eclipse.uml2.uml.Enumeration#getOwnedLiterals()
	 * @generated
	 */
	public static final Function<Enumeration, EList<EnumerationLiteral>> ownedLiteral = new Function<Enumeration, EList<EnumerationLiteral>>() {
    public EList<EnumerationLiteral> apply(Enumeration s) {
      return s.getOwnedLiterals();
    }
  };
	
	

}
