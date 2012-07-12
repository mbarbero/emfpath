package org.eclipselabs.emfpath.trans.engine.muxdemux;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.ITransformationEngineInput;
import org.eclipselabs.emfpath.trans.rules.ITransformationRule;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public interface IMultiplexer {

	<E extends ITransformationRule> ImmutableMap<E, ? extends Iterable<Map<String, EObject>>> multiplex(ITransformationEngineInput input, ImmutableList<? extends E> rules);

}