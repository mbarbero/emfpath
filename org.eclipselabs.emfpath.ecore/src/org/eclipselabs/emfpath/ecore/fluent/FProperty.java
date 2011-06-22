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
package org.eclipselabs.emfpath.ecore.fluent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipselabs.emfpath.indie.collect.IFluentIterable;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public interface FProperty {

	/**
	 * @return
	 */
	Object value();

	/**
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	<T> T value(Class<T> clazz);

	/**
	 * @return
	 */
	String asString();

	/**
	 * @return
	 */
	int asInt();

	/**
	 * @return
	 */
	boolean asBoolean();

	/**
	 * @return
	 */
	long asLong();

	/**
	 * @return
	 */
	double asDouble();

	/**
	 * @return
	 */
	float asFloat();

	/**
	 * @return
	 */
	short asShort();

	/**
	 * @return
	 */
	char asChar();

	/**
	 * @return
	 */
	FObject<EObject> asFObject();
	
	<E extends EObject> FObject<E> asFObject(Class<E> type);

	/**
	 * @return
	 */
	IFluentIterable<?> asIterable();

	<T> IFluentIterable<T> asIterable(Class<T> elementType);

	/**
	 * @return
	 */
	FIterable<? extends EObject> asFIterable();
	
	<T extends EObject> FIterable<T> asFIterable(Class<T> elementType);

	/**
	 * @return
	 */
	boolean isUndefined();

	/**
	 * @return
	 */
	boolean isInvalid();

	/**
	 * @return
	 */
	EStructuralFeature eStructuralFeature();

	/**
	 * @return
	 */
	EObject eObject();


	public static class UndefinedPropertyException extends UnsupportedOperationException {

		/**
		 * 
		 */
		private static final long serialVersionUID = -4883644420638907526L;

		/**
		 * 
		 */
		public UndefinedPropertyException() {
			super();
		}
	}
	
	public static class InvalidPropertyException extends UnsupportedOperationException {

		/**
		 * 
		 */
		private static final long serialVersionUID = -8466242289526997219L;

		/**
		 * 
		 */
		public InvalidPropertyException() {
			super();
		}
	}
}
