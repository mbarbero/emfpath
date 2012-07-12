package org.eclipselabs.emfpath.trans.engine;

import org.eclipselabs.emfpath.trans.rules.ITransformationRule;

import com.google.common.collect.ImmutableList;

public interface ITransformationEngine<E extends ITransformationRule> {

	 ITransformationOutput transform(ITransformationEngineInput input, ImmutableList<E> rules);

}