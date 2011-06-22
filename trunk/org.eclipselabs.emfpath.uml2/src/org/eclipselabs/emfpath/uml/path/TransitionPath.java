package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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

/**
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
	 * @see org.eclipse.uml2.uml.Transition#getKind()
	 * @generated
	 */
	public static final Function<Transition, TransitionKind> kind = new Function<Transition, TransitionKind>() {
		public TransitionKind apply(Transition s) {
			return s.getKind();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getContainer()
	 * @generated
	 */
	public static final Function<Transition, Region> container = new Function<Transition, Region>() {
		public Region apply(Transition s) {
			return s.getContainer();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getSource()
	 * @generated
	 */
	public static final Function<Transition, Vertex> source = new Function<Transition, Vertex>() {
		public Vertex apply(Transition s) {
			return s.getSource();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getTarget()
	 * @generated
	 */
	public static final Function<Transition, Vertex> target = new Function<Transition, Vertex>() {
		public Vertex apply(Transition s) {
			return s.getTarget();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getRedefinedTransition()
	 * @generated
	 */
	public static final Function<Transition, Transition> redefinedTransition = new Function<Transition, Transition>() {
		public Transition apply(Transition s) {
			return s.getRedefinedTransition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getGuard()
	 * @generated
	 */
	public static final Function<Transition, Constraint> guard = new Function<Transition, Constraint>() {
		public Constraint apply(Transition s) {
			return s.getGuard();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getEffect()
	 * @generated
	 */
	public static final Function<Transition, Behavior> effect = new Function<Transition, Behavior>() {
		public Behavior apply(Transition s) {
			return s.getEffect();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#getTriggers()
	 * @generated
	 */
	public static final Function<Transition, EList<Trigger>> trigger = new Function<Transition, EList<Trigger>>() {
		public EList<Trigger> apply(Transition s) {
			return s.getTriggers();
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
	 * @see org.eclipse.uml2.uml.Transition#validateForkSegmentGuards()
	 * @generated
	 */
	public static Predicate<Transition> validateForkSegmentGuards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateForkSegmentGuards(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateJoinSegmentGuards()
	 * @generated
	 */
	public static Predicate<Transition> validateJoinSegmentGuards(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateJoinSegmentGuards(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateForkSegmentState()
	 * @generated
	 */
	public static Predicate<Transition> validateForkSegmentState(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateForkSegmentState(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateJoinSegmentState()
	 * @generated
	 */
	public static Predicate<Transition> validateJoinSegmentState(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateJoinSegmentState(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateOutgoingPseudostates()
	 * @generated
	 */
	public static Predicate<Transition> validateOutgoingPseudostates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateOutgoingPseudostates(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateInitialTransition()
	 * @generated
	 */
	public static Predicate<Transition> validateInitialTransition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateInitialTransition(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#validateSignaturesCompatible()
	 * @generated
	 */
	public static Predicate<Transition> validateSignaturesCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Transition>() {
			public boolean apply(Transition s) {
				return s.validateSignaturesCompatible(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Transition#redefinitionContext()
	 * @generated
	 */
	public static final Function<Transition, Classifier> redefinitionContext_ = new Function<Transition, Classifier>() {
		public Classifier apply(Transition s) {
			return s.redefinitionContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Transition#containingStateMachine()
	 * @generated
	 */
	public static final Function<Transition, StateMachine> containingStateMachine = new Function<Transition, StateMachine>() {
		public StateMachine apply(Transition s) {
			return s.containingStateMachine();
		}
	};

}
