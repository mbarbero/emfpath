package org.eclipselabs.emfpath.trans;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;

public interface IDemultiplexer {

	<E extends ITransformationRule> TransformationOutput demultiplex(ImmutableMap<E, ImmutableMultimap<String, Iterable<EObject>>> transformedInput);

}