package org.eclipselabs.emfpath.trans.engine.muxdemux;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.ITransformationOutput;
import org.eclipselabs.emfpath.trans.rules.ITransformationRule;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;

public interface IDemultiplexer {

	<E extends ITransformationRule> ITransformationOutput demultiplex(ImmutableMap<E, ImmutableMultimap<String, Iterable<EObject>>> transformedInput);

}