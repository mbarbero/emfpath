package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ObjectNode;

/**
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
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getHandlerBody()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ExecutableNode> handlerBody = new Function<ExceptionHandler, ExecutableNode>() {
		public ExecutableNode apply(ExceptionHandler s) {
			return s.getHandlerBody();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getExceptionInput()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ObjectNode> exceptionInput = new Function<ExceptionHandler, ObjectNode>() {
		public ObjectNode apply(ExceptionHandler s) {
			return s.getExceptionInput();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getExceptionTypes()
	 * @generated
	 */
	public static final Function<ExceptionHandler, EList<Classifier>> exceptionType = new Function<ExceptionHandler, EList<Classifier>>() {
		public EList<Classifier> apply(ExceptionHandler s) {
			return s.getExceptionTypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#getProtectedNode()
	 * @generated
	 */
	public static final Function<ExceptionHandler, ExecutableNode> protectedNode = new Function<ExceptionHandler, ExecutableNode>() {
		public ExecutableNode apply(ExceptionHandler s) {
			return s.getProtectedNode();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateExceptionBody()
	 * @generated
	 */
	public static Predicate<ExceptionHandler> validateExceptionBody(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExceptionHandler>() {
			public boolean apply(ExceptionHandler s) {
				return s.validateExceptionBody(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateResultPins()
	 * @generated
	 */
	public static Predicate<ExceptionHandler> validateResultPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExceptionHandler>() {
			public boolean apply(ExceptionHandler s) {
				return s.validateResultPins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateOneInput()
	 * @generated
	 */
	public static Predicate<ExceptionHandler> validateOneInput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExceptionHandler>() {
			public boolean apply(ExceptionHandler s) {
				return s.validateOneInput(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ExceptionHandler#validateEdgeSourceTarget()
	 * @generated
	 */
	public static Predicate<ExceptionHandler> validateEdgeSourceTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExceptionHandler>() {
			public boolean apply(ExceptionHandler s) {
				return s.validateEdgeSourceTarget(diagnostics, context);
			}
		};
	}

}
