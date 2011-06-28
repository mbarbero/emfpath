package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Transition Transition} in a functional way.
 * <p>
 * A transition is a directed relationship between a source vertex and a target vertex.
 * It may be part of a compound transition, which takes the state machine from one state
 * configuration to another, representing the complete response of the state machine
 * to an occurrence of an event of a particular type. 
 * @see org.eclipse.uml2.uml.Transition
 * @generated
 */
public class TransitionPath extends NamespacePath {

	/**
	 * @generated
	 */
	 TransitionPath() {
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
	public static final ComposablePredicate<RedefinableElement> isLeaf = RedefinableElementPath.isLeaf;

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
	 * Indicates  the precise type of the transition. 
	 * @see org.eclipse.uml2.uml.Transition#getKind()
	 * @generated
	 */
	public static final Function<Transition, TransitionKind> kind = new Function<Transition, TransitionKind>() {
    public TransitionKind apply(Transition s) {
      return s.getKind();
    }
  };

	/**
	 * Designates the region that owns this transition. 
	 * @see org.eclipse.uml2.uml.Transition#getContainer()
	 * @generated
	 */
	public static final Function<Transition, Region> container = new Function<Transition, Region>() {
    public Region apply(Transition s) {
      return s.getContainer();
    }
  };

	/**
	 * Designates the originating vertex (state or pseudostate) of the transition. 
	 * @see org.eclipse.uml2.uml.Transition#getSource()
	 * @generated
	 */
	public static final Function<Transition, Vertex> source = new Function<Transition, Vertex>() {
    public Vertex apply(Transition s) {
      return s.getSource();
    }
  };

	/**
	 * Designates the target vertex that is reached when the transition is taken. 
	 * @see org.eclipse.uml2.uml.Transition#getTarget()
	 * @generated
	 */
	public static final Function<Transition, Vertex> target = new Function<Transition, Vertex>() {
    public Vertex apply(Transition s) {
      return s.getTarget();
    }
  };

	/**
	 * The transition that is redefined by this transition. 
	 * @see org.eclipse.uml2.uml.Transition#getRedefinedTransition()
	 * @generated
	 */
	public static final Function<Transition, Transition> redefinedTransition = new Function<Transition, Transition>() {
    public Transition apply(Transition s) {
      return s.getRedefinedTransition();
    }
  };

	/**
	 * A guard is a constraint that provides a fine-grained control over the firing of the
	 * transition. The guard is evaluated when an event occurrence is dispatched by the state
	 * machine. If the guard is true at that time, the transition may be enabled, otherwise,
	 * it is disabled. Guards should be pure expressions without side effects. Guard expressions
	 * with side effects are ill formed. 
	 * @see org.eclipse.uml2.uml.Transition#getGuard()
	 * @generated
	 */
	public static final Function<Transition, Constraint> guard = new Function<Transition, Constraint>() {
    public Constraint apply(Transition s) {
      return s.getGuard();
    }
  };

	/**
	 * Specifies an optional behavior to be performed when the transition fires. 
	 * @see org.eclipse.uml2.uml.Transition#getEffect()
	 * @generated
	 */
	public static final Function<Transition, Behavior> effect = new Function<Transition, Behavior>() {
    public Behavior apply(Transition s) {
      return s.getEffect();
    }
  };

	/**
	 * Specifies the triggers that may fire the transition. 
	 * @see org.eclipse.uml2.uml.Transition#getTriggers()
	 * @generated
	 */
	public static final Function<Transition, EList<Trigger>> trigger = new Function<Transition, EList<Trigger>>() {
    public EList<Trigger> apply(Transition s) {
      return s.getTriggers();
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
	public static ComposablePredicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
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
	public static ComposablePredicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
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
	public static ComposablePredicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
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
	public static ComposablePredicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
    return RedefinableElementPath.isRedefinitionContextValid(redefined);
  }

	/**
	 * A fork segment must not have guards or triggers.
	(source.oclIsKindOf(Pseudostate)
	 * and source.kind = #fork) implies (guard->isEmpty() and trigger->isEmpty()) 
	 * @see org.eclipse.uml2.uml.Transition#validateForkSegmentGuards(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateForkSegmentGuards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateForkSegmentGuards(diagnostics, context);
      }
    };
  }

	/**
	 * A join segment must not have guards or triggers.
	(target.oclIsKindOf(Pseudostate)
	 * and target.kind = #join) implies (guard->isEmpty() and trigger->isEmpty()) 
	 * @see org.eclipse.uml2.uml.Transition#validateJoinSegmentGuards(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateJoinSegmentGuards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateJoinSegmentGuards(diagnostics, context);
      }
    };
  }

	/**
	 * A fork segment must always target a state.
	(source.oclIsKindOf(Pseudostate) and source.kind
	 * = #fork) implies (target.oclIsKindOf(State)) 
	 * @see org.eclipse.uml2.uml.Transition#validateForkSegmentState(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateForkSegmentState(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateForkSegmentState(diagnostics, context);
      }
    };
  }

	/**
	 * A join segment must always originate from a state.
	(target.oclIsKindOf(Pseudostate)
	 * and target.kind = #join) implies (source.oclIsKindOf(State)) 
	 * @see org.eclipse.uml2.uml.Transition#validateJoinSegmentState(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateJoinSegmentState(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateJoinSegmentState(diagnostics, context);
      }
    };
  }

	/**
	 * Transitions outgoing pseudostates may not have a trigger.
	source.oclIsKindOf(Pseudostate)
	 * and (source.kind <> #initial)) implies trigger->isEmpty() 
	 * @see org.eclipse.uml2.uml.Transition#validateOutgoingPseudostates(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateOutgoingPseudostates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateOutgoingPseudostates(diagnostics, context);
      }
    };
  }

	/**
	 * An initial transition at the topmost level (region of a statemachine) either has no
	 * trigger or it has a trigger with the stereotype <<create>>.
	self.source.oclIsKindOf(Pseudostate)
	 * implies
	(self.source.oclAsType(Pseudostate).kind = #initial) implies
	(self.source.container
	 * = self.stateMachine.top) implies
	((self.trigger->isEmpty) or
	(self.trigger.stereotype.name
	 * = 'create'))
	 
	 * @see org.eclipse.uml2.uml.Transition#validateInitialTransition(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateInitialTransition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateInitialTransition(diagnostics, context);
      }
    };
  }

	/**
	 * In case of more than one trigger, the signatures of these must be compatible in case
	 * the parameters of the signal are assigned to local variables/attributes.
	
	true 
	 * @see org.eclipse.uml2.uml.Transition#validateSignaturesCompatible(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Transition> validateSignaturesCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Transition>() {
      public boolean apply(Transition s) {
        return s.validateSignaturesCompatible(diagnostics, context);
      }
    };
  }

	/**
	 * The redefinition context of a transition is the nearest containing statemachine.
	result
	 * = let sm = containingStateMachine() in
	if sm.context->isEmpty() or sm.general->notEmpty()
	 * then
	sm
	else
	sm.context
	endif 
	 * @see org.eclipse.uml2.uml.Transition#redefinitionContext()
	 * @generated
	 */
	public static final Function<Transition, Classifier> redefinitionContext_ = new Function<Transition, Classifier>() {
    public Classifier apply(Transition s) {
      return s.redefinitionContext();
    }
  };

	/**
	 * The query containingStateMachine() returns the state machine that contains the transition
	 * either directly or transitively.
	result = container.containingStateMachine() 
	 * @see org.eclipse.uml2.uml.Transition#containingStateMachine()
	 * @generated
	 */
	public static final Function<Transition, StateMachine> containingStateMachine = new Function<Transition, StateMachine>() {
    public StateMachine apply(Transition s) {
      return s.containingStateMachine();
    }
  };

}
