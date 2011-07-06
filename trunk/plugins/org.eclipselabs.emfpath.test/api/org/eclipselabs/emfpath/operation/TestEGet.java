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
import org.eclipselabs.emfpath.operation.EGet;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestEGet {

	private static Employee e1;
	private static Employee e2;
	
	@BeforeClass
	public static void beforeClass() {
		e1 = EXTLibraryFactory.eINSTANCE.createEmployee();
		e2 = EXTLibraryFactory.eINSTANCE.createEmployee();
		
		e1.setFirstName("Anakin");
		e1.setLastName("Skywalker");
		e1.setAddress("Tatooine");
		
		e2.setFirstName("Darth");
		e2.setLastName("Sidious");
		e2.setAddress("Death Star");
		
		e1.setManager(e2);
	}
	
	@Test
	public void testFeatureString() {
		assertEquals("Anakin", EGet.feature("firstName").of(e1));
		assertEquals("Darth", EGet.feature("firstName").of(e2));
		
		assertEquals(e2, EGet.feature("manager").of(e1));
		assertEquals(null, EGet.feature("manager").of(e2));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalFeatureString() {
		assertEquals("Anakin", EGet.feature("firstName_").of(e1));
	}

	@Test
	public void testEStructuralFeature() {
		assertEquals("Anakin", EGet.feature(EXTLibraryPackage.Literals.PERSON__FIRST_NAME).of(e1));
		assertEquals("Darth", EGet.feature(EXTLibraryPackage.Literals.PERSON__FIRST_NAME).of(e2));
		
		assertEquals(e2, EGet.feature(EXTLibraryPackage.Literals.EMPLOYEE__MANAGER).of(e1));
		assertEquals(null, EGet.feature(EXTLibraryPackage.Literals.EMPLOYEE__MANAGER).of(e2));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalEStructuralFeature() {
		assertEquals("Anakin", EGet.feature(EXTLibraryPackage.Literals.AUDIO_VISUAL_ITEM__DAMAGED).of(e1));
	}

}
