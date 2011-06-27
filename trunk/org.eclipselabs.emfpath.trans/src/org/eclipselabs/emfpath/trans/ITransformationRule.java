package org.eclipselabs.emfpath.trans;

public interface ITransformationRule {

	ISourcePattern sourcePattern();

	ITargetPattern targetPattern();

}