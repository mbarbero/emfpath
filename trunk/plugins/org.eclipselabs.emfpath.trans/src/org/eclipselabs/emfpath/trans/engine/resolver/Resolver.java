package org.eclipselabs.emfpath.trans.engine.resolver;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.declarative.Constants;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ObjectArrays;

public abstract class Resolver implements ILinkerResolver {

	protected abstract void link(TransientLinkKey key, EObject target);

	protected abstract EObject resolve(TransientLinkKey key, EClass eClass);
	
	protected abstract <T extends EObject> T resolve(TransientLinkKey key, Class<T> clazz);

	public EObject resolve(EObject s, EClass eClass) {
		return resolve(ImmutableList.of(s), eClass);
	}

	public EObject resolve(Collection<EObject> s, EClass eClass) {
		TransientLinkKey key = TransientLinkKey.createDefault(s);
		return resolve(key, eClass);
	}

	public EObject resolve(EObject s, String tpeName, EClass eClass) {
		return resolve(ImmutableList.of(s), tpeName, eClass);
	}

	public EObject resolve(Collection<? extends EObject> s, String tpeName, EClass eClass) {
		TransientLinkKey key = TransientLinkKey.create(s, tpeName);
		return resolve(key, eClass);
	}

	public Collection<EObject> resolveAll(Collection<? extends EObject> s, EClass eClass) {
		ImmutableList.Builder<EObject> retBuilder = ImmutableList.builder();
		for (EObject eObject : s) {
			retBuilder.add(resolve(eObject, eClass));
		}
		return retBuilder.build();
	}

	public Collection<EObject> resolveAll(Collection<? extends EObject> s, String tpeName, EClass eClass) {
		ImmutableList.Builder<EObject> retBuilder = ImmutableList.builder();
		for (EObject eObject : s) {
			retBuilder.add(resolve(eObject, tpeName, eClass));
		}
		return retBuilder.build();
	}
	
	public <T extends EObject> T resolve(EObject s, Class<T> eClass) {
		return resolve(ImmutableList.of(s), eClass);
	}

	public <T extends EObject> T resolve(Collection<EObject> s, Class<T> eClass) {
		TransientLinkKey key = TransientLinkKey.createDefault(s);
		return resolve(key, eClass);
	}

	public <T extends EObject> T resolve(EObject s, String tpeName, Class<T> eClass) {
		return resolve(ImmutableList.of(s), tpeName, eClass);
	}

	public <T extends EObject> T resolve(Collection<? extends EObject> s, String tpeName, Class<T> eClass) {
		TransientLinkKey key = TransientLinkKey.create(s, tpeName);
		return resolve(key, eClass);
	}

	public <T extends EObject> Collection<T> resolveAll(Collection<? extends EObject> s, Class<T> eClass) {
		ImmutableList.Builder<T> retBuilder = ImmutableList.builder();
		for (EObject eObject : s) {
			retBuilder.add(resolve(eObject, eClass));
		}
		return retBuilder.build();
	}

	public <T extends EObject> Collection<T> resolveAll(Collection<? extends EObject> s, String tpeName, Class<T> eClass) {
		ImmutableList.Builder<T> retBuilder = ImmutableList.builder();
		for (EObject eObject : s) {
			retBuilder.add(resolve(eObject, tpeName, eClass));
		}
		return retBuilder.build();
	}

	public void link(EObject s, EObject t) {
		link(ImmutableList.of(s), t);
	}

	public void link(Collection<? extends EObject> s, EObject t) {
		link(TransientLinkKey.createDefault(s), t);
	}

	public void link(EObject s, String name, EObject t) {
		link(ImmutableList.of(s), name, t);
	}

	public void link(Collection<? extends EObject> values, String name, EObject t) {
		link(TransientLinkKey.create(values, name), t);
	}

	static final class TransientLinkKey {
		
		private Object[] fElements;
		private String fTargetPatternElementName;
		
		private TransientLinkKey() {
		}
		
		public static TransientLinkKey create(Collection<?> elements, String tpeName) {
			TransientLinkKey ret = new TransientLinkKey();
			ret.fElements = Preconditions.checkNotNull(elements).toArray();
			ret.fTargetPatternElementName = Preconditions.checkNotNull(tpeName);
			return ret;
		}
		
		public static TransientLinkKey createDefault(Collection<?> elements) {
			return create(elements, Constants.DEFAULT_TARGET_PATTERN_ELEMENT_NAME);
		}
		
		@Override
		public int hashCode() {
			return Objects.hashCode(ObjectArrays.concat(fElements, fTargetPatternElementName));
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean ret = false;
			if (obj instanceof TransientLinkKey) {
				ret = 
					Arrays.equals(fElements, ((TransientLinkKey) obj).fElements) && 
					Objects.equal(fTargetPatternElementName, ((TransientLinkKey) obj).fTargetPatternElementName);
			}
			return ret;
		}
		
		@Override
		public String toString() {
			ToStringHelper tsh = Objects.toStringHelper(this).addValue(fTargetPatternElementName);
			for (int i = 0; i < fElements.length; i++) {
				tsh.add("e["+i+"]", fElements[i]);
			}
			return tsh.toString();
		}
	}
	
	public static class UnresolvingResolver extends Resolver {

		public final static Resolver INSTANCE = new UnresolvingResolver();
		
		private UnresolvingResolver() {
			// prevents instantiation
		}
		
		@Override
		protected void link(TransientLinkKey key, EObject target) {
		}

		@Override
		protected EObject resolve(TransientLinkKey key, EClass eClass) {
			throw new UnsupportedOperationException();
		}

		@Override
		protected <T extends EObject> T resolve(TransientLinkKey key, Class<T> clazz) {
			throw new UnsupportedOperationException();
		}
	}
}