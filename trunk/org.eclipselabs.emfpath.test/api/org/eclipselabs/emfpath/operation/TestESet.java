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
package org.eclipselabs.emfpath.operation;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Employee;
import org.eclipselabs.emfpath.operation.ESet;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestESet {

	private static Employee e1;
	
	@BeforeClass
	public static void beforeClass() {
		e1 = EXTLibraryFactory.eINSTANCE.createEmployee();
	}
	
	@Test
	public void testFeatureString() {
		ESet.feature("firstName").withValue("Anakin").apply(e1);
		assertEquals("Anakin", e1.eGet(EXTLibraryPackage.Literals.PERSON__FIRST_NAME));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalFeatureString() {
		ESet.feature("firstName_").withValue("Anakin").apply(e1);
	}

	@Test
	public void testEStructuralFeature() {
		ESet.feature(EXTLibraryPackage.Literals.PERSON__FIRST_NAME).withValue("Anakin").apply(e1);
		assertEquals("Anakin", e1.eGet(EXTLibraryPackage.Literals.PERSON__FIRST_NAME));
	}
	
}
