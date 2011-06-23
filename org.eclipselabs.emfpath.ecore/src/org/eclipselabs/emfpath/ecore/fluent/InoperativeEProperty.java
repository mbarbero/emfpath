package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.collect.FluentList;

enum InoperativeEProperty implements FProperty {
	INVALID {
		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asBoolean()
		 */
		public boolean asBoolean() {
			throw new InvalidPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asInt()
		 */
		public int asInt() {
			throw new InvalidPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asString()
		 */
		public String asString() {
			throw new InvalidPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#eObject()
		 */
		public EObject eObject() {
			throw new InvalidPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#eStructuralFeature()
		 */
		public EStructuralFeature eStructuralFeature() {
			throw new InvalidPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#isInvalid()
		 */
		public boolean isInvalid() {
			return true;
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#isUndefined()
		 */
		public boolean isUndefined() {
			return false;
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#value()
		 */
		public Object value() {
			throw new InvalidPropertyException();
		}

		public <T> T value(Class<T> clazz) {
			throw new InvalidPropertyException();
		}

		public long asLong() {
			throw new InvalidPropertyException();
		}

		public double asDouble() {
			throw new InvalidPropertyException();
		}

		public float asFloat() {
			throw new InvalidPropertyException();
		}

		public short asShort() {
			throw new InvalidPropertyException();
		}

		public char asChar() {
			throw new InvalidPropertyException();
		}

		public FObject<EObject> asFObject() {
			throw new InvalidPropertyException();
		}

		public FluentList<?> asIterable() {
			throw new InvalidPropertyException();
		}

		public <T> FluentList<T> asIterable(Class<T> elementType) {
			throw new InvalidPropertyException();
		}

		public FIterable<? extends EObject> asFIterable() {
			throw new InvalidPropertyException();
		}

		public <T extends EObject> FIterable<T> asFIterable(
				Class<T> elementType) {
			throw new InvalidPropertyException();
		}

		public <E extends EObject> FObject<E> asFObject(Class<E> type) {
			throw new InvalidPropertyException();
		}
	},
	
	UNDEFINED {
		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asBoolean()
		 */
		public boolean asBoolean() {
			throw new UndefinedPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asInt()
		 */
		public int asInt() {
			throw new UndefinedPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#asString()
		 */
		public String asString() {
			throw new UndefinedPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#eObject()
		 */
		public EObject eObject() {
			throw new UndefinedPropertyException();
		}

		/**
		 * @see org.eclipselabs.emfpath.util.FProperty#eStructuralFeature()
		 */
		public EStructuralFeature eStructuralFeature() {
			throw new UndefinedPropertyException();
		}

		public boolean isInvalid() {
			return false;
		}

		public boolean isUndefined() {
			return true;
		}

		public Object value() {
			throw new UndefinedPropertyException();
		}

		public <T> T value(Class<T> clazz) {
			throw new UndefinedPropertyException();
		}

		public long asLong() {
			throw new UndefinedPropertyException();
		}

		public double asDouble() {
			throw new UndefinedPropertyException();
		}

		public float asFloat() {
			throw new UndefinedPropertyException();
		}

		public short asShort() {
			throw new UndefinedPropertyException();
		}

		public char asChar() {
			throw new UndefinedPropertyException();
		}

		public FObject<EObject> asFObject() {
			throw new UndefinedPropertyException();
		}

		public FluentList<?> asIterable() {
			throw new UndefinedPropertyException();
		}

		public <T> FluentList<T> asIterable(Class<T> elementType) {
			throw new UndefinedPropertyException();
		}

		public FIterable<? extends EObject> asFIterable() {
			throw new UndefinedPropertyException();
		}

		public <T extends EObject> FIterable<T> asFIterable(
				Class<T> elementType) {
			throw new UndefinedPropertyException();
		}

		public <E extends EObject> FObject<E> asFObject(Class<E> type) {
			throw new UndefinedPropertyException();
		}
	},
}