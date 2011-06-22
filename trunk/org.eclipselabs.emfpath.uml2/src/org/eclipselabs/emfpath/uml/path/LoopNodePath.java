package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class LoopNodePath extends StructuredActivityNodePath {

	/**
	 * @generated
	 */
	private LoopNodePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#isTestedFirst()
	 * @generated
	 */
	public static final Predicate<LoopNode> isTestedFirst = new Predicate<LoopNode>() {
		public boolean apply(LoopNode s) {
			return s.isTestedFirst();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getBodyParts()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> bodyPart = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getBodyParts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getSetupParts()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> setupPart = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getSetupParts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getDecider()
	 * @generated
	 */
	public static final Function<LoopNode, OutputPin> decider = new Function<LoopNode, OutputPin>() {
		public OutputPin apply(LoopNode s) {
			return s.getDecider();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getTests()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> test = new Function<LoopNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(LoopNode s) {
			return s.getTests();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getResults()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> result = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getResults();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getLoopVariables()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> loopVariable = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getLoopVariables();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getBodyOutputs()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> bodyOutput = new Function<LoopNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(LoopNode s) {
			return s.getBodyOutputs();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#getLoopVariableInputs()
	 * @generated
	 */
	public static final Function<LoopNode, EList<InputPin>> loopVariableInput = new Function<LoopNode, EList<InputPin>>() {
		public EList<InputPin> apply(LoopNode s) {
			return s.getLoopVariableInputs();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.LoopNode#validateInputEdges()
	 * @generated
	 */
	public static Predicate<LoopNode> validateInputEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateInputEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#validateBodyOutputPins()
	 * @generated
	 */
	public static Predicate<LoopNode> validateBodyOutputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateBodyOutputPins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LoopNode#validateResultNoIncoming()
	 * @generated
	 */
	public static Predicate<LoopNode> validateResultNoIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LoopNode>() {
			public boolean apply(LoopNode s) {
				return s.validateResultNoIncoming(diagnostics, context);
			}
		};
	}

}
