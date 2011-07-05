package org.eclipselabs.emfpath.trans;

import com.google.common.collect.ImmutableList;

public interface ITransformationEngine {

	 <E extends IDeclarativeTransformationRule> TransformationOutput transform(TransformationInput input, ImmutableList<E> rules);

}