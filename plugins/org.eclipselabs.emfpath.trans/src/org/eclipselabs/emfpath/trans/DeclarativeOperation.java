package org.eclipselabs.emfpath.trans;

import com.google.common.base.Function;


public abstract class DeclarativeOperation<F, T> implements Function<F, T> {

	private IResolver fResolver;

	public IResolver resolver() {
		return this.fResolver;
	}
	
	void setResolver(IResolver resolver) {
		this.fResolver = resolver;
	}
}
