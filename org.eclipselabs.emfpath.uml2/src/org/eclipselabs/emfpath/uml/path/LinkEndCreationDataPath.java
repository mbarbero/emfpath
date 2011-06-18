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
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;

/**
 * @generated
 */
public final class LinkEndCreationDataPath {

	/**
	 * @generated
	 */
	private LinkEndCreationDataPath() {
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
	public static final Function<LinkEndData, InputPin> value = LinkEndDataPath.value;

	/**
	 * @generated
	 */
	public static final Function<LinkEndData, Property> end = LinkEndDataPath.end;

	/**
	 * @generated
	 */
	public static final Function<LinkEndData, EList<QualifierValue>> qualifier = LinkEndDataPath.qualifier;

	/**
	 * @generated
	 */
	public static final Predicate<LinkEndCreationData> isReplaceAll = new Predicate<LinkEndCreationData>() {
		public boolean apply(LinkEndCreationData s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * @generated
	 */
	public static final Function<LinkEndCreationData, InputPin> insertAt = new Function<LinkEndCreationData, InputPin>() {
		public InputPin apply(LinkEndCreationData s) {
			return s.getInsertAt();
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
	public static Predicate<LinkEndData> validatePropertyIsAssociationEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return LinkEndDataPath.validatePropertyIsAssociationEnd(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndData> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return LinkEndDataPath.validateSameType(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndData> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return LinkEndDataPath.validateMultiplicity(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndData> validateQualifiers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return LinkEndDataPath.validateQualifiers(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndData> validateEndObjectInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return LinkEndDataPath.validateEndObjectInputPin(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndCreationData> validateCreateLinkAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndCreationData>() {
			public boolean apply(LinkEndCreationData s) {
				return s.validateCreateLinkAction(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<LinkEndCreationData> validateSingleInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndCreationData>() {
			public boolean apply(LinkEndCreationData s) {
				return s.validateSingleInputPin(diagnostics, context);
			}
		};
	}

}
