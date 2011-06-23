package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TypedElement TypedElement} in a functional way.
 * <p>
 * A typed element is a kind of named element that represents an element with a type.
A
 * typed element has a type. 
 * @see org.eclipse.uml2.uml.TypedElement
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
	 * This information is derived from the return result for this Operation.
	The type of
	 * the TypedElement. 
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = new Function<TypedElement, Type>() {
		public Type apply(TypedElement s) {
			return s.getType();
		}
	};
	
	

}
