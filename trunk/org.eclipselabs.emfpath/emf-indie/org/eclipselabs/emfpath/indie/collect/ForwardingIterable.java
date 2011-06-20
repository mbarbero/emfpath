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

import java.util.Iterator;

import com.google.common.collect.ForwardingObject;

/**
 * A simple {@link Iterable} that forwards all of its method call to its the delegating {@link Iterable}.
 * 
 * @param <T> the kind of element in the {@link Iterable}.
 * @since 0.3
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public abstract class ForwardingIterable<T> extends ForwardingObject implements Iterable<T> {

	@Override
	protected abstract Iterable<T> delegate();

	public Iterator<T> iterator() {
		return this.delegate().iterator();
	}
}
