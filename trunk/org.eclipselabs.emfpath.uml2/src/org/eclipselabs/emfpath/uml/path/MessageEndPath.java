package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;

/**
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
	 * @see org.eclipse.uml2.uml.MessageEnd#getMessage()
	 * @generated
	 */
	public static final Function<MessageEnd, Message> message = new Function<MessageEnd, Message>() {
		public Message apply(MessageEnd s) {
			return s.getMessage();
		}
	};
	
	

}
