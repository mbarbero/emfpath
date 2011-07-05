package org.eclipselabs.emfpath.trans;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.collect.ForwardingIterable;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public final class TransformationInput extends ForwardingIterable<Map.Entry<String, Iterable<? extends EObject>>> {

	private ImmutableMap<String,Iterable<? extends EObject>> fBackingMap;
	
	TransformationInput() {
		// prevents instantiation
	}
	
	@Override
	protected ImmutableSet<Entry<String,Iterable<? extends EObject>>> delegate() {
		return fBackingMap.entrySet();
	}
	
	public Iterable<? extends EObject> get(String id) {
		return fBackingMap.get(id);
	}

	void setBackingMap(ImmutableMap<String, Iterable<? extends EObject>> backingMap) {
		fBackingMap = backingMap;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private ImmutableMap.Builder<String, Iterable<? extends EObject>> fMapBuilder;
		
		Builder() {
			fMapBuilder = ImmutableMap.builder();
		}
		
		public Builder add(String id, Iterable<? extends EObject> value) {
			Preconditions.checkNotNull(id);
			Preconditions.checkNotNull(value);
			fMapBuilder.put(id, value);
			return this;
		}
		
		public TransformationInput build() {
			ImmutableMap<String, Iterable<? extends EObject>> buildedMap = fMapBuilder.build();
			Preconditions.checkState(buildedMap.size() > 0);
			
			TransformationInput ret = new TransformationInput();
			ret.setBackingMap(buildedMap);
			return ret;
		}
	}
}
