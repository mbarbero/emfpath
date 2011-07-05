package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExceptionHandler ExceptionHandler} in a functional way.
 * <p>
 * An exception handler is an element that specifies a body to execute in case the specified
 * exception occurs during the execution of the protected node. 
 * @see org.eclipse.uml2.uml.ExceptionHandler
 * @generated
 */
public class ExceptionHandlerPath extends ElementPath {

	/**
	 * @generated
	 */
	private ExceptionHandlerPath() {
    super();
  }

	/**
	 * A node that is executed if the handler satisfies an uncaught exception. 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getHandlerBody()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ExecutableNode> handlerBody = new Function<ExceptionHandler, ExecutableNode>() {
    public ExecutableNode apply(ExceptionHandler s) {
      return s.getHandlerBody();
    }
  };

	/**
	 * An object node within the handler body. When the handler catches an exception, the
	 * exception token is placed in this node, causing the body to execute. 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getExceptionInput()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ObjectNode> exceptionInput = new Function<ExceptionHandler, ObjectNode>() {
    public ObjectNode apply(ExceptionHandler s) {
      return s.getExceptionInput();
    }
  };

	/**
	 * The kind of instances that the handler catches. If an exception occurs whose type
	 * is any of the classifiers in the set, the handler catches the exception and executes
	 * its body. 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getExceptionTypes()
	 * @generated
	 */
	public static final Function<ExceptionHandler, EList<Classifier>> exceptionType = new Function<ExceptionHandler, EList<Classifier>>() {
    public EList<Classifier> apply(ExceptionHandler s) {
      return s.getExceptionTypes();
    }
  };

	/**
	 * The node protected by the handler. The handler is examined if an exception propagates
	 * to the outside of the node. 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ExecutableNode> protectedNode = new Function<ExceptionHandler, ExecutableNode>() {
    public ExecutableNode apply(ExceptionHandler s) {
      return s.getProtectedNode();
    }
  };
	
	/**
	 * The exception handler and its input object node are not the source or target of any
	 * edge.
	true 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateExceptionBody(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExceptionHandler> validateExceptionBody(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExceptionHandler>() {
      public boolean apply(ExceptionHandler s) {
        return s.validateExceptionBody(diagnostics, context);
      }
    };
  }

	/**
	 * The result pins of the exception handler body must correspond in number and types
	 * to the result pins of the protected node.
	true 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateResultPins(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExceptionHandler> validateResultPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExceptionHandler>() {
      public boolean apply(ExceptionHandler s) {
        return s.validateResultPins(diagnostics, context);
      }
    };
  }

	/**
	 * The handler body has one input, and that input is the same as the exception input.
	true
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateOneInput(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExceptionHandler> validateOneInput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExceptionHandler>() {
      public boolean apply(ExceptionHandler s) {
        return s.validateOneInput(diagnostics, context);
      }
    };
  }

	/**
	 * An edge that has a source in an exception handler structured node must have its target
	 * in the handler also, and vice versa.
	true 
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateEdgeSourceTarget(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExceptionHandler> validateEdgeSourceTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExceptionHandler>() {
      public boolean apply(ExceptionHandler s) {
        return s.validateEdgeSourceTarget(diagnostics, context);
      }
    };
  }

}
