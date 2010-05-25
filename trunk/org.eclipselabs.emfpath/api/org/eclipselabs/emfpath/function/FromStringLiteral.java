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
 * Function that uses standard EMF mechanism to create an instance of an {@link EDataType} from a {@link String}
 * literal.
 * <p>
 * The {@link #apply(String)} method calls {@link EcoreUtil#createFromString(EDataType, String)}.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public class FromStringLiteral implements Function<String, Object> {

	private EDataType eDataType;

	private FromStringLiteral(EDataType eDataType) {
		Preconditions.checkNotNull(eDataType);
		this.eDataType = eDataType;
	}

	/**
	 * Creates a new {@link Function} that will be able to create instances of the
	 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
	 * 
	 * @param eAttribute the {@link Object}s created with this {@link Function} will be instance of the type of this
	 *        {@link EAttribute}.
	 * @return a new {@link Function}
	 */
	public static FromStringLiteral ofType(EAttribute eAttribute) {
		Preconditions.checkNotNull(eAttribute);
		FromStringLiteral ret = new FromStringLiteral(eAttribute.getEAttributeType());
		return ret;
	}

	/**
	 * Creates a new {@link Function} that will be able to create instances of the given {@link EDataType}.
	 * 
	 * @param eDataType the {@link Object}s created with this {@link Function} will be instance of this
	 *        {@link EDataType}.
	 * @return a new {@link Function}
	 */
	public static FromStringLiteral ofType(EDataType eDataType) {
		Preconditions.checkNotNull(eDataType);
		FromStringLiteral ret = new FromStringLiteral(eDataType);
		return ret;
	}

	/**
	 * Synonym of {@link #apply(String)}.
	 * 
	 * @param from the source object.
	 * @return the resulting object.
	 */
	public Object creates(String from) {
		return this.apply(from);
	}

	public Object apply(String from) {
		return EcoreUtil.createFromString(this.eDataType, from);
	}
}
