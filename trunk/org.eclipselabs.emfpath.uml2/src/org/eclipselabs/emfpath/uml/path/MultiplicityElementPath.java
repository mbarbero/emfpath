package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public final class MultiplicityElementPath {

	/**
	 * @generated
	 */
	private MultiplicityElementPath() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Element>> ownedElement = ElementPath.ownedElement;

	/**
	 * @generated
	 */
	public static final Function<Element, Element> owner = ElementPath.owner;

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Comment>> ownedComment = ElementPath.ownedComment;

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isOrdered = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isOrdered();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isUnique = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isUnique();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getUpperValue();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = new Function<MultiplicityElement, ValueSpecification>() {
		public ValueSpecification apply(MultiplicityElement s) {
			return s.getLowerValue();
		}
	};
	
	/**
	 * @generated
	 */
	public static Predicate<Element> validateNotOwnSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ElementPath.validateNotOwnSelf(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> validateHasOwner(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return ElementPath.validateHasOwner(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, Element> destroy = ElementPath.destroy;

	/**
	 * @generated
	 */
	public static Predicate<Element> hasKeyword(final String keyword) {
		return ElementPath.hasKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<String>> getKeywords = ElementPath.getKeywords;

	/**
	 * @generated
	 */
	public static Predicate<Element> addKeyword(final String keyword) {
		return ElementPath.addKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> removeKeyword(final String keyword) {
		return ElementPath.removeKeyword(keyword);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, Package> getNearestPackage = ElementPath.getNearestPackage;

	/**
	 * @generated
	 */
	public static final Function<Element, Model> getModel = ElementPath.getModel;

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplicable(final Stereotype stereotype) {
		return ElementPath.isStereotypeApplicable(stereotype);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeRequired(final Stereotype stereotype) {
		return ElementPath.isStereotypeRequired(stereotype);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplied(final Stereotype stereotype) {
		return ElementPath.isStereotypeApplied(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EObject> applyStereotype(final Stereotype stereotype) {
		return ElementPath.applyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EObject> unapplyStereotype(final Stereotype stereotype) {
		return ElementPath.unapplyStereotype(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getApplicableStereotypes = ElementPath.getApplicableStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getApplicableStereotype(final String qualifiedName) {
		return ElementPath.getApplicableStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<EObject>> getStereotypeApplications = ElementPath.getStereotypeApplications;

	/**
	 * @generated
	 */
	public static Function<Element, EObject> getStereotypeApplication(final Stereotype stereotype) {
		return ElementPath.getStereotypeApplication(stereotype);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getRequiredStereotypes = ElementPath.getRequiredStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getRequiredStereotype(final String qualifiedName) {
		return ElementPath.getRequiredStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getAppliedStereotypes = ElementPath.getAppliedStereotypes;

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedStereotype(final String qualifiedName) {
		return ElementPath.getAppliedStereotype(qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EList<Stereotype>> getAppliedSubstereotypes(final Stereotype stereotype) {
		return ElementPath.getAppliedSubstereotypes(stereotype);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedSubstereotype(final Stereotype stereotype, final String qualifiedName) {
		return ElementPath.getAppliedSubstereotype(stereotype, qualifiedName);
	}

	/**
	 * @generated
	 */
	public static Predicate<Element> hasValue(final Stereotype stereotype, final String propertyName) {
		return ElementPath.hasValue(stereotype, propertyName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Object> getValue(final Stereotype stereotype, final String propertyName) {
		return ElementPath.getValue(stereotype, propertyName);
	}

	/**
	 * @generated
	 */
	public static Function<Element, Element> setValue(final Stereotype stereotype, final String propertyName, final Object newValue) {
		return ElementPath.setValue(stereotype, propertyName, newValue);
	}

	/**
	 * @generated
	 */
	public static Function<Element, EAnnotation> createEAnnotation(final String source) {
		return ElementPath.createEAnnotation(source);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Relationship>> getRelationships = ElementPath.getRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<Relationship>> getRelationships(final EClass eClass) {
		return ElementPath.getRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships = ElementPath.getSourceDirectedRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships(final EClass eClass) {
		return ElementPath.getSourceDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships = ElementPath.getTargetDirectedRelationships;

	/**
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships(final EClass eClass) {
		return ElementPath.getTargetDirectedRelationships(eClass);
	}

	/**
	 * @generated
	 */
	public static final Function<Element, EList<Element>> allOwnedElements = ElementPath.allOwnedElements;

	/**
	 * @generated
	 */
	public static final Predicate<Element> mustBeOwned = ElementPath.mustBeOwned;

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateLowerGe0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateLowerGe0(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateUpperGeLower(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateUpperGeLower(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateValueSpecificationNoSideEffects(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationConstant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.validateValueSpecificationConstant(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setLower(final int newLower) {
		return new Function<MultiplicityElement, MultiplicityElement>() {
			public MultiplicityElement apply(MultiplicityElement s) {
				s.setLower(newLower);
				return s;
			}
		};
	}

	/**
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setUpper(final int newUpper) {
		return new Function<MultiplicityElement, MultiplicityElement>() {
			public MultiplicityElement apply(MultiplicityElement s) {
				s.setUpper(newUpper);
				return s;
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getLower = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getLower();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getUpper = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.getUpper();
		}
	};

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isMultivalued = new Predicate<MultiplicityElement>() {
		public boolean apply(MultiplicityElement s) {
			return s.isMultivalued();
		}
	};

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesCardinality(final int C) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.includesCardinality(C);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesMultiplicity(final MultiplicityElement M) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.includesMultiplicity(M);
			}
		};
	}

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.lowerBound();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = new Function<MultiplicityElement, java.lang.Integer>() {
		public java.lang.Integer apply(MultiplicityElement s) {
			return s.upperBound();
		}
	};

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> compatibleWith(final MultiplicityElement other) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.compatibleWith(other);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> is(final int lowerbound, final int upperbound) {
		return new Predicate<MultiplicityElement>() {
			public boolean apply(MultiplicityElement s) {
				return s.is(lowerbound, upperbound);
			}
		};
	}

}
