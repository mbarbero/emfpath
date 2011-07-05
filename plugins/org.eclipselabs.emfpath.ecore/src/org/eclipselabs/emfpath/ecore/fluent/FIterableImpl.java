package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.collect.FluentCollections;
import org.eclipselabs.emfpath.collect.FluentIterable;
import org.eclipselabs.emfpath.collect.FluentIterableImpl;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

final class FIterableImpl<E extends EObject> extends FluentIterableImpl<E> implements FIterable<E> {

	FIterableImpl(Iterable<E> delegator) {
		super(delegator);
	}

	static <E extends EObject> Function<Iterable<E>, FIterable<E>> wrapFunction2() {
		return new Function<Iterable<E>, FIterable<E>>() {
			public FIterable<E> apply(Iterable<E> input) {
				return FIterableImpl.create(input);
			}
		};
	}

	static <E extends EObject> FIterableImpl<E> create(Iterable<E> delegator) {
		return new FIterableImpl<E>(delegator);
	}

	public FProperties fGet(EStructuralFeature feature) {
		return AbstractMProperties.create(this.delegate(), feature);
	}

	public FProperties fGet(String featureName) {
		return AbstractMProperties.create(this.delegate(), featureName);
	}

	public <X extends Iterable<Z>, Z> FluentIterable<FluentIterable<Z>> fGetIterables(
			Function<? super E, ? extends Iterable<Z>> function) {
		Iterable<Iterable<Z>> functionApplied = Iterables.transform(this.delegate(), function);
		Iterable<FluentIterable<Z>> wrapped1 = Iterables.transform(functionApplied, FluentIterableImpl.<Z> wrapFunction());
		FluentIterable<FluentIterable<Z>> wrapped2 = FluentCollections.newFluentIterable(wrapped1);
		return wrapped2;
	}

	public <X extends Iterable<Z>, Z> FluentIterable<Z> fGetIterable(
			Function<? super E, ? extends Iterable<Z>> function) {
		Iterable<Iterable<Z>> functionApplied = Iterables.transform(this.delegate(), function);
		Iterable<Z> concat = Iterables.concat(functionApplied);
		FluentIterable<Z> wrapped = FluentCollections.newFluentIterable(concat);
		return wrapped;
	}

	public <X extends Iterable<Z>, Z extends EObject> FluentIterable<FIterable<Z>> fGetFIterables(Function<? super E, ? extends Iterable<Z>> function) {
		Iterable<Iterable<Z>> functionApplied = Iterables.transform(this.delegate(), function);
		Iterable<FIterable<Z>> wrapped1 = Iterables.transform(functionApplied, FIterableImpl.<Z> wrapFunction2());
		FluentIterable<FIterable<Z>> wrapped2 = FluentCollections.newFluentIterable(wrapped1);
		return wrapped2;
	}

	public <X extends Iterable<Z>, Z extends EObject> FIterable<Z> fGetFIterable(Function<? super E, ? extends Iterable<Z>> function) {
		Iterable<Iterable<Z>> functionApplied = Iterables.transform(this.delegate(), function);
		Iterable<Z> concat = Iterables.concat(functionApplied);
		FIterable<Z> wrapped = FIterableImpl.create(concat);
		return wrapped;
	}
	
	@Override
	public FIterable<E> filter(Predicate<? super E> predicate) {
		return create(Iterables.filter(delegate(), predicate));
	}

	public <X extends EObject> FIterable<X> eFilter(Class<X> type) {
		return create(Iterables.filter(delegate(), type));
	}
}
