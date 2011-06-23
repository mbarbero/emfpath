package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.MessageOccurrenceSpecification MessageOccurrenceSpecification} in a functional way.
 * <p>
 * A message occurrence specification pecifies the occurrence of message events, such
 * as sending and receiving of signals or invoking or receiving of operation calls. A
 * message occurrence specification is a kind of message end. Messages are generated
 * either by synchronous operation calls or asynchronous signal sends. They are received
 * by the execution of corresponding accept event actions. 
 * @see org.eclipse.uml2.uml.MessageOccurrenceSpecification
 * @generated
 */
public class MessageOccurrenceSpecificationPath extends OccurrenceSpecificationPath {

	/**
	 * @generated
	 */
	private MessageOccurrenceSpecificationPath() {
		super();
	}

	/**
	 * References a Message. 
	 *
	 * @see MessageEndPath#message()
	 * @see org.eclipse.uml2.uml.MessageEnd#getMessage()
	 * @generated
	 */
	public static final Function<MessageEnd, Message> message = MessageEndPath.message;
	
	

}
