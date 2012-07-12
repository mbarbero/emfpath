package org.eclipselabs.emfpath.trans.rules;


public interface ITransformationRule {

	ISourcePattern sourcePattern();

	ITargetPattern targetPattern();

}