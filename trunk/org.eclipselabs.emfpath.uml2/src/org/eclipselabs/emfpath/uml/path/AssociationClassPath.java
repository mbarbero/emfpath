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
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * @see org.eclipse.uml2.uml.Association#getOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> ownedEnd = AssociationPath.ownedEnd;

	/**
	 * @see org.eclipse.uml2.uml.Association#getMemberEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> memberEnd = AssociationPath.memberEnd;

	/**
	 * @see org.eclipse.uml2.uml.Association#isDerived()
	 * @generated
	 */
	public static final Predicate<Association> isDerived = AssociationPath.isDerived;

	/**
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> endType = AssociationPath.endType;

	/**
	 * @see org.eclipse.uml2.uml.Association#getNavigableOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> navigableOwnedEnd = AssociationPath.navigableOwnedEnd;
	
	/**
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndNumber()
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateSpecializedEndNumber(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndTypes()
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateSpecializedEndTypes(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateBinaryAssociations()
	 * @generated
	 */
	public static Predicate<Association> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateBinaryAssociations(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateAssociationEnds()
	 * @generated
	 */
	public static Predicate<Association> validateAssociationEnds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AssociationPath.validateAssociationEnds(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#isBinary()
	 * @generated
	 */
	public static final Predicate<Association> isBinary = AssociationPath.isBinary;

	/**
	 * @see org.eclipse.uml2.uml.AssociationClass#validateCannotBeDefined()
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
	 * @see org.eclipse.uml2.uml.AssociationClass#allConnections()
	 * @generated
	 */
	public static final Function<AssociationClass, EList<Property>> allConnections = new Function<AssociationClass, EList<Property>>() {
		public EList<Property> apply(AssociationClass s) {
			return s.allConnections();
		}
	};

}
