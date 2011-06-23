package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.State;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ConnectionPointReference ConnectionPointReference} in a functional way.
 * <p>
 * A connection point reference represents a usage (as part of a submachine state) of
 * an entry/exit point defined in the statemachine reference by the submachine state.
 * @see org.eclipse.uml2.uml.ConnectionPointReference
 * @generated
 */
public class ConnectionPointReferencePath extends VertexPath {

	/**
	 * @generated
	 */
	private ConnectionPointReferencePath() {
		super();
	}

	/**
	 * The entryPoint kind pseudo states corresponding to this connection point. 
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getEntries()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, EList<Pseudostate>> entry = new Function<ConnectionPointReference, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(ConnectionPointReference s) {
			return s.getEntries();
		}
	};

	/**
	 * The exitPoints kind pseudo states corresponding to this connection point. 
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getExits()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, EList<Pseudostate>> exit = new Function<ConnectionPointReference, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(ConnectionPointReference s) {
			return s.getExits();
		}
	};

	/**
	 * The State in which the connection point refreshens are defined. 
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getState()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, State> state = new Function<ConnectionPointReference, State>() {
		public State apply(ConnectionPointReference s) {
			return s.getState();
		}
	};
	
	/**
	 * The entry Pseudostates must be Pseudostates with kind entryPoint.
	entry->notEmpty()
	 * implies entry->forAll(e | e.kind = #entryPoint) 
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#validateEntryPseudostates(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectionPointReference> validateEntryPseudostates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectionPointReference>() {
			public boolean apply(ConnectionPointReference s) {
				return s.validateEntryPseudostates(diagnostics, context);
			}
		};
	}

	/**
	 * The exit Pseudostates must be Pseudostates with kind exitPoint.
	exit->notEmpty()
	 * implies exit->forAll(e | e.kind = #exitPoint) 
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#validateExitPseudostates(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectionPointReference> validateExitPseudostates(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectionPointReference>() {
			public boolean apply(ConnectionPointReference s) {
				return s.validateExitPseudostates(diagnostics, context);
			}
		};
	}

}
