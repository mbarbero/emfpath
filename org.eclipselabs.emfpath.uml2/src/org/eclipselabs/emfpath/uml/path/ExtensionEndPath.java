package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public final class ExtensionEndPath {

	/**
	 * @generated
	 */
	private ExtensionEndPath() {
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
	public static final Function<NamedElement, String> name = NamedElementPath.name;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, VisibilityKind> visibility = NamedElementPath.visibility;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> qualifiedName = NamedElementPath.qualifiedName;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Dependency>> clientDependency = NamedElementPath.clientDependency;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, Namespace> namespace = NamedElementPath.namespace;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, StringExpression> nameExpression = NamedElementPath.nameExpression;

	/**
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = TypedElementPath.type;

	/**
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @generated
	 */
	public static final Predicate<Feature> isStatic = FeaturePath.isStatic;

	/**
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = FeaturePath.featuringClassifier;

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isOrdered = MultiplicityElementPath.isOrdered;

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isUnique = MultiplicityElementPath.isUnique;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upper = MultiplicityElementPath.upper;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lower = MultiplicityElementPath.lower;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> upperValue = MultiplicityElementPath.upperValue;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, ValueSpecification> lowerValue = MultiplicityElementPath.lowerValue;

	/**
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> end = ConnectableElementPath.end;

	/**
	 * @generated
	 */
	public static final Function<Property, Class> class_ = PropertyPath.class_;

	/**
	 * @generated
	 */
	public static final Function<Property, DataType> datatype = PropertyPath.datatype;

	/**
	 * @generated
	 */
	public static final Predicate<Property> isDerived = PropertyPath.isDerived;

	/**
	 * @generated
	 */
	public static final Predicate<Property> isDerivedUnion = PropertyPath.isDerivedUnion;

	/**
	 * @generated
	 */
	public static final Function<Property, String> default_ = PropertyPath.default_;

	/**
	 * @generated
	 */
	public static final Function<Property, AggregationKind> aggregation = PropertyPath.aggregation;

	/**
	 * @generated
	 */
	public static final Predicate<Property> isComposite = PropertyPath.isComposite;

	/**
	 * @generated
	 */
	public static final Function<Property, EList<Property>> redefinedProperty = PropertyPath.redefinedProperty;

	/**
	 * @generated
	 */
	public static final Function<Property, Association> owningAssociation = PropertyPath.owningAssociation;

	/**
	 * @generated
	 */
	public static final Function<Property, ValueSpecification> defaultValue = PropertyPath.defaultValue;

	/**
	 * @generated
	 */
	public static final Function<Property, Property> opposite = PropertyPath.opposite;

	/**
	 * @generated
	 */
	public static final Function<Property, EList<Property>> subsettedProperty = PropertyPath.subsettedProperty;

	/**
	 * @generated
	 */
	public static final Function<Property, Association> association = PropertyPath.association;

	/**
	 * @generated
	 */
	public static final Function<Property, EList<Property>> qualifier = PropertyPath.qualifier;

	/**
	 * @generated
	 */
	public static final Function<Property, Property> associationEnd = PropertyPath.associationEnd;

	/**
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<Deployment>> deployment = DeploymentTargetPath.deployment;

	/**
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> deployedElement = DeploymentTargetPath.deployedElement;

	/**
	 * @generated
	 */
	public static final Predicate<StructuralFeature> isReadOnly = StructuralFeaturePath.isReadOnly;
	
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
	public static Predicate<NamedElement> validateHasNoQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateHasNoQualifiedName(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateHasQualifiedName(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> validateVisibilityNeedsOwnership(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return NamedElementPath.validateVisibilityNeedsOwnership(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Dependency> createDependency(final NamedElement supplier) {
		return NamedElementPath.createDependency(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel = NamedElementPath.getLabel;

	/**
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel(final boolean localize) {
		return NamedElementPath.getLabel(localize);
	}

	/**
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage(final NamedElement supplier) {
		return NamedElementPath.createUsage(supplier);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName = NamedElementPath.getQualifiedName;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces = NamedElementPath.allNamespaces;

	/**
	 * @generated
	 */
	public static Predicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
		return NamedElementPath.isDistinguishableFrom(n, ns);
	}

	/**
	 * @generated
	 */
	public static final Function<NamedElement, String> separator = NamedElementPath.separator;

	/**
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages = NamedElementPath.allOwningPackages;

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateLowerGe0(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateLowerGe0(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateUpperGeLower(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateUpperGeLower(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateValueSpecificationNoSideEffects(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> validateValueSpecificationConstant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return MultiplicityElementPath.validateValueSpecificationConstant(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setLower(final int newLower) {
		return MultiplicityElementPath.setLower(newLower);
	}

	/**
	 * @generated
	 */
	public static Function<MultiplicityElement, MultiplicityElement> setUpper(final int newUpper) {
		return MultiplicityElementPath.setUpper(newUpper);
	}

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getLower = MultiplicityElementPath.getLower;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> getUpper = MultiplicityElementPath.getUpper;

	/**
	 * @generated
	 */
	public static final Predicate<MultiplicityElement> isMultivalued = MultiplicityElementPath.isMultivalued;

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesCardinality(final int C) {
		return MultiplicityElementPath.includesCardinality(C);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> includesMultiplicity(final MultiplicityElement M) {
		return MultiplicityElementPath.includesMultiplicity(M);
	}

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> lowerBound = MultiplicityElementPath.lowerBound;

	/**
	 * @generated
	 */
	public static final Function<MultiplicityElement, java.lang.Integer> upperBound_ = MultiplicityElementPath.upperBound_;

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> compatibleWith(final MultiplicityElement other) {
		return MultiplicityElementPath.compatibleWith(other);
	}

	/**
	 * @generated
	 */
	public static Predicate<MultiplicityElement> is(final int lowerbound, final int upperbound) {
		return MultiplicityElementPath.is(lowerbound, upperbound);
	}

	/**
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> getEnds = ConnectableElementPath.getEnds;

	/**
	 * @generated
	 */
	public static Predicate<Property> validateMultiplicityOfComposite(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateMultiplicityOfComposite(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateSubsettingContextConforms(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateSubsettingContextConforms(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateRedefinedPropertyInherited(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateRedefinedPropertyInherited(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateSubsettingRules(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateSubsettingRules(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateNavigableReadonly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateNavigableReadonly(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateDerivedUnionIsDerived(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateDerivedUnionIsDerived(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateDerivedUnionIsReadOnly(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateDerivedUnionIsReadOnly(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateSubsettedPropertyNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateSubsettedPropertyNames(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateDeploymentTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateDeploymentTarget(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static Predicate<Property> validateBindingToAttribute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return PropertyPath.validateBindingToAttribute(diagnostics, context);
	}

	/**
	 * @generated
	 */
	public static final Function<Property, String> getDefault = PropertyPath.getDefault;

	/**
	 * @generated
	 */
	public static final Predicate<Property> isSetDefault = PropertyPath.isSetDefault;

	/**
	 * @generated
	 */
	public static Function<Property, Property> setDefault(final String newDefault) {
		return PropertyPath.setDefault(newDefault);
	}

	/**
	 * @generated
	 */
	public static Function<Property, Property> setIsComposite(final boolean newIsComposite) {
		return PropertyPath.setIsComposite(newIsComposite);
	}

	/**
	 * @generated
	 */
	public static Function<Property, Property> setOpposite(final Property newOpposite) {
		return PropertyPath.setOpposite(newOpposite);
	}

	/**
	 * @generated
	 */
	public static final Function<Property, Property> unsetDefault = PropertyPath.unsetDefault;

	/**
	 * @generated
	 */
	public static Function<Property, Property> setIsNavigable(final boolean isNavigable) {
		return PropertyPath.setIsNavigable(isNavigable);
	}

	/**
	 * @generated
	 */
	public static final Function<Property, Property> getOtherEnd = PropertyPath.getOtherEnd;

	/**
	 * @generated
	 */
	public static Function<Property, Property> setBooleanDefaultValue(final boolean value) {
		return PropertyPath.setBooleanDefaultValue(value);
	}

	/**
	 * @generated
	 */
	public static Function<Property, Property> setIntegerDefaultValue(final int value) {
		return PropertyPath.setIntegerDefaultValue(value);
	}

	/**
	 * @generated
	 */
	public static Function<Property, Property> setStringDefaultValue(final String value) {
		return PropertyPath.setStringDefaultValue(value);
	}

	/**
	 * @generated
	 */
	public static Function<Property, Property> setUnlimitedNaturalDefaultValue(final int value) {
		return PropertyPath.setUnlimitedNaturalDefaultValue(value);
	}

	/**
	 * @generated
	 */
	public static final Function<Property, Property> setNullDefaultValue = PropertyPath.setNullDefaultValue;

	/**
	 * @generated
	 */
	public static Predicate<Property> isAttribute(final Property p) {
		return PropertyPath.isAttribute(p);
	}

	/**
	 * @generated
	 */
	public static final Function<Property, Property> getOpposite = PropertyPath.getOpposite;

	/**
	 * @generated
	 */
	public static final Function<Property, EList<Type>> subsettingContext = PropertyPath.subsettingContext;

	/**
	 * @generated
	 */
	public static final Predicate<Property> isNavigable = PropertyPath.isNavigable;

	/**
	 * @generated
	 */
	public static final Function<DeploymentTarget, EList<PackageableElement>> getDeployedElements = DeploymentTargetPath.getDeployedElements;

	/**
	 * @generated
	 */
	public static Predicate<ExtensionEnd> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExtensionEnd>() {
			public boolean apply(ExtensionEnd s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @generated
	 */
	public static Predicate<ExtensionEnd> validateAggregation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExtensionEnd>() {
			public boolean apply(ExtensionEnd s) {
				return s.validateAggregation(diagnostics, context);
			}
		};
	}

}
