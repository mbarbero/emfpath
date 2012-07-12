package org.eclipselabs.emfpath.trans.rules.impl;

import org.eclipselabs.emfpath.trans.rules.ITargetPattern;
import org.eclipselabs.emfpath.trans.rules.ITargetPatternElement;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

public class TargetPattern implements ITargetPattern {

	protected ImmutableSet<? extends ITargetPatternElement> fElements;
	
	protected TargetPattern() {
		// do nothing
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.IDeclarativeTargetPattern#elements()
	 */
	public ImmutableSet<? extends ITargetPatternElement> elements() {
		return fElements;
	}

	//TODO: must be package-private
	public void setElements(ImmutableSet<? extends ITargetPatternElement> elements) {
		fElements = elements;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		ImmutableSet.Builder<ITargetPatternElement> elementsBuilder;
		
		protected Builder() {
			elementsBuilder = ImmutableSet.builder();
		}
		
		public Builder addElement(ITargetPatternElement element) {
			elementsBuilder.add(element);
			return this;
		}
		
		public ITargetPattern build() {
			ImmutableSet<ITargetPatternElement> elements = elementsBuilder.build();
			checkPreconditions(elements);
			TargetPattern ret = new TargetPattern();
			ret.setElements(elements);
			return ret;
		}
	}

	private static final Function<ITargetPatternElement, String> TARGET_PATTERN_ELEMENT_NAME = new Function<ITargetPatternElement, String>() {
		public String apply(ITargetPatternElement from) {
			return from.name();
		}
	};
	
	public static void checkPreconditions(final ImmutableSet<? extends ITargetPatternElement> elements) {
		Preconditions.checkState(elements.size() > 0);
		
		Iterable<? extends ITargetPatternElement> duplicateVarName = Iterables.filter(elements, new Predicate<ITargetPatternElement>() {
			public boolean apply(ITargetPatternElement input) {
				return Iterables.frequency(Iterables.transform(elements, TARGET_PATTERN_ELEMENT_NAME), input.name()) > 1;
			}
		});
		boolean empty = Iterables.isEmpty(duplicateVarName);
		Preconditions.checkState(empty, 
			"Duplicate output variable names: " + 
			Joiner.on(", ").join(ImmutableSet.copyOf(Iterables.transform(duplicateVarName, TARGET_PATTERN_ELEMENT_NAME))));
	}
}
