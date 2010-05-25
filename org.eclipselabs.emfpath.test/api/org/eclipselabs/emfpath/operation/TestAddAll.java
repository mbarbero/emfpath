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

import java.util.List;

import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Library;
import org.eclipselabs.emfpath.operation.EAddAll;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Lists;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestAddAll {

	private static Library lib;
	private static Book b1, b2;
	private static List<Book> books;
	
	@BeforeClass
	public static void beforeClass() {
		lib = EXTLibraryFactory.eINSTANCE.createLibrary();
		b1 = EXTLibraryFactory.eINSTANCE.createBook();
		b2 = EXTLibraryFactory.eINSTANCE.createBook();
		b1.setTitle("Les cigarres du pharaon");
		b2.setTitle("Le lotus bleu");
		books = Lists.newArrayList();
		books.add(b1);
		books.add(b2);
	}
	
	@Test
	public void testToFeatureString() {
		EAddAll.toFeature("books").values(books).of(lib);
		assertTrue(lib.getBooks().contains(b1));
		assertTrue(lib.getBooks().contains(b2));
		assertEquals(b1, lib.getBooks().get(0));
		assertEquals(b2, lib.getBooks().get(1));
	}

	@Test
	public void testToFeatureEStructuralFeature() {
		EAddAll.toFeature(EXTLibraryPackage.Literals.LIBRARY__BOOKS).values(books).of(lib);	
		assertTrue(lib.getBooks().contains(b1));
		assertTrue(lib.getBooks().contains(b2));
		assertEquals(b1, lib.getBooks().get(0));
		assertEquals(b2, lib.getBooks().get(1));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNoToFeatureString() {
		EAddAll.toFeature("books_").values(books).of(lib);	
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNoToFeatureEStructuralFeature() {
		EAddAll.toFeature(EXTLibraryPackage.Literals.BOOK__AUTHOR).values(books).of(lib);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2NoToFeatureEStructuralFeature() {
		EAddAll.toFeature(EXTLibraryPackage.Literals.WRITER__BOOKS).values(books).of(lib);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalNoToFeatureEStructuralFeature() {
		EAddAll.toFeature(EXTLibraryPackage.Literals.BOOK__AUTHOR);	
	}
}
