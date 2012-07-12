package org.eclipselabs.emfpath.trans.engine.resolver;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public interface ILinkerResolver extends IResolver {

	void link(EObject s, EObject t);

	void link(Collection<? extends EObject> s, EObject t);

	void link(EObject s, String name, EObject t);

	void link(Collection<? extends EObject> values, String name, EObject t);
}
