package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ConsiderIgnoreFragment ConsiderIgnoreFragment} in a functional way.
 * <p>
 * A consider ignore fragment is a kind of combined fragment that is used for the consider
 * and ignore cases, which require lists of pertinent messages to be specified. 
 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment
 * @generated
 */
public class ConsiderIgnoreFragmentPath extends CombinedFragmentPath {

	/**
	 * @generated
	 */
	private ConsiderIgnoreFragmentPath() {
		super();
	}

	/**
	 * The set of messages that apply to this fragment 
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#getMessages()
	 * @generated
	 */
	public static final Function<ConsiderIgnoreFragment, EList<NamedElement>> message = new Function<ConsiderIgnoreFragment, EList<NamedElement>>() {
		public EList<NamedElement> apply(ConsiderIgnoreFragment s) {
			return s.getMessages();
		}
	};
	
	/**
	 * The interaction operator of a ConsiderIgnoreFragment must be either 'consider' or
	 * 'ignore'.
	(interactionOperator = #consider) or (interactionOperator = #ignore) 
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateConsiderOrIgnore(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConsiderIgnoreFragment> validateConsiderOrIgnore(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConsiderIgnoreFragment>() {
			public boolean apply(ConsiderIgnoreFragment s) {
				return s.validateConsiderOrIgnore(diagnostics, context);
			}
		};
	}

	/**
	 * The NamedElements must be of a type of element that identifies a message (e.g., an
	 * Operation, Reception, or a Signal).
	message->forAll(m | m.oclIsKindOf(Operation)
	 * or m.oclIsKindOf(Reception) or m.oclIsKindOf(Signal)) 
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConsiderIgnoreFragment> validateType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConsiderIgnoreFragment>() {
			public boolean apply(ConsiderIgnoreFragment s) {
				return s.validateType(diagnostics, context);
			}
		};
	}

}
