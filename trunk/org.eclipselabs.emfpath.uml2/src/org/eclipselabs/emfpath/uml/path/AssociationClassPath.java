package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.AssociationClass AssociationClass} in a functional way.
 * <p>
 * A model element that has both association and class properties. An AssociationClass
 * can be seen as an association that also has class properties, or as a class that also
 * has association properties. It not only connects a set of classifiers but also defines
 * a set of features that belong to the relationship itself and not to any of the classifiers.
 * @see org.eclipse.uml2.uml.AssociationClass
 * @generated
 */
public class AssociationClassPath extends ClassPath {

	/**
	 * @generated
	 */
	private AssociationClassPath() {
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
	 *
	 * @see AssociationPath#ownedEnd()
	 * @see org.eclipse.uml2.uml.Association#getOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> ownedEnd = AssociationPath.ownedEnd;

	/**
	 * Each end represents participation of instances of the classifier connected to the
	 * end in links of the association. 
	 *
	 * @see AssociationPath#memberEnd()
	 * @see org.eclipse.uml2.uml.Association#getMemberEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> memberEnd = AssociationPath.memberEnd;

	/**
	 * Specifies whether the association is derived from other model elements such as other
	 * associations or constraints. 
	 *
	 * @see AssociationPath#isDerived()
	 * @see org.eclipse.uml2.uml.Association#isDerived()
	 * @generated
	 */
	public static final Predicate<Association> isDerived = AssociationPath.isDerived;

	/**
	 * References the classifiers that are used as types of the ends of the association.
	 *
	 * @see AssociationPath#endType()
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> endType = AssociationPath.endType;

	/**
	 * The navigable ends that are owned by the association itself. 
	 *
	 * @see AssociationPath#navigableOwnedEnd()
	 * @see org.eclipse.uml2.uml.Association#getNavigableOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> navigableOwnedEnd = AssociationPath.navigableOwnedEnd;
	
	/**
	 * An association specializing another association has the same number of ends as the
	 * other association.
	self.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())
	 *
	 * @see AssociationPath#validateSpecializedEndNumber()
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndNumber(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateSpecializedEndNumber(diagnostics, context);
	}

	/**
	 * When an association specializes another association, every end of the specific association
	 * corresponds to an end of the general association, and the specific end reaches the
	 * same type or a subtype of the more general end.
	true 
	 *
	 * @see AssociationPath#validateSpecializedEndTypes()
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndTypes(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateSpecializedEndTypes(diagnostics, context);
	}

	/**
	 * Only binary associations can be aggregations.
	self.memberEnd->exists(aggregation
	 * <> Aggregation::none) implies self.memberEnd->size() = 2 
	 *
	 * @see AssociationPath#validateBinaryAssociations()
	 * @see org.eclipse.uml2.uml.Association#validateBinaryAssociations(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Association> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateBinaryAssociations(diagnostics, context);
	}

	/**
	 * Association ends of associations with more than two ends must be owned by the association.
	if
	 * memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd) 
	 *
	 * @see AssociationPath#validateAssociationEnds()
	 * @see org.eclipse.uml2.uml.Association#validateAssociationEnds(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Association> validateAssociationEnds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateAssociationEnds(diagnostics, context);
	}

	/**
	 * Determines whether this association is a binary association, i.e. whether it has exactly
	 * two member ends. 
	 *
	 * @see AssociationPath#isBinary()
	 * @see org.eclipse.uml2.uml.Association#isBinary()
	 * @generated
	 */
	public static final Predicate<Association> isBinary = AssociationPath.isBinary;

	/**
	 * An AssociationClass cannot be defined between itself and something else.
	self.endType->excludes(self)
	 * and self.endType>collect(et|et.allparents()->excludes(self)) 
	 * @see org.eclipse.uml2.uml.AssociationClass#validateCannotBeDefined(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<AssociationClass> validateCannotBeDefined(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AssociationClass>() {
			public boolean apply(AssociationClass s) {
				return s.validateCannotBeDefined(diagnostics, context);
			}
		};
	}

	/**
	 * The operation allConnections results in the set of all AssociationEnds of the Association.
	result
	 * = memberEnd->union ( self.parents ()->collect (p | p.allConnections () ) 
	 * @see org.eclipse.uml2.uml.AssociationClass#allConnections()
	 * @generated
	 */
	public static final Function<AssociationClass, EList<Property>> allConnections = new Function<AssociationClass, EList<Property>>() {
		public EList<Property> apply(AssociationClass s) {
			return s.allConnections();
		}
	};

}
