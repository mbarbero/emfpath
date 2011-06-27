package org.eclipselabs.emfpath.trans;

import com.google.common.collect.ImmutableSet;

public interface IDeclarativeTargetPattern extends ITargetPattern {

	IDeclarativeTargetPatternElement defaultPattern();

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ITargetPattern#elements()
	 */
	ImmutableSet<? extends IDeclarativeTargetPatternElement> elements();

}