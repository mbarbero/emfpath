package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;

/**
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
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * @see org.eclipse.uml2.uml.Association#getOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> ownedEnd = new Function<Association, EList<Property>>() {
		public EList<Property> apply(Association s) {
			return s.getOwnedEnds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Association#getMemberEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> memberEnd = new Function<Association, EList<Property>>() {
		public EList<Property> apply(Association s) {
			return s.getMemberEnds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Association#isDerived()
	 * @generated
	 */
	public static final Predicate<Association> isDerived = new Predicate<Association>() {
		public boolean apply(Association s) {
			return s.isDerived();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> endType = new Function<Association, EList<Type>>() {
		public EList<Type> apply(Association s) {
			return s.getEndTypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Association#getNavigableOwnedEnds()
	 * @generated
	 */
	public static final Function<Association, EList<Property>> navigableOwnedEnd = new Function<Association, EList<Property>>() {
		public EList<Property> apply(Association s) {
			return s.getNavigableOwnedEnds();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndNumber()
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Association>() {
			public boolean apply(Association s) {
				return s.validateSpecializedEndNumber(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateSpecializedEndTypes()
	 * @generated
	 */
	public static Predicate<Association> validateSpecializedEndTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Association>() {
			public boolean apply(Association s) {
				return s.validateSpecializedEndTypes(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateBinaryAssociations()
	 * @generated
	 */
	public static Predicate<Association> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Association>() {
			public boolean apply(Association s) {
				return s.validateBinaryAssociations(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#validateAssociationEnds()
	 * @generated
	 */
	public static Predicate<Association> validateAssociationEnds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Association>() {
			public boolean apply(Association s) {
				return s.validateAssociationEnds(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Association#isBinary()
	 * @generated
	 */
	public static final Predicate<Association> isBinary = new Predicate<Association>() {
		public boolean apply(Association s) {
			return s.isBinary();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Association#getEndTypes()
	 * @generated
	 */
	public static final Function<Association, EList<Type>> getEndTypes = new Function<Association, EList<Type>>() {
		public EList<Type> apply(Association s) {
			return s.getEndTypes();
		}
	};

}
