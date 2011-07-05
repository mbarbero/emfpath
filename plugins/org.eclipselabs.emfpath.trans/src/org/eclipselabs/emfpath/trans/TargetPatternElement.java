package org.eclipselabs.emfpath.trans;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public abstract class TargetPatternElement implements ITargetPatternElement {

	private String fName;
	private String fIn; 
	
	public String name() {
		return fName;
	}

	public String in() {
		return fIn;
	}

	void setName(String name) {
		fName = name;
	}

	void setIn(String in) {
		fIn = in;
	}

	public static abstract class Builder {
		
		String fName;
		String fIn;

		Builder(String name) {
			fName = name;
		}
		
		public Builder in(String name) {
			fIn = name;
			return this;
		}
		
		public abstract ITargetPatternElement build();

		void checkPreconditions() {
			Preconditions.checkState(!Strings.isNullOrEmpty(fName));
			Preconditions.checkState(!Strings.isNullOrEmpty(fIn));
		}
	}
}
