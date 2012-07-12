package org.eclipselabs.emfpath.trans.rules.declarative;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.declarative.DeclarativeOperation;
import org.eclipselabs.emfpath.trans.rules.ITargetPatternElement;

public interface IDeclarativeTargetPatternElement extends ITargetPatternElement {

	boolean isDefault();
	
	DeclarativeOperation<Map<String, EObject>, EObject> function();
}