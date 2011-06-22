package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * @generated
 */
public class DestroyObjectActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private DestroyObjectActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#isDestroyLinks()
	 * @generated
	 */
	public static final Predicate<DestroyObjectAction> isDestroyLinks = new Predicate<DestroyObjectAction>() {
		public boolean apply(DestroyObjectAction s) {
			return s.isDestroyLinks();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#isDestroyOwnedObjects()
	 * @generated
	 */
	public static final Predicate<DestroyObjectAction> isDestroyOwnedObjects = new Predicate<DestroyObjectAction>() {
		public boolean apply(DestroyObjectAction s) {
			return s.isDestroyOwnedObjects();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#getTarget()
	 * @generated
	 */
	public static final Function<DestroyObjectAction, InputPin> target = new Function<DestroyObjectAction, InputPin>() {
		public InputPin apply(DestroyObjectAction s) {
			return s.getTarget();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<DestroyObjectAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DestroyObjectAction>() {
			public boolean apply(DestroyObjectAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#validateNoType()
	 * @generated
	 */
	public static Predicate<DestroyObjectAction> validateNoType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DestroyObjectAction>() {
			public boolean apply(DestroyObjectAction s) {
				return s.validateNoType(diagnostics, context);
			}
		};
	}

}
