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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipselabs.emfpath.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.util.EReferences;
import org.eclipselabs.emfpath.util.Resources;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestEReferences {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	@BeforeClass
	public static void beforeClass() {
		resourceSet = new ResourceSetImpl();
		Resources.initResourceSet(resourceSet);
		resourceSet.getPackageRegistry().put(EXTLibraryPackage.eNS_URI,
				EXTLibraryPackage.eINSTANCE);
	}

	@Test
	public void testFromEClass() throws NoSuchFeatureException {
		assertEquals(EXTLibraryPackage.Literals.EMPLOYEE__MANAGER, EReferences
				.from(EXTLibraryPackage.Literals.EMPLOYEE).named("manager"));
	}

	@Test(expected=ClassCastException.class)
	public void testAttributeFromEClass() throws NoSuchFeatureException {
		EReferences.from(EXTLibraryPackage.Literals.EMPLOYEE).named(
				"firstName");
	}
	
	@Test(expected=NoSuchFeatureException.class)
	public void testIllegalFromEClass() throws NoSuchFeatureException {
		EReferences.from(EXTLibraryPackage.Literals.EMPLOYEE).named(
				"manager_");
	}
}
