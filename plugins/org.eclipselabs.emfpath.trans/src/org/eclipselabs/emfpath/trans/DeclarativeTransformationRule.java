package org.eclipselabs.emfpath.trans;

import com.google.common.base.Preconditions;


public final class DeclarativeTransformationRule implements IDeclarativeTransformationRule {

	private IDeclarativeTargetPattern fTargetPattern;
	
	private ISourcePattern fSourcePattern;

	DeclarativeTransformationRule() {
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ITransformationRule#sourcePattern()
	 */
	public ISourcePattern sourcePattern() {
		return fSourcePattern;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.emfpath.trans.ITransformationRule#targetPattern()
	 */
	public IDeclarativeTargetPattern targetPattern() {
		return fTargetPattern;
	}

	void setTargetPattern(IDeclarativeTargetPattern targetPattern) {
		fTargetPattern = targetPattern;
	}
	
	void setSourcePattern(ISourcePattern sourcePattern) {
		fSourcePattern = sourcePattern;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		
		private IDeclarativeTargetPattern fTargetPattern;
		
		private ISourcePattern fSourcePattern;
		
		Builder() {
		}
		
		public Builder inPattern(ISourcePattern pattern) {
			fSourcePattern = pattern;
			return this;
		}
		
		public Builder outPattern(IDeclarativeTargetPattern outPattern) {
			fTargetPattern = outPattern;
			return this;
		}
		
		public DeclarativeTransformationRule build() {
			Preconditions.checkState(fTargetPattern != null);
			Preconditions.checkState(fSourcePattern != null);

			DeclarativeTransformationRule ret = new DeclarativeTransformationRule();
			ret.setSourcePattern(fSourcePattern);
			ret.setTargetPattern(fTargetPattern);
			return ret;
		}
	}
}
