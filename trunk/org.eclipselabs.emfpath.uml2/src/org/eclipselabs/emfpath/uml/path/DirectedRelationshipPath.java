package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DirectedRelationship DirectedRelationship} in a functional way.
 * <p>
 * A directed relationship represents a relationship between a collection of source model
 * elements and a collection of target model elements. 
 * @see org.eclipse.uml2.uml.DirectedRelationship
 * @generated
 */
public class DirectedRelationshipPath extends RelationshipPath {

	/**
	 * @generated
	 */
	 DirectedRelationshipPath() {
		super();
	}

	/**
	 * Specifies the sources of the DirectedRelationship. 
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = new Function<DirectedRelationship, EList<Element>>() {
		public EList<Element> apply(DirectedRelationship s) {
			return s.getSources();
		}
	};

	/**
	 * Specifies the targets of the DirectedRelationship. 
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = new Function<DirectedRelationship, EList<Element>>() {
		public EList<Element> apply(DirectedRelationship s) {
			return s.getTargets();
		}
	};
	
	

}
