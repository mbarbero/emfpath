package org.eclipselabs.emfpath.trans;

import com.google.common.collect.ImmutableSet;

public interface ITargetPattern {

	ImmutableSet<? extends ITargetPatternElement> elements();

}