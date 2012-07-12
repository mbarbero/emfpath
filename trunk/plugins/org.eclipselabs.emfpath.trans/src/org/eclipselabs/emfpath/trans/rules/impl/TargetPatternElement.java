package org.eclipselabs.emfpath.trans.rules.impl;

import org.eclipselabs.emfpath.trans.rules.ITargetPatternElement;

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

	protected void setName(String name) {
		fName = name;
	}

	protected void setIn(String in) {
		fIn = in;
	}

	public static abstract class Builder {
		
		protected String fName;
		protected String fIn;

		protected Builder(String name) {
			fName = name;
		}
		
		public Builder in(String name) {
			fIn = name;
			return this;
		}
		
		public abstract ITargetPatternElement build();

		protected void checkPreconditions() {
			Preconditions.checkState(!Strings.isNullOrEmpty(fName));
			Preconditions.checkState(!Strings.isNullOrEmpty(fIn));
		}
	}
}
