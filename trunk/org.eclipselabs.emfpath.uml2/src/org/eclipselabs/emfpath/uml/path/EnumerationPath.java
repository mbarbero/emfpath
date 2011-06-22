package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
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
	 * @see org.eclipse.uml2.uml.Enumeration#getOwnedLiterals()
	 * @generated
	 */
	public static final Function<Enumeration, EList<EnumerationLiteral>> ownedLiteral = new Function<Enumeration, EList<EnumerationLiteral>>() {
		public EList<EnumerationLiteral> apply(Enumeration s) {
			return s.getOwnedLiterals();
		}
	};
	
	

}
