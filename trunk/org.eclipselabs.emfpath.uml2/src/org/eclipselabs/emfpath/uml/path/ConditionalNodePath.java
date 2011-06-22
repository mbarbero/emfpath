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
	 * @see org.eclipse.uml2.uml.ConditionalNode#isDeterminate()
	 * @generated
	 */
	public static final Predicate<ConditionalNode> isDeterminate = new Predicate<ConditionalNode>() {
		public boolean apply(ConditionalNode s) {
			return s.isDeterminate();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConditionalNode#isAssured()
	 * @generated
	 */
	public static final Predicate<ConditionalNode> isAssured = new Predicate<ConditionalNode>() {
		public boolean apply(ConditionalNode s) {
			return s.isAssured();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConditionalNode#getClauses()
	 * @generated
	 */
	public static final Function<ConditionalNode, EList<Clause>> clause = new Function<ConditionalNode, EList<Clause>>() {
		public EList<Clause> apply(ConditionalNode s) {
			return s.getClauses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConditionalNode#getResults()
	 * @generated
	 */
	public static final Function<ConditionalNode, EList<OutputPin>> result = new Function<ConditionalNode, EList<OutputPin>>() {
		public EList<OutputPin> apply(ConditionalNode s) {
			return s.getResults();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ConditionalNode#validateResultNoIncoming()
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
