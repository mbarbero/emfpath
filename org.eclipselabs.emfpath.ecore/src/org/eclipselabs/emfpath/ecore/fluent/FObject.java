package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.FluentIterable;

import com.google.common.base.Function;

public interface FObject<E extends EObject> extends EObject {

	/**
	 * @param feature
	 * @return
	 */
	FProperty fGet(EStructuralFeature feature);

	/**
	 * @param featureName
	 * @return
	 */
	FProperty fGet(String featureName);

	<T> T fGet(Function<? super E, T> function);

	<T extends EObject> FObject<T> fGetFObject(Function<? super E, T> function);

	<F, T extends Iterable<F>> FluentIterable<F> fGetIterable(Function<? super E, T> function);

	<F extends EObject, T extends Iterable<F>> FIterable<F> fGetFIterable(Function<? super E, T> function);
}