package org.eclipselabs.emfpath.ecore.fluent;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.FluentIterable;

public interface FProperties extends FluentIterable<FProperty> {

	FluentIterable<?> values();
	
	<T> FluentIterable<T> values(Class<T> clazz);
	
	/**
	 * @return
	 */
	FluentIterable<String> asStrings();

	/**
	 * @return
	 */
	FluentIterable<Integer> asIntegers();

	/**
	 * @return
	 */
	FluentIterable<Boolean> asBooleans();

	/**
	 * @return
	 */
	FluentIterable<Long> asLongs();

	/**
	 * @return
	 */
	FluentIterable<Double> asDoubles();

	/**
	 * @return
	 */
	FluentIterable<Float> asFloats();

	/**
	 * @return
	 */
	FluentIterable<Short> asShorts();

	/**
	 * @return
	 */
	FluentIterable<Character> asCharacters();

	/**
	 * @return
	 */
	FIterable<FObject<EObject>> asFObjects();
	
	<E extends EObject> FIterable<FObject<E>> asFObjects(Class<E> type);
	
	/**
	 * @return
	 */
	FluentIterable<Iterable<?>> asIterables();
	
	<T> FluentIterable<Iterable<T>> asIterables(Class<T> elementType);
	
	FluentIterable<?> asIterable();
	
	<T> FluentIterable<T> asIterable(Class<T> elementType);

	FluentIterable<FIterable<EObject>> asFIterables();
	
	<T extends EObject> FluentIterable<FIterable<T>> asFIterables(Class<T> elementType);
	
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
