package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.OutputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ConditionalNode ConditionalNode} in a functional way.
 * <p>
 * A conditional node is a structured activity node that represents an exclusive choice
 * among some number of alternatives. 
 * @see org.eclipse.uml2.uml.ConditionalNode
 * @generated
 */
public class ConditionalNodePath extends StructuredActivityNodePath {

	/**
	 * @generated
	 */
	private ConditionalNodePath() {
		super();
	}

	/**
	 * If true, the modeler asserts that at most one test will succeed. 
	 * @see org.eclipse.uml2.uml.ConditionalNode#isDeterminate()
	 * @generated
	 */
	public static final Predicate<ConditionalNode> isDeterminate = new Predicate<ConditionalNode>() {
		public boolean apply(ConditionalNode s) {
			return s.isDeterminate();
		}
	};

	/**
	 * If true, the modeler asserts that at least one test will succeed. 
	 * @see org.eclipse.uml2.uml.ConditionalNode#isAssured()
	 * @generated
	 */
	public static final Predicate<ConditionalNode> isAssured = new Predicate<ConditionalNode>() {
		public boolean apply(ConditionalNode s) {
			return s.isAssured();
		}
	};

	/**
	 * Set of clauses composing the conditional. 
	 * @see org.eclipse.uml2.uml.ConditionalNode#getClauses()
	 * @generated
	 */
	public static final Function<ConditionalNode, EList<Clause>> clause = new Function<ConditionalNode, EList<Clause>>() {
		public EList<Clause> apply(ConditionalNode s) {
			return s.getClauses();
		}
	};

	/**
	 * A list of output pins that constitute the data flow outputs of the conditional. 
	 * @see org.eclipse.uml2.uml.ConditionalNode#getResults()
	 * @generated
	 */
	public static final Function<ConditionalNode, EList<OutputPin>> result = new Function<ConditionalNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(ConditionalNode s) {
			return s.getResults();
		}
	};
	
	/**
	 * The result output pins have no incoming edges.
	true 
	 * @see org.eclipse.uml2.uml.ConditionalNode#validateResultNoIncoming(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConditionalNode> validateResultNoIncoming(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConditionalNode>() {
			public boolean apply(ConditionalNode s) {
				return s.validateResultNoIncoming(diagnostics, context);
			}
		};
	}

}
