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

import static org.eclipselabs.emfpath.function.EObjects.parent;
import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.operation.EGet;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public class TestParent extends AbstractTestNavigation {

	@Test
	public void testOf() {
		EObject node = theTree.eContents().get(0).eContents().get(0);

		assertEquals("n1", EGet.<String> feature("name").of(node));

		assertEquals("root", EGet.<String> feature("name").of(parent.of(node)));
	}

	@Test
	public void testOf2() {
		EObject node = theTree.eContents().get(0).eContents().get(1).eContents()
		.get(1).eContents().get(2);
		assertEquals("n223", EGet.<String> feature("name").of(node));

		assertEquals("n22", EGet.<String> feature("name").of(parent.of(node)));
	}

	@Test
	public void testOf3() {
		assertEquals("myTree", EGet.<String> feature("name").of(theTree));

		assertEquals(null, parent.of(theTree));
	}
}
