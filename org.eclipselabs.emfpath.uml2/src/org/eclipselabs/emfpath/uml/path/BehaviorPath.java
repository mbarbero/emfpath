package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Behavior Behavior} in a functional way.
 * <p>
 * Behavior is a specification of how its context classifier changes state over time.
 * This specification may be either a definition of possible behavior execution or emergent
 * behavior, or a selective illustration of an interesting subset of possible executions.
 * The latter form is typically used for capturing examples, such as a trace of a particular
 * execution.
A behavior owns zero or more parameter sets. 
 * @see org.eclipse.uml2.uml.Behavior
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
	 * Tells whether the behavior can be invoked while it is still executing from a previous
	 * invocation. 
	 * @see org.eclipse.uml2.uml.Behavior#isReentrant()
	 * @generated
	 */
	public static final ComposablePredicate<Behavior> isReentrant = new ComposablePredicate<Behavior>() {
    public boolean apply(Behavior s) {
      return s.isReentrant();
    }
  };

	/**
	 * References a behavior that this behavior redefines. A subtype of Behavior may redefine
	 * any other subtype of Behavior. If the behavior implements a behavioral feature, it
	 * replaces the redefined behavior. If the behavior is a classifier behavior, it extends
	 * the redefined behavior. 
	 * @see org.eclipse.uml2.uml.Behavior#getRedefinedBehaviors()
	 * @generated
	 */
	public static final Function<Behavior, EList<Behavior>> redefinedBehavior = new Function<Behavior, EList<Behavior>>() {
    public EList<Behavior> apply(Behavior s) {
      return s.getRedefinedBehaviors();
    }
  };

	/**
	 * References a list of parameters to the behavior which describes the order and type
	 * of arguments that can be given when the behavior is invoked and of the values which
	 * will be returned when the behavior completes its execution.
	 
	 * @see org.eclipse.uml2.uml.Behavior#getOwnedParameters()
	 * @generated
	 */
	public static final Function<Behavior, EList<Parameter>> ownedParameter = new Function<Behavior, EList<Parameter>>() {
    public EList<Parameter> apply(Behavior s) {
      return s.getOwnedParameters();
    }
  };

	/**
	 * The classifier that is the context for the execution of the behavior. If the behavior
	 * is owned by a BehavioredClassifier, that classifier is the context. Otherwise, the
	 * context is the first BehavioredClassifier reached by following the chain of owner
	 * relationships. For example, following this algorithm, the context of an entry action
	 * in a state machine is the classifier that owns the state machine. The features of
	 * the context classifier as well as the elements visible to the context classifier are
	 * visible to the behavior. 
	 * @see org.eclipse.uml2.uml.Behavior#getContext()
	 * @generated
	 */
	public static final Function<Behavior, BehavioredClassifier> context = new Function<Behavior, BehavioredClassifier>() {
    public BehavioredClassifier apply(Behavior s) {
      return s.getContext();
    }
  };

	/**
	 * An optional set of Constraints specifying what must be fulfilled when the behavior
	 * is invoked. 
	 * @see org.eclipse.uml2.uml.Behavior#getPreconditions()
	 * @generated
	 */
	public static final Function<Behavior, EList<Constraint>> precondition = new Function<Behavior, EList<Constraint>>() {
    public EList<Constraint> apply(Behavior s) {
      return s.getPreconditions();
    }
  };

	/**
	 * An optional set of Constraints specifying what is fulfilled after the execution of
	 * the behavior is completed, if its precondition was fulfilled before its invocation.
	 * @see org.eclipse.uml2.uml.Behavior#getPostconditions()
	 * @generated
	 */
	public static final Function<Behavior, EList<Constraint>> postcondition = new Function<Behavior, EList<Constraint>>() {
    public EList<Constraint> apply(Behavior s) {
      return s.getPostconditions();
    }
  };

	/**
	 * The ParameterSets owned by this Behavior. 
	 * @see org.eclipse.uml2.uml.Behavior#getOwnedParameterSets()
	 * @generated
	 */
	public static final Function<Behavior, EList<ParameterSet>> ownedParameterSet = new Function<Behavior, EList<ParameterSet>>() {
    public EList<ParameterSet> apply(Behavior s) {
      return s.getOwnedParameterSets();
    }
  };

	/**
	 * Designates a behavioral feature that the behavior implements. The behavioral feature
	 * must be owned by the classifier that owns the behavior or be inherited by it. The
	 * parameters of the behavioral feature and the implementing behavior must match. A behavior
	 * does not need to have a specification, in which case it either is the classifer behavior
	 * of a BehavioredClassifier or it can only be invoked by another behavior of the classifier.
	 * @see org.eclipse.uml2.uml.Behavior#getSpecification()
	 * @generated
	 */
	public static final Function<Behavior, BehavioralFeature> specification = new Function<Behavior, BehavioralFeature>() {
    public BehavioralFeature apply(Behavior s) {
      return s.getSpecification();
    }
  };
	
	/**
	 * The parameters of the behavior must match the parameters of the implemented behavioral
	 * feature.
	true 
	 * @see org.eclipse.uml2.uml.Behavior#validateParametersMatch(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Behavior> validateParametersMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Behavior>() {
      public boolean apply(Behavior s) {
        return s.validateParametersMatch(diagnostics, context);
      }
    };
  }

	/**
	 * The implemented behavioral feature must be a feature (possibly inherited) of the context
	 * classifier of the behavior.
	true 
	 * @see org.eclipse.uml2.uml.Behavior#validateFeatureOfContextClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Behavior> validateFeatureOfContextClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Behavior>() {
      public boolean apply(Behavior s) {
        return s.validateFeatureOfContextClassifier(diagnostics, context);
      }
    };
  }

	/**
	 * If the implemented behavioral feature has been redefined in the ancestors of the owner
	 * of the behavior, then the behavior must realize the latest redefining behavioral feature.
	true
	 * @see org.eclipse.uml2.uml.Behavior#validateMustRealize(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Behavior> validateMustRealize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Behavior>() {
      public boolean apply(Behavior s) {
        return s.validateMustRealize(diagnostics, context);
      }
    };
  }

	/**
	 * There may be at most one behavior for a given pairing of classifier (as owner of the
	 * behavior) and behavioral feature (as specification of the behavior).
	true 
	 * @see org.eclipse.uml2.uml.Behavior#validateMostOneBehaviour(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Behavior> validateMostOneBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Behavior>() {
      public boolean apply(Behavior s) {
        return s.validateMostOneBehaviour(diagnostics, context);
      }
    };
  }

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Behavior#getContext()
	 * @generated
	 */
	public static final Function<Behavior, BehavioredClassifier> getContext = new Function<Behavior, BehavioredClassifier>() {
    public BehavioredClassifier apply(Behavior s) {
      return s.getContext();
    }
  };

}
