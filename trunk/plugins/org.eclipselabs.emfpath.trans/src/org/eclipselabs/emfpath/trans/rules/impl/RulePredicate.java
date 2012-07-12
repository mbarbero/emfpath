package org.eclipselabs.emfpath.trans.rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.ecore.path.EObjects;

import com.google.common.base.Predicate;

abstract class RulePredicate<T extends EObject> implements Predicate<EObject> {

	private final Predicate<? super T> fPredicate;
	
	RulePredicate(Predicate<? super T> predicate) {
		this.fPredicate = predicate;
	}
	
	Predicate<? super T> delegate() {
		return fPredicate;
	}
	
	static <E extends EObject> RulePredicate<E> create(Class<E> type, Predicate<? super E> predicate) {
		return new GenericRulePredicate<E>(EObjects.isKindOf(type), predicate);
	}
	
	static <E extends EObject> RulePredicate<E> create(EClass eClass, Predicate<? super E> predicate) {
		return new GenericRulePredicate<E>(EObjects.isKindOf(eClass), predicate);
	}
	
	static <E extends EObject> RulePredicate<E> create(Predicate<? super E> predicate) {
		return new EObjectRulePredicate<E>(predicate);
	}
	
	private static class EObjectRulePredicate<T extends EObject> extends RulePredicate<T>  {

		public EObjectRulePredicate(Predicate<? super T> predicate) {
			super(predicate);
		}

		@SuppressWarnings("unchecked") // safe by construction, T is EObject
		public boolean apply(EObject input) {
			return delegate().apply((T)input);
		}
		
	}
	
	private static class GenericRulePredicate<T extends EObject> extends RulePredicate<T> {
		
		private final Predicate<EObject> fTypePredicate;
		
		public GenericRulePredicate(Predicate<EObject> typePredicate, Predicate<? super T> predicate) {
			super(predicate);
			this.fTypePredicate = typePredicate;
		}
		
		@SuppressWarnings("unchecked") // safe by construction, T is EObject
		public boolean apply(EObject input) {
			return fTypePredicate.apply(input) && delegate().apply((T)input);
		}
	}
}
