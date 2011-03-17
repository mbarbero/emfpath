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
package org.eclipselabs.emfpath.exception;

import java.io.Serializable;

/**
 * A {@link NotFoundException} is an EMFPath specific exception to force users to handle possible null returned values.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.3
 */
public class NotFoundException extends EMFPathException {

	/**
	 * The serialVersionUID long to make {@link Serializable} extremists happy ;)
	 */
	private static final long serialVersionUID = 7258280794142269843L;

	/**
	 * Instantiate a new exception with the given <code>message</code>
	 * 
	 * @param message the message of this exception
	 */
	public NotFoundException(String message) {
		super(message);
	}

}
