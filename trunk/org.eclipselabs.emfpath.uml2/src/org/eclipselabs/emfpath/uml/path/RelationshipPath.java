package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Relationship;

/**
 * @generated
 */
public class RelationshipPath extends ElementPath {

	/**
	 * @generated
	 */
	 RelationshipPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = new Function<Relationship, EList<Element>>() {
		public EList<Element> apply(Relationship s) {
			return s.getRelatedElements();
		}
	};
	
	

}
