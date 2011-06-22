package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class SignalPath extends ClassifierPath {

	/**
	 * @generated
	 */
	private SignalPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Signal#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Signal, EList<Property>> ownedAttribute = new Function<Signal, EList<Property>>() {
		public EList<Property> apply(Signal s) {
			return s.getOwnedAttributes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Signal#createOwnedAttribute()
	 * @generated
	 */
	public static Function<Signal, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
		return new Function<Signal, Property>() {
			public Property apply(Signal s) {
				return s.createOwnedAttribute(name, type, lower, upper);
			}
		};
	}

}
