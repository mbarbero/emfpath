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
import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
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
public class TestEPackages {

	private static ResourceSet resourceSet;

	@BeforeClass
	public static void beforeClass() {
		resourceSet = new ResourceSetImpl();
		Resource resource;

		Resources.initResourceSet(resourceSet);
		resource = resourceSet.getResource(URI.createURI(TestResources.class.getClassLoader().getResource(Constants.EXTLIBRARY_ECORE_FILE).toString()), true);
		Resources.registerEPackagesFrom(resource);
		resource = resourceSet.getResource(URI.createURI(TestResources.class.getClassLoader().getResource(Constants.SUB_PKG_ECORE_FILE).toString()), true);
		Resources.registerEPackagesFrom(resource);
	}

	@Test
	public void testWithNSUri() {
		try {
			assertEquals(EXTLibraryPackage.eNS_URI, EPackages.from(resourceSet).withNSUri(EXTLibraryPackage.eNS_URI).getNsURI());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testWithName() {
		try {
			assertEquals(EXTLibraryPackage.eNAME, EPackages.from(resourceSet).withName(EXTLibraryPackage.eNAME).getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testWithFullName() {
		try {
			assertEquals(EXTLibraryPackage.eNAME, EPackages.from(resourceSet).withFullyQualifiedName(EXTLibraryPackage.eNAME).getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
		try {
			assertEquals(EXTLibraryPackage.eNAME, EPackages.from(resourceSet).separator("#").withFullyQualifiedName(EXTLibraryPackage.eNAME).getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testWithFullName2() {
		try {
			assertEquals("d", EPackages.from(resourceSet).withFullyQualifiedName("a.b.d").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
		try {
			assertEquals("e", EPackages.from(resourceSet).withFullyQualifiedName("a.b.e").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
		try {
			assertEquals("c", EPackages.from(resourceSet).withFullyQualifiedName("a.c").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testWithFullName3() {
		try {
			assertEquals("d", EPackages.from(resourceSet).separator("#").withFullyQualifiedName("a#b#d").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
		try {
			assertEquals("e", EPackages.from(resourceSet).separator("#").withFullyQualifiedName("a#b#e").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
		try {
			assertEquals("c", EPackages.from(resourceSet).separator("#").withFullyQualifiedName("a#c").getName());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		}
	}

}
