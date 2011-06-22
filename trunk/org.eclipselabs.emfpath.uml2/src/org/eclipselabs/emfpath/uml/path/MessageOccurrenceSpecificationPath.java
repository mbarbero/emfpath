package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;

/**
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
	 * @see org.eclipse.uml2.uml.MessageEnd#getMessage()
	 * @generated
	 */
	public static final Function<MessageEnd, Message> message = MessageEndPath.message;
	
	

}
