package org.eclipselabs.emfpath.trans;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emfpath.ecore.path.EClasses;
import org.eclipselabs.emfpath.ecore.path.EPackages;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;

public class BasicResolver extends Resolver {

	private static final int CACHE_SIZE = 64;

	@VisibleForTesting final Map<TransientLinkKey, EObject> fTransientLinks;
	
	@VisibleForTesting final Map<TransientLinkKey, EObject> fProxyDelegate;
	
	private final ResourceSet fResourceSet;

	@VisibleForTesting final Resource fDelegateResource;
	
	private final ECrossReferenceAdapter fCrossReferenceAdapter;
	
	private final ConcurrentMap<Class<?>, EClass> fInstanceClass2EClassCache;
	
	public BasicResolver(ResourceSet resourceSet) {
		fResourceSet = resourceSet;
		fTransientLinks = Maps.newHashMap();
		fProxyDelegate = Maps.newHashMap();
		fInstanceClass2EClassCache = new MapMaker().maximumSize(CACHE_SIZE).makeMap();

		ECrossReferenceAdapter registeredCrossReferenceAdapter = ECrossReferenceAdapter.getCrossReferenceAdapter(resourceSet);
		if (registeredCrossReferenceAdapter == null) {
			fCrossReferenceAdapter = new ECrossReferenceAdapter();
			resourceSet.eAdapters().add(fCrossReferenceAdapter);
		} else {
			fCrossReferenceAdapter = registeredCrossReferenceAdapter;
		}

		fDelegateResource = resourceSet.createResource(URI.createURI("__delegates__.xml"));
	}
	
	@Override
	void link(TransientLinkKey key, final EObject target) {
		EObject previous = fTransientLinks.put(key, target);
		if (previous != null) {
			throw new IllegalStateException("Key " + key + " was already registered with " + previous);
		}
	
		EObject proxy = fProxyDelegate.get(key);
		if (proxy != null) {
			restoreReferencesFromProxy(proxy, target);
			fProxyDelegate.remove(key);
		}
	}

	@SuppressWarnings("unchecked") // checked in the code (isInstance())
	@Override
	<T extends EObject> T resolve(TransientLinkKey key, Class<T> clazz) {
		EObject ret = fTransientLinks.get(key);
		if (ret == null) {
			ret = fProxyDelegate.get(key);
			if (ret == null) {
				ret = createProxyObject(clazz);
				fProxyDelegate.put(key, ret);
			}
		} else {
			if (!clazz.isInstance(ret)) {
				throw new IllegalArgumentException("Resolved element does not match the type " + clazz.getName());
			}
		}
		return (T) ret;
	}
	
	@Override
	EObject resolve(TransientLinkKey key, EClass eClass) {
		EObject ret = fTransientLinks.get(key);
		if (ret == null) {
			ret = fProxyDelegate.get(key);
			if (ret == null) {
				ret = createProxyObject(eClass);
				fProxyDelegate.put(key, ret);
			}
		} else {
			if (!ret.eClass().equals(eClass)) {
				throw new IllegalArgumentException("Resolved element does not match the type " + eClass.getEPackage().getName() + "." + eClass.getName());
			}
		}
		return ret;
	}

	private EObject createProxyObject(EClass eClass) {
		EObject ret = EcoreUtil.create(eClass);
		fDelegateResource.getContents().add(ret);
		return ret;
	}
	
	@SuppressWarnings("unchecked") // if EClass.getInstanceClass == T, then EcoreUtil.create(EClass) returns a T
	private <T extends EObject> T createProxyObject(Class<T> clazz) {
		EClass eClass = fInstanceClass2EClassCache.get(clazz);
		if (eClass == null) {
			eClass = findEClassFromInstanceClass(clazz);
			fInstanceClass2EClassCache.put(clazz, eClass);
		}
		return (T) createProxyObject(eClass);
	}
	
	private EClass findEClassFromInstanceClass(Class<?> clazz) {
		Iterable<EClass> allEClasses = Iterables.filter(Iterables.concat(Iterables.transform(
			EPackages.allEPackages(fResourceSet.getPackageRegistry()), EPackages.eClassifiers)), EClass.class);
		
		try {
			Predicate<Class<?>> equalTo = Predicates.<Class<?>>equalTo(clazz);
			Predicate<? super EClass> findPredicate = Predicates.compose(equalTo, EClasses.instanceClass);
			EClass eClass = Iterables.find(allEClasses, findPredicate);
			return eClass;
		} catch (NoSuchElementException e) {
			throw new IllegalArgumentException("No EClass exists with " + clazz.getName() + " as instance class");
		}
	}

	private void restoreReferencesFromProxy(EObject proxy, EObject target) {
		Collection<Setting> usage = fCrossReferenceAdapter.getInverseReferences(proxy);
		for (Setting setting : usage) {
			EStructuralFeature eSF = setting.getEStructuralFeature();
			EObject eObject = setting.getEObject();
			if (eSF.isMany()) {
				@SuppressWarnings("unchecked") 
				List<? super Object> list = (List<? super Object>)eObject.eGet(eSF);
				int index = list.indexOf(proxy);
				list.remove(index);
				list.add(index, target);
			} else {
				eObject.eSet(eSF, target);
			}
		}
	}
}
