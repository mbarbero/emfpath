package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public final class DeclarativeTargetPatternElement extends TargetPatternElement implements IDeclarativeTargetPatternElement {

	private boolean fIsDefault;
	private DeclarativeOperation<Map<String, EObject>, EObject> fOperation;
	
	public boolean isDefault() {
		return fIsDefault;
	}

	void setDefault(boolean isDefault) {
		fIsDefault = isDefault;
	}

	public DeclarativeOperation<Map<String, EObject>, EObject> function() {
		return fOperation;
	}
	
	void setOperation(DeclarativeOperation<Map<String, EObject>, EObject> operation) {
		fOperation = operation;
	}
	
	public static Builder named(String name) {
		return new Builder(name);
	}
	
	public static class Builder extends TargetPatternElement.Builder {
		
		private boolean fIsDefault;
		private DeclarativeOperation<Map<String, EObject>, EObject> fOperation;
		
		Builder(String name) {
			super(name);
			fIsDefault = false;
		}
		
		@Override
		public Builder in(String name) {
			super.in(name);
			return this;
		}
		
		public Builder executing(DeclarativeOperation<Map<String, EObject>, EObject> targetPatternElementOperation) {
			fOperation = targetPatternElementOperation;
			return this;
		}
		
		public Builder asDefault() {
			fIsDefault = true;
			return this;
		}
		
		public IDeclarativeTargetPatternElement build() {
			checkPreconditions();
			
			DeclarativeTargetPatternElement ret = new DeclarativeTargetPatternElement();
			ret.setName(fName);
			ret.setDefault(fIsDefault);
			ret.setIn(fIn);
			ret.setOperation(fOperation);
			return ret;
			
		}
	}
}
