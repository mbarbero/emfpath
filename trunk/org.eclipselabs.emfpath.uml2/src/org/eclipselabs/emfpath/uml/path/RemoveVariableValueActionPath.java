package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.RemoveVariableValueAction;

/**
 * @generated
 */
public class RemoveVariableValueActionPath extends WriteVariableActionPath {

	/**
	 * @generated
	 */
	private RemoveVariableValueActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#isRemoveDuplicates()
	 * @generated
	 */
	public static final Predicate<RemoveVariableValueAction> isRemoveDuplicates = new Predicate<RemoveVariableValueAction>() {
		public boolean apply(RemoveVariableValueAction s) {
			return s.isRemoveDuplicates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#getRemoveAt()
	 * @generated
	 */
	public static final Function<RemoveVariableValueAction, InputPin> removeAt = new Function<RemoveVariableValueAction, InputPin>() {
		public InputPin apply(RemoveVariableValueAction s) {
			return s.getRemoveAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RemoveVariableValueAction#validateUnlimitedNatural()
	 * @generated
	 */
	public static Predicate<RemoveVariableValueAction> validateUnlimitedNatural(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<RemoveVariableValueAction>() {
			public boolean apply(RemoveVariableValueAction s) {
				return s.validateUnlimitedNatural(diagnostics, context);
			}
		};
	}

}
