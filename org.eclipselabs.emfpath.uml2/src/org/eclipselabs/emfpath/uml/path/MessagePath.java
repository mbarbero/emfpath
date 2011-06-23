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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Message Message} in a functional way.
 * <p>
 * A message defines a particular communication between lifelines of an interaction.
 * @see org.eclipse.uml2.uml.Message
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
	 * The derived kind of the Message (complete, lost, found or unknown) 
	 * @see org.eclipse.uml2.uml.Message#getMessageKind()
	 * @generated
	 */
	public static final Function<Message, MessageKind> messageKind = new Function<Message, MessageKind>() {
		public MessageKind apply(Message s) {
			return s.getMessageKind();
		}
	};

	/**
	 * The sort of communication reflected by the Message 
	 * @see org.eclipse.uml2.uml.Message#getMessageSort()
	 * @generated
	 */
	public static final Function<Message, MessageSort> messageSort = new Function<Message, MessageSort>() {
		public MessageSort apply(Message s) {
			return s.getMessageSort();
		}
	};

	/**
	 * References the Receiving of the Message 
	 * @see org.eclipse.uml2.uml.Message#getReceiveEvent()
	 * @generated
	 */
	public static final Function<Message, MessageEnd> receiveEvent = new Function<Message, MessageEnd>() {
		public MessageEnd apply(Message s) {
			return s.getReceiveEvent();
		}
	};

	/**
	 * References the Sending of the Message. 
	 * @see org.eclipse.uml2.uml.Message#getSendEvent()
	 * @generated
	 */
	public static final Function<Message, MessageEnd> sendEvent = new Function<Message, MessageEnd>() {
		public MessageEnd apply(Message s) {
			return s.getSendEvent();
		}
	};

	/**
	 * The Connector on which this Message is sent. 
	 * @see org.eclipse.uml2.uml.Message#getConnector()
	 * @generated
	 */
	public static final Function<Message, Connector> connector = new Function<Message, Connector>() {
		public Connector apply(Message s) {
			return s.getConnector();
		}
	};

	/**
	 * The enclosing Interaction owning the Message 
	 * @see org.eclipse.uml2.uml.Message#getInteraction()
	 * @generated
	 */
	public static final Function<Message, Interaction> interaction = new Function<Message, Interaction>() {
		public Interaction apply(Message s) {
			return s.getInteraction();
		}
	};

	/**
	 * The arguments of the Message 
	 * @see org.eclipse.uml2.uml.Message#getArguments()
	 * @generated
	 */
	public static final Function<Message, EList<ValueSpecification>> argument = new Function<Message, EList<ValueSpecification>>() {
		public EList<ValueSpecification> apply(Message s) {
			return s.getArguments();
		}
	};

	/**
	 * The definition of the type or signature of the Message (depending on its kind). The
	 * associated named element is derived from the message end that constitutes the sending
	 * or receiving message event. If both a sending event and a receiving message event
	 * are present, the signature is obtained from the sending event. 
	 * @see org.eclipse.uml2.uml.Message#getSignature()
	 * @generated
	 */
	public static final Function<Message, NamedElement> signature = new Function<Message, NamedElement>() {
		public NamedElement apply(Message s) {
			return s.getSignature();
		}
	};
	
	/**
	 * If the sending MessageEvent and the receiving MessageEvent of the same Message are
	 * on the same Lifeline, the sending MessageEvent must be ordered before the receiving
	 * MessageEvent.
	true 
	 * @see org.eclipse.uml2.uml.Message#validateSendingReceivingMessageEvent(DiagnosticChain, Map)
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
	 * The signature must either refer an Operation (in which case messageSort is either
	 * synchCall or asynchCall) or a Signal (in which case messageSort is asynchSignal).
	 * The name of the NamedElement referenced by signature must be the same as that of the
	 * Message.
	true 
	 * @see org.eclipse.uml2.uml.Message#validateSignatureReferTo(DiagnosticChain, Map)
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
	 * In the case when the Message signature is an Operation, the arguments of the Message
	 * must correspond to the parameters of the Operation. A Parameter corresponds to an
	 * Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	true
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsOperation(DiagnosticChain, Map)
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
	 * In the case when the Message signature is a Signal, the arguments of the Message must
	 * correspond to the attributes of the Signal. A Message Argument corresponds to a Signal
	 * Attribute if the Arguement is of the same Class or a specialization of that of the
	 * Attribute.
	true 
	 * @see org.eclipse.uml2.uml.Message#validateSignatureIsSignal(DiagnosticChain, Map)
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
	 * Arguments of a Message must only be:
	i) attributes of the sending lifeline
	ii) constants
	iii)
	 * symbolic values (which are wildcard values representing any legal value)
	iv) explicit
	 * parameters of the enclosing Interaction
	v) attributes of the class owning the Interaction
	
	true
	 * @see org.eclipse.uml2.uml.Message#validateArguments(DiagnosticChain, Map)
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
	 * Messages cannot cross bounderies of CombinedFragments or their operands.
	true 
	 * @see org.eclipse.uml2.uml.Message#validateCannotCrossBoundaries(DiagnosticChain, Map)
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
	 * If the MessageEnds are both OccurrenceSpecifications then the connector must go between
	 * the Parts represented by the Lifelines of the two MessageEnds.
	true 
	 * @see org.eclipse.uml2.uml.Message#validateOccurrenceSpecifications(DiagnosticChain, Map)
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
	 * 
	 * @see org.eclipse.uml2.uml.Message#getMessageKind()
	 * @generated
	 */
	public static final Function<Message, MessageKind> getMessageKind = new Function<Message, MessageKind>() {
		public MessageKind apply(Message s) {
			return s.getMessageKind();
		}
	};

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Message#getSignature()
	 * @generated
	 */
	public static final Function<Message, NamedElement> getSignature = new Function<Message, NamedElement>() {
		public NamedElement apply(Message s) {
			return s.getSignature();
		}
	};

}
