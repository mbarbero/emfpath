package org.eclipselabs.emfpath.trans.rules.declarative.impl;

import org.eclipselabs.emfpath.trans.rules.declarative.IDeclarativeTargetPattern;
import org.eclipselabs.emfpath.trans.rules.declarative.IDeclarativeTargetPatternElement;
import org.eclipselabs.emfpath.trans.rules.impl.TargetPattern;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

public class DeclarativeTargetPattern extends TargetPattern implements IDeclarativeTargetPattern {

	private static final Predicate<IDeclarativeTargetPatternElement> IS_DEFAULT = new Predicate<IDeclarativeTargetPatternElement>() {
		public boolean apply(IDeclarativeTargetPatternElement input) {
			return input.isDefault();
		}
	};
	
	DeclarativeTargetPattern() {
		// do nothing
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.IDeclarativeTargetPattern#defaultPattern()
	 */
	public IDeclarativeTargetPatternElement defaultPattern() {
		return Iterables.find(elements(), IS_DEFAULT);
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.IDeclarativeTargetPattern#elements()
	 */
	public ImmutableSet<? extends IDeclarativeTargetPatternElement> elements() {
		return (ImmutableSet<? extends IDeclarativeTargetPatternElement>) fElements;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder extends TargetPattern.Builder {
		ImmutableSet.Builder<IDeclarativeTargetPatternElement> elementsBuilder;
		
		Builder() {
			elementsBuilder = ImmutableSet.builder();
		}
		
		public Builder addElement(IDeclarativeTargetPatternElement element) {
			elementsBuilder.add(element);
			return this;
		}
		
		public IDeclarativeTargetPattern build() {
			ImmutableSet<IDeclarativeTargetPatternElement> elements = elementsBuilder.build();
			checkPreconditions(elements);
			DeclarativeTargetPattern ret = new DeclarativeTargetPattern();
			ret.setElements(elements);
			return ret;
		}
	}
	
	static void checkPreconditions(final ImmutableSet<? extends IDeclarativeTargetPatternElement> elements) {
		TargetPattern.checkPreconditions(elements);
		Preconditions.checkState(Iterables.size(Iterables.filter(elements, IS_DEFAULT)) == 1, "A target pattern must have one and only one default target pattern element");
	}
}
