package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.CreateLinkObjectAction;
import org.eclipse.uml2.uml.OutputPin;

/**
 * @generated
 */
public class CreateLinkObjectActionPath extends CreateLinkActionPath {

	/**
	 * @generated
	 */
	private CreateLinkObjectActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#getResult()
	 * @generated
	 */
	public static final Function<CreateLinkObjectAction, OutputPin> result = new Function<CreateLinkObjectAction, OutputPin>() {
		public OutputPin apply(CreateLinkObjectAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateAssociationClass()
	 * @generated
	 */
	public static Predicate<CreateLinkObjectAction> validateAssociationClass(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateLinkObjectAction>() {
			public boolean apply(CreateLinkObjectAction s) {
				return s.validateAssociationClass(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateTypeOfResult()
	 * @generated
	 */
	public static Predicate<CreateLinkObjectAction> validateTypeOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateLinkObjectAction>() {
			public boolean apply(CreateLinkObjectAction s) {
				return s.validateTypeOfResult(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CreateLinkObjectAction#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<CreateLinkObjectAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CreateLinkObjectAction>() {
			public boolean apply(CreateLinkObjectAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
