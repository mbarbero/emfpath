package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;

/**
 * @generated
 */
public class DependencyPath extends PackageableElementPath {

	/**
	 * @generated
	 */
	 DependencyPath() {
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
	 * @see org.eclipse.uml2.uml.Dependency#getSuppliers()
	 * @generated
	 */
	public static final Function<Dependency, EList<NamedElement>> supplier = new Function<Dependency, EList<NamedElement>>() {
		public EList<NamedElement> apply(Dependency s) {
			return s.getSuppliers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Dependency#getClients()
	 * @generated
	 */
	public static final Function<Dependency, EList<NamedElement>> client = new Function<Dependency, EList<NamedElement>>() {
		public EList<NamedElement> apply(Dependency s) {
			return s.getClients();
		}
	};
	
	

}
