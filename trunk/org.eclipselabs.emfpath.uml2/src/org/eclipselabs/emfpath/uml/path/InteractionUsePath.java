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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InteractionUse InteractionUse} in a functional way.
 * <p>
 * An interaction use refers to an interaction. The interaction use is a shorthand for
 * copying the contents of the referenced interaction where the interaction use is. To
 * be accurate the copying must take into account substituting parameters with arguments
 * and connect the formal gates with the actual ones. 
 * @see org.eclipse.uml2.uml.InteractionUse
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
	 * Refers to the Interaction that defines its meaning 
	 * @see org.eclipse.uml2.uml.InteractionUse#getRefersTo()
	 * @generated
	 */
	public static final Function<InteractionUse, Interaction> refersTo = new Function<InteractionUse, Interaction>() {
		public Interaction apply(InteractionUse s) {
			return s.getRefersTo();
		}
	};

	/**
	 * The actual gates of the InteractionUse 
	 * @see org.eclipse.uml2.uml.InteractionUse#getActualGates()
	 * @generated
	 */
	public static final Function<InteractionUse, EList<Gate>> actualGate = new Function<InteractionUse, EList<Gate>>() {
		public EList<Gate> apply(InteractionUse s) {
			return s.getActualGates();
		}
	};

	/**
	 * The actual arguments of the Interaction 
	 * @see org.eclipse.uml2.uml.InteractionUse#getArguments()
	 * @generated
	 */
	public static final Function<InteractionUse, EList<Action>> argument = new Function<InteractionUse, EList<Action>>() {
		public EList<Action> apply(InteractionUse s) {
			return s.getArguments();
		}
	};
	
	/**
	 * Actual Gates of the InteractionUse must match Formal Gates of the referred Interaction.
	 * Gates match when their names are equal.
	true 
	 * @see org.eclipse.uml2.uml.InteractionUse#validateGatesMatch(DiagnosticChain, Map)
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
	 * The InteractionUse must cover all Lifelines of the enclosing Interaction which appear
	 * within the referred Interaction.
	true 
	 * @see org.eclipse.uml2.uml.InteractionUse#validateAllLifelines(DiagnosticChain, Map)
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
	 * The arguments of the InteractionUse must correspond to parameters of the referred
	 * Interaction
	true 
	 * @see org.eclipse.uml2.uml.InteractionUse#validateArgumentsCorrespondToParameters(DiagnosticChain, Map)
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
	 * The arguments must only be constants, parameters of the enclosing Interaction or attributes
	 * of the classifier owning the enclosing Interaction.
	true 
	 * @see org.eclipse.uml2.uml.InteractionUse#validateArgumentsAreConstants(DiagnosticChain, Map)
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
