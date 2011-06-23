package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuralFeatureAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StructuralFeatureAction StructuralFeatureAction} in a functional way.
 * <p>
 * StructuralFeatureAction is an abstract class for all structural feature actions. 
 * @see org.eclipse.uml2.uml.StructuralFeatureAction
 * @generated
 */
public class StructuralFeatureActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 StructuralFeatureActionPath() {
		super();
	}

	/**
	 * Structural feature to be read. 
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#getStructuralFeature()
	 * @generated
	 */
	public static final Function<StructuralFeatureAction, StructuralFeature> structuralFeature = new Function<StructuralFeatureAction, StructuralFeature>() {
		public StructuralFeature apply(StructuralFeatureAction s) {
			return s.getStructuralFeature();
		}
	};

	/**
	 * Gives the input pin from which the object whose structural feature is to be read or
	 * written is obtained.
	 
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#getObject()
	 * @generated
	 */
	public static final Function<StructuralFeatureAction, InputPin> object = new Function<StructuralFeatureAction, InputPin>() {
		public InputPin apply(StructuralFeatureAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * The structural feature must not be static.
	self.structuralFeature.isStatic = #false
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateNotStatic(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuralFeatureAction> validateNotStatic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuralFeatureAction>() {
			public boolean apply(StructuralFeatureAction s) {
				return s.validateNotStatic(diagnostics, context);
			}
		};
	}

	/**
	 * The type of the object input pin is the same as the classifier of the object passed
	 * on this pin.
	true 
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuralFeatureAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuralFeatureAction>() {
			public boolean apply(StructuralFeatureAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the input pin must be 1..1.
	self.object.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuralFeatureAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuralFeatureAction>() {
			public boolean apply(StructuralFeatureAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * Visibility of structural feature must allow access to the object performing the action.
	let
	 * host : Classifier = self.context in
	self.structuralFeature.visibility = #public
	or
	 * host = self.structuralFeature.featuringClassifier.type
	or (self.structuralFeature.visibility
	 * = #protected and host.allSupertypes
	->includes(self.structuralFeature.featuringClassifier.type)))
	
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateVisibility(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuralFeatureAction> validateVisibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuralFeatureAction>() {
			public boolean apply(StructuralFeatureAction s) {
				return s.validateVisibility(diagnostics, context);
			}
		};
	}

	/**
	 * A structural feature has exactly one featuringClassifier.
	self.structuralFeature.featuringClassifier->size()
	 * = 1 
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateOneFeaturingClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuralFeatureAction> validateOneFeaturingClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuralFeatureAction>() {
			public boolean apply(StructuralFeatureAction s) {
				return s.validateOneFeaturingClassifier(diagnostics, context);
			}
		};
	}

}
