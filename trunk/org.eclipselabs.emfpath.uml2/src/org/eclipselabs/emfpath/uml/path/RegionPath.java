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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Region Region} in a functional way.
 * <p>
 * A region is an orthogonal part of either a composite state or a state machine. It
 * contains states and transitions. 
 * @see org.eclipse.uml2.uml.Region
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
	 * The set of vertices that are owned by this region. 
	 * @see org.eclipse.uml2.uml.Region#getSubvertices()
	 * @generated
	 */
	public static final Function<Region, EList<Vertex>> subvertex = new Function<Region, EList<Vertex>>() {
		public EList<Vertex> apply(Region s) {
			return s.getSubvertices();
		}
	};

	/**
	 * The set of transitions owned by the region. Note that internal transitions are owned
	 * by a region, but applies to the source state. 
	 * @see org.eclipse.uml2.uml.Region#getTransitions()
	 * @generated
	 */
	public static final Function<Region, EList<Transition>> transition = new Function<Region, EList<Transition>>() {
		public EList<Transition> apply(Region s) {
			return s.getTransitions();
		}
	};

	/**
	 * The State that owns the Region. If a Region is owned by a State, then it cannot also
	 * be owned by a StateMachine. 
	 * @see org.eclipse.uml2.uml.Region#getState()
	 * @generated
	 */
	public static final Function<Region, State> state = new Function<Region, State>() {
		public State apply(Region s) {
			return s.getState();
		}
	};

	/**
	 * The region of which this region is an extension. 
	 * @see org.eclipse.uml2.uml.Region#getExtendedRegion()
	 * @generated
	 */
	public static final Function<Region, Region> extendedRegion = new Function<Region, Region>() {
		public Region apply(Region s) {
			return s.getExtendedRegion();
		}
	};

	/**
	 * The StateMachine that owns the Region. If a Region is owned by a StateMachine, then
	 * it cannot also be owned by a State. 
	 * @see org.eclipse.uml2.uml.Region#getStateMachine()
	 * @generated
	 */
	public static final Function<Region, StateMachine> stateMachine = new Function<Region, StateMachine>() {
		public StateMachine apply(Region s) {
			return s.getStateMachine();
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
	 * A region can have at most one initial vertex
	self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	select(p
	 * : Pseudostate | p.kind = #initial)->size() <= 1
	 
	 * @see org.eclipse.uml2.uml.Region#validateInitialVertex(DiagnosticChain, Map)
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
	 * A region can have at most one deep history vertex
	self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	select(p
	 * : Pseudostate | p.kind = #deepHistory)->size() <= 1
	 
	 * @see org.eclipse.uml2.uml.Region#validateDeepHistoryVertex(DiagnosticChain, Map)
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
	 * A region can have at most one shallow history vertex
	self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->
	select(p
	 * : Pseudostate | p.kind = #shallowHistory)->size() <= 1
	 
	 * @see org.eclipse.uml2.uml.Region#validateShallowHistoryVertex(DiagnosticChain, Map)
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
	 * If a Region is owned by a StateMachine, then it cannot also be owned by a State and
	 * vice versa.
	(stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty()
	 * implies stateMachine->isEmpty()) 
	 * @see org.eclipse.uml2.uml.Region#validateOwned(DiagnosticChain, Map)
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
	 * The redefinition context of a region is the nearest containing statemachine
	result
	 * = let sm = containingStateMachine() in
	if sm.context->isEmpty() or sm.general->notEmpty()
	 * then
	sm
	else
	sm.context
	endif 
	 * @see org.eclipse.uml2.uml.Region#redefinitionContext()
	 * @generated
	 */
	public static final Function<Region, Classifier> redefinitionContext_ = new Function<Region, Classifier>() {
		public Classifier apply(Region s) {
			return s.redefinitionContext();
		}
	};

	/**
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of a region are properly related to the redefinition contexts of the specified region
	 * to allow this element to redefine the other. The containing statemachine/state of
	 * a redefining region must redefine the containing statemachine/state of the redefined
	 * region.
	result = true 
	 * @see org.eclipse.uml2.uml.Region#isRedefinitionContextValid(Region)
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
	 * The operation containingStateMachine() returns the sate machine in which this Region
	 * is defined
	result = if stateMachine->isEmpty() 
	then
	state.containingStateMachine()
	else
	stateMachine
	endif
	 * @see org.eclipse.uml2.uml.Region#containingStateMachine()
	 * @generated
	 */
	public static final Function<Region, StateMachine> containingStateMachine = new Function<Region, StateMachine>() {
		public StateMachine apply(Region s) {
			return s.containingStateMachine();
		}
	};

	/**
	 * The operation belongsToPSM () checks if the region belongs to a protocol state machine
	result
	 * = if not stateMachine->isEmpty() then
	oclIsTypeOf(ProtocolStateMachine)
	else if not
	 * state->isEmpty() then
	state.container.belongsToPSM ()
	else false 
	 * @see org.eclipse.uml2.uml.Region#belongsToPSM()
	 * @generated
	 */
	public static final Predicate<Region> belongsToPSM = new Predicate<Region>() {
		public boolean apply(Region s) {
			return s.belongsToPSM();
		}
	};

}
