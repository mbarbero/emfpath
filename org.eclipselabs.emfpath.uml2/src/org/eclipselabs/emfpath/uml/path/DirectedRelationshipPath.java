package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;

/**
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
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = new Function<DirectedRelationship, EList<Element>>() {
		public EList<Element> apply(DirectedRelationship s) {
			return s.getSources();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = new Function<DirectedRelationship, EList<Element>>() {
		public EList<Element> apply(DirectedRelationship s) {
			return s.getTargets();
		}
	};
	
	

}
