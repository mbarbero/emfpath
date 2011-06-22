package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.Trigger;

/**
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
	 * @see org.eclipse.uml2.uml.ReplyAction#getReplyToCall()
	 * @generated
	 */
	public static final Function<ReplyAction, Trigger> replyToCall = new Function<ReplyAction, Trigger>() {
		public Trigger apply(ReplyAction s) {
			return s.getReplyToCall();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReplyAction#getReturnInformation()
	 * @generated
	 */
	public static final Function<ReplyAction, InputPin> returnInformation = new Function<ReplyAction, InputPin>() {
		public InputPin apply(ReplyAction s) {
			return s.getReturnInformation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReplyAction#getReplyValues()
	 * @generated
	 */
	public static final Function<ReplyAction, EList<InputPin>> replyValue = new Function<ReplyAction, EList<InputPin>>() {
		public EList<InputPin> apply(ReplyAction s) {
			return s.getReplyValues();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReplyAction#validatePinsMatchParameter()
	 * @generated
	 */
	public static Predicate<ReplyAction> validatePinsMatchParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReplyAction>() {
			public boolean apply(ReplyAction s) {
				return s.validatePinsMatchParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReplyAction#validateEventOnReplyToCallTrigger()
	 * @generated
	 */
	public static Predicate<ReplyAction> validateEventOnReplyToCallTrigger(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReplyAction>() {
			public boolean apply(ReplyAction s) {
				return s.validateEventOnReplyToCallTrigger(diagnostics, context);
			}
		};
	}

}
