package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
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
	 * @see org.eclipse.uml2.uml.EnumerationLiteral#getEnumeration()
	 * @generated
	 */
	public static final Function<EnumerationLiteral, Enumeration> enumeration = new Function<EnumerationLiteral, Enumeration>() {
		public Enumeration apply(EnumerationLiteral s) {
			return s.getEnumeration();
		}
	};
	
	

}
