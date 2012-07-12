package org.eclipselabs.emfpath.trans.rules.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.rules.ISourcePattern;
import org.eclipselabs.emfpath.trans.rules.ISourcePatternElement;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

public class SourcePattern implements ISourcePattern {

	private ImmutableSet<ISourcePatternElement> fElements;
	private Predicate<Map<String, EObject>> fJoinPredicate;
	
	SourcePattern() {
		// prevents instantation
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ISourcePattern#elements()
	 */
	public ImmutableSet<ISourcePatternElement> elements() {
		return fElements;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ISourcePattern#joinPredicate()
	 */
	public Predicate<Map<String, EObject>> joinPredicate() {
		return fJoinPredicate;
	}

	void setElements(ImmutableSet<ISourcePatternElement> elements) {
		fElements = elements;
	}

	void setJoinPredicate(Predicate<Map<String, EObject>> joinPredicate) {
		fJoinPredicate = joinPredicate;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private ImmutableSet.Builder<ISourcePatternElement> fElementsBuilder;
		private Predicate<Map<String, EObject>> fJoinPredicate;
		
		private static final Function<ISourcePatternElement, String> SOURCE_PATTERN_ELEMENT_NAME = new Function<ISourcePatternElement, String>() {
			public String apply(ISourcePatternElement from) {
				return from.name();
			}
		};
		
		Builder() {
			fElementsBuilder = ImmutableSet.builder();
			fJoinPredicate = Predicates.alwaysTrue();
		}
		
		public Builder addElement(ISourcePatternElement element) {
			fElementsBuilder.add(element);
			return this;
		}
		
		public Builder joinWhen(Predicate<Map<String, EObject>> joinPredicate) {
			fJoinPredicate = joinPredicate;
			return this;
		}
		
		public ISourcePattern build() {
			final ImmutableSet<ISourcePatternElement> elements = fElementsBuilder.build();
			Preconditions.checkState(elements.size() > 0);
			
			Iterable<ISourcePatternElement> duplicateVarName = Iterables.filter(elements, new Predicate<ISourcePatternElement>() {
				public boolean apply(ISourcePatternElement input) {
					return Iterables.frequency(Iterables.transform(elements, SOURCE_PATTERN_ELEMENT_NAME), input.name()) > 1;
				}
			});
			Preconditions.checkState(Iterables.isEmpty(duplicateVarName), 
				"Duplicate output variable names: " + 
				Joiner.on(", ").join(ImmutableSet.copyOf(Iterables.transform(duplicateVarName, SOURCE_PATTERN_ELEMENT_NAME))));
			
			Preconditions.checkState(fJoinPredicate != null);
			
			SourcePattern ret = new SourcePattern();
			ret.setElements(elements);
			ret.setJoinPredicate(fJoinPredicate);
			return ret;
		}
	}
}
