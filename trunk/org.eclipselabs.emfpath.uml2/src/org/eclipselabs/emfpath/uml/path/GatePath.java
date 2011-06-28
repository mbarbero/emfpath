package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Gate;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Gate Gate} in a functional way.
 * <p>
 * A gate is a connection point for relating a message outside an interaction fragment
 * with a message inside the interaction fragment. 
 * @see org.eclipse.uml2.uml.Gate
 * @generated
 */
public class GatePath extends MessageEndPath {

	/**
	 * @generated
	 */
	private GatePath() {
    super();
  }

	
	
	/**
	 * The message leading to/from an actualGate of an InteractionUse must correspond to
	 * the message leading from/to the formalGate with the same name of the Interaction referenced
	 * by the InteractionUse.
	true 
	 * @see org.eclipse.uml2.uml.Gate#validateMessagesActualGate(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Gate> validateMessagesActualGate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Gate>() {
      public boolean apply(Gate s) {
        return s.validateMessagesActualGate(diagnostics, context);
      }
    };
  }

	/**
	 * The message leading to/from an (expression) Gate within a CombinedFragment must correspond
	 * to the message leading from/to the CombinedFragment on its outside.
	true 
	 * @see org.eclipse.uml2.uml.Gate#validateMessagesCombinedFragment(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Gate> validateMessagesCombinedFragment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Gate>() {
      public boolean apply(Gate s) {
        return s.validateMessagesCombinedFragment(diagnostics, context);
      }
    };
  }

}
