package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Dependency Dependency} in a functional way.
 * <p>
 * A dependency is a relationship that signifies that a single or a set of model elements
 * requires other model elements for their specification or implementation. This means
 * that the complete semantics of the depending elements is either semantically or structurally
 * dependent on the definition of the supplier element(s). 
 * @see org.eclipse.uml2.uml.Dependency
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
	 * The element(s) independent of the client element(s), in the same respect and the same
	 * dependency relationship. In some directed dependency relationships (such as Refinement
	 * Abstractions), a common convention in the domain of class-based OO software is to
	 * put the more abstract element in this role. Despite this convention, users of UML
	 * may stipulate a sense of dependency suitable for their domain, which makes a more
	 * abstract element dependent on that which is more specific. 
	 * @see org.eclipse.uml2.uml.Dependency#getSuppliers()
	 * @generated
	 */
	public static final Function<Dependency, EList<NamedElement>> supplier = new Function<Dependency, EList<NamedElement>>() {
		public EList<NamedElement> apply(Dependency s) {
			return s.getSuppliers();
		}
	};

	/**
	 * The element(s) dependent on the supplier element(s). In some cases (such as a Trace
	 * Abstraction) the assignment of direction (that is, the designation of the client element)
	 * is at the discretion of the modeler, and is a stipulation. 
	 * @see org.eclipse.uml2.uml.Dependency#getClients()
	 * @generated
	 */
	public static final Function<Dependency, EList<NamedElement>> client = new Function<Dependency, EList<NamedElement>>() {
		public EList<NamedElement> apply(Dependency s) {
			return s.getClients();
		}
	};
	
	

}
