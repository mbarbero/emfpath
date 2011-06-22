package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;

/**
 * @generated
 */
public class StartObjectBehaviorActionPath extends CallActionPath {

	/**
	 * @generated
	 */
	private StartObjectBehaviorActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#getObject()
	 * @generated
	 */
	public static final Function<StartObjectBehaviorAction, InputPin> object = new Function<StartObjectBehaviorAction, InputPin>() {
		public InputPin apply(StartObjectBehaviorAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOfObject()
	 * @generated
	 */
	public static Predicate<StartObjectBehaviorAction> validateTypeOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartObjectBehaviorAction>() {
			public boolean apply(StartObjectBehaviorAction s) {
				return s.validateTypeOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateMultiplicityOfObject()
	 * @generated
	 */
	public static Predicate<StartObjectBehaviorAction> validateMultiplicityOfObject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartObjectBehaviorAction>() {
			public boolean apply(StartObjectBehaviorAction s) {
				return s.validateMultiplicityOfObject(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderArguments()
	 * @generated
	 */
	public static Predicate<StartObjectBehaviorAction> validateNumberOrderArguments(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartObjectBehaviorAction>() {
			public boolean apply(StartObjectBehaviorAction s) {
				return s.validateNumberOrderArguments(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateNumberOrderResults()
	 * @generated
	 */
	public static Predicate<StartObjectBehaviorAction> validateNumberOrderResults(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartObjectBehaviorAction>() {
			public boolean apply(StartObjectBehaviorAction s) {
				return s.validateNumberOrderResults(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StartObjectBehaviorAction#validateTypeOrderingMultiplicityMatch()
	 * @generated
	 */
	public static Predicate<StartObjectBehaviorAction> validateTypeOrderingMultiplicityMatch(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartObjectBehaviorAction>() {
			public boolean apply(StartObjectBehaviorAction s) {
				return s.validateTypeOrderingMultiplicityMatch(diagnostics, context);
			}
		};
	}

}
