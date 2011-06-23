package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Clause Clause} in a functional way.
 * <p>
 * A clause is an element that represents a single branch of a conditional construct,
 * including a test and a body section. The body section is executed only if (but not
 * necessarily if) the test section evaluates true. 
 * @see org.eclipse.uml2.uml.Clause
 * @generated
 */
public class ClausePath extends ElementPath {

	/**
	 * @generated
	 */
	private ClausePath() {
		super();
	}

	/**
	 * A nested activity fragment with a designated output pin that specifies the result
	 * of the test. 
	 * @see org.eclipse.uml2.uml.Clause#getTests()
	 * @generated
	 */
	public static final Function<Clause, EList<ExecutableNode>> test = new Function<Clause, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(Clause s) {
			return s.getTests();
		}
	};

	/**
	 * A nested activity fragment that is executed if the test evaluates to true and the
	 * clause is chosen over any concurrent clauses that also evaluate to true. 
	 * @see org.eclipse.uml2.uml.Clause#getBodies()
	 * @generated
	 */
	public static final Function<Clause, EList<ExecutableNode>> body = new Function<Clause, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(Clause s) {
			return s.getBodies();
		}
	};

	/**
	 * A set of clauses whose tests must all evaluate false before the current clause can
	 * be tested. 
	 * @see org.eclipse.uml2.uml.Clause#getPredecessorClauses()
	 * @generated
	 */
	public static final Function<Clause, EList<Clause>> predecessorClause = new Function<Clause, EList<Clause>>() {
		public EList<Clause> apply(Clause s) {
			return s.getPredecessorClauses();
		}
	};

	/**
	 * A set of clauses which may not be tested unless the current clause tests false. 
	 * @see org.eclipse.uml2.uml.Clause#getSuccessorClauses()
	 * @generated
	 */
	public static final Function<Clause, EList<Clause>> successorClause = new Function<Clause, EList<Clause>>() {
		public EList<Clause> apply(Clause s) {
			return s.getSuccessorClauses();
		}
	};

	/**
	 * An output pin within the test fragment the value of which is examined after execution
	 * of the test to determine whether the body should be executed. 
	 * @see org.eclipse.uml2.uml.Clause#getDecider()
	 * @generated
	 */
	public static final Function<Clause, OutputPin> decider = new Function<Clause, OutputPin>() {
		public OutputPin apply(Clause s) {
			return s.getDecider();
		}
	};

	/**
	 * A list of output pins within the body fragment whose values are moved to the result
	 * pins of the containing conditional node after execution of the clause body. 
	 * @see org.eclipse.uml2.uml.Clause#getBodyOutputs()
	 * @generated
	 */
	public static final Function<Clause, EList<OutputPin>> bodyOutput = new Function<Clause, EList<OutputPin>>() {
		public EList<OutputPin> apply(Clause s) {
			return s.getBodyOutputs();
		}
	};
	
	/**
	 * The decider output pin must be for the test body or a node contained by the test body
	 * as a structured node.
	true 
	 * @see org.eclipse.uml2.uml.Clause#validateDeciderOutput(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Clause> validateDeciderOutput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Clause>() {
			public boolean apply(Clause s) {
				return s.validateDeciderOutput(diagnostics, context);
			}
		};
	}

	/**
	 * The bodyOutput pins are output pins on actions in the body of the clause.
	true 
	 * @see org.eclipse.uml2.uml.Clause#validateBodyOutputPins(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Clause> validateBodyOutputPins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Clause>() {
			public boolean apply(Clause s) {
				return s.validateBodyOutputPins(diagnostics, context);
			}
		};
	}

}
