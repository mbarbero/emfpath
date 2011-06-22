package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
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
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> outgoing = new Function<Vertex, EList<Transition>>() {
		public EList<Transition> apply(Vertex s) {
			return s.getOutgoings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> incoming = new Function<Vertex, EList<Transition>>() {
		public EList<Transition> apply(Vertex s) {
			return s.getIncomings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getContainer()
	 * @generated
	 */
	public static final Function<Vertex, Region> container = new Function<Vertex, Region>() {
		public Region apply(Vertex s) {
			return s.getContainer();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Vertex#containingStateMachine()
	 * @generated
	 */
	public static final Function<Vertex, StateMachine> containingStateMachine = new Function<Vertex, StateMachine>() {
		public StateMachine apply(Vertex s) {
			return s.containingStateMachine();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getOutgoings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> getOutgoings = new Function<Vertex, EList<Transition>>() {
		public EList<Transition> apply(Vertex s) {
			return s.getOutgoings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Vertex#getIncomings()
	 * @generated
	 */
	public static final Function<Vertex, EList<Transition>> getIncomings = new Function<Vertex, EList<Transition>>() {
		public EList<Transition> apply(Vertex s) {
			return s.getIncomings();
		}
	};

}
