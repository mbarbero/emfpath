package org.eclipselabs.emfpath.trans.rules.imperative;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.imperative.Operation;
import org.eclipselabs.emfpath.trans.rules.ITargetPatternElement;

public interface IImperativeTargetPatternElement extends ITargetPatternElement {

	Operation<Map<String, EObject>, EObject> function();
	
}
