package org.eclipselabs.emfpath.ecore.fluent;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.ecore.path.EStructuralFeatures;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.collect.FluentCollections;
import org.eclipselabs.emfpath.collect.FluentIterable;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

class FPropertyImpl implements FProperty {

	private final EObject fEObject;
	private final EStructuralFeature fEStructuralFeature;
	private final Object fValue;

	/**
	 * @param eObject
	 * @param eStructuralFeature
	 * @param value
	 */
	FPropertyImpl(EObject eObject, EStructuralFeature eStructuralFeature, Object value) {
		this.fEObject = eObject;
		this.fEStructuralFeature = eStructuralFeature;
		this.fValue = value;
	}

	static Function<EObject, FProperty> wrapFunction(final EStructuralFeature eStructuralFeature) {
		return new Function<EObject, FProperty>() {
			public FProperty apply(EObject input) {
				return create(input, eStructuralFeature);
			}
		};
	}
	
	static Function<EObject, FProperty> wrapFunction(final String featureName) {
		return new Function<EObject, FProperty>() {
			public FProperty apply(EObject input) {
				try {
					EStructuralFeature feature = EStructuralFeatures.from(input.eClass()).named(featureName);
					return create(input, feature);
				} catch (NoSuchFeatureException e) {
					throw new IllegalArgumentException(e);
				}
				
			}
		};
	}
	
	public static FProperty create(EObject eObject, EStructuralFeature eStructuralFeature) {
		FProperty ret = InoperativeEProperty.INVALID;

		if (eObject.eClass().getEAllStructuralFeatures().contains(eStructuralFeature)) {
			Object value = eObject.eGet(eStructuralFeature);
			if (value == null) {
				ret = InoperativeEProperty.UNDEFINED;
			} else {
				ret = new FPropertyImpl(eObject, eStructuralFeature, value);
			}
		}
		
		return ret;
	}
	
	/**
	 * @return
	 */
	public Object value() {
		return this.fValue;
	}

	/**
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T value(Class<T> clazz) {
		if (!clazz.isInstance(this.fValue)) {
			throw new UnsupportedOperationException("EStructuralFeature " + this.fEObject.eClass().getName() + "."
				+ this.fEStructuralFeature.getName() + " is not of " + clazz.getSimpleName() + " type. Type was ["
				+ this.fEStructuralFeature.getEType().getInstanceClass().getSimpleName() + "] and value was [" + this.fValue + "]");
		}
		return (T) this.fValue;
	}

	/**
	 * @return
	 */
	public String asString() {
		return this.value(String.class);
	}

	/**
	 * @return
	 */
	public int asInt() {
		return this.value(Integer.class).intValue();
	}

	/**
	 * @return
	 */
	public boolean asBoolean() {
		return this.value(Boolean.class).booleanValue();
	}

	/**
	 * @return
	 */
	public long asLong() {
		return this.value(Long.class).longValue();
	}

	/**
	 * @return
	 */
	public double asDouble() {
		return this.value(Double.class).doubleValue();
	}

	/**
	 * @return
	 */
	public float asFloat() {
		return this.value(Float.class).floatValue();
	}

	/**
	 * @return
	 */
	public short asShort() {
		return this.value(Short.class).shortValue();
	}

	/**
	 * @return
	 */
	public char asChar() {
		return this.value(Character.class).charValue();
	}

	/**
	 * @return
	 */
	private EObject asSimpleEObject() {
		return this.value(EObject.class);
	}

	/**
	 * @return
	 */
	public FObject<EObject> asFObject() {
		return FObjects.create(this.asSimpleEObject());
	}
	
	public <E extends EObject> FObject<E> asFObject(Class<E> type) {
		return FObjects.create(this.value(type));
	}

	/**
	 * @return
	 */
	private Iterable<?> asSimpleList() {
		return asSimpleList(Object.class);
	}
	
	private  <T> Iterable<T> asSimpleList(Class<T> elementType) {
		Preconditions.checkState(fEStructuralFeature.isMany(), "EStructuralFeature " + fEStructuralFeature + " is not multivalued");
		Preconditions.checkArgument(this.eStructuralFeature().getEType().getInstanceClass().isAssignableFrom(elementType), "EStructuralFeature " + this.fEObject.eClass().getName() + "."
				+ this.fEStructuralFeature.getName() + " is not of List<" + elementType.getSimpleName() + "> type. Type was [List<"
				+ this.fEStructuralFeature.getEType().getInstanceClass().getSimpleName() + ">] and value was [" + this.fValue + "]");
		return Iterables.filter((List<?>)fValue, elementType);
	}

	/**
	 * @return
	 */
	public FluentIterable<?> asIterable() {
		return FluentCollections.newFluentIterable(asSimpleList());
	}
	
	public <T> FluentIterable<T> asIterable(Class<T> elementType) {
		return FluentCollections.newFluentIterable(asSimpleList(elementType));
	}

	/**
	 * @return
	 */
	public boolean isUndefined() {
		return false;
	}

	/**
	 * @return
	 */
	public boolean isInvalid() {
		return false;
	}

	/**
	 * @return
	 */
	public EStructuralFeature eStructuralFeature() {
		return this.fEStructuralFeature;
	}

	/**
	 * @return
	 */
	public EObject eObject() {
		return this.fEObject;
	}

	public FIterable<? extends EObject> asFIterable() {
		return FIterableImpl.create(asSimpleList(EObject.class));
	}

	public <T extends EObject> FIterable<T> asFIterable(Class<T> elementType) {
		return FIterableImpl.create(asSimpleList(elementType));
	}

}