package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.InputPin;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DestroyObjectAction DestroyObjectAction} in a functional way.
 * <p>
 * A destroy object action is an action that destroys objects. 
 * @see org.eclipse.uml2.uml.DestroyObjectAction
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
	 * Specifies whether links in which the object participates are destroyed along with
	 * the object. 
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#isDestroyLinks()
	 * @generated
	 */
	public static final Predicate<DestroyObjectAction> isDestroyLinks = new Predicate<DestroyObjectAction>() {
		public boolean apply(DestroyObjectAction s) {
			return s.isDestroyLinks();
		}
	};

	/**
	 * Specifies whether objects owned by the object are destroyed along with the object.
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#isDestroyOwnedObjects()
	 * @generated
	 */
	public static final Predicate<DestroyObjectAction> isDestroyOwnedObjects = new Predicate<DestroyObjectAction>() {
		public boolean apply(DestroyObjectAction s) {
			return s.isDestroyOwnedObjects();
		}
	};

	/**
	 * The input pin providing the object to be destroyed. 
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#getTarget()
	 * @generated
	 */
	public static final Function<DestroyObjectAction, InputPin> target = new Function<DestroyObjectAction, InputPin>() {
		public InputPin apply(DestroyObjectAction s) {
			return s.getTarget();
		}
	};
	
	/**
	 * The multiplicity of the input pin is 1..1.
	self.target.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#validateMultiplicity(DiagnosticChain, Map)
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
	 * The input pin has no type.
	self.target.type->size() = 0 
	 * @see org.eclipse.uml2.uml.DestroyObjectAction#validateNoType(DiagnosticChain, Map)
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
