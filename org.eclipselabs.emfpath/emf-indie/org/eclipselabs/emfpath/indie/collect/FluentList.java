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
package org.eclipselabs.emfpath.indie.collect;

import java.util.List;

import com.google.common.base.Function;

/**
 * @author mbarbero
 * @param <T>
 */
public interface FluentList<T> extends FluentCollection<T>, List<T> {

	FluentList<T> subList(int fromIndex, int toIndex);

	FluentList<List<T>> partition(int size);

	<V> FluentList<V> transform(Function<? super T, ? extends V> function);

	/**
	 * @return
	 */
	FluentList<T> reverse();
}
