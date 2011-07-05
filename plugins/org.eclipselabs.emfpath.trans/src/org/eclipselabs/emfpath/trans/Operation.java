package org.eclipselabs.emfpath.trans;

import com.google.common.base.Function;


public abstract class Operation<F, T> implements Function<F, T> {

	private ILinkerResolver fResolver;

	public ILinkerResolver resolver() {
		return this.fResolver;
	}
	
	void setResolver(ILinkerResolver resolver) {
		this.fResolver = resolver;
	}
}
