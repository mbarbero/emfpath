package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * @generated
 */
public class TypedElementPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 TypedElementPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = new Function<TypedElement, Type>() {
		public Type apply(TypedElement s) {
			return s.getType();
		}
	};
	
	

}
