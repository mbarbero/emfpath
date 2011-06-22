package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionUse;

/**
 * @generated
 */
public class InteractionUsePath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 InteractionUsePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#getRefersTo()
	 * @generated
	 */
	public static final Function<InteractionUse, Interaction> refersTo = new Function<InteractionUse, Interaction>() {
		public Interaction apply(InteractionUse s) {
			return s.getRefersTo();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#getActualGates()
	 * @generated
	 */
	public static final Function<InteractionUse, EList<Gate>> actualGate = new Function<InteractionUse, EList<Gate>>() {
		public EList<Gate> apply(InteractionUse s) {
			return s.getActualGates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#getArguments()
	 * @generated
	 */
	public static final Function<InteractionUse, EList<Action>> argument = new Function<InteractionUse, EList<Action>>() {
		public EList<Action> apply(InteractionUse s) {
			return s.getArguments();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#validateGatesMatch()
	 * @generated
	 */
	public static Predicate<InteractionUse> validateGatesMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionUse>() {
			public boolean apply(InteractionUse s) {
				return s.validateGatesMatch(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#validateAllLifelines()
	 * @generated
	 */
	public static Predicate<InteractionUse> validateAllLifelines(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionUse>() {
			public boolean apply(InteractionUse s) {
				return s.validateAllLifelines(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#validateArgumentsCorrespondToParameters()
	 * @generated
	 */
	public static Predicate<InteractionUse> validateArgumentsCorrespondToParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionUse>() {
			public boolean apply(InteractionUse s) {
				return s.validateArgumentsCorrespondToParameters(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InteractionUse#validateArgumentsAreConstants()
	 * @generated
	 */
	public static Predicate<InteractionUse> validateArgumentsAreConstants(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InteractionUse>() {
			public boolean apply(InteractionUse s) {
				return s.validateArgumentsAreConstants(diagnostics, context);
			}
		};
	}

}
