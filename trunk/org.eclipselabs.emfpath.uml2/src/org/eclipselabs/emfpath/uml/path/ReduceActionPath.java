package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReduceAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReduceAction ReduceAction} in a functional way.
 * <p>
 * A reduce action is an action that reduces a collection to a single value by combining
 * the elements of the collection. 
 * @see org.eclipse.uml2.uml.ReduceAction
 * @generated
 */
public class ReduceActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReduceActionPath() {
		super();
	}

	/**
	 * Behavior that is applied to two elements of the input collection to produce a value
	 * that is the same type as elements of the collection. 
	 * @see org.eclipse.uml2.uml.ReduceAction#getReducer()
	 * @generated
	 */
	public static final Function<ReduceAction, Behavior> reducer = new Function<ReduceAction, Behavior>() {
		public Behavior apply(ReduceAction s) {
			return s.getReducer();
		}
	};

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.ReduceAction#getResult()
	 * @generated
	 */
	public static final Function<ReduceAction, OutputPin> result = new Function<ReduceAction, OutputPin>() {
		public OutputPin apply(ReduceAction s) {
			return s.getResult();
		}
	};

	/**
	 * The collection to be reduced. 
	 * @see org.eclipse.uml2.uml.ReduceAction#getCollection()
	 * @generated
	 */
	public static final Function<ReduceAction, InputPin> collection = new Function<ReduceAction, InputPin>() {
		public InputPin apply(ReduceAction s) {
			return s.getCollection();
		}
	};

	/**
	 * Tells whether the order of the input collection should determine the order in which
	 * the behavior is applied to its elements. 
	 * @see org.eclipse.uml2.uml.ReduceAction#isOrdered()
	 * @generated
	 */
	public static final Predicate<ReduceAction> isOrdered = new Predicate<ReduceAction>() {
		public boolean apply(ReduceAction s) {
			return s.isOrdered();
		}
	};
	
	/**
	 * The type of the input must be a collection.
	true 
	 * @see org.eclipse.uml2.uml.ReduceAction#validateInputTypeIsCollection(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReduceAction> validateInputTypeIsCollection(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReduceAction>() {
			public boolean apply(ReduceAction s) {
				return s.validateInputTypeIsCollection(diagnostics, context);
			}
		};
	}

	/**
	 * The type of the output must be compatible with the type of the output of the reducer
	 * behavior.
	true 
	 * @see org.eclipse.uml2.uml.ReduceAction#validateOutputTypesAreCompatible(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReduceAction> validateOutputTypesAreCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReduceAction>() {
			public boolean apply(ReduceAction s) {
				return s.validateOutputTypesAreCompatible(diagnostics, context);
			}
		};
	}

	/**
	 * The reducer behavior must have two input parameters and one output parameter, of types
	 * compatible with the types of elements of the input collection.
	true 
	 * @see org.eclipse.uml2.uml.ReduceAction#validateReducerInputsOutput(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReduceAction> validateReducerInputsOutput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReduceAction>() {
			public boolean apply(ReduceAction s) {
				return s.validateReducerInputsOutput(diagnostics, context);
			}
		};
	}

}
