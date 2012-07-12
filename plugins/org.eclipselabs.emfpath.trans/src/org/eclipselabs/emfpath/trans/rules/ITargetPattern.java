package org.eclipselabs.emfpath.trans.rules;

import com.google.common.collect.ImmutableSet;

public interface ITargetPattern {

	ImmutableSet<? extends ITargetPatternElement> elements();

}