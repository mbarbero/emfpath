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

import static org.eclipselabs.emfpath.base.EObjects.descendant;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.operation.EGet;
import org.junit.Test;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public class TestDescendant extends AbstractTestNavigation {

	@Test
	public void testOf() {
		EObject node = theTree.eContents().get(0).eContents().get(0);

		assertEquals("n1", EGet.<String> feature("name").of(node));

		List<String> expected = Lists.newArrayList("n11", "n111", "n112",
			"n113", "n12", "n121", "n122", "n123", "n13", "n131", "n132",
		"n133");
		Iterable<String> actual = Iterables.transform(descendant.of(node), EGet
			.<String> feature("name"));

		assertTrue(Iterables.elementsEqual(expected, actual));
	}

	@Test
	public void testOf2() {
		EObject node = theTree.eContents().get(0).eContents().get(1)
		.eContents().get(1).eContents().get(2);
		assertEquals("n223", EGet.<String> feature("name").of(node));

		List<String> expected = Lists.newArrayList();

		assertTrue(Iterables.elementsEqual(expected, descendant.of(node)));
	}

	@Test
	public void testOf3() {
		assertEquals("myTree", EGet.<String> feature("name").of(theTree));

		List<String> expected = Lists.newArrayList("root", "n1", "n11", "n111",
			"n112", "n113", "n12", "n121", "n122", "n123", "n13", "n131",
			"n132", "n133",

			"n2", "n21", "n211", "n212", "n213", "n22", "n221", "n222",
			"n223", "n23", "n231", "n232", "n233",

			"n3", "n31", "n311", "n312", "n313", "n32", "n321", "n322",
			"n323", "n33", "n331", "n332", "n333");
		Iterable<String> actual = Iterables.transform(descendant.of(theTree),
			EGet.<String> feature("name"));

		assertTrue(Iterables.elementsEqual(expected, actual));
	}
}
