package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Continuation;

/**
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
	 * @see org.eclipse.uml2.uml.Continuation#isSetting()
	 * @generated
	 */
	public static final Predicate<Continuation> isSetting = new Predicate<Continuation>() {
		public boolean apply(Continuation s) {
			return s.isSetting();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Continuation#validateSameName()
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
	 * @see org.eclipse.uml2.uml.Continuation#validateGlobal()
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
	 * @see org.eclipse.uml2.uml.Continuation#validateFirstOrLastInteractionFragment()
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
