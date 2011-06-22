package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.IFluentIterable;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public interface FIterable<E extends EObject> extends IFluentIterable<E> {

	FProperties fGet(EStructuralFeature feature);
	
	FProperties fGet(String name);

	<F extends Iterable<T>, T> IFluentIterable<IFluentIterable<T>> fGetIterables(Function<? super E, ? extends Iterable<T>> function);
	
	<F extends Iterable<T>, T> IFluentIterable<T> fGetIterable(Function<? super E, ? extends Iterable<T>> function);
	
	<F extends Iterable<T>, T extends EObject> IFluentIterable<FIterable<T>> fGetFIterables(Function<? super E, ? extends Iterable<T>> function);
	
	<F extends Iterable<T>, T extends EObject> FIterable<T> fGetFIterable(Function<? super E, ? extends Iterable<T>> function);
	
	FIterable<E> filter(Predicate<? super E> predicate);
	
	<T extends EObject> FIterable<T> eFilter(Class<T> type);
}