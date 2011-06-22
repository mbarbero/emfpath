package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuralFeatureAction;

/**
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
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#getStructuralFeature()
	 * @generated
	 */
	public static final Function<StructuralFeatureAction, StructuralFeature> structuralFeature = new Function<StructuralFeatureAction, StructuralFeature>() {
		public StructuralFeature apply(StructuralFeatureAction s) {
			return s.getStructuralFeature();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#getObject()
	 * @generated
	 */
	public static final Function<StructuralFeatureAction, InputPin> object = new Function<StructuralFeatureAction, InputPin>() {
		public InputPin apply(StructuralFeatureAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateNotStatic()
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
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateSameType()
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
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateMultiplicity()
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
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateVisibility()
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
	 * @see org.eclipse.uml2.uml.StructuralFeatureAction#validateOneFeaturingClassifier()
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
