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
package org.eclipselabs.emfpath.predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfpath.function.TestFollowingSibling;
import org.eclipselabs.emfpath.operation.EAdd;
import org.eclipselabs.emfpath.operation.ESet;
import org.eclipselabs.emfpath.predicate.EIsSet;
import org.eclipselabs.emfpath.test.Constants;
import org.eclipselabs.emfpath.util.Resources;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestEIsSet {

	static EObject theTree;
	static Resource metamodel;

	@BeforeClass
	public static void beforeClass() {
		ResourceSet resourceSet = new ResourceSetImpl();

		Resources.initResourceSet(resourceSet);
		metamodel = resourceSet.getResource(URI
				.createURI(TestFollowingSibling.class.getClassLoader()
						.getResource(Constants.TREE_ECORE_FILE).toString()),
				true);
		Resources.registerEPackagesFrom(metamodel);

		Resource sampleTree = resourceSet.getResource(
				URI
						.createURI(TestFollowingSibling.class.getClassLoader()
								.getResource(Constants.SAMPLE_TREE_XMI_FILE)
								.toString()), true);
		theTree = sampleTree.getContents().get(0);
	}

	@AfterClass
	public static void afterClass() {
		Resources.unregisterEPackagesFrom(metamodel);
	}

	@Test
	public void testEIsSet() {
		EObject node = theTree.eContents().get(0);
		assertFalse(EIsSet.feature("anAttribute").of(node));
		assertFalse(EIsSet.feature("anAttribute2").of(node));
		assertFalse(EIsSet.feature("anAttribute3").of(node));
		assertFalse(EIsSet.feature("anAttribute4").of(node));
	}
	@Test
	public void testEIsSet2() {
		EObject node = theTree.eContents().get(0);
		ESet.feature("anAttribute").withValue(5).apply(node);
		ESet.feature("anAttribute2").withValue(5).apply(node);
		ESet.feature("anAttribute3").withValue(5).apply(node);
		ESet.feature("anAttribute4").withValue(5).apply(node);
		assertTrue(EIsSet.feature("anAttribute").of(node));
		assertTrue(EIsSet.feature("anAttribute2").of(node));
		assertTrue(EIsSet.feature("anAttribute3").of(node));
		assertTrue(EIsSet.feature("anAttribute4").of(node));
	}
	
	@Test
	public void testEIsSet3() {
		EObject node = theTree.eContents().get(0);
		assertFalse(EIsSet.feature("aReference").of(node));
	}
	@Test
	public void testEIsSet4() {
		EObject node = theTree.eContents().get(0);
		EObject subNode = node.eContents().get(0);
		EAdd.toFeature("aReference").value(subNode).apply(node);
		assertTrue(EIsSet.feature("aReference").of(node));
	}
}
