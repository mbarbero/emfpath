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
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getEntries()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, EList<Pseudostate>> entry = new Function<ConnectionPointReference, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(ConnectionPointReference s) {
			return s.getEntries();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getExits()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, EList<Pseudostate>> exit = new Function<ConnectionPointReference, EList<Pseudostate>>() {
		public EList<Pseudostate> apply(ConnectionPointReference s) {
			return s.getExits();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#getState()
	 * @generated
	 */
	public static final Function<ConnectionPointReference, State> state = new Function<ConnectionPointReference, State>() {
		public State apply(ConnectionPointReference s) {
			return s.getState();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#validateEntryPseudostates()
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
	 * @see org.eclipse.uml2.uml.ConnectionPointReference#validateExitPseudostates()
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
