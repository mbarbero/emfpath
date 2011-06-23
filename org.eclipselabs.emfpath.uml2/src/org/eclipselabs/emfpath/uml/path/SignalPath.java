package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Signal Signal} in a functional way.
 * <p>
 * A signal is a specification of send request instances communicated between objects.
 * The receiving object handles the received request instances as specified by its receptions.
 * The data carried by a send request (which was passed to it by the send invocation
 * occurrence that caused that request) are represented as attributes of the signal.
 * A signal is defined independently of the classifiers handling the signal occurrence.
 * @see org.eclipse.uml2.uml.Signal
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
	 * The attributes owned by the signal. 
	 * @see org.eclipse.uml2.uml.Signal#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Signal, EList<Property>> ownedAttribute = new Function<Signal, EList<Property>>() {
		public EList<Property> apply(Signal s) {
			return s.getOwnedAttributes();
		}
	};
	
	/**
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this signal. 
	 * @see org.eclipse.uml2.uml.Signal#createOwnedAttribute(String, Type, int, int)
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
