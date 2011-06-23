package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StartClassifierBehaviorAction StartClassifierBehaviorAction} in a functional way.
 * <p>
 * A start classifier behavior action is an action that starts the classifier behavior
 * of the input. 
 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction
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
	 * Holds the object on which to start the owned behavior. 
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#getObject()
	 * @generated
	 */
	public static final Function<StartClassifierBehaviorAction, InputPin> object = new Function<StartClassifierBehaviorAction, InputPin>() {
		public InputPin apply(StartClassifierBehaviorAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * The multiplicity of the input pin is 1..1
	true 
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#validateMultiplicity(DiagnosticChain, Map)
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
	 * If the input pin has a type, then the type must have a classifier behavior.
	true
	 * @see org.eclipse.uml2.uml.StartClassifierBehaviorAction#validateTypeHasClassifier(DiagnosticChain, Map)
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
