package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExecutableNode ExecutableNode} in a functional way.
 * <p>
 * An executable node is an abstract class for activity nodes that may be executed. It
 * is used as an attachment point for exception handlers. 
 * @see org.eclipse.uml2.uml.ExecutableNode
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
	 * A set of exception handlers that are examined if an uncaught exception propagates
	 * to the outer level of the executable node. 
	 * @see org.eclipse.uml2.uml.ExecutableNode#getHandlers()
	 * @generated
	 */
	public static final Function<ExecutableNode, EList<ExceptionHandler>> handler = new Function<ExecutableNode, EList<ExceptionHandler>>() {
    public EList<ExceptionHandler> apply(ExecutableNode s) {
      return s.getHandlers();
    }
  };
	
	

}
