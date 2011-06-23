package org.eclipselabs.emfpath.ecore.path;

import java.util.List;
import java.util.NoSuchElementException;

import com.google.common.base.Function;	
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emfpath.ecore.internal.i18n.Messages;
import org.eclipselabs.emfpath.exception.NotFoundException;

/**
 * @generated
 */
public final class EPackages {

	/**
	 * String separator used between segments of an {@link EPackage} qualified name
	 */
	public static final String DEFAULT_FULL_NAME_SEPARATOR = "."; //$NON-NLS-1$
	
	private EPackages() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = ENamedElements.name;

	/**
	 * @generated
	 */
	public static final Function<EPackage, String> nsURI = new Function<EPackage, String>() {
    public String apply(EPackage s) {
      return s.getNsURI();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EPackage, String> nsPrefix = new Function<EPackage, String>() {
    public String apply(EPackage s) {
      return s.getNsPrefix();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EPackage, EFactory> eFactoryInstance = new Function<EPackage, EFactory>() {
    public EFactory apply(EPackage s) {
      return s.getEFactoryInstance();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EPackage, EList<EClassifier>> eClassifiers = new Function<EPackage, EList<EClassifier>>() {
    public EList<EClassifier> apply(EPackage s) {
      return s.getEClassifiers();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EPackage, EList<EPackage>> eSubpackages = new Function<EPackage, EList<EPackage>>() {
    public EList<EPackage> apply(EPackage s) {
      return s.getESubpackages();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EPackage, EPackage> eSuperPackage = new Function<EPackage, EPackage>() {
    public EPackage apply(EPackage s) {
      return s.getESuperPackage();
    }
  };
	
	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

	/**
	 * @generated
	 */
	public static Function<EPackage, EClassifier> getEClassifier(final String name) {
    return new Function<EPackage, EClassifier>() {
      public EClassifier apply(EPackage s) {
        return s.getEClassifier(name);
      }
    };
  }

	/**
	 * Returns the fully qualified name of the given {@link EPackage}. Each segments of the fully qualified name are
	 * separated by {@link EPackages#DEFAULT_FULL_NAME_SEPARATOR}. Equivalent to:
	 * <p>
	 * <code>EPackages.fullyQualifiedName(ePackage, EPackages.DEFAULT_FULL_NAME_SEPARATOR)</code>
	 * 
	 * @param ePackage the package to get the full name from
	 * @return the fully qualified name
	 */
	public static String fullyQualifiedName(EPackage ePackage) {
		return fullyQualifiedName(ePackage, DEFAULT_FULL_NAME_SEPARATOR);
	}

	/**
	 * Returns the fully qualified name of the given {@link EPackage}. Each segments of the fully qualified name are
	 * separated by the <code>separator</code> string.
	 * 
	 * @param ePackage the package to get the full name from.
	 * @param separator the string to separate the name segments.
	 * @return the fully qualified name
	 */
	public static String fullyQualifiedName(EPackage ePackage, String separator) {
		List<String> ancestorsOrSelf = ImmutableList.copyOf(Iterables.filter(Iterables.transform(EObjects.ancestorOrSelf.of(ePackage), EObjects.eGet(EcorePackage.Literals.ENAMED_ELEMENT__NAME)), String.class));

		return Joiner.on(separator).join(Lists.reverse(ancestorsOrSelf));
	}

	/**
	 * @param registry
	 * @return
	 */
	public static Iterable<EPackage> allEPackages(final EPackage.Registry registry) {
		// cannot do a find on this.ePackageRegistry.values() because EPackage.Registry implementation do not always
		// return EPackage.
		// EPackage.Registry#getEPackage() is the only method doing the conversion
		return Iterables.transform(registry.keySet(), new Function<String, EPackage>() {
			public EPackage apply(String from) {
				return registry.getEPackage(from);
			}
		});
	}

	/**
	 * @param registry
	 * @return
	 */
	public static Iterable<EFactory> allEFactories(final EPackage.Registry registry) {
		// cannot do a find on this.ePackageRegistry.values() because EPackage.Registry implementation do not always
		// return EPackage.
		// EPackage.Registry#getEPackage() is the only method doing the conversion
		return Iterables.transform(registry.keySet(), new Function<String, EFactory>() {
			public EFactory apply(String from) {
				return registry.getEFactory(from);
			}
		});
	}
	
	/**
	 * Create a search object and configure it with the {@link ResourceSet#getPackageRegistry() package registry} of the
	 * given {@link ResourceSet}
	 * 
	 * @param resourceSet the resource set to look in for finding {@link EPackage}s
	 * @return the search object
	 * @throws IllegalArgumentException if <code>resourceSet</code> is null
	 */
	public static Lookup from(ResourceSet resourceSet) {
		Preconditions.checkArgument(resourceSet != null, Messages.getString("EPackages.0")); //$NON-NLS-1$
		return new Lookup(resourceSet.getPackageRegistry());
	}

	/**
	 * Create a search object and configure it with the {@link ResourceSet#getPackageRegistry() package registry} to
	 * look in.
	 * 
	 * @param registry the registry to look in.
	 * @return the search object
	 * @throws IllegalArgumentException if <code>registry</code> is null.
	 */
	public static Lookup from(EPackage.Registry registry) {
		Preconditions.checkArgument(registry != null, Messages.getString("EPackages.1")); //$NON-NLS-1$
		return new Lookup(registry);
	}

	/**
	 * Utility class to search for an {@link EPackage} in a {@link ResourceSet}.
	 * <p>
	 * An {@link EPackage} can be get by:
	 * <ul>
	 * <li>simple name (the first {@link EPackage} with the same name will be returned)</li>
	 * <li>fully qualified name (segment separator can be configured with {@link EPackages#separator(String)})</li>
	 * <li>namespace URI (as defined by {@link EPackage#getNsURI()})</li>
	 * </ul>
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 * @since 0.1.0
	 */
	public static class Lookup {

		/**
		 * 
		 */
		final EPackage.Registry ePackageRegistry;

		/**
		 * 
		 */
		String separator;

		private Lookup(EPackage.Registry registry) {
			this.ePackageRegistry = registry;
			this.separator = EPackages.DEFAULT_FULL_NAME_SEPARATOR;
		}

		/**
		 * Search for an {@link EPackage} with the given {@link EPackage#getNsURI() namespace URI}.
		 * 
		 * @param nsUri the namespace URI of the searched package.
		 * @return the search EPackage.
		 * @throws NotFoundException if {@link EPackage} cannot be found
		 * @throws IllegalArgumentException if <code>nsUri</code> is null or empty
		 */
		public EPackage withNSUri(String nsUri) throws NotFoundException {
			Preconditions.checkArgument(!Strings.isNullOrEmpty(nsUri), Messages.getString("EPackages.2")); //$NON-NLS-1$
			EPackage ret = this.ePackageRegistry.getEPackage(nsUri);

			if (ret == null) {
				throw new NotFoundException(Messages.getString("EPackages.3", nsUri)); //$NON-NLS-1$
			}

			return ret;
		}

		/**
		 * Search for an {@link EPackage} with the given {@link EPackage#getName() name}. It returns the first one with the
		 * given name.
		 * 
		 * @param name the name of the searched package.
		 * @return the first package with the given <code>name</code>
		 * @throws NotFoundException if the EPackage cannot be found
		 * @throws IllegalArgumentException if <code>name</code> is null or empty.
		 */
		public EPackage withName(final String name) throws NotFoundException {
			Preconditions.checkArgument(!Strings.isNullOrEmpty(name), Messages.getString("EPackages.4")); //$NON-NLS-1$

			EPackage ret = null;

			try {
				ret = Iterables.find(allEPackages(this.ePackageRegistry), new Predicate<EPackage>() {
					public boolean apply(EPackage input) {
						return name.equals(input.getName());
					}
				});
			} catch (NoSuchElementException e) {
				throw new NotFoundException(Messages.getString("EPackages.5", name)); //$NON-NLS-1$
			}

			return ret;
		}

		/**
		 * Configure this object to use <code>sep</code> as fully qualified name segment separator instead of
		 * {@link EPackages#DEFAULT_FULL_NAME_SEPARATOR}.
		 * 
		 * @param sep the separator string to use.
		 * @return this search object re-configured
		 * @throws IllegalArgumentException if <code>sep</code> is null or empty
		 */
		public Lookup separator(String sep) {
			Preconditions.checkArgument(!Strings.isNullOrEmpty(sep), Messages.getString("EPackages.6")); //$NON-NLS-1$
			this.separator = sep;
			return this;
		}

		/**
		 * Search for an {@link EPackage} with the given {@link EPackages#fullyQualifiedName(EPackage) fully qualified name}
		 * . It returns the first one with the given name.
		 * 
		 * @param fullyQualifiedName the fully qualified name of the {@link EPackage} to search.
		 * @return the first EPackage with the given <code>fullyQualifiedName</code>.
		 * @throws NotFoundException if the EPackage can not be found.
		 */
		public EPackage withFullyQualifiedName(final String fullyQualifiedName) throws NotFoundException {
			Preconditions.checkArgument(!Strings.isNullOrEmpty(fullyQualifiedName), Messages.getString("EPackages.7")); //$NON-NLS-1$

			EPackage ret = null;

			try {
				ret = Iterables.find(EPackages.allEPackages(this.ePackageRegistry), new Predicate<EPackage>() {
					public boolean apply(EPackage input) {
						return fullyQualifiedName.equals(EPackages.fullyQualifiedName(input, Lookup.this.separator));
					}
				});
			} catch (NoSuchElementException e) {
				throw new NotFoundException(Messages.getString("EPackages.8", fullyQualifiedName)); //$NON-NLS-1$
			}

			return ret;
		}
	}
	
}
