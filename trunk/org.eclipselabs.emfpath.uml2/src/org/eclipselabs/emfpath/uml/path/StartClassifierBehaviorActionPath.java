package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;

/**
 * @generated
 */
public class StartClassifierBehaviorActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private StartClassifierBehaviorActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#getObject()
	 * @generated
	 */
	public static final Function<StartClassifierBehaviorAction, InputPin> object = new Function<StartClassifierBehaviorAction, InputPin>() {
		public InputPin apply(StartClassifierBehaviorAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<StartClassifierBehaviorAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartClassifierBehaviorAction>() {
			public boolean apply(StartClassifierBehaviorAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#validateTypeHasClassifier()
	 * @generated
	 */
	public static Predicate<StartClassifierBehaviorAction> validateTypeHasClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StartClassifierBehaviorAction>() {
			public boolean apply(StartClassifierBehaviorAction s) {
				return s.validateTypeHasClassifier(diagnostics, context);
			}
		};
	}

}
