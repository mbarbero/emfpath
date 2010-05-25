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
 * Default abstract EMFPath Exception
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.3
 */
public abstract class EMFPathException extends Exception {

	/**
	 * The serialVersionUID long to make {@link Serializable} extremists happy ;)
	 */
	private static final long serialVersionUID = 957937658657257746L;

	/**
	 * Create a new {@link EMFPathException} with the given <code>message</code>.
	 * 
	 * @param message the explanation message of this exception.
	 */
	public EMFPathException(String message) {
		super(message);
	}

	/**
	 * Create a new {@link EMFPathException} with the given <code>message</code> and the given <code>cause</code>.
	 * 
	 * @param message the explanation message of this exception.
	 * @param cause the cause of this exception.
	 */
	public EMFPathException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Create a new {@link EMFPathException} with the given <code>cause</code>.
	 * 
	 * @param cause the cause of this exception.
	 */
	public EMFPathException(Throwable cause) {
		super(cause);
	}

}
