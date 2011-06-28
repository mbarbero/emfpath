package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.Trigger;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReplyAction ReplyAction} in a functional way.
 * <p>
 * A reply action is an action that accepts a set of return values and a value containing
 * return information produced by a previous accept call action. The reply action returns
 * the values to the caller of the previous call, completing execution of the call. 
 * @see org.eclipse.uml2.uml.ReplyAction
 * @generated
 */
public class ReplyActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReplyActionPath() {
    super();
  }

	/**
	 * The trigger specifying the operation whose call is being replied to. 
	 * @see org.eclipse.uml2.uml.ReplyAction#getReplyToCall()
	 * @generated
	 */
	public static final Function<ReplyAction, Trigger> replyToCall = new Function<ReplyAction, Trigger>() {
    public Trigger apply(ReplyAction s) {
      return s.getReplyToCall();
    }
  };

	/**
	 * A pin containing the return information value produced by an earlier AcceptCallAction.
	 * @see org.eclipse.uml2.uml.ReplyAction#getReturnInformation()
	 * @generated
	 */
	public static final Function<ReplyAction, InputPin> returnInformation = new Function<ReplyAction, InputPin>() {
    public InputPin apply(ReplyAction s) {
      return s.getReturnInformation();
    }
  };

	/**
	 * A list of pins containing the reply values of the operation. These values are returned
	 * to the caller. 
	 * @see org.eclipse.uml2.uml.ReplyAction#getReplyValues()
	 * @generated
	 */
	public static final Function<ReplyAction, EList<InputPin>> replyValue = new Function<ReplyAction, EList<InputPin>>() {
    public EList<InputPin> apply(ReplyAction s) {
      return s.getReplyValues();
    }
  };
	
	/**
	 * The reply value pins must match the return, out, and inout parameters of the operation
	 * on the event on the trigger in number, type, and order.
	true 
	 * @see org.eclipse.uml2.uml.ReplyAction#validatePinsMatchParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReplyAction> validatePinsMatchParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReplyAction>() {
      public boolean apply(ReplyAction s) {
        return s.validatePinsMatchParameter(diagnostics, context);
      }
    };
  }

	/**
	 * The event on replyToCall trigger must be a CallEvent replyToCallEvent.oclIsKindOf(CallEvent)
	replyToCallEvent.oclIsKindOf(CallEvent)
	 * @see org.eclipse.uml2.uml.ReplyAction#validateEventOnReplyToCallTrigger(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReplyAction> validateEventOnReplyToCallTrigger(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReplyAction>() {
      public boolean apply(ReplyAction s) {
        return s.validateEventOnReplyToCallTrigger(diagnostics, context);
      }
    };
  }

}
