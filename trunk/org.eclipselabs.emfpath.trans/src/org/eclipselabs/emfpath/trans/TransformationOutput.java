package org.eclipselabs.emfpath.trans;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.collect.ForwardingIterable;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

public final class TransformationOutput extends ForwardingIterable<Map.Entry<String, Iterable<EObject>>> {

	private ImmutableMap<String, Iterable<EObject>> fBackingMap;
	
	TransformationOutput() {
		// prevents instantiation
	}
	
	@Override
	protected Iterable<Entry<String, Iterable<EObject>>> delegate() {
		return fBackingMap.entrySet();
	}

	public Iterable<EObject> get(String id) {
		return fBackingMap.get(id);
	}

	void setBackingMap(ImmutableMap<String, Iterable<EObject>> backingMap) {
		fBackingMap = backingMap;
	}

	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private ImmutableMap.Builder<String, Iterable<EObject>> fMapBuilder;
		
		Builder() {
			fMapBuilder = ImmutableMap.builder();
		}
		
		public Builder add(String id, Iterable<EObject> value) {
			Preconditions.checkNotNull(id);
			Preconditions.checkNotNull(value);
			fMapBuilder.put(id, value);
			return this;
		}
		
		public TransformationOutput build() {
			ImmutableMap<String, Iterable<EObject>> buildedMap = fMapBuilder.build();
			Preconditions.checkState(buildedMap.size() > 0);
			
			TransformationOutput ret = new TransformationOutput();
			ret.setBackingMap(buildedMap);
			return ret;
		}
	}
}
