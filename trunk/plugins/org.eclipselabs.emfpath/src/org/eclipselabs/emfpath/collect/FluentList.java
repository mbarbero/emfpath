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

import java.util.List;

import com.google.common.base.Function;

/**
 * @author mbarbero
 * @param <E>
 */
public interface FluentList<E> extends FluentCollection<E>, List<E> {

	FluentList<E> subList(int fromIndex, int toIndex);

	FluentList<List<E>> partition(int size);

	<T> FluentList<T> transform(Function<? super E, ? extends T> function);

	/**
	 * @return
	 */
	FluentList<E> reverse();
}
