package org.eclipselabs.emfpath.trans.engine;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ITransformationEngineInput extends Iterable<Map.Entry<String, Iterable<? extends EObject>>> {

	public abstract Iterable<? extends EObject> get(String id);

}