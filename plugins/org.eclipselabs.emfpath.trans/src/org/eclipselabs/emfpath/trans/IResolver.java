package org.eclipselabs.emfpath.trans;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface IResolver {

	EObject resolve(EObject s, EClass eClass);

	EObject resolve(Collection<EObject> s, EClass eClass);

	EObject resolve(EObject s, String tpeName, EClass eClass);

	EObject resolve(Collection<? extends EObject> s, String tpeName, EClass eClass);

	Collection<EObject> resolveAll(Collection<? extends EObject> s, EClass eClass);

	Collection<EObject> resolveAll(Collection<? extends EObject> s, String tpeName, EClass eClass);

	<T extends EObject> T resolve(EObject s, Class<T> eClass);

	<T extends EObject> T resolve(Collection<EObject> s, Class<T> eClass);

	<T extends EObject> T resolve(EObject s, String tpeName, Class<T> eClass);

	<T extends EObject> T resolve(Collection<? extends EObject> s, String tpeName, Class<T> eClass);

	<T extends EObject> Collection<T> resolveAll(Collection<? extends EObject> s, Class<T> eClass);

	<T extends EObject> Collection<T> resolveAll(Collection<? extends EObject> s, String tpeName, Class<T> eClass);

}