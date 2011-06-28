package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Vertex Vertex} in a functional way.
 * <p>
 * A vertex is an abstraction of a node in a state machine graph. In general, it can
 * be the source or destination of any number of transitions. 
 * @see org.eclipse.uml2.uml.Vertex
 * @generated
 */
public class VertexPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 VertexPath() {
    super();
  }

	/**
	 * Specifies the transitions departing from this vertex. 
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> outgoing = new Function<Vertex, EList<Transition>>() {
    public EList<Transition> apply(Vertex s) {
      return s.getOutgoings();
    }
  };

	/**
	 * Specifies the transitions entering this vertex. 
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> incoming = new Function<Vertex, EList<Transition>>() {
    public EList<Transition> apply(Vertex s) {
      return s.getIncomings();
    }
  };

	/**
	 * The region that contains this vertex. 
	 * @see org.eclipse.uml2.uml.Vertex#getContainer()
	 * @generated
	 */
	public static final Function<Vertex, Region> container = new Function<Vertex, Region>() {
    public Region apply(Vertex s) {
      return s.getContainer();
    }
  };
	
	/**
	 * The operation containingStateMachine() returns the state machine in which this Vertex
	 * is defined
	result = if not container->isEmpty()
	then
	-- the container is a region
	container.containingStateMachine()
	else
	 * if (oclIsKindOf(Pseudostate)) then
	-- entry or exit point?
	if (kind = #entryPoint)
	 * or (kind = #exitPoint) then
	stateMachine
	else if (oclIsKindOf(ConnectionPointReference))
	 * then
	state.containingStateMachine() -- no other valid cases possible
	endif
	 
	 * @see org.eclipse.uml2.uml.Vertex#containingStateMachine()
	 * @generated
	 */
	public static final Function<Vertex, StateMachine> containingStateMachine = new Function<Vertex, StateMachine>() {
    public StateMachine apply(Vertex s) {
      return s.containingStateMachine();
    }
  };

	/**
	 * result = Transition.allInstances()->select(t | t.source=self) 
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> getOutgoings = new Function<Vertex, EList<Transition>>() {
    public EList<Transition> apply(Vertex s) {
      return s.getOutgoings();
    }
  };

	/**
	 * result = Transition.allInstances()->select(t | t.target=self) 
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> getIncomings = new Function<Vertex, EList<Transition>>() {
    public EList<Transition> apply(Vertex s) {
      return s.getIncomings();
    }
  };

}
