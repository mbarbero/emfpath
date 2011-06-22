package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;

/**
 * @generated
 */
public class ExecutableNodePath extends ActivityNodePath {

	/**
	 * @generated
	 */
	 ExecutableNodePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ExecutableNode#getHandlers()
	 * @generated
	 */
	public static final Function<ExecutableNode, EList<ExceptionHandler>> handler = new Function<ExecutableNode, EList<ExceptionHandler>>() {
		public EList<ExceptionHandler> apply(ExecutableNode s) {
			return s.getHandlers();
		}
	};
	
	

}
