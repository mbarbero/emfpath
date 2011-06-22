package org.eclipselabs.emfpath.ecore.fluent;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.IFluentIterable;

public interface FProperties extends IFluentIterable<FProperty> {

	IFluentIterable<?> values();
	
	<T> IFluentIterable<T> values(Class<T> clazz);
	
	/**
	 * @return
	 */
	IFluentIterable<String> asStrings();

	/**
	 * @return
	 */
	IFluentIterable<Integer> asIntegers();

	/**
	 * @return
	 */
	IFluentIterable<Boolean> asBooleans();

	/**
	 * @return
	 */
	IFluentIterable<Long> asLongs();

	/**
	 * @return
	 */
	IFluentIterable<Double> asDoubles();

	/**
	 * @return
	 */
	IFluentIterable<Float> asFloats();

	/**
	 * @return
	 */
	IFluentIterable<Short> asShorts();

	/**
	 * @return
	 */
	IFluentIterable<Character> asCharacters();

	/**
	 * @return
	 */
	FIterable<FObject<EObject>> asFObjects();
	
	<E extends EObject> FIterable<FObject<E>> asFObjects(Class<E> type);
	
	/**
	 * @return
	 */
	IFluentIterable<Iterable<?>> asIterables();
	
	<T> IFluentIterable<Iterable<T>> asIterables(Class<T> elementType);
	
	IFluentIterable<?> asIterable();
	
	<T> IFluentIterable<T> asIterable(Class<T> elementType);

	IFluentIterable<FIterable<EObject>> asFIterables();
	
	<T extends EObject> IFluentIterable<FIterable<T>> asFIterables(Class<T> elementType);
	
	FIterable<EObject> asFIterable();
	
	<T extends EObject> FIterable<T> asFIterable(Class<T> elementType);
	
	/**
	 * @return
	 */
	boolean isUndefined();

	/**
	 * @return
	 */
	boolean isInvalid();

	/**
	 * @return
	 */
	Iterable<? extends EObject> eObjects();
	
	Set<EStructuralFeature> eStructuralFeatures();
}
