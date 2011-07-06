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
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipselabs.emfpath.operation.EAdd;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Lists;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestAdd {

	private static Library lib;
	private static Book b1, b2;
	
	@BeforeClass
	public static void beforeClass() {
		lib = EXTLibraryFactory.eINSTANCE.createLibrary();
		b1 = EXTLibraryFactory.eINSTANCE.createBook();
		b2 = EXTLibraryFactory.eINSTANCE.createBook();
		b1.setTitle("Les cigarres du pharaon");
		b2.setTitle("Le lotus bleu");
	}
	
	@Test
	public void testToFeatureString() {
		EAdd.toFeature("books").value(b1).of(lib);	
		EAdd.toFeature("books").value(b2).of(lib);
		assertTrue(lib.getBooks().contains(b1));
		assertTrue(lib.getBooks().contains(b2));
		assertEquals(b1, lib.getBooks().get(0));
		assertEquals(b2, lib.getBooks().get(1));
	}

	@Test
	public void testToFeatureEStructuralFeature() {
		EAdd.toFeature(EXTLibraryPackage.Literals.LIBRARY__BOOKS).value(b1).of(lib);	
		EAdd.toFeature(EXTLibraryPackage.Literals.LIBRARY__BOOKS).value(b2).of(lib);
		assertTrue(lib.getBooks().contains(b1));
		assertTrue(lib.getBooks().contains(b2));
		assertEquals(b1, lib.getBooks().get(0));
		assertEquals(b2, lib.getBooks().get(1));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNoToFeatureString() {
		EAdd.toFeature("books_").value(b1).of(lib);	
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNoToFeatureEStructuralFeature() {
		EAdd.toFeature(EXTLibraryPackage.Literals.BOOK__AUTHOR).value(b1).of(lib);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2NoToFeatureEStructuralFeature() {
		EAdd.toFeature(EXTLibraryPackage.Literals.WRITER__BOOKS).value(b1).of(lib);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalNoToFeatureEStructuralFeature() {
		EAdd.toFeature(EXTLibraryPackage.Literals.BOOK__AUTHOR);	
	}
	
	@Test(expected=ArrayStoreException.class)
	public void testAddCollection() {
		EAdd.toFeature("books").value(Lists.newArrayList(b1, b2)).of(lib);
	}
}
