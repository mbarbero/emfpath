package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Continuation;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Continuation Continuation} in a functional way.
 * <p>
 * A continuation is a syntactic way to define continuations of different branches of
 * an alternative combined fragment. Continuations is intuitively similar to labels representing
 * intermediate points in a flow of control. 
 * @see org.eclipse.uml2.uml.Continuation
 * @generated
 */
public class ContinuationPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	private ContinuationPath() {
		super();
	}

	/**
	 * True: when the Continuation is at the end of the enclosing InteractionFragment and
	 * False when it is in the beginning. 
	 * @see org.eclipse.uml2.uml.Continuation#isSetting()
	 * @generated
	 */
	public static final Predicate<Continuation> isSetting = new Predicate<Continuation>() {
		public boolean apply(Continuation s) {
			return s.isSetting();
		}
	};
	
	/**
	 * Continuations with the same name may only cover the same set of Lifelines (within
	 * one Classifier).
	true 
	 * @see org.eclipse.uml2.uml.Continuation#validateSameName(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Continuation> validateSameName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Continuation>() {
			public boolean apply(Continuation s) {
				return s.validateSameName(diagnostics, context);
			}
		};
	}

	/**
	 * Continuations are always global in the enclosing InteractionFragment e.g. it always
	 * covers all Lifelines covered by the enclosing InteractionFragment.
	true 
	 * @see org.eclipse.uml2.uml.Continuation#validateGlobal(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Continuation> validateGlobal(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Continuation>() {
			public boolean apply(Continuation s) {
				return s.validateGlobal(diagnostics, context);
			}
		};
	}

	/**
	 * Continuations always occur as the very first InteractionFragment or the very last
	 * InteractionFragment of the enclosing InteractionFragment.
	true 
	 * @see org.eclipse.uml2.uml.Continuation#validateFirstOrLastInteractionFragment(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Continuation> validateFirstOrLastInteractionFragment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Continuation>() {
			public boolean apply(Continuation s) {
				return s.validateFirstOrLastInteractionFragment(diagnostics, context);
			}
		};
	}

}
