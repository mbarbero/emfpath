package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
 * @generated
 */
public class RegionPath extends NamespacePath {

	/**
	 * @generated
	 */
	private RegionPath() {
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
	 * @see org.eclipse.uml2.uml.Region#getSubvertices()
	 * @generated
	 */
	public static final Function<Region, EList<Vertex>> subvertex = new Function<Region, EList<Vertex>>() {
		public EList<Vertex> apply(Region s) {
			return s.getSubvertices();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#getTransitions()
	 * @generated
	 */
	public static final Function<Region, EList<Transition>> transition = new Function<Region, EList<Transition>>() {
		public EList<Transition> apply(Region s) {
			return s.getTransitions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#getState()
	 * @generated
	 */
	public static final Function<Region, State> state = new Function<Region, State>() {
		public State apply(Region s) {
			return s.getState();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#getExtendedRegion()
	 * @generated
	 */
	public static final Function<Region, Region> extendedRegion = new Function<Region, Region>() {
		public Region apply(Region s) {
			return s.getExtendedRegion();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#getStateMachine()
	 * @generated
	 */
	public static final Function<Region, StateMachine> stateMachine = new Function<Region, StateMachine>() {
		public StateMachine apply(Region s) {
			return s.getStateMachine();
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
	 * @see org.eclipse.uml2.uml.Region#validateInitialVertex()
	 * @generated
	 */
	public static Predicate<Region> validateInitialVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Region>() {
			public boolean apply(Region s) {
				return s.validateInitialVertex(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Region#validateDeepHistoryVertex()
	 * @generated
	 */
	public static Predicate<Region> validateDeepHistoryVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Region>() {
			public boolean apply(Region s) {
				return s.validateDeepHistoryVertex(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Region#validateShallowHistoryVertex()
	 * @generated
	 */
	public static Predicate<Region> validateShallowHistoryVertex(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Region>() {
			public boolean apply(Region s) {
				return s.validateShallowHistoryVertex(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Region#validateOwned()
	 * @generated
	 */
	public static Predicate<Region> validateOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Region>() {
			public boolean apply(Region s) {
				return s.validateOwned(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Region#redefinitionContext()
	 * @generated
	 */
	public static final Function<Region, Classifier> redefinitionContext_ = new Function<Region, Classifier>() {
		public Classifier apply(Region s) {
			return s.redefinitionContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<Region> isRedefinitionContextValid(final Region redefined) {
		return new Predicate<Region>() {
			public boolean apply(Region s) {
				return s.isRedefinitionContextValid(redefined);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Region#containingStateMachine()
	 * @generated
	 */
	public static final Function<Region, StateMachine> containingStateMachine = new Function<Region, StateMachine>() {
		public StateMachine apply(Region s) {
			return s.containingStateMachine();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Region#belongsToPSM()
	 * @generated
	 */
	public static final Predicate<Region> belongsToPSM = new Predicate<Region>() {
		public boolean apply(Region s) {
			return s.belongsToPSM();
		}
	};

}
