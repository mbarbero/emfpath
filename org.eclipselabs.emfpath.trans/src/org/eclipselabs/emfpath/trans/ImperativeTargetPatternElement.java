package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public final class ImperativeTargetPatternElement extends TargetPatternElement implements IImperativeTargetPatternElement {

	private Operation<Map<String, EObject>, EObject> fOperation;
	
	public Operation<Map<String, EObject>, EObject> function() {
		return fOperation;
	}
	
	void setOperation(Operation<Map<String, EObject>, EObject> operation) {
		fOperation = operation;
	}
	
	public static Builder named(String name) {
		return new Builder(name);
	}
	
	public static class Builder extends TargetPatternElement.Builder {
		
		Operation<Map<String, EObject>, EObject> fOperation;
		
		Builder(String name) {
			super(name);
		}
		
		@Override
		public Builder in(String name) {
			super.in(name);
			return this;
		}
		
		public Builder executing(Operation<Map<String, EObject>, EObject> targetPatternElementOperation) {
			this.fOperation = targetPatternElementOperation;
			return this;
		}
		
		public IImperativeTargetPatternElement build() {
			checkPreconditions();
			
			ImperativeTargetPatternElement ret = new ImperativeTargetPatternElement();
			ret.setName(fName);
			ret.setIn(fIn);
			ret.setOperation(fOperation);
			return ret;
			
		}
	}
}
