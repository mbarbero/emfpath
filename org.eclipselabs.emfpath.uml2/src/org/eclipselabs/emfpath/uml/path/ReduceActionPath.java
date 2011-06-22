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
	 * @see org.eclipse.uml2.uml.ReduceAction#getReducer()
	 * @generated
	 */
	public static final Function<ReduceAction, Behavior> reducer = new Function<ReduceAction, Behavior>() {
		public Behavior apply(ReduceAction s) {
			return s.getReducer();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReduceAction#getResult()
	 * @generated
	 */
	public static final Function<ReduceAction, OutputPin> result = new Function<ReduceAction, OutputPin>() {
		public OutputPin apply(ReduceAction s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReduceAction#getCollection()
	 * @generated
	 */
	public static final Function<ReduceAction, InputPin> collection = new Function<ReduceAction, InputPin>() {
		public InputPin apply(ReduceAction s) {
			return s.getCollection();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReduceAction#isOrdered()
	 * @generated
	 */
	public static final Predicate<ReduceAction> isOrdered = new Predicate<ReduceAction>() {
		public boolean apply(ReduceAction s) {
			return s.isOrdered();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReduceAction#validateInputTypeIsCollection()
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
	 * @see org.eclipse.uml2.uml.ReduceAction#validateOutputTypesAreCompatible()
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
	 * @see org.eclipse.uml2.uml.ReduceAction#validateReducerInputsOutput()
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
