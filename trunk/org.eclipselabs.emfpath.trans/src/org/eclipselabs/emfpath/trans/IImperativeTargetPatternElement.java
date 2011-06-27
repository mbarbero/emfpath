package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IImperativeTargetPatternElement extends ITargetPatternElement {

	Operation<Map<String, EObject>, EObject> function();
	
}
