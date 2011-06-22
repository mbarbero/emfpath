package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionOperatorKind;

/**
 * @generated
 */
public class CombinedFragmentPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 CombinedFragmentPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#getInteractionOperator()
	 * @generated
	 */
	public static final Function<CombinedFragment, InteractionOperatorKind> interactionOperator = new Function<CombinedFragment, InteractionOperatorKind>() {
		public InteractionOperatorKind apply(CombinedFragment s) {
			return s.getInteractionOperator();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#getOperands()
	 * @generated
	 */
	public static final Function<CombinedFragment, EList<InteractionOperand>> operand = new Function<CombinedFragment, EList<InteractionOperand>>() {
		public EList<InteractionOperand> apply(CombinedFragment s) {
			return s.getOperands();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#getCfragmentGates()
	 * @generated
	 */
	public static final Function<CombinedFragment, EList<Gate>> cfragmentGate = new Function<CombinedFragment, EList<Gate>>() {
		public EList<Gate> apply(CombinedFragment s) {
			return s.getCfragmentGates();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateOptLoopBreakNeg()
	 * @generated
	 */
	public static Predicate<CombinedFragment> validateOptLoopBreakNeg(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CombinedFragment>() {
			public boolean apply(CombinedFragment s) {
				return s.validateOptLoopBreakNeg(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateMinintAndMaxint()
	 * @generated
	 */
	public static Predicate<CombinedFragment> validateMinintAndMaxint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CombinedFragment>() {
			public boolean apply(CombinedFragment s) {
				return s.validateMinintAndMaxint(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateBreak()
	 * @generated
	 */
	public static Predicate<CombinedFragment> validateBreak(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CombinedFragment>() {
			public boolean apply(CombinedFragment s) {
				return s.validateBreak(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CombinedFragment#validateConsiderAndIgnore()
	 * @generated
	 */
	public static Predicate<CombinedFragment> validateConsiderAndIgnore(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CombinedFragment>() {
			public boolean apply(CombinedFragment s) {
				return s.validateConsiderAndIgnore(diagnostics, context);
			}
		};
	}

}
