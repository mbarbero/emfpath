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
package org.eclipselabs.emfpath.base;

import static org.eclipselabs.emfpath.base.EObjects.ancestorOrSelf;
import static org.eclipselabs.emfpath.base.EObjects.descendant;

import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.indie.predicate.Equals;
import org.eclipselabs.emfpath.operation.EGet;
import org.eclipselabs.emfpath.predicate.Having;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/**
 * Set of utility methods to handle {@link EClass EClasses}.
 * <p>
 * It provides an static utility method to compute the fully qualified name of an {@link EClass} within its owner
 * {@link EPackage}s and functions wrapping common {@link EClass} methods.
 * <p>
 * It also provides an internal DSL to search for an {@link EClass} by fully qualified in a scope. The scope can be:
 * <ul>
 * <li> {@link EPackage}</li>
 * <li> {@link ResourceSet}</li>
 * <li> {@link EPackage.Registry}</li>
 * </ul>
 * <p>
 * The qualified name is a set of String fragments separated by another String. This separator can be configured by
 * calling the method {@link #separator(String)}.
 * <p>
 * Usage:
 * <p>
 * <code>
 * EClasses.from(anEPackage).forName("p1.p2.myEClassName");
 * EClasses.from(aResourceSet).separator("::").forName("p1::p2::myEClassName");
 * EClasses.from(EPackage.Registry.INSTANCE).separator("!").forName("ecore!EModelElement");
 * </code>
 * <p>
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
	 * 
	 */
	String separator;

	/**
	 * Default visibility to prevent external instantiation (use static constructor method instead).
	 */
	EClasses() {
		this.separator = EClasses.DEFAULT_FULL_NAME_SEPARATOR;
	}

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
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @param <T>
	 * @since 0.3.0
	 */
	public static abstract class Function<T> implements com.google.common.base.Function<EClass, T> {

		/**
		 * A synonym of apply
		 * 
		 * @param from
		 * @return
		 */
		public T of(EClass from) {
			return this.apply(from);
		}
	}

	/**
	 * @see EClass#getEAllSuperTypes()
	 */
	public static final Function<EList<EClass>> eAllSuperTypes = new Function<EList<EClass>>() {
		public EList<EClass> apply(EClass from) {
			Preconditions.checkNotNull(from);
			return from.getEAllSuperTypes();
		}
	};

	/**
	 * @see EClass#getEAllSuperTypes()
	 */
	public static final Function<ImmutableList<EClass>> eAllSuperTypesAndSelf = new Function<ImmutableList<EClass>>() {
		public ImmutableList<EClass> apply(EClass from) {
			Preconditions.checkNotNull(from);
			return ImmutableList.<EClass> builder().add(from).addAll(from.getEAllSuperTypes()).build();
		}
	};

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

			for (String nameFragment : nameFragments) {
				try {
					currentEPackage = Iterables.find(currentEPackage.getESubpackages(), Having.feature(
						EcorePackage.Literals.ENAMED_ELEMENT__NAME, Equals.to(nameFragment)));
				} catch (NoSuchElementException e) {
					throw new NotFoundException("Cannot find EPackage named " + nameFragment + " as sub package of "
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

			Iterable<? extends EClass> allEClasses = Iterables.filter(Iterables.concat(Iterables.transform(
				EPackages.allEPackages(this.ePackageRegistry), descendant)), EClass.class);

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
