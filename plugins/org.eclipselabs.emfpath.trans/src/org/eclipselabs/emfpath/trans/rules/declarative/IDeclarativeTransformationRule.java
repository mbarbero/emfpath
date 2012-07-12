package org.eclipselabs.emfpath.trans.rules.declarative;

import org.eclipselabs.emfpath.trans.rules.ITransformationRule;

public interface IDeclarativeTransformationRule extends ITransformationRule {

	public IDeclarativeTargetPattern targetPattern();
}
