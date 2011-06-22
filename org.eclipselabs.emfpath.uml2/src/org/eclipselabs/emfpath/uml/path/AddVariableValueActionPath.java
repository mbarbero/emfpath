package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * @generated
 */
public class AddVariableValueActionPath extends WriteVariableActionPath {

	/**
	 * @generated
	 */
	private AddVariableValueActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<AddVariableValueAction> isReplaceAll = new Predicate<AddVariableValueAction>() {
		public boolean apply(AddVariableValueAction s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#getInsertAt()
	 * @generated
	 */
	public static final Function<AddVariableValueAction, InputPin> insertAt = new Function<AddVariableValueAction, InputPin>() {
		public InputPin apply(AddVariableValueAction s) {
			return s.getInsertAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.AddVariableValueAction#validateSingleInputPin()
	 * @generated
	 */
	public static Predicate<AddVariableValueAction> validateSingleInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<AddVariableValueAction>() {
			public boolean apply(AddVariableValueAction s) {
				return s.validateSingleInputPin(diagnostics, context);
			}
		};
	}

}
