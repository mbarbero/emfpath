package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Relationship;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Relationship Relationship} in a functional way.
 * <p>
 * Relationship is an abstract concept that specifies some kind of relationship between
 * elements. 
 * @see org.eclipse.uml2.uml.Relationship
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
	 * Specifies the elements related by the Relationship. 
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = new Function<Relationship, EList<Element>>() {
		public EList<Element> apply(Relationship s) {
			return s.getRelatedElements();
		}
	};
	
	

}
