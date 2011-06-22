package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;

/**
 * @generated
 */
public class BehaviorPath extends ClassPath {

	/**
	 * @generated
	 */
	 BehaviorPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Behavior#isReentrant()
	 * @generated
	 */
	public static final Predicate<Behavior> isReentrant = new Predicate<Behavior>() {
		public boolean apply(Behavior s) {
			return s.isReentrant();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors()
	 * @generated
	 */
	public static final Function<Behavior, EList<Behavior>> redefinedBehavior = new Function<Behavior, EList<Behavior>>() {
		public EList<Behavior> apply(Behavior s) {
			return s.getRedefinedBehaviors();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getOwnedParameters()
	 * @generated
	 */
	public static final Function<Behavior, EList<Parameter>> ownedParameter = new Function<Behavior, EList<Parameter>>() {
		public EList<Parameter> apply(Behavior s) {
			return s.getOwnedParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getContext()
	 * @generated
	 */
	public static final Function<Behavior, BehavioredClassifier> context = new Function<Behavior, BehavioredClassifier>() {
		public BehavioredClassifier apply(Behavior s) {
			return s.getContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getPreconditions()
	 * @generated
	 */
	public static final Function<Behavior, EList<Constraint>> precondition = new Function<Behavior, EList<Constraint>>() {
		public EList<Constraint> apply(Behavior s) {
			return s.getPreconditions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getPostconditions()
	 * @generated
	 */
	public static final Function<Behavior, EList<Constraint>> postcondition = new Function<Behavior, EList<Constraint>>() {
		public EList<Constraint> apply(Behavior s) {
			return s.getPostconditions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getOwnedParameterSets()
	 * @generated
	 */
	public static final Function<Behavior, EList<ParameterSet>> ownedParameterSet = new Function<Behavior, EList<ParameterSet>>() {
		public EList<ParameterSet> apply(Behavior s) {
			return s.getOwnedParameterSets();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getSpecification()
	 * @generated
	 */
	public static final Function<Behavior, BehavioralFeature> specification = new Function<Behavior, BehavioralFeature>() {
		public BehavioralFeature apply(Behavior s) {
			return s.getSpecification();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Behavior#validateParametersMatch()
	 * @generated
	 */
	public static Predicate<Behavior> validateParametersMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Behavior>() {
			public boolean apply(Behavior s) {
				return s.validateParametersMatch(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Behavior#validateFeatureOfContextClassifier()
	 * @generated
	 */
	public static Predicate<Behavior> validateFeatureOfContextClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Behavior>() {
			public boolean apply(Behavior s) {
				return s.validateFeatureOfContextClassifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Behavior#validateMustRealize()
	 * @generated
	 */
	public static Predicate<Behavior> validateMustRealize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Behavior>() {
			public boolean apply(Behavior s) {
				return s.validateMustRealize(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Behavior#validateMostOneBehaviour()
	 * @generated
	 */
	public static Predicate<Behavior> validateMostOneBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Behavior>() {
			public boolean apply(Behavior s) {
				return s.validateMostOneBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Behavior#getContext()
	 * @generated
	 */
	public static final Function<Behavior, BehavioredClassifier> getContext = new Function<Behavior, BehavioredClassifier>() {
		public BehavioredClassifier apply(Behavior s) {
			return s.getContext();
		}
	};

}
