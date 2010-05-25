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

package org.eclipselabs.emfpath.indie.predicate;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.ImmutableList;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public class TestContains {

	static List<String> mock;

	@BeforeClass
	public static void beforeClass() {
		TestContains.mock = ImmutableList.of("e1", "e2", "e3", "e4"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	@Test
	public void testAtLeastPositive() {
		Assert.assertTrue(Contains.atLeast(-1).elementsIn(TestContains.mock));
		Assert.assertTrue(Contains.atLeast(0).elementsIn(TestContains.mock));
		Assert.assertTrue(Contains.atLeast(2).elementsIn(TestContains.mock));
		Assert.assertTrue(Contains.atLeast(4).elementsIn(TestContains.mock));
	}

	@Test
	public void testAtLeastNegative() {
		Assert.assertFalse(Contains.atLeast(5).elementsIn(TestContains.mock));
		Assert.assertFalse(Contains.atLeast(6).elementsIn(TestContains.mock));
	}

	@Test
	public void testAtMostNegative() {
		Assert.assertFalse(Contains.atMost(-1).elementsIn(TestContains.mock));
		Assert.assertFalse(Contains.atMost(0).elementsIn(TestContains.mock));
		Assert.assertFalse(Contains.atMost(2).elementsIn(TestContains.mock));
		Assert.assertFalse(Contains.atMost(4).elementsIn(TestContains.mock));
	}

	@Test
	public void testAtMostPositive() {
		Assert.assertTrue(Contains.atMost(5).elementsIn(TestContains.mock));
		Assert.assertTrue(Contains.atMost(6).elementsIn(TestContains.mock));
		Assert.assertTrue(Contains.atMost(7).elementsIn(TestContains.mock));
	}
}
