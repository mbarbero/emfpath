package org.eclipselabs.emfpath.trans.rules;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;

public interface ITargetPatternElement {

	String name();

	String in();

	Function<Map<String, EObject>, EObject> function();

}