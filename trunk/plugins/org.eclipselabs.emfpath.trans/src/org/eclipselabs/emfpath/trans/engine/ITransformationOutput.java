package org.eclipselabs.emfpath.trans.engine;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ITransformationOutput extends Iterable<Map.Entry<String, Iterable<EObject>>> {

	public abstract Iterable<EObject> get(String id);

}