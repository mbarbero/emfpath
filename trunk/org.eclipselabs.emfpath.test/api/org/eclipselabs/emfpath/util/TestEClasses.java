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
package org.eclipselabs.emfpath.util;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfpath.base.EClasses;
import org.eclipselabs.emfpath.base.EPackages;
import org.eclipselabs.emfpath.base.Resources;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.test.Constants;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public class TestEClasses {

	private static ResourceSet resourceSet;

	@BeforeClass
	public static void beforeClass() {
		resourceSet = new ResourceSetImpl();
		Resource resource;

		Resources.initResourceSet(resourceSet);
		resource = resourceSet.getResource(URI.createURI(TestEClasses.class.getClassLoader().getResource(Constants.EXTLIBRARY_ECORE_FILE).toString()), true);
		Resources.registerEPackagesFrom(resource);
		resource = resourceSet.getResource(URI.createURI(TestEClasses.class.getClassLoader().getResource(Constants.SUB_PKG_ECORE_FILE).toString()), true);
		Resources.registerEPackagesFrom(resource);
	}

	@Test
	public void testFromEPackage() throws NotFoundException {
		assertEquals("cd1", EClasses.from(EPackages.from(resourceSet).withFullyQualifiedName("a.b.d")).forName("cd1").getName());
		assertEquals("cb2", EClasses.from(EPackages.from(resourceSet).withFullyQualifiedName("a.b")).forName("cb2").getName());
	}

	@Test(expected=NotFoundException.class)
	public void testFromEPackage2() throws NotFoundException {
		assertEquals("cd1", EClasses.from(EPackages.from(resourceSet).withFullyQualifiedName("a")).forName("cd1").getName());
	}


	@Test(expected=NotFoundException.class)
	public void testFromEPackage3() throws NotFoundException {
		assertEquals("ce2", EClasses.from(EPackages.from(resourceSet).withFullyQualifiedName("a.b")).forName("ce2").getName());
	}

	@Test
	public void testFromResourceSet() throws NotFoundException {
		assertEquals("cd1", EClasses.from(resourceSet).forName("a.b.d.cd1").getName());
		assertEquals("cb2", EClasses.from(resourceSet).forName("a.b.cb2").getName());
	}

	@Test
	public void testFromResourceSet2() throws NotFoundException {
		assertEquals("cd1", EClasses.from(resourceSet).separator("#").forName("a#b#d#cd1").getName());
		assertEquals("cb2", EClasses.from(resourceSet).separator("#").forName("a#b#cb2").getName());
	}
}
