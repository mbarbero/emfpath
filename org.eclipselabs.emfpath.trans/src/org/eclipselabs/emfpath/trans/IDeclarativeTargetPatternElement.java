package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IDeclarativeTargetPatternElement extends ITargetPatternElement {

	boolean isDefault();
	
	DeclarativeOperation<Map<String, EObject>, EObject> function();
}