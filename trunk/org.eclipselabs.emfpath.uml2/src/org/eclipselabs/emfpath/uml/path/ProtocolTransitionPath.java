package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ProtocolTransition;

/**
 * @generated
 */
public class ProtocolTransitionPath extends TransitionPath {

	/**
	 * @generated
	 */
	private ProtocolTransitionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getPostCondition()
	 * @generated
	 */
	public static final Function<ProtocolTransition, Constraint> postCondition = new Function<ProtocolTransition, Constraint>() {
		public Constraint apply(ProtocolTransition s) {
			return s.getPostCondition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getReferreds()
	 * @generated
	 */
	public static final Function<ProtocolTransition, EList<Operation>> referred = new Function<ProtocolTransition, EList<Operation>>() {
		public EList<Operation> apply(ProtocolTransition s) {
			return s.getReferreds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getPreCondition()
	 * @generated
	 */
	public static final Function<ProtocolTransition, Constraint> preCondition = new Function<ProtocolTransition, Constraint>() {
		public Constraint apply(ProtocolTransition s) {
			return s.getPreCondition();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm()
	 * @generated
	 */
	public static Predicate<ProtocolTransition> validateBelongsToPsm(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolTransition>() {
			public boolean apply(ProtocolTransition s) {
				return s.validateBelongsToPsm(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions()
	 * @generated
	 */
	public static Predicate<ProtocolTransition> validateAssociatedActions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolTransition>() {
			public boolean apply(ProtocolTransition s) {
				return s.validateAssociatedActions(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation()
	 * @generated
	 */
	public static Predicate<ProtocolTransition> validateRefersToOperation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ProtocolTransition>() {
			public boolean apply(ProtocolTransition s) {
				return s.validateRefersToOperation(diagnostics, context);
			}
		};
	}

}
