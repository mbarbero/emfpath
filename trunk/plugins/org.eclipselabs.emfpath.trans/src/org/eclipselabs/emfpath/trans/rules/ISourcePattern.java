package org.eclipselabs.emfpath.trans.rules;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;

public interface ISourcePattern {

	ImmutableSet<ISourcePatternElement> elements();

	Predicate<Map<String, EObject>> joinPredicate();

}