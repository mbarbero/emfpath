package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public interface IMultiplexer {

	<E extends ITransformationRule> ImmutableMap<E, ? extends Iterable<Map<String, EObject>>> multiplex(TransformationInput input, ImmutableList<? extends E> rules);

}