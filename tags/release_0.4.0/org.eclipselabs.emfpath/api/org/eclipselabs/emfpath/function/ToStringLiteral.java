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
package org.eclipselabs.emfpath.function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/**
 * Function that uses standard EMF mechanism to create a {@link String} literal from an instance of an {@link EDataType}
 * .
 * <p>
 * The {@link #apply(Object)} method calls {@link EcoreUtil#convertToString(EDataType, Object)}.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public class ToStringLiteral implements Function<Object, String> {

	private EDataType eDataType;

	private ToStringLiteral(EDataType eDataType) {
		Preconditions.checkNotNull(eDataType);
		this.eDataType = eDataType;
	}

	/**
	 * Creates a new {@link Function} that will be able to serialize instances of the
	 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
	 * 
	 * @param eAttribute the {@link String}s created with this {@link Function} will be serialization of the type of
	 *        this {@link EAttribute}.
	 * @return a new {@link Function}
	 */
	public static ToStringLiteral type(EAttribute eAttribute) {
		Preconditions.checkNotNull(eAttribute);
		ToStringLiteral ret = new ToStringLiteral(eAttribute.getEAttributeType());
		return ret;
	}

	/**
	 * Creates a new {@link Function} that will be able to serialize instances of the given {@link EDataType}.
	 * 
	 * @param eDataType the {@link String}s created with this {@link Function} will be serialization of this
	 *        {@link EDataType}.
	 * @return a new {@link Function}
	 */
	public static ToStringLiteral type(EDataType eDataType) {
		Preconditions.checkNotNull(eDataType);
		ToStringLiteral ret = new ToStringLiteral(eDataType);
		return ret;
	}

	/**
	 * Synonym of {@link #apply(Object)}.
	 * 
	 * @param from the source object.
	 * @return the resulting object.
	 */
	public String convert(Object from) {
		return EcoreUtil.convertToString(this.eDataType, from);
	}

	public String apply(Object from) {
		return EcoreUtil.convertToString(this.eDataType, from);
	}
}
