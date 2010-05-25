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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.test.Constants;
import org.eclipselabs.emfpath.util.EPackages;
import org.eclipselabs.emfpath.util.Resources;
import org.junit.Before;
import org.junit.Test;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class TestResources {

	private ResourceSet resourceSet;
	private Resource resource;
	
	@Before 
	public void beforeTest() {
		resourceSet = new ResourceSetImpl();
		Resources.initResourceSet(resourceSet);
		resource = resourceSet.getResource(URI.createURI(TestResources.class.getClassLoader().getResource(Constants.EXTLIBRARY_ECORE_FILE).toString()), true);
	}
	
	@Test
	public void testInitResourceSet() {
		assertTrue(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey(Resource.Factory.Registry.DEFAULT_EXTENSION));
		assertTrue(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("ecore"));
		assertTrue(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("emof"));
		
		assertTrue(resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().containsKey(Resource.Factory.Registry.DEFAULT_CONTENT_TYPE_IDENTIFIER));
		assertTrue(resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().containsKey(EcorePackage.eCONTENT_TYPE));
		assertTrue(resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().containsKey(EMOFExtendedMetaData.CONTENT_TYPE));
		
		assertTrue(resourceSet.getPackageRegistry().containsKey(EcorePackage.eNS_URI));
	}

	@Test
	public void testReloadEPackagesFrom() throws NotFoundException {
		Resources.registerEPackagesFrom(resource);
		assertTrue(resourceSet.getPackageRegistry().getEPackage(EXTLibraryPackage.eNS_URI).getName().equals(EXTLibraryPackage.eNAME));
		
		EPackage ePkg = EPackages.from(resourceSet).withName("extlibrary");
		ePkg.setName(EXTLibraryPackage.eNAME + "__");
		
		Resources.reloadEPackagesFrom(resource);
		assertTrue(resourceSet.getPackageRegistry().getEPackage(EXTLibraryPackage.eNS_URI).getName().equals(EXTLibraryPackage.eNAME + "__"));
	}

	@Test
	public void testRegisterEPackagesFrom() {
		Resources.registerEPackagesFrom(resource);
		assertTrue(resourceSet.getPackageRegistry().containsKey(EXTLibraryPackage.eNS_URI));
	}

	@Test
	public void testUnregisterEPackagesFrom() {
		Resources.registerEPackagesFrom(resource);
		assertTrue(resourceSet.getPackageRegistry().containsKey(EXTLibraryPackage.eNS_URI));
		
		Resources.unregisterEPackagesFrom(resource);
		assertFalse(resourceSet.getPackageRegistry().containsKey(EXTLibraryPackage.eNS_URI));
	}

}
