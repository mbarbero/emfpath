package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ClearAssociationAction ClearAssociationAction} in a functional way.
 * <p>
 * A clear association action is an action that destroys all links of an association
 * in which a particular object participates. 
 * @see org.eclipse.uml2.uml.ClearAssociationAction
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
	 * Gives the input pin from which is obtained the object whose participation in the association
	 * is to be cleared. 
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#getObject()
	 * @generated
	 */
	public static final Function<ClearAssociationAction, InputPin> object = new Function<ClearAssociationAction, InputPin>() {
		public InputPin apply(ClearAssociationAction s) {
			return s.getObject();
		}
	};

	/**
	 * Association to be cleared. 
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#getAssociation()
	 * @generated
	 */
	public static final Function<ClearAssociationAction, Association> association = new Function<ClearAssociationAction, Association>() {
		public Association apply(ClearAssociationAction s) {
			return s.getAssociation();
		}
	};
	
	/**
	 * The type of the input pin must be the same as the type of at least one of the association
	 * ends of the association.
	self.association->exists(end.type = self.object.type) 
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#validateSameType(DiagnosticChain, Map)
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
	 * The multiplicity of the input pin is 1..1.
	self.object.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.ClearAssociationAction#validateMultiplicity(DiagnosticChain, Map)
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
