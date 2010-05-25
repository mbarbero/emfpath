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

import static org.eclipselabs.emfpath.function.EObjects.ancestorOrSelf;
import static org.eclipselabs.emfpath.function.EObjects.descendant;

import java.util.Collection;
import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.indie.predicate.Equals;
import org.eclipselabs.emfpath.operation.EGet;
import org.eclipselabs.emfpath.predicate.Having;
import org.eclipselabs.emfpath.predicate.IsType;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;


/**
 * Set of utility methods to handle {@link EClass EClasses}.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @since 0.1.0
 */
public abstract class EClasses {

	/**
	 * 
	 */
	public static final String DEFAULT_FULL_NAME_SEPARATOR = EPackages.DEFAULT_FULL_NAME_SEPARATOR;

	/**
	 * @param ePackage
	 * @return
	 */
	public static EClasses from(EPackage ePackage) {
		Preconditions.checkArgument(ePackage != null, "ePackage cannot be null");
		return new FromEPackage(ePackage);
	}

	/**
	 * @param eResourceSet
	 * @return
	 */
	public static EClasses from(ResourceSet eResourceSet) {
		Preconditions.checkArgument(eResourceSet != null, "eResourceSet cannot be null");
		return new FromEPackageRegistry(eResourceSet.getPackageRegistry());
	}

	/**
	 * @param ePackageRegistry
	 * @return
	 */
	public static EClasses from(EPackage.Registry ePackageRegistry) {
		Preconditions.checkArgument(ePackageRegistry != null, "ePackageRegistry cannot be null");
		return new FromEPackageRegistry(ePackageRegistry);
	}

	/**
	 * 
	 */
	String separator = EClasses.DEFAULT_FULL_NAME_SEPARATOR;

	/**
	 * @param sep
	 * @return
	 */
	public EClasses separator(String sep) {
		Preconditions.checkArgument(sep != null, "sep cannot be null");
		Preconditions.checkArgument(sep.length() >= 0);
		this.separator = sep;
		return this;
	}

	/**
	 * @param fullyQualifiedName
	 * @return
	 * @throws NotFoundException
	 */
	public abstract EClass forName(String fullyQualifiedName) throws NotFoundException;

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 */
	static final class FromEPackage extends EClasses {

		private final EPackage ePackage;

		/**
		 * @param ePackage
		 */
		FromEPackage(EPackage ePackage) {
			this.ePackage = ePackage;
		}

		/**
		 * @param name
		 * @return
		 * @throws NotFoundException
		 */
		@Override
		public EClass forName(String name) throws NotFoundException {
			Preconditions.checkArgument(name != null, "name cannot be null");
			Preconditions.checkArgument(name.length() >= 0);

			EPackage currentEPackage = this.ePackage;
			String[] nameFragments = name.split(this.separator);
			for (int i = 0; i < nameFragments.length - 1; i++) {
				try {
					currentEPackage = Iterables.find(currentEPackage.getESubpackages(), Having.feature(
						EcorePackage.Literals.ENAMED_ELEMENT__NAME, Equals.to(nameFragments[i])));
				} catch (NoSuchElementException e) {
					throw new NotFoundException("Cannot find EPackage named " + nameFragments[i] + " as sub package of "
						+ EPackages.fullyQualifiedName(this.ePackage, this.separator));
				}
			}

			String eClassName = (nameFragments.length > 0 ? nameFragments[nameFragments.length - 1] : name);
			EClassifier eClassifier = currentEPackage.getEClassifier(eClassName);

			if ((eClassifier == null) || !(eClassifier instanceof EClass)) {
				throw new NotFoundException("Cannot find EClass named " + eClassName + " in EPackage "
					+ EPackages.fullyQualifiedName(currentEPackage, this.separator));
			}

			return (EClass) eClassifier;
		}
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 */
	static final class FromEPackageRegistry extends EClasses {

		private final EPackage.Registry ePackageRegistry;

		/**
		 * @param ePackageRegistry
		 */
		FromEPackageRegistry(EPackage.Registry ePackageRegistry) {
			this.ePackageRegistry = ePackageRegistry;
		}

		/**
		 * @param fullName
		 * @return
		 * @throws NotFoundException
		 */
		@Override
		@SuppressWarnings("unchecked")
		public EClass forName(final String fullName) throws NotFoundException {
			Preconditions.checkArgument(fullName != null, "fullName cannot be null");
			Preconditions.checkArgument(fullName.length() >= 0);

			Iterable<? extends EClass> allEClasses = (Iterable<? extends EClass>) Iterables.filter(Iterables.concat(Iterables.transform(
				(Collection<? extends EPackage>) this.ePackageRegistry.values(), descendant)), IsType
				.of(EcorePackage.Literals.ECLASS));

			try {
				EClass eClass = Iterables.find(allEClasses, new Predicate<EClass>() {
					public boolean apply(EClass input) {
						Iterable<String> ancestorOrSelfName = Iterables.transform(ancestorOrSelf.of(input), EGet
							.<String> feature(EcorePackage.Literals.ENAMED_ELEMENT__NAME));
						String currentFullName = Joiner.on(FromEPackageRegistry.this.separator).join(
							Iterables.reverse(ImmutableList.copyOf(ancestorOrSelfName)));
						return fullName.equals(currentFullName);
					}
				});

				return eClass;
			} catch (NoSuchElementException e) {
				throw new NotFoundException("No EClass with full name " + fullName + " in package registry " + this.ePackageRegistry);
			}
		}
	}

	/**
	 * @param eClass
	 * @return
	 */
	public static String fullyQualifiedName(EClass eClass) {
		return EClasses.fullyQualifiedName(eClass, EClasses.DEFAULT_FULL_NAME_SEPARATOR);
	}

	/**
	 * @param eClass
	 * @param separator
	 * @return
	 */
	public static String fullyQualifiedName(EClass eClass, String separator) {
		StringBuilder sb = new StringBuilder(EPackages.fullyQualifiedName(eClass.getEPackage(), separator));
		sb.append(EClasses.DEFAULT_FULL_NAME_SEPARATOR).append(eClass.getName());
		return sb.toString();
	}
}
