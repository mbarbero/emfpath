package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.CallConcurrencyKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class BehavioralFeaturePath extends NamespacePath {

	/**
	 * @generated
	 */
	 BehavioralFeaturePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * @see org.eclipse.uml2.uml.Feature#isStatic()
	 * @generated
	 */
	public static final Predicate<Feature> isStatic = FeaturePath.isStatic;

	/**
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = FeaturePath.featuringClassifier;

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Parameter>> ownedParameter = new Function<BehavioralFeature, EList<Parameter>>() {
		public EList<Parameter> apply(BehavioralFeature s) {
			return s.getOwnedParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#isAbstract()
	 * @generated
	 */
	public static final Predicate<BehavioralFeature> isAbstract = new Predicate<BehavioralFeature>() {
		public boolean apply(BehavioralFeature s) {
			return s.isAbstract();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getMethods()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Behavior>> method = new Function<BehavioralFeature, EList<Behavior>>() {
		public EList<Behavior> apply(BehavioralFeature s) {
			return s.getMethods();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getConcurrency()
	 * @generated
	 */
	public static final Function<BehavioralFeature, CallConcurrencyKind> concurrency = new Function<BehavioralFeature, CallConcurrencyKind>() {
		public CallConcurrencyKind apply(BehavioralFeature s) {
			return s.getConcurrency();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getRaisedExceptions()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Type>> raisedException = new Function<BehavioralFeature, EList<Type>>() {
		public EList<Type> apply(BehavioralFeature s) {
			return s.getRaisedExceptions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameterSets()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<ParameterSet>> ownedParameterSet = new Function<BehavioralFeature, EList<ParameterSet>>() {
		public EList<ParameterSet> apply(BehavioralFeature s) {
			return s.getOwnedParameterSets();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * @see org.eclipse.uml2.uml.BehavioralFeature#createReturnResult()
	 * @generated
	 */
	public static Function<BehavioralFeature, Parameter> createReturnResult(final String name, final Type type) {
		return new Function<BehavioralFeature, Parameter>() {
			public Parameter apply(BehavioralFeature s) {
				return s.createReturnResult(name, type);
			}
		};
	}

}
