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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.BehavioralFeature BehavioralFeature} in a functional way.
 * <p>
 * A behavioral feature is a feature of a classifier that specifies an aspect of the
 * behavior of its instances.
A behavioral feature is implemented (realized) by a behavior.
 * A behavioral feature specifies that a classifier will respond to a designated request
 * by invoking its implementing method.
A behavioral feature owns zero or more parameter
 * sets. 
 * @see org.eclipse.uml2.uml.BehavioralFeature
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
	 * Indicates whether it is possible to further specialize a RedefinableElement. If the
	 * value is true, then it is not possible to further specialize the RedefinableElement.
	 *
	 * @see RedefinableElementPath#isLeaf()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

	/**
	 * The redefinable element that is being redefined by this element. 
	 *
	 * @see RedefinableElementPath#redefinedElement()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = RedefinableElementPath.redefinedElement;

	/**
	 * References the contexts that this element may be redefined from. 
	 *
	 * @see RedefinableElementPath#redefinitionContext()
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = RedefinableElementPath.redefinitionContext;

	/**
	 * Specifies whether this feature characterizes individual instances classified by the
	 * classifier (false) or the classifier itself (true). 
	 *
	 * @see FeaturePath#isStatic()
	 * @see org.eclipse.uml2.uml.Feature#isStatic()
	 * @generated
	 */
	public static final Predicate<Feature> isStatic = FeaturePath.isStatic;

	/**
	 * The Classifiers that have this Feature as a feature. 
	 *
	 * @see FeaturePath#featuringClassifier()
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = FeaturePath.featuringClassifier;

	/**
	 * Specifies the ordered set of formal parameters of this BehavioralFeature. 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Parameter>> ownedParameter = new Function<BehavioralFeature, EList<Parameter>>() {
		public EList<Parameter> apply(BehavioralFeature s) {
			return s.getOwnedParameters();
		}
	};

	/**
	 * If true, then the behavioral feature does not have an implementation, and one must
	 * be supplied by a more specific element. If false, the behavioral feature must have
	 * an implementation in the classifier or one must be inherited from a more general element.
	 * @see org.eclipse.uml2.uml.BehavioralFeature#isAbstract()
	 * @generated
	 */
	public static final Predicate<BehavioralFeature> isAbstract = new Predicate<BehavioralFeature>() {
		public boolean apply(BehavioralFeature s) {
			return s.isAbstract();
		}
	};

	/**
	 * A behavioral description that implements the behavioral feature. There may be at most
	 * one behavior for a particular pairing of a classifier (as owner of the behavior) and
	 * a behavioral feature (as specification of the behavior). 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getMethods()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Behavior>> method = new Function<BehavioralFeature, EList<Behavior>>() {
		public EList<Behavior> apply(BehavioralFeature s) {
			return s.getMethods();
		}
	};

	/**
	 * Specifies the semantics of concurrent calls to the same passive instance (i.e., an
	 * instance originating from a class with isActive being false). Active instances control
	 * access to their own behavioral features. 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getConcurrency()
	 * @generated
	 */
	public static final Function<BehavioralFeature, CallConcurrencyKind> concurrency = new Function<BehavioralFeature, CallConcurrencyKind>() {
		public CallConcurrencyKind apply(BehavioralFeature s) {
			return s.getConcurrency();
		}
	};

	/**
	 * References the Types representing exceptions that may be raised during an invocation
	 * of this feature.
	The signals that the behavioral feature raises as exceptions. 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getRaisedExceptions()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<Type>> raisedException = new Function<BehavioralFeature, EList<Type>>() {
		public EList<Type> apply(BehavioralFeature s) {
			return s.getRaisedExceptions();
		}
	};

	/**
	 * The ParameterSets owned by this BehavioralFeature. 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#getOwnedParameterSets()
	 * @generated
	 */
	public static final Function<BehavioralFeature, EList<ParameterSet>> ownedParameterSet = new Function<BehavioralFeature, EList<ParameterSet>>() {
		public EList<ParameterSet> apply(BehavioralFeature s) {
			return s.getOwnedParameterSets();
		}
	};
	
	/**
	 * At least one of the redefinition contexts of the redefining element must be a specialization
	 * of at least one of the redefinition contexts for each redefined element.
	self.redefinedElement->forAll(e
	 * | self.isRedefinitionContextValid(e)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionContextValid(diagnostics, context);
	}

	/**
	 * A redefining element must be consistent with each redefined element.
	self.redefinedElement->forAll(re
	 * | re.isConsistentWith(self)) 
	 *
	 * @see RedefinableElementPath#validateRedefinitionConsistent()
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return RedefinableElementPath.validateRedefinitionConsistent(diagnostics, context);
	}

	/**
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context
	 * in which redefinition is possible, whether redefinition would be logically consistent.
	 * By default, this is false; this operation must be overridden for subclasses of RedefinableElement
	 * to define the consistency conditions.
	redefinee.isRedefinitionContextValid(self)
	result
	 * = false 
	 *
	 * @see RedefinableElementPath#isConsistentWith()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(RedefinableElement)
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return RedefinableElementPath.isConsistentWith(redefinee);
	}

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of this RedefinableElement are properly related to the redefinition contexts of the
	 * specified RedefinableElement to allow this element to redefine the other. By default
	 * at least one of the redefinition contexts of this element must be a specialization
	 * of at least one of the redefinition contexts of the specified element.
	result = redefinitionContext->exists(c
	 * | c.allParents()->includes(redefined.redefinitionContext))) 
	 *
	 * @see RedefinableElementPath#isRedefinitionContextValid()
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return RedefinableElementPath.isRedefinitionContextValid(redefined);
	}

	/**
	 * Creates a return result parameter with the specified name and type. 
	 * @see org.eclipse.uml2.uml.BehavioralFeature#createReturnResult(String, Type)
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
