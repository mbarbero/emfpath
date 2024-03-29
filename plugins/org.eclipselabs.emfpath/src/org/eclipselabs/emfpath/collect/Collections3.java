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

import com.google.common.base.Predicate;

/**
 * @author mbarbero
 *
 */
public final class Collections3 {

	/**
	 * @param o
	 * @return
	 */
	public static <E> Predicate<Collection<E>> contains(final Object o) {
		return new Predicate<Collection<E>>() {
			public boolean apply(Collection<E> input) {
				return input.contains(o);
			}
		};
	}


}
