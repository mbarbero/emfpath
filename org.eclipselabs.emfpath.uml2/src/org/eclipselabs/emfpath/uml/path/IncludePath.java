package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UseCase;

/**
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
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = DirectedRelationshipPath.source;

	/**
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = DirectedRelationshipPath.target;

	/**
	 * @see org.eclipse.uml2.uml.Include#getAddition()
	 * @generated
	 */
	public static final Function<Include, UseCase> addition = new Function<Include, UseCase>() {
		public UseCase apply(Include s) {
			return s.getAddition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Include#getIncludingCase()
	 * @generated
	 */
	public static final Function<Include, UseCase> includingCase = new Function<Include, UseCase>() {
		public UseCase apply(Include s) {
			return s.getIncludingCase();
		}
	};
	
	

}
