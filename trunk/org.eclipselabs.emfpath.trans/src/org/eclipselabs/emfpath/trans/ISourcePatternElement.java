package org.eclipselabs.emfpath.trans;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;

public interface ISourcePatternElement {

	String in();

	String name();

	Predicate<EObject> predicate();

}