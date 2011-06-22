package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class MessagePath extends NamedElementPath {

	/**
	 * @generated
	 */
	private MessagePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#getMessageKind()
	 * @generated
	 */
	public static final Function<Message, MessageKind> messageKind = new Function<Message, MessageKind>() {
		public MessageKind apply(Message s) {
			return s.getMessageKind();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getMessageSort()
	 * @generated
	 */
	public static final Function<Message, MessageSort> messageSort = new Function<Message, MessageSort>() {
		public MessageSort apply(Message s) {
			return s.getMessageSort();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getReceiveEvent()
	 * @generated
	 */
	public static final Function<Message, MessageEnd> receiveEvent = new Function<Message, MessageEnd>() {
		public MessageEnd apply(Message s) {
			return s.getReceiveEvent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getSendEvent()
	 * @generated
	 */
	public static final Function<Message, MessageEnd> sendEvent = new Function<Message, MessageEnd>() {
		public MessageEnd apply(Message s) {
			return s.getSendEvent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getConnector()
	 * @generated
	 */
	public static final Function<Message, Connector> connector = new Function<Message, Connector>() {
		public Connector apply(Message s) {
			return s.getConnector();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getInteraction()
	 * @generated
	 */
	public static final Function<Message, Interaction> interaction = new Function<Message, Interaction>() {
		public Interaction apply(Message s) {
			return s.getInteraction();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getArguments()
	 * @generated
	 */
	public static final Function<Message, EList<ValueSpecification>> argument = new Function<Message, EList<ValueSpecification>>() {
		public EList<ValueSpecification> apply(Message s) {
			return s.getArguments();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getSignature()
	 * @generated
	 */
	public static final Function<Message, NamedElement> signature = new Function<Message, NamedElement>() {
		public NamedElement apply(Message s) {
			return s.getSignature();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent()
	 * @generated
	 */
	public static Predicate<Message> validateSendingReceivingMessageEvent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateSendingReceivingMessageEvent(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateSignatureReferTo()
	 * @generated
	 */
	public static Predicate<Message> validateSignatureReferTo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateSignatureReferTo(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsOperation()
	 * @generated
	 */
	public static Predicate<Message> validateSignatureIsOperation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateSignatureIsOperation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsSignal()
	 * @generated
	 */
	public static Predicate<Message> validateSignatureIsSignal(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateSignatureIsSignal(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateArguments()
	 * @generated
	 */
	public static Predicate<Message> validateArguments(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateArguments(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries()
	 * @generated
	 */
	public static Predicate<Message> validateCannotCrossBoundaries(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateCannotCrossBoundaries(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications()
	 * @generated
	 */
	public static Predicate<Message> validateOccurrenceSpecifications(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Message>() {
			public boolean apply(Message s) {
				return s.validateOccurrenceSpecifications(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Message#getMessageKind()
	 * @generated
	 */
	public static final Function<Message, MessageKind> getMessageKind = new Function<Message, MessageKind>() {
		public MessageKind apply(Message s) {
			return s.getMessageKind();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Message#getSignature()
	 * @generated
	 */
	public static final Function<Message, NamedElement> getSignature = new Function<Message, NamedElement>() {
		public NamedElement apply(Message s) {
			return s.getSignature();
		}
	};

}
