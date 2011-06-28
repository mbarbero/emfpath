package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LoopNode LoopNode} in a functional way.
 * <p>
 * A loop node is a structured activity node that represents a loop with setup, test,
 * and body sections. 
 * @see org.eclipse.uml2.uml.LoopNode
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
	 * If true, the test is performed before the first execution of the body.
	If false, the
	 * body is executed once before the test is performed.
	 
	 * @see org.eclipse.uml2.uml.LoopNode#isTestedFirst()
	 * @generated
	 */
	public static final ComposablePredicate<LoopNode> isTestedFirst = new ComposablePredicate<LoopNode>() {
    public boolean apply(LoopNode s) {
      return s.isTestedFirst();
    }
  };

	/**
	 * The set of nodes and edges that perform the repetitive computations of the loop. The
	 * body section is executed as long as the test section produces a true value. 
	 * @see org.eclipse.uml2.uml.LoopNode#getBodyParts()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> bodyPart = new Function<LoopNode, EList<ExecutableNode>>() {
    public EList<ExecutableNode> apply(LoopNode s) {
      return s.getBodyParts();
    }
  };

	/**
	 * The set of nodes and edges that initialize values or perform other setup computations
	 * for the loop. 
	 * @see org.eclipse.uml2.uml.LoopNode#getSetupParts()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> setupPart = new Function<LoopNode, EList<ExecutableNode>>() {
    public EList<ExecutableNode> apply(LoopNode s) {
      return s.getSetupParts();
    }
  };

	/**
	 * An output pin within the test fragment the value of which is examined after execution
	 * of the test to determine whether to execute the loop body. 
	 * @see org.eclipse.uml2.uml.LoopNode#getDecider()
	 * @generated
	 */
	public static final Function<LoopNode, OutputPin> decider = new Function<LoopNode, OutputPin>() {
    public OutputPin apply(LoopNode s) {
      return s.getDecider();
    }
  };

	/**
	 * The set of nodes, edges, and designated value that compute a Boolean value to determine
	 * if another execution of the body will be performed. 
	 * @see org.eclipse.uml2.uml.LoopNode#getTests()
	 * @generated
	 */
	public static final Function<LoopNode, EList<ExecutableNode>> test = new Function<LoopNode, EList<ExecutableNode>>() {
    public EList<ExecutableNode> apply(LoopNode s) {
      return s.getTests();
    }
  };

	/**
	 * A list of output pins that constitute the data flow output of the entire loop. 
	 * @see org.eclipse.uml2.uml.LoopNode#getResults()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> result = new Function<LoopNode, EList<OutputPin>>() {
    public EList<OutputPin> apply(LoopNode s) {
      return s.getResults();
    }
  };

	/**
	 * A list of output pins that hold the values of the loop variables during an execution
	 * of the loop. When the test fails, the values are movied to the result pins of the
	 * loop. 
	 * @see org.eclipse.uml2.uml.LoopNode#getLoopVariables()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> loopVariable = new Function<LoopNode, EList<OutputPin>>() {
    public EList<OutputPin> apply(LoopNode s) {
      return s.getLoopVariables();
    }
  };

	/**
	 * A list of output pins within the body fragment the values of which are moved to the
	 * loop variable pins after completion of execution of the body, before the next iteration
	 * of the loop begins or before the loop exits. 
	 * @see org.eclipse.uml2.uml.LoopNode#getBodyOutputs()
	 * @generated
	 */
	public static final Function<LoopNode, EList<OutputPin>> bodyOutput = new Function<LoopNode, EList<OutputPin>>() {
    public EList<OutputPin> apply(LoopNode s) {
      return s.getBodyOutputs();
    }
  };

	/**
	 * A list of values that are moved into the loop variable pins before the first iteration
	 * of the loop. 
	 * @see org.eclipse.uml2.uml.LoopNode#getLoopVariableInputs()
	 * @generated
	 */
	public static final Function<LoopNode, EList<InputPin>> loopVariableInput = new Function<LoopNode, EList<InputPin>>() {
    public EList<InputPin> apply(LoopNode s) {
      return s.getLoopVariableInputs();
    }
  };
	
	/**
	 * Loop variable inputs must not have outgoing edges.
	true 
	 * @see org.eclipse.uml2.uml.LoopNode#validateInputEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LoopNode> validateInputEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LoopNode>() {
      public boolean apply(LoopNode s) {
        return s.validateInputEdges(diagnostics, context);
      }
    };
  }

	/**
	 * The bodyOutput pins are output pins on actions in the body of the loop node.
	true
	 * @see org.eclipse.uml2.uml.LoopNode#validateBodyOutputPins(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LoopNode> validateBodyOutputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LoopNode>() {
      public boolean apply(LoopNode s) {
        return s.validateBodyOutputPins(diagnostics, context);
      }
    };
  }

	/**
	 * The result output pins have no incoming edges.
	true 
	 * @see org.eclipse.uml2.uml.LoopNode#validateResultNoIncoming(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LoopNode> validateResultNoIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LoopNode>() {
      public boolean apply(LoopNode s) {
        return s.validateResultNoIncoming(diagnostics, context);
      }
    };
  }

}
