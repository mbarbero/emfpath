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

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @param <T>
 */
public abstract class EObjects<T> {

	/**
	 * 
	 */
	EObjects() {
		// prevent instantiation
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @param <T>
	 */
	public static abstract class Function<T> implements com.google.common.base.Function<EObject, T> {

		/**
		 * A synonym of apply
		 * 
		 * @param from
		 * @return
		 */
		public T of(EObject from) {
			return this.apply(from);
		}
	}

	/**
	 * 
	 */
	public static final Function<EClass> eClass = new Function<EClass>() {
		public EClass apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eClass();
		}
	};

	/**
	 * @see EObject#eContainer()
	 */
	public static final Function<EObject> parent = new Function<EObject>() {
		public EObject apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContainer();
		}
	};

	/**
	 * 
	 */
	public static final Function<EObject> eContainer = EObjects.parent;

	/**
	 * 
	 */
	public static final Function<EStructuralFeature> eContainingFeature = new Function<EStructuralFeature>() {
		public EStructuralFeature apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContainingFeature();
		}
	};

	/**
	 * 
	 */
	public static final Function<EReference> eContainmentFeature = new Function<EReference>() {
		public EReference apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContainmentFeature();
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> ancestor = new Function<Iterable<EObject>>() {
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
	public static final Function<Iterable<EObject>> ancestorOrSelf = new Function<Iterable<EObject>>() {
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
								EObject currentContainer = this.current.eContainer();
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
	public static final Function<Iterable<EObject>> child = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			return from.eContents();
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> eContents = EObjects.child;

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> descendant = new Function<Iterable<EObject>>() {
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
	public static final Function<Iterable<EObject>> eAllContents = EObjects.descendant;

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> descendantOrSelf = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return Iterators.concat(Iterators.singletonIterator(from), from.eAllContents());
				}
			};
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> following = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			Iterable<Iterable<EObject>> followingToConcat = Iterables.transform(followingSibling.of(from), descendantOrSelf);
			return Iterables.concat(followingToConcat);
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> followingSibling = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			EObject fromParent = from.eContainer();
			if (fromParent != null) {
				return Iterables.filter(fromParent.eContents(), new Predicate<EObject>() {
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
			return Collections.emptyList();
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> preceding = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(EObject from) {
			Preconditions.checkNotNull(from);
			Iterable<Iterable<EObject>> precedingToConcat = Iterables.transform(precedingSibling.of(from), descendantOrSelf);
			return Iterables.concat(precedingToConcat);
		}
	};

	/**
	 * 
	 */
	public static final Function<Iterable<EObject>> precedingSibling = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(final EObject from) {
			Preconditions.checkNotNull(from);

			EObject fromParent = from.eContainer();
			if (fromParent != null) {
				return Iterables.filter(fromParent.eContents(), new Predicate<EObject>() {
					boolean skip = false;

					public boolean apply(EObject input) {
						if (!this.skip && (input == from)) {
							this.skip = true;
						}
						return !this.skip;
					}
				});
			}
			return Collections.emptyList();
		}
	};

	/**
	 * 
	 */
	public static final Function<URI> uri = new Function<URI>() {
		public URI apply(EObject from) {
			return EcoreUtil.getURI(from);
		}
	};

	/**
	 * 
	 */
	public static final Function<String> uriFragment = new Function<String>() {
		public String apply(EObject from) {
			return EcoreUtil.getURI(from).fragment();
		}
	};
}
