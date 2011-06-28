package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ProtocolTransition ProtocolTransition} in a functional way.
 * <p>
 * A protocol transition specifies a legal transition for an operation. Transitions of
 * protocol state machines have the following information: a pre condition (guard), on
 * trigger, and a post condition. Every protocol transition is associated to zero or
 * one operation (referred BehavioralFeature) that belongs to the context classifier
 * of the protocol state machine. 
 * @see org.eclipse.uml2.uml.ProtocolTransition
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
	 * Specifies the post condition of the transition which is the condition that should
	 * be obtained once the transition is triggered. This post condition is part of the post
	 * condition of the operation connected to the transition.
	 
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getPostCondition()
	 * @generated
	 */
	public static final Function<ProtocolTransition, Constraint> postCondition = new Function<ProtocolTransition, Constraint>() {
    public Constraint apply(ProtocolTransition s) {
      return s.getPostCondition();
    }
  };

	/**
	 * This association refers to the associated operation. It is derived from the operation
	 * of the call trigger when applicable. 
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getReferreds()
	 * @generated
	 */
	public static final Function<ProtocolTransition, EList<Operation>> referred = new Function<ProtocolTransition, EList<Operation>>() {
    public EList<Operation> apply(ProtocolTransition s) {
      return s.getReferreds();
    }
  };

	/**
	 * Specifies the precondition of the transition. It specifies the condition that should
	 * be verified before triggering the transition. This guard condition added to the source
	 * state will be evaluated as part of the precondition of the operation referred by the
	 * transition if any. 
	 * @see org.eclipse.uml2.uml.ProtocolTransition#getPreCondition()
	 * @generated
	 */
	public static final Function<ProtocolTransition, Constraint> preCondition = new Function<ProtocolTransition, Constraint>() {
    public Constraint apply(ProtocolTransition s) {
      return s.getPreCondition();
    }
  };
	
	/**
	 * A protocol transition always belongs to a protocol state machine.
	container.belongsToPSM()
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ProtocolTransition> validateBelongsToPsm(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ProtocolTransition>() {
      public boolean apply(ProtocolTransition s) {
        return s.validateBelongsToPsm(diagnostics, context);
      }
    };
  }

	/**
	 * A protocol transition never has associated actions.
	effect->isEmpty() 
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ProtocolTransition> validateAssociatedActions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ProtocolTransition>() {
      public boolean apply(ProtocolTransition s) {
        return s.validateAssociatedActions(diagnostics, context);
      }
    };
  }

	/**
	 * If a protocol transition refers to an operation (i. e. has a call trigger corresponding
	 * to an operation), then that operation should apply to the context classifier of the
	 * state machine of the protocol transition.
	true 
	 * @see org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ProtocolTransition> validateRefersToOperation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ProtocolTransition>() {
      public boolean apply(ProtocolTransition s) {
        return s.validateRefersToOperation(diagnostics, context);
      }
    };
  }

}
