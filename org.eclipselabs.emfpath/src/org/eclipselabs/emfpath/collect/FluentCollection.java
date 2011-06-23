/*******************************************************************************
 * Copyright (c) 2009, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfpath.collect;

import java.util.Collection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * @author mbarbero
 * @param <E>
 */
public interface FluentCollection<E> extends FluentIterable<E>, Collection<E> {

	/**
	 * @param function
	 * @return
	 * @see org.eclipselabs.emfpath.collect.FluentIterable#transform(com.google.common.base.Function)
	 */
	<T> FluentCollection<T> transform(Function<? super E, ? extends T> function);

	FluentCollection<E> filter(Predicate<? super E> predicate);
}
