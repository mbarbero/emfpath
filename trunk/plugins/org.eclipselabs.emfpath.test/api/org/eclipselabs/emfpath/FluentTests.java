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
package org.eclipselabs.emfpath;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipselabs.emfpath.ecore.fluent.FIterable;
import org.eclipselabs.emfpath.ecore.fluent.FObject;
import org.eclipselabs.emfpath.ecore.fluent.FObjects;
import org.eclipselabs.emfpath.ecore.path.EClasses;
import org.eclipselabs.emfpath.ecore.path.ENamedElements;
import org.eclipselabs.emfpath.ecore.path.EObjects;
import org.eclipselabs.emfpath.ecore.path.EPackages;
import org.eclipselabs.emfpath.indie.collect.FluentIterable;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 *
 */
public class FluentTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EAttribute e = EcoreFactory.eINSTANCE.createEAttribute();
		e.setName("titi");
		System.out.println(FObjects.create(e).fGet("name").asString());


		Iterable<EClassifier> asList = FObjects.create(EcorePackage.eINSTANCE).fGet(EcorePackage.Literals.EPACKAGE__ECLASSIFIERS).asIterable(EClassifier.class);
		System.out.println(Joiner.on("\n").join(asList));


		FluentIterable<String> asString = FObjects.create(EcorePackage.eINSTANCE).
				fGet(EcorePackage.Literals.EPACKAGE__ECLASSIFIERS).asFIterable(EClassifier.class).
				fGet(EcorePackage.Literals.ENAMED_ELEMENT__NAME).asStrings();

		System.out.println(Joiner.on("\n").join(asString));

		FIterable<EAttribute> asEIterable = FObjects.create(EcorePackage.eINSTANCE).
				fGet(EcorePackage.Literals.EPACKAGE__ECLASSIFIERS).asFIterable(EClass.class).
				fGet(EcorePackage.Literals.ECLASS__EALL_ATTRIBUTES).asFIterable(EAttribute.class);

		System.out.println(Joiner.on("\n").join(asEIterable));

		FluentIterable<String> allNames = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).
				fGet("eAllAttributes").asFIterable(EAttribute.class).fGet("name").asStrings();

		System.out.println(Joiner.on("\n").join(allNames));

		EAttribute containerAttribute = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).
fGet("eAllAttributes").asFIterable(EAttribute.class).find(EObjects.having("name", Predicates.equalTo("container")));

		System.out.println(containerAttribute);

		FluentIterable<FIterable<EObject>> transformToEFluent = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetFIterables(EObjects.precedingSibling);

		FluentIterable<FluentIterable<EObject>> transformToEFluent2 = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetIterables(EObjects.precedingSibling);

		FIterable<EObject> transformToEFluent3 = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetFIterable(EObjects.precedingSibling);

		FluentIterable<FIterable<EAttribute>> transformToEFluent4 = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetFIterables(EClasses.eAllAttributes);

		FluentIterable<FluentIterable<EAttribute>> transformToEFluent5 = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetIterables(EClasses.eAllAttributes);

		FIterable<EAttribute> transformToEFluent6 = FObjects.create(EcorePackage.eINSTANCE).
				fGet("eClassifiers").asFIterable(EClass.class).fGetFIterable(EClasses.eAllAttributes);

		System.out.println(Joiner.on("\n=>").join(transformToEFluent6.fGet("name").asStrings()));

		FIterable<EClass> filter = FObjects.create(EcorePackage.eINSTANCE).fGet("eClassifiers").asFIterable(EClass.class).eFilter(EClass.class);
		System.out.println(filter);
		FIterable<EClass> filter2 = FObjects.create(EcorePackage.eINSTANCE).fGet("eClassifiers").asFIterable(EClass.class).filter(EClasses.isAbstract);
		System.out.println(filter2);

		EList<EClassifier> eListEClassifier = FObjects.create(EcorePackage.eINSTANCE).fGet(EPackages.eClassifiers);
		System.out.println(eListEClassifier);
		FluentIterable<EClassifier> eFluentIterableEClassifier = FObjects.create(EcorePackage.eINSTANCE).fGetIterable(EPackages.eClassifiers);
		System.out.println(eFluentIterableEClassifier);
		FIterable<EClassifier> eFluentEIterableEClassifier = FObjects.create(EcorePackage.eINSTANCE).fGetFIterable(EPackages.eClassifiers);
		System.out.println(eFluentEIterableEClassifier);

		FIterable<EClass> eFilter = FObjects.create(EcorePackage.eINSTANCE).fGetFIterable(EPackages.eClassifiers).eFilter(EClass.class);
		FluentIterable<String> names = eFilter.transform(ENamedElements.name);

		FIterable<EAnnotation> eAnnotatiosn = eFilter.fGetFIterable(EClasses.eAnnotations);

		FIterable<EObject> eAllContents = FObjects.create(EcorePackage.eINSTANCE).fGetFIterable(EObjects.descendant);
		FObject<EcorePackage> e1 = FObjects.create(EcorePackage.eINSTANCE);
		FObject<EcorePackage> e2 = FObjects.create(e1);
		FObject<EObject> e3 = FObjects.create((EObject)e1);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
