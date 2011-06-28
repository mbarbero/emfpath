package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Association Association} in a functional way.
 * <p>
 * An association describes a set of tuples whose values refer to typed instances. An
 * instance of an association is called a link. 
 * @see org.eclipse.uml2.uml.Association
 * @generated
 */
public class AssociationPath extends ClassifierPath {

	/**
	 * @generated
	 */
	 AssociationPath() {
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
	 * The ends that are owned by the association itself. 
	 * @see org.eclipse.uml2.uml.Association#getOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> ownedEnd = new Function<Association, EList<Property>>() {
    public EList<Property> apply(Association s) {
      return s.getOwnedEnds();
    }
  };

	/**
	 * Each end represents participation of instances of the classifier connected to the
	 * end in links of the association. 
	 * @see org.eclipse.uml2.uml.Association#getMemberEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> memberEnd = new Function<Association, EList<Property>>() {
    public EList<Property> apply(Association s) {
      return s.getMemberEnds();
    }
  };

	/**
	 * Specifies whether the association is derived from other model elements such as other
	 * associations or constraints. 
	 * @see org.eclipse.uml2.uml.Association#isDerived()
	 * @generated
	 */
	public static final ComposablePredicate<Association> isDerived = new ComposablePredicate<Association>() {
    public boolean apply(Association s) {
      return s.isDerived();
    }
  };

	/**
	 * References the classifiers that are used as types of the ends of the association.
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> endType = new Function<Association, EList<Type>>() {
    public EList<Type> apply(Association s) {
      return s.getEndTypes();
    }
  };

	/**
	 * The navigable ends that are owned by the association itself. 
	 * @see org.eclipse.uml2.uml.Association#getNavigableOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> navigableOwnedEnd = new Function<Association, EList<Property>>() {
    public EList<Property> apply(Association s) {
      return s.getNavigableOwnedEnds();
    }
  };
	
	/**
	 * An association specializing another association has the same number of ends as the
	 * other association.
	self.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Association> validateSpecializedEndNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Association>() {
      public boolean apply(Association s) {
        return s.validateSpecializedEndNumber(diagnostics, context);
      }
    };
  }

	/**
	 * When an association specializes another association, every end of the specific association
	 * corresponds to an end of the general association, and the specific end reaches the
	 * same type or a subtype of the more general end.
	true 
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Association> validateSpecializedEndTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Association>() {
      public boolean apply(Association s) {
        return s.validateSpecializedEndTypes(diagnostics, context);
      }
    };
  }

	/**
	 * Only binary associations can be aggregations.
	self.memberEnd->exists(aggregation
	 * <> Aggregation::none) implies self.memberEnd->size() = 2 
	 * @see org.eclipse.uml2.uml.Association#validateBinaryAssociations(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Association> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Association>() {
      public boolean apply(Association s) {
        return s.validateBinaryAssociations(diagnostics, context);
      }
    };
  }

	/**
	 * Association ends of associations with more than two ends must be owned by the association.
	if
	 * memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd) 
	 * @see org.eclipse.uml2.uml.Association#validateAssociationEnds(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Association> validateAssociationEnds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Association>() {
      public boolean apply(Association s) {
        return s.validateAssociationEnds(diagnostics, context);
      }
    };
  }

	/**
	 * Determines whether this association is a binary association, i.e. whether it has exactly
	 * two member ends. 
	 * @see org.eclipse.uml2.uml.Association#isBinary()
	 * @generated
	 */
	public static final ComposablePredicate<Association> isBinary = new ComposablePredicate<Association>() {
    public boolean apply(Association s) {
      return s.isBinary();
    }
  };

	/**
	 * endType is derived from the types of the member ends.
	result = self.memberEnd->collect(e
	 * | e.type) 
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> getEndTypes = new Function<Association, EList<Type>>() {
    public EList<Type> apply(Association s) {
      return s.getEndTypes();
    }
  };

}
