package org.eclipselabs.emfpath.ecore.path;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emfpath.base.ComposablePredicate;
import org.eclipselabs.emfpath.ecore.exception.NoSuchFeatureException;
import org.eclipselabs.emfpath.ecore.exception.NotFoundException;
import org.eclipselabs.emfpath.ecore.internal.i18n.Messages;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;



/**
 * @generated
 */
public class EObjects {

/**
   * @generated
   */
  private EObjects() {
    // prevent instantiation
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eClass()
   * @generated
   */
  public static final Function<EObject, EClass> eClass = new Function<EObject, EClass>() {
    public EClass apply(EObject s) {
      return s.eClass();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eIsProxy()
   * @generated
   */
  public static final ComposablePredicate<EObject> eIsProxy = new ComposablePredicate<EObject>() {
    public boolean apply(EObject s) {
      return s.eIsProxy();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eResource()
   * @generated
   */
  public static final Function<EObject, Resource> eResource = new Function<EObject, Resource>() {
    public Resource apply(EObject s) {
      return s.eResource();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eContainer()
   * @generated
   */
  public static final Function<EObject, EObject> eContainer = new Function<EObject, EObject>() {
    public EObject apply(EObject s) {
      return s.eContainer();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eContainingFeature()
   * @generated
   */
  public static final Function<EObject, EStructuralFeature> eContainingFeature = new Function<EObject, EStructuralFeature>() {
    public EStructuralFeature apply(EObject s) {
      return s.eContainingFeature();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eContainmentFeature()
   * @generated
   */
  public static final Function<EObject, EReference> eContainmentFeature = new Function<EObject, EReference>() {
    public EReference apply(EObject s) {
      return s.eContainmentFeature();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eContents()
   * @generated
   */
  public static final Function<EObject, EList<EObject>> eContents = new Function<EObject, EList<EObject>>() {
    public EList<EObject> apply(EObject s) {
      return s.eContents();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eAllContents()
   * @generated
   */
  public static final Function<EObject, TreeIterator<EObject>> eAllContents = new Function<EObject, TreeIterator<EObject>>() {
    public TreeIterator<EObject> apply(EObject s) {
      return s.eAllContents();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eCrossReferences()
   * @generated
   */
  public static final Function<EObject, EList<EObject>> eCrossReferences = new Function<EObject, EList<EObject>>() {
    public EList<EObject> apply(EObject s) {
      return s.eCrossReferences();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eGet(EStructuralFeature)
   * @generated
   */
  public static Function<EObject, Object> eGet(final EStructuralFeature feature) {
    return new Function<EObject, Object>() {
      public Object apply(EObject s) {
        return s.eGet(feature);
      }
    };
  }



  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eGet(EStructuralFeature, boolean)
   * @generated
   */
  public static Function<EObject, Object> eGet(final EStructuralFeature feature, final boolean resolve) {
    return new Function<EObject, Object>() {
      public Object apply(EObject s) {
        return s.eGet(feature, resolve);
      }
    };
  }



  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eSet(EStructuralFeature, Object)
   * @generated
   */
  public static Function<EObject, EObject> eSet(final EStructuralFeature feature, final Object newValue) {
    return new Function<EObject, EObject>() {
      public EObject apply(EObject s) {
        s.eSet(feature, newValue);
        return s;
      }
    };
  }



  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eIsSet(EStructuralFeature)
   * @generated
   */
  public static ComposablePredicate<EObject> eIsSet(final EStructuralFeature feature) {
    return new ComposablePredicate<EObject>() {
      public boolean apply(EObject s) {
        return s.eIsSet(feature);
      }
    };
  }



  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eUnset(EStructuralFeature)
   * @generated
   */
  public static Function<EObject, EObject> eUnset(final EStructuralFeature feature) {
    return new Function<EObject, EObject>() {
      public EObject apply(EObject s) {
        s.eUnset(feature);
        return s;
      }
    };
  }



  /**
   * 
   * @see org.eclipse.emf.ecore.EObject#eInvoke(EOperation, EList)
   * @generated
   */
  public static Function<EObject, Object> eInvoke(final EOperation operation, final EList<?> arguments) {
    return new Function<EObject, Object>() {
      public Object apply(EObject s) {
        try {
          return s.eInvoke(operation, arguments);
        } catch (java.lang.reflect.InvocationTargetException e1) {
          throw new WrappedException(e1);
        }
      }
    };
  }
  
  public static Function<EObject, Object> eInvoke(final String operationName, final EList<?> arguments) {
	    return new Function<EObject, Object>() {
	      public Object apply(EObject s) {
	    	EOperation eOperation = EClasses.getEOperation(s.eClass(), operationName);
	        try {
	          return s.eInvoke(eOperation, arguments);
	        } catch (java.lang.reflect.InvocationTargetException e1) {
	          throw new WrappedException(e1);
	        }
	      }
	    };
	  }



/**
 * A function that returns the value of the feature with the given name, or
 * a {@link NoSuchFeatureException} if the {@link EObject#eClass() EClass}
 * does not have a feature with the given name.
 * 
 * @param featureName
 * @return
 */
public static EFunction<EObject, Object> eGet(final String featureName) {
	return new EFunction<EObject, Object>() {
		public Object apply(EObject s) {
			EClass eClass = s.eClass();
			EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);
			return s.eGet(feature);
		}
	};
}



/**
 * A function that returns the value of the feature with the given name, or
 * a {@link NoSuchFeatureException} if the {@link EObject#eClass() EClass}
 * does not have a feature with the given name.
 * 
 * @param featureName
 * @param resolve
 * @return
 */
public static EFunction<EObject, Object> eGet(final String featureName, final boolean resolve) {
	return new EFunction<EObject, Object>() {
		public Object apply(EObject s) {
			EClass eClass = s.eClass();
			EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);
			return s.eGet(feature, resolve);
		}
	};
}

  
  public static Function<EObject, EObject> eSet(final String featureName, final Object newValue) {
    return new Function<EObject, EObject>() {
      public EObject apply(EObject s) {
    	  EClass eClass = s.eClass();
    	  EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);
    	  s.eSet(feature, newValue);
        return s;
      }
    };
  }




  public static Predicate<EObject> eIsSet(final String featureName) {
	return new Predicate<EObject>() {
		public boolean apply(EObject s) {
			EClass eClass = s.eClass();
			EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);
			return s.eIsSet(feature);
		}
	};
}


  public static Function<EObject, EObject> eUnset(final String featureName) {
    return new Function<EObject, EObject>() {
      public EObject apply(EObject s) {
			EClass eClass = s.eClass();
			EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);
			s.eUnset(feature);
			return s;
      }
    };
  }

    public static Function<EObject, EObject> eAdd(final EStructuralFeature feature, final Object newValue) {
	    return new Function<EObject, EObject>() {
	      @SuppressWarnings("unchecked")
		public EObject apply(EObject s) {
	    	  if (!feature.isMany()) {
					throw new IllegalArgumentException(Messages.getString("EAdd.9", feature)); //$NON-NLS-1$
				}

				((List<? super Object>) s.eGet(feature)).add(newValue);
				return s;
	      }
	    };
	  }
	
	public static Function<EObject, EObject> eAdd(final String featureName, final Object newValue) {
		return new Function<EObject, EObject>() {
			@SuppressWarnings("unchecked")
			public EObject apply(EObject s) {
				EClass eClass = s.eClass();
				EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);

				if (!feature.isMany()) {
					throw new IllegalArgumentException(Messages.getString("EAdd.9", feature)); //$NON-NLS-1$
				}

				((List<? super Object>) s.eGet(feature)).add(newValue);
				return s;
			}
		};
	}
	
	public static Function<EObject, EObject> eAddAll(final EStructuralFeature feature, final Collection<?> newValues) {
	    return new Function<EObject, EObject>() {
	      @SuppressWarnings("unchecked")
		public EObject apply(EObject s) {
	    	  if (!feature.isMany()) {
					throw new IllegalArgumentException(Messages.getString("EAdd.9", feature)); //$NON-NLS-1$
				}

				((List<? super Object>) s.eGet(feature)).addAll(newValues);
				return s;
	      }
	    };
	  }
	
	public static Function<EObject, EObject> eAddAll(final String featureName, final Collection<?> newValues) {
		return new Function<EObject, EObject>() {
			@SuppressWarnings("unchecked")
			public EObject apply(EObject s) {
				EClass eClass = s.eClass();
				EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, eClass);

				if (!feature.isMany()) {
					throw new IllegalArgumentException(Messages.getString("EAdd.9", feature)); //$NON-NLS-1$
				}

				((List<? super Object>) s.eGet(feature)).addAll(newValues);
				return s;
			}
		};
	}
	
	/**
	 * @param <T>
	 * @param featureName
	 * @param filter
	 * @return
	 */
	public static <F, T extends EObject> Predicate<T> having(String featureName, Predicate<? super F> filter) {
		Preconditions.checkNotNull(featureName);
		Preconditions.checkNotNull(filter);
		Preconditions.checkArgument(featureName.length() > 0);

		return new HavingWithFeatureName<F, T>(featureName, filter);
	}

	/**
	 * @param <T>
	 * @param eStructuralFeature
	 * @param filter
	 * @return
	 */
	public static <F, T extends EObject> Predicate<T> having(EStructuralFeature eStructuralFeature, Predicate<? super F> filter) {
		Preconditions.checkNotNull(eStructuralFeature);
		Preconditions.checkNotNull(filter);

		return new HavingWithEStructuralFeature<F, T>(eStructuralFeature, filter);
	}

	private static final class HavingWithFeatureName<F, T extends EObject> implements Predicate<T> {

		private final String featureName;
		private final Predicate<? super F> filter;

		public HavingWithFeatureName(String featureName, Predicate<? super F> filter) {
			this.featureName = featureName;
			this.filter = filter;
		}

		@SuppressWarnings("unchecked")
		public boolean apply(T input) {
			EStructuralFeature feature = getFeatureAndRedirectToRuntimeExceptions(featureName, input.eClass());
			return this.filter.apply((F) input.eGet(feature));
		}
	}

	private static final class HavingWithEStructuralFeature<F, T extends EObject> implements Predicate<T> {

		private final EStructuralFeature eStructuralFeature;
		private final Predicate<? super F> filter;

		public HavingWithEStructuralFeature(EStructuralFeature eStructuralFeature, Predicate<? super F> filter) {
			this.eStructuralFeature = eStructuralFeature;
			this.filter = filter;
		}

		@SuppressWarnings("unchecked")
		public boolean apply(EObject input) {
			return this.filter.apply((F) input.eGet(this.eStructuralFeature));
		}
	}
	
	/**
	 * @see EcoreUtil#isAncestor(EObject, EObject)
	 */
	public static Predicate<EObject> isAncestorOf(final EObject child) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				return EcoreUtil.isAncestor(input, child);
			}
		};
	}

	/**
	 * @see EcoreUtil#isAncestor(EObject, EObject)
	 */
	public static Predicate<EObject> isChildOf(final EObject ancestor) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				return EcoreUtil.isAncestor(ancestor, input);
			}
		};
	}

	public static Predicate<EObject> isKindOf(final EClass eClass) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				EClass inputEClass = input.eClass();
				return ((inputEClass == eClass) || inputEClass
						.getEAllSuperTypes().contains(eClass));
			}
		};
	}
	
	public static Predicate<EObject> isKindOf(final Class<? extends EObject> eClass) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				return eClass.isInstance(input);
			}
		};
	}

	/**
	 * Will on look for an EClass named <code>eClassName</code> in the
	 * {@link EPackage} of {@link Predicate} inputs.
	 * 
	 * @param eClassName
	 * @return
	 */
	public static Predicate<EObject> isKindOf(final String eClassName) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				EClass of;
				try {
					of = EClasses.from(input.eClass().getEPackage()).forName(eClassName);
				} catch (NotFoundException e) {
					throw new IllegalArgumentException(e);
				}
				EClass inputEClass = input.eClass();
				return ((inputEClass == of) || inputEClass.getEAllSuperTypes()
						.contains(of));
			}
		};
	}

	public static Predicate<EObject> isTypeOf(final EClass eClass) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				EClass inputEClass = input.eClass();
				return (inputEClass == eClass);
			}
		};
	}

	/**
	 * Will on look for an EClass named <code>eClassName</code> in the
	 * {@link EPackage} of {@link Predicate} inputs.
	 * 
	 * @param eClassName
	 * @return
	 */
	public static Predicate<EObject> isTypeOf(final String eClassName) {
		return new Predicate<EObject>() {
			public boolean apply(EObject input) {
				EClass of;
				try {
					of = EClasses.from(input.eClass().getEPackage()).forName(eClassName);
				} catch (NotFoundException e) {
					throw new IllegalArgumentException(e);
				}
				EClass inputEClass = input.eClass();
				return (inputEClass == of);
			}
		};
	}

	/**
	 * @see EObject#eContainer()
	 */
	public static final EFunction<EObject, EObject> parent = new EFunction<EObject, EObject>() {
		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContainer();
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> ancestor = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);
			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return new AbstractIterator<EObject>() {
						private EObject current = from;

						@Override
						protected EObject computeNext() {
							if (this.current.eContainer() != null) {
								this.current = this.current.eContainer();
								return this.current;
							}
							return this.endOfData();
						}
					};
				}
			};
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> ancestorOrSelf = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);
			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return new AbstractIterator<EObject>() {
						private EObject current;

						@Override
						protected EObject computeNext() {
							EObject ret = null;

							if (this.current == null) {
								this.current = from;
								ret = this.current;
							} else {
								EObject currentContainer = this.current
										.eContainer();
								if (currentContainer != null) {
									this.current = currentContainer;
									ret = this.current;
								} else {
									ret = this.endOfData();
								}
							}

							return ret;
						}
					};
				}
			};
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, EList<EObject>> child = new EFunction<EObject, EList<EObject>>() {
		public EList<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContents();
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> descendant = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);
			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return from.eAllContents();
				}
			};
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> descendantOrSelf = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return Iterators.concat(Iterators.singletonIterator(from),
							from.eAllContents());
				}
			};
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> following = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			Iterable<Iterable<EObject>> followingToConcat = Iterables
					.transform(followingSibling.of(from), descendantOrSelf);
			return Iterables.concat(followingToConcat);
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> followingSibling = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			EObject fromParent = from.eContainer();
			if (fromParent != null) {
				return Iterables.filter(fromParent.eContents(),
						new Predicate<EObject>() {
							boolean skip = true;

							public boolean apply(EObject input) {
								if (this.skip && (input == from)) {
									this.skip = false;
									return false;
								}
								return !this.skip;
							}
						});
			}
			return ImmutableList.of();
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> preceding = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			Iterable<Iterable<EObject>> precedingToConcat = Iterables
					.transform(precedingSibling.of(from), descendantOrSelf);
			return Iterables.concat(precedingToConcat);
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, Iterable<EObject>> precedingSibling = new EFunction<EObject, Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			EObject fromParent = from.eContainer();
			if (fromParent != null) {
				return Iterables.filter(fromParent.eContents(),
						new Predicate<EObject>() {
							boolean skip = false;

							public boolean apply(EObject input) {
								if (!this.skip && (input == from)) {
									this.skip = true;
								}
								return !this.skip;
							}
						});
			}
			return ImmutableList.of();
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, URI> uri = new EFunction<EObject, URI>() {
		public URI apply(EObject from) {
			return EcoreUtil.getURI(from);
		}
	};

	/**
	 * 
	 */
	public static final EFunction<EObject, String> uriFragment = new EFunction<EObject, String>() {
		public String apply(EObject from) {
			return EcoreUtil.getURI(from).fragment();
		}
	};
	
	private static EStructuralFeature getFeatureAndRedirectToRuntimeExceptions(String eStructuralFeatureName, EClass eClass) {
		try {
			return EStructuralFeatures.from(eClass).named(eStructuralFeatureName);
		} catch (NoSuchFeatureException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @param <F>
	 * @param <T>
	 */
	public static abstract class EFunction<F, T> implements Function<F, T> {

		/**
		 * Synonym of {@link Function#apply(Object))}
		 * 
		 * @param input
		 * @return
		 * @see com.google.common.base.Function#apply(java.lang.Object)
		 */
		public T of(F input) {
			return this.apply(input);
		}

	}
}
