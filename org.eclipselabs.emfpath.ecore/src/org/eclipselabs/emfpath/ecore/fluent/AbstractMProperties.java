package org.eclipselabs.emfpath.ecore.fluent;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.ecore.path.EClasses;
import org.eclipselabs.emfpath.ecore.path.EObjects;
import org.eclipselabs.emfpath.indie.collect.FluentCollections;
import org.eclipselabs.emfpath.indie.collect.FluentIterable;
import org.eclipselabs.emfpath.indie.collect.IFluentIterable;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

abstract class AbstractMProperties extends FluentIterable<FProperty> implements FProperties {

	public static FProperties create(Iterable<? extends EObject> iterable, EStructuralFeature eStructuralFeature) {
		return new EPropertyIterableWithEStructuralFeature(iterable, eStructuralFeature);
	}

	public static FProperties create(Iterable<? extends EObject> iterable, String featureName) {
		return new EPropertyIterableWithFeatureName(iterable, featureName);
	}

	private static class EPropertyIterableWithFeatureName extends AbstractMProperties {
		
		private final String fFeatureName;
		private ImmutableSet<EStructuralFeature> fEStructuralFeatures;
		
		EPropertyIterableWithFeatureName(Iterable<? extends EObject> eObjects, String featureName) {
			super(eObjects, Iterables.transform(eObjects, FPropertyImpl.wrapFunction(featureName)));
			fFeatureName = featureName;
		}
	
		protected Iterable<?> simpleValues() {
			return Iterables.transform(eObjects(), EObjects.eGet(fFeatureName));
		}
		
		protected <T> Iterable<T> simpleValues(Class<T> elementType) {
			for (EStructuralFeature eStructuralFeature : eStructuralFeatures()) {
				Preconditions.checkArgument(eStructuralFeature.getEType().getInstanceClass().isAssignableFrom(elementType), "EStructuralFeature " + eStructuralFeature.getEContainingClass().getName() + "."
						+ eStructuralFeature.getName() + " is not of List<" + elementType.getSimpleName() + "> type. Type was [List<"
						+ eStructuralFeature.getEType().getInstanceClass().getSimpleName() + ">] and values was [" + Joiner.on(", ").join(Iterables.limit(simpleValues(), 3)) + "...]");
			}
			return Iterables.filter(simpleValues(), elementType);
		}
		
		public IFluentIterable<?> values() {
			return FluentCollections.newFluentIterable(simpleValues());
		}
	
		public <T> IFluentIterable<T> values(Class<T> clazz) {
			return FluentCollections.newFluentIterable(simpleValues(clazz));
		}
		
		protected <T> Iterable<Iterable<T>> asSimpleIterable(Class<T> elementType) {
			for (EStructuralFeature eStructuralFeature : eStructuralFeatures()) {
			
				Preconditions.checkState(eStructuralFeature.isMany(), "EStructuralFeature " + eStructuralFeature + " is not multivalued");
				Preconditions.checkArgument(eStructuralFeature.getEType().getInstanceClass().isAssignableFrom(elementType), "EStructuralFeature " + eStructuralFeature.getEContainingClass().getName() + "."
						+ eStructuralFeature.getName() + " is not of List<" + elementType.getSimpleName() + "> type. Type was [List<"
						+ eStructuralFeature.getEType().getInstanceClass().getSimpleName() + ">] and value was [" + Joiner.on(", ").join(Iterables.limit(simpleValues(), 3)) + "...]");
			}
	
			@SuppressWarnings("rawtypes")
			IFluentIterable<Iterable> newFluentIterable = FluentCollections.newFluentIterable(Iterables.filter(simpleValues(), Iterable.class));
			return Iterables.transform(newFluentIterable, toCheckedIterableOfIterable(elementType));
		}
		
		public Set<EStructuralFeature> eStructuralFeatures() {
			if (fEStructuralFeatures == null) {
				Iterable<EClass> eClasses = Iterables.transform(eObjects(), EObjects.eClass);
				Iterable<EStructuralFeature> eStructuralFeatures = Iterables.transform(eClasses, EClasses.getEStructuralFeature(fFeatureName));
				fEStructuralFeatures = ImmutableSet.copyOf(eStructuralFeatures);
			}
			return fEStructuralFeatures;
		}
	}

	private static class EPropertyIterableWithEStructuralFeature extends AbstractMProperties {
	
		private final EStructuralFeature fEStructuralFeature;
		
		EPropertyIterableWithEStructuralFeature(Iterable<? extends EObject> eObjects, EStructuralFeature eStructuralFeature) {
			super(eObjects, Iterables.transform(eObjects, FPropertyImpl.wrapFunction(eStructuralFeature)));
			fEStructuralFeature = eStructuralFeature;
		}
		
		protected Iterable<?> simpleValues() {
			return Iterables.transform(eObjects(), EObjects.eGet(fEStructuralFeature));
		}
		
		protected <T> Iterable<T> simpleValues(Class<T> elementType) {
			Preconditions.checkArgument(fEStructuralFeature.getEType().getInstanceClass().isAssignableFrom(elementType), "EStructuralFeature " + this.fEStructuralFeature.getEContainingClass().getName() + "."
					+ this.fEStructuralFeature.getName() + " is not of List<" + elementType.getSimpleName() + "> type. Type was [List<"
					+ this.fEStructuralFeature.getEType().getInstanceClass().getSimpleName() + ">] and values was [" + Joiner.on(", ").join(Iterables.limit(simpleValues(), 3)) + "...]");
			return Iterables.filter(simpleValues(), elementType);
		}
		
		public IFluentIterable<?> values() {
			return FluentCollections.newFluentIterable(simpleValues());
		}
	
		public <T> IFluentIterable<T> values(Class<T> clazz) {
			return FluentCollections.newFluentIterable(simpleValues(clazz));
		}
		
		protected <T> Iterable<Iterable<T>> asSimpleIterable(Class<T> elementType) {
			Preconditions.checkState(fEStructuralFeature.isMany(), "EStructuralFeature " + fEStructuralFeature + " is not multivalued");
			Preconditions.checkArgument(fEStructuralFeature.getEType().getInstanceClass().isAssignableFrom(elementType), "EStructuralFeature " + this.fEStructuralFeature.getEContainingClass().getName() + "."
					+ this.fEStructuralFeature.getName() + " is not of List<" + elementType.getSimpleName() + "> type. Type was [List<"
					+ this.fEStructuralFeature.getEType().getInstanceClass().getSimpleName() + ">] and value was [" + Joiner.on(", ").join(Iterables.limit(simpleValues(), 3)) + "...]");
			@SuppressWarnings("rawtypes")
			IFluentIterable<Iterable> newFluentIterable = FluentCollections.newFluentIterable(Iterables.filter(simpleValues(), Iterable.class));
			return Iterables.transform(newFluentIterable, toCheckedIterableOfIterable(elementType));
		}
		
		public Set<EStructuralFeature> eStructuralFeatures() {
			return ImmutableSet.of(fEStructuralFeature);
		}
	}

	private final Iterable<? extends EObject> fEObjects;
	
	AbstractMProperties(Iterable<? extends EObject> eObjects, Iterable<FProperty> fProperties) {
		super(fProperties);
		fEObjects = eObjects;
	}

	protected abstract Iterable<?> simpleValues();
	protected abstract <T> Iterable<T> simpleValues(Class<T> elementType);

	public IFluentIterable<String> asStrings() {
		return values(String.class);
	}

	public IFluentIterable<Integer> asIntegers() {
		return values(Integer.class);
	}

	public IFluentIterable<Boolean> asBooleans() {
		return values(Boolean.class);
	}

	public IFluentIterable<Long> asLongs() {
		return values(Long.class);
	}

	public IFluentIterable<Double> asDoubles() {
		return values(Double.class);
	}

	public IFluentIterable<Float> asFloats() {
		return values(Float.class);
	}

	public IFluentIterable<Short> asShorts() {
		return values(Short.class);
	}

	public IFluentIterable<Character> asCharacters() {
		return values(Character.class);
	}

	public FIterable<FObject<EObject>> asFObjects() {
		return asFObjects(EObject.class);
	}
	
	public <E extends EObject> FIterable<FObject<E>> asFObjects(Class<E> type) {
		Iterable<E> asSimpleEObject = simpleValues(type);
		Iterable<FObject<E>> transform = Iterables.transform(asSimpleEObject, FObjectImpl.<E>wrapFunction());
		return FIterableImpl.create(transform);
	}

	private static Predicate<? super Object> instanceOfPredicate(final Class<?> clazz) {
		return new Predicate<Object>() {
			public boolean apply(Object input) {
				return clazz.isInstance(input);
			}
		};
	}
	
	@SuppressWarnings("unchecked") // this is safe thanks to the filter predicate
	private Iterable<Iterable<?>> asSimpleIterable() {
		return (Iterable<Iterable<?>>) Iterables.filter(values(), instanceOfPredicate(Iterable.class));
	}

	@SuppressWarnings("rawtypes")
	static <T> Function<Iterable, Iterable<T>> toCheckedIterableOfIterable(final Class<T> clazz) {
		return new Function<Iterable, Iterable<T>>() {
			public Iterable<T> apply(Iterable input) {
				return Iterables.filter(input, clazz);
			}
		};
	}
	
	protected abstract <T> Iterable<Iterable<T>> asSimpleIterable(Class<T> elementType);

	public IFluentIterable<Iterable<?>> asIterables() {
		return FluentCollections.newFluentIterable(asSimpleIterable());
	}

	public <T> IFluentIterable<Iterable<T>> asIterables(Class<T> elementType) {
		return FluentCollections.newFluentIterable(asSimpleIterable(elementType));
	}
	
	public IFluentIterable<FIterable<EObject>> asFIterables() {
		return asFIterables(EObject.class);
	}

	public <T extends EObject> IFluentIterable<FIterable<T>> asFIterables(Class<T> elementType) {
		return FluentCollections.newFluentIterable(Iterables.transform(asSimpleIterable(elementType), FIterableImpl.<T>wrapFunction2()));
	}

	public boolean isUndefined() {
		return false;
	}

	public boolean isInvalid() {
		return false;
	}

	public Iterable<? extends EObject> eObjects() {
		return fEObjects;
	}

	public IFluentIterable<?> asIterable() {
		return FluentCollections.newFluentIterable(Iterables.concat(asSimpleIterable()));
	}

	public <T> IFluentIterable<T> asIterable(Class<T> elementType) {
		return FluentCollections.newFluentIterable(Iterables.concat(asSimpleIterable(elementType)));
	}

	public FIterable<EObject> asFIterable() {
		return asFIterable(EObject.class);
	}

	public <T extends EObject> FIterable<T> asFIterable(Class<T> elementType) {
		return FIterableImpl.create(Iterables.concat(Iterables.transform(asSimpleIterable(elementType), FIterableImpl.<T>wrapFunction2())));
	}
}