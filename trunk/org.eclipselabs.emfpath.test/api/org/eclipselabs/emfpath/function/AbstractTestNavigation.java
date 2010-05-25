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
package org.eclipselabs.emfpath.function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfpath.test.Constants;
import org.eclipselabs.emfpath.util.Resources;
import org.junit.AfterClass;
import org.junit.BeforeClass;


/**
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a> 
 *
 */
public class AbstractTestNavigation {
	
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
}
