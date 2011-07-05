package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;

public final class FObjects {

	private FObjects() {
		// prevents instantiation
	}
	
	/**
	 * @param from
	 * @return
	 */
	// safe by construction (an FObject can only be cast to EObject to be passed as argument, 
	// therefore it will return FEObject<EObject> which is always true
	@SuppressWarnings("unchecked") 
	public static <E extends EObject> FObject<E> create(E from) {
		FObject<E> ret = null;
		if (from instanceof FObjectImpl<?>) {
			ret = (FObject<E>) from;
		} else {
			ret = new FObjectImpl<E>(from);
		}
		return ret;
	}
	
	public static <E extends EObject> FObject<E> create(FObject<E> from) {
		return from;
	}
}
