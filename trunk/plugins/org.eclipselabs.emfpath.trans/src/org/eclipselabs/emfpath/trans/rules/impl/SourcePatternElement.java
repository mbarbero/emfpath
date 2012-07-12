package org.eclipselabs.emfpath.trans.rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.rules.ISourcePatternElement;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;

public class SourcePatternElement implements ISourcePatternElement {

	private String fIn;
	private String fName;
	private RulePredicate<?> fPredicate;

	SourcePatternElement() {
		// prevents instantiation
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ISourcePatternElement#in()
	 */
	public String in() {
		return fIn;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ISourcePatternElement#name()
	 */
	public String name() {
		return fName;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ISourcePatternElement#predicate()
	 */
	public Predicate<EObject> predicate() {
		return fPredicate;
	}
	
	void setIn(String in) {
		fIn = in;
	}

	void setName(String name) {
		fName = name;
	}

	void setPredicate(RulePredicate<? extends EObject> predicate) {
		fPredicate = predicate;
	}
	
	public static <E extends EObject> Builder<E> select() {
		return new Builder<E>();
	}
	
	public static <E extends EObject> Builder<E> select(EClass eClass) {
		return new Builder<E>(eClass);
	}
	
	public static <E extends EObject> Builder<E> select(Class<E> type) {
		return new Builder<E>(type);
	}
	
	public static class Builder<E extends EObject> {
		private String fIn;
		private String fName;
		private Class<E> fType;
		private RulePredicate<? super E> fPredicate;
		private EClass fEClass;
		
		Builder() {
			fIn = "";
			fType = null;
			fEClass = null;
			fPredicate = RulePredicate.create(Predicates.alwaysTrue());
			fName = "";
		}
		
		Builder(Class<E> type) {
			fIn = "";
			fType = type;
			fEClass = null;
			fPredicate = RulePredicate.create(type, Predicates.alwaysTrue());
			fName = "";
		}
		
		Builder(EClass eClass) {
			fIn = "";
			fType = null;
			fEClass = eClass;
			fPredicate = RulePredicate.create(eClass, Predicates.alwaysTrue());
			fName = "";
		}
		
		public Builder<E> from(String sourceName) {
			fIn = sourceName;
			return this;
		}
		
		public Builder<E> as(String name) {
			fName = name;
			return this;
		}

		public Builder<E> where(Predicate<? super E> predicate) {
			if (fType != null) {
				fPredicate = RulePredicate.create(fType, predicate);
			} else if (fEClass != null) {
				fPredicate = RulePredicate.create(fEClass, predicate);
			} else {
				fPredicate = RulePredicate.create(predicate);
			}
			return this;
		}
		
		public ISourcePatternElement build() {
			Preconditions.checkState(!Strings.isNullOrEmpty(fIn));
			Preconditions.checkState(!Strings.isNullOrEmpty(fName));
			Preconditions.checkState(fPredicate != null);
			SourcePatternElement ret = new SourcePatternElement();
			ret.setIn(fIn);
			ret.setName(fName);
			ret.setPredicate(fPredicate);
			return ret;
		}
	}
}
