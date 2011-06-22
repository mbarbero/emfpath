package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * @generated
 */
public class ClearAssociationActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ClearAssociationActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#getObject()
	 * @generated
	 */
	public static final Function<ClearAssociationAction, InputPin> object = new Function<ClearAssociationAction, InputPin>() {
		public InputPin apply(ClearAssociationAction s) {
			return s.getObject();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#getAssociation()
	 * @generated
	 */
	public static final Function<ClearAssociationAction, Association> association = new Function<ClearAssociationAction, Association>() {
		public Association apply(ClearAssociationAction s) {
			return s.getAssociation();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#validateSameType()
	 * @generated
	 */
	public static Predicate<ClearAssociationAction> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ClearAssociationAction>() {
			public boolean apply(ClearAssociationAction s) {
				return s.validateSameType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<ClearAssociationAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ClearAssociationAction>() {
			public boolean apply(ClearAssociationAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
