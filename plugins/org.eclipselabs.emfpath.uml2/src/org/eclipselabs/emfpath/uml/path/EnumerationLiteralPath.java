package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.EnumerationLiteral EnumerationLiteral} in a functional way.
 * <p>
 * An enumeration literal is a user-defined data value for an enumeration. 
 * @see org.eclipse.uml2.uml.EnumerationLiteral
 * @generated
 */
public class EnumerationLiteralPath extends InstanceSpecificationPath {

	/**
	 * @generated
	 */
	private EnumerationLiteralPath() {
    super();
  }

	/**
	 * The Enumeration that this EnumerationLiteral is a member of. 
	 * @see org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration()
	 * @generated
	 */
	public static final Function<EnumerationLiteral, Enumeration> enumeration = new Function<EnumerationLiteral, Enumeration>() {
    public Enumeration apply(EnumerationLiteral s) {
      return s.getEnumeration();
    }
  };
	
	

}
