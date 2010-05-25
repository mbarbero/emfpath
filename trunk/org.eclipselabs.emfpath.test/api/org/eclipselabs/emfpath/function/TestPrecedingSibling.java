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

import static org.eclipselabs.emfpath.function.EObjects.precedingSibling;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.operation.EGet;
import org.junit.Test;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public class TestPrecedingSibling extends AbstractTestNavigation {

	@Test
	public void testOf() {
		EObject node = theTree.eContents().get(0).eContents().get(1).eContents().get(1).eContents().get(2);

		assertEquals("n223", EGet.<String> feature("name").of(node));

		List<String> expected = Lists.newArrayList("n221", "n222");
		Iterable<String> actual = Iterables.transform(precedingSibling.of(node), EGet.<String> feature("name"));

		assertTrue(Iterables.elementsEqual(expected, actual));
	}

	@Test
	public void testOf2() {
		EObject node = theTree.eContents().get(0).eContents().get(1);

		assertEquals("n2", EGet.<String> feature("name").of(node));

		List<String> expected = Lists.newArrayList("n1");
		Iterable<String> actual = Iterables.transform(precedingSibling.of(node), EGet.<String> feature("name"));

		assertTrue(Iterables.elementsEqual(expected, actual));
	}

	@Test
	public void testOf3() {
		EObject node = theTree.eContents().get(0).eContents().get(1).eContents().get(0);

		assertEquals("n21", EGet.<String> feature("name").of(node));

		assertTrue(Iterables.isEmpty(precedingSibling.of(node)));
	}

}
