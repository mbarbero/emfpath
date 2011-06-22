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
	 * @see org.eclipse.uml2.uml.Clause#getTests()
	 * @generated
	 */
	public static final Function<Clause, EList<ExecutableNode>> test = new Function<Clause, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(Clause s) {
			return s.getTests();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Clause#getBodies()
	 * @generated
	 */
	public static final Function<Clause, EList<ExecutableNode>> body = new Function<Clause, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(Clause s) {
			return s.getBodies();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Clause#getPredecessorClauses()
	 * @generated
	 */
	public static final Function<Clause, EList<Clause>> predecessorClause = new Function<Clause, EList<Clause>>() {
		public EList<Clause> apply(Clause s) {
			return s.getPredecessorClauses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Clause#getSuccessorClauses()
	 * @generated
	 */
	public static final Function<Clause, EList<Clause>> successorClause = new Function<Clause, EList<Clause>>() {
		public EList<Clause> apply(Clause s) {
			return s.getSuccessorClauses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Clause#getDecider()
	 * @generated
	 */
	public static final Function<Clause, OutputPin> decider = new Function<Clause, OutputPin>() {
		public OutputPin apply(Clause s) {
			return s.getDecider();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Clause#getBodyOutputs()
	 * @generated
	 */
	public static final Function<Clause, EList<OutputPin>> bodyOutput = new Function<Clause, EList<OutputPin>>() {
		public EList<OutputPin> apply(Clause s) {
			return s.getBodyOutputs();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Clause#validateDeciderOutput()
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
	 * @see org.eclipse.uml2.uml.Clause#validateBodyOutputPins()
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
