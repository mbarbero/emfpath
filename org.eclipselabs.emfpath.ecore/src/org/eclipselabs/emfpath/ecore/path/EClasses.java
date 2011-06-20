package org.eclipselabs.emfpath.ecore.path;

import java.util.NoSuchElementException;

import com.google.common.base.Function;	
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;	
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emfpath.exception.NotFoundException;
import org.eclipselabs.emfpath.indie.base.Equivalences2;

/**
 * @generated
 */
public final class EClasses {

	private EClasses() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceClassName = EClassifiers.instanceClassName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = EClassifiers.instanceClass;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = EClassifiers.defaultValue;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = EClassifiers.instanceTypeName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = EClassifiers.ePackage;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = EClassifiers.eTypeParameters;

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
	public static final Predicate<EClass> isAbstract = new Predicate<EClass>() {
    public boolean apply(EClass s) {
      return s.isAbstract();
    }
  };

	/**
	 * @generated
	 */
	public static final Predicate<EClass> isInterface = new Predicate<EClass>() {
    public boolean apply(EClass s) {
      return s.isInterface();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EClass>> eSuperTypes = new Function<EClass, EList<EClass>>() {
    public EList<EClass> apply(EClass s) {
      return s.getESuperTypes();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EOperation>> eOperations = new Function<EClass, EList<EOperation>>() {
    public EList<EOperation> apply(EClass s) {
      return s.getEOperations();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EAttribute>> eAllAttributes = new Function<EClass, EList<EAttribute>>() {
    public EList<EAttribute> apply(EClass s) {
      return s.getEAllAttributes();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eAllReferences = new Function<EClass, EList<EReference>>() {
    public EList<EReference> apply(EClass s) {
      return s.getEAllReferences();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eReferences = new Function<EClass, EList<EReference>>() {
    public EList<EReference> apply(EClass s) {
      return s.getEReferences();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EAttribute>> eAttributes = new Function<EClass, EList<EAttribute>>() {
    public EList<EAttribute> apply(EClass s) {
      return s.getEAttributes();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EReference>> eAllContainments = new Function<EClass, EList<EReference>>() {
    public EList<EReference> apply(EClass s) {
      return s.getEAllContainments();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EOperation>> eAllOperations = new Function<EClass, EList<EOperation>>() {
    public EList<EOperation> apply(EClass s) {
      return s.getEAllOperations();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EStructuralFeature>> eAllStructuralFeatures = new Function<EClass, EList<EStructuralFeature>>() {
    public EList<EStructuralFeature> apply(EClass s) {
      return s.getEAllStructuralFeatures();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EClass>> eAllSuperTypes = new Function<EClass, EList<EClass>>() {
    public EList<EClass> apply(EClass s) {
      return s.getEAllSuperTypes();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EAttribute> eIDAttribute = new Function<EClass, EAttribute>() {
    public EAttribute apply(EClass s) {
      return s.getEIDAttribute();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EStructuralFeature>> eStructuralFeatures = new Function<EClass, EList<EStructuralFeature>>() {
    public EList<EStructuralFeature> apply(EClass s) {
      return s.getEStructuralFeatures();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EGenericType>> eGenericSuperTypes = new Function<EClass, EList<EGenericType>>() {
    public EList<EGenericType> apply(EClass s) {
      return s.getEGenericSuperTypes();
    }
  };

	/**
	 * @generated
	 */
	public static final Function<EClass, EList<EGenericType>> eAllGenericSuperTypes = new Function<EClass, EList<EGenericType>>() {
    public EList<EGenericType> apply(EClass s) {
      return s.getEAllGenericSuperTypes();
    }
  };
	
	/**
	 * @generated
	 */
	public static Predicate<EClassifier> isInstance(final Object object) {
    return EClassifiers.isInstance(object);
  }

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = EClassifiers.getClassifierID;

	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

	/**
	 * @generated
	 */
	public static Predicate<EClass> isSuperTypeOf(final EClass someClass) {
    return new Predicate<EClass>() {
      public boolean apply(EClass s) {
        return s.isSuperTypeOf(someClass);
      }
    };
  }

	/**
	 * @generated
	 */
	public static final Function<EClass, java.lang.Integer> getFeatureCount = new Function<EClass, java.lang.Integer>() {
    public java.lang.Integer apply(EClass s) {
      return s.getFeatureCount();
    }
  };

	/**
	 * @generated
	 */
	public static Function<EClass, EStructuralFeature> getEStructuralFeature(final int featureID) {
    return new Function<EClass, EStructuralFeature>() {
      public EStructuralFeature apply(EClass s) {
        return s.getEStructuralFeature(featureID);
      }
    };
  }

	/**
	 * @generated
	 */
	public static Function<EClass, java.lang.Integer> getFeatureID(final EStructuralFeature feature) {
    return new Function<EClass, java.lang.Integer>() {
      public java.lang.Integer apply(EClass s) {
        return s.getFeatureID(feature);
      }
    };
  }

	/**
	 * @generated
	 */
	public static Function<EClass, EStructuralFeature> getEStructuralFeature(final String featureName) {
    return new Function<EClass, EStructuralFeature>() {
      public EStructuralFeature apply(EClass s) {
        return s.getEStructuralFeature(featureName);
      }
    };
  }

	/**
	 * @generated
	 */
	public static final Function<EClass, java.lang.Integer> getOperationCount = new Function<EClass, java.lang.Integer>() {
    public java.lang.Integer apply(EClass s) {
      return s.getOperationCount();
    }
  };

	/**
	 * @generated
	 */
	public static Function<EClass, EOperation> getEOperation(final int operationID) {
    return new Function<EClass, EOperation>() {
      public EOperation apply(EClass s) {
        return s.getEOperation(operationID);
      }
    };
  }

	/**
	 * @generated
	 */
	public static Function<EClass, java.lang.Integer> getOperationID(final EOperation operation) {
    return new Function<EClass, java.lang.Integer>() {
      public java.lang.Integer apply(EClass s) {
        return s.getOperationID(operation);
      }
    };
  }

	/**
	 * @generated
	 */
	public static Function<EClass, EOperation> getOverride(final EOperation operation) {
    return new Function<EClass, EOperation>() {
      public EOperation apply(EClass s) {
        return s.getOverride(operation);
      }
    };
  }


	/**
	 * @param ePackage
	 * @return
	 */
	public static Lookup from(EPackage ePackage) {
		Preconditions.checkArgument(ePackage != null, "ePackage cannot be null");
		return new FromEPackage(ePackage);
	}

	/**
	 * @param eResourceSet
	 * @return
	 */
	public static Lookup from(ResourceSet eResourceSet) {
		Preconditions.checkArgument(eResourceSet != null, "eResourceSet cannot be null");
		return new FromEPackageRegistry(eResourceSet.getPackageRegistry());
	}

	/**
	 * @param ePackageRegistry
	 * @return
	 */
	public static Lookup from(EPackage.Registry ePackageRegistry) {
		Preconditions.checkArgument(ePackageRegistry != null, "ePackageRegistry cannot be null");
		return new FromEPackageRegistry(ePackageRegistry);
	}

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
	public static abstract class Lookup {
		/**
		 * 
		 */
		public static final String DEFAULT_FULL_NAME_SEPARATOR = EPackages.DEFAULT_FULL_NAME_SEPARATOR;

		/**
		 * 
		 */
		String separator;
		
		/**
		 * Default visibility to prevent external subclassing.
		 */
		Lookup() {
			this.separator = Lookup.DEFAULT_FULL_NAME_SEPARATOR;
		}
		
		/**
		 * @param sep
		 * @return
		 */
		public Lookup separator(String sep) {
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
	}
	
	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
	 */
	private static final class FromEPackage extends Lookup {

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
			ImmutableList<String> nameFragments = ImmutableList.copyOf(Splitter.on(this.separator).omitEmptyStrings().trimResults().split(
				name));

			for (String nameFragment : nameFragments) {
				try {
					currentEPackage = Iterables.find(currentEPackage.getESubpackages(), EObjects.having(
						EcorePackage.Literals.ENAMED_ELEMENT__NAME, Equivalences2.equalsTo(nameFragment)));
				} catch (NoSuchElementException e) {
					throw new NotFoundException("Cannot find EPackage named " + nameFragment + " as sub package of "
						+ EPackages.fullyQualifiedName(this.ePackage, this.separator));
				}
			}

			String eClassName = (nameFragments.isEmpty() ? name : Iterables.getLast(nameFragments));
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
	private static final class FromEPackageRegistry extends Lookup {

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
		public EClass forName(final String fullName) throws NotFoundException {
			Preconditions.checkArgument(fullName != null, "fullName cannot be null");
			Preconditions.checkArgument(fullName.length() >= 0);

			Iterable<? extends EClass> allEClasses = Iterables.filter(Iterables.concat(Iterables.transform(
				EPackages.allEPackages(this.ePackageRegistry), EObjects.descendant)), EClass.class);

			try {
				EClass eClass = Iterables.find(allEClasses, new Predicate<EClass>() {
					public boolean apply(EClass input) {
						Iterable<String> ancestorOrSelfName = Iterables.filter(Iterables.transform(EObjects.ancestorOrSelf.of(input), EObjects.eGet(EcorePackage.Literals.ENAMED_ELEMENT__NAME)), String.class);
						String currentFullName = Joiner.on(FromEPackageRegistry.this.separator).join(
							Lists.reverse(ImmutableList.copyOf(ancestorOrSelfName)));
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
		return fullyQualifiedName(eClass, Lookup.DEFAULT_FULL_NAME_SEPARATOR);
	}

	/**
	 * @param eClass
	 * @param separator
	 * @return
	 */
	public static String fullyQualifiedName(EClass eClass, String separator) {
		StringBuilder sb = new StringBuilder(EPackages.fullyQualifiedName(eClass.getEPackage(), separator));
		sb.append(Lookup.DEFAULT_FULL_NAME_SEPARATOR).append(eClass.getName());
		return sb.toString();
	}
}
