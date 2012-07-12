package org.eclipselabs.emfpath.trans.engine.imperative;

import org.eclipselabs.emfpath.trans.engine.resolver.ILinkerResolver;

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
