package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.MessageEnd MessageEnd} in a functional way.
 * <p>
 * MessageEnd is an abstract specialization of NamedElement that represents what can
 * occur at the end of a message. 
 * @see org.eclipse.uml2.uml.MessageEnd
 * @generated
 */
public class MessageEndPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 MessageEndPath() {
		super();
	}

	/**
	 * References a Message. 
	 * @see org.eclipse.uml2.uml.MessageEnd#getMessage()
	 * @generated
	 */
	public static final Function<MessageEnd, Message> message = new Function<MessageEnd, Message>() {
		public Message apply(MessageEnd s) {
			return s.getMessage();
		}
	};
	
	

}
