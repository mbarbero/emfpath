package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UseCase;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Include Include} in a functional way.
 * <p>
 * An include relationship defines that a use case contains the behavior defined in another
 * use case. 
 * @see org.eclipse.uml2.uml.Include
 * @generated
 */
public class IncludePath extends NamedElementPath {

	/**
	 * @generated
	 */
	private IncludePath() {
    super();
  }

	/**
	 * Specifies the elements related by the Relationship. 
	 *
	 * @see RelationshipPath#relatedElement()
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * Specifies the sources of the DirectedRelationship. 
	 *
	 * @see DirectedRelationshipPath#source()
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = DirectedRelationshipPath.source;

	/**
	 * Specifies the targets of the DirectedRelationship. 
	 *
	 * @see DirectedRelationshipPath#target()
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = DirectedRelationshipPath.target;

	/**
	 * References the use case that is to be included.
	 
	 * @see org.eclipse.uml2.uml.Include#getAddition()
	 * @generated
	 */
	public static final Function<Include, UseCase> addition = new Function<Include, UseCase>() {
    public UseCase apply(Include s) {
      return s.getAddition();
    }
  };

	/**
	 * References the use case which will include the addition and owns the include relationship.
	 * @see org.eclipse.uml2.uml.Include#getIncludingCase()
	 * @generated
	 */
	public static final Function<Include, UseCase> includingCase = new Function<Include, UseCase>() {
    public UseCase apply(Include s) {
      return s.getIncludingCase();
    }
  };
	
	

}
