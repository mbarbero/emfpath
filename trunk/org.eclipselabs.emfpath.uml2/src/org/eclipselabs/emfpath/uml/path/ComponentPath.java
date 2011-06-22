package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;

/**
 * @generated
 */
public class ComponentPath extends ClassPath {

	/**
	 * @generated
	 */
	private ComponentPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#isIndirectlyInstantiated()
	 * @generated
	 */
	public static final Predicate<Component> isIndirectlyInstantiated = new Predicate<Component>() {
		public boolean apply(Component s) {
			return s.isIndirectlyInstantiated();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Component#getRequireds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> required = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getRequireds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Component#getProvideds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> provided = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getProvideds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Component#getPackagedElements()
	 * @generated
	 */
	public static final Function<Component, EList<PackageableElement>> packagedElement = new Function<Component, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Component s) {
			return s.getPackagedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Component#getRealizations()
	 * @generated
	 */
	public static final Function<Component, EList<ComponentRealization>> realization = new Function<Component, EList<ComponentRealization>>() {
		public EList<ComponentRealization> apply(Component s) {
			return s.getRealizations();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Component#createOwnedClass()
	 * @generated
	 */
	public static Function<Component, Class> createOwnedClass(final String name, final boolean isAbstract) {
		return new Function<Component, Class>() {
			public Class apply(Component s) {
				return s.createOwnedClass(name, isAbstract);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#createOwnedEnumeration()
	 * @generated
	 */
	public static Function<Component, Enumeration> createOwnedEnumeration(final String name) {
		return new Function<Component, Enumeration>() {
			public Enumeration apply(Component s) {
				return s.createOwnedEnumeration(name);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#createOwnedPrimitiveType()
	 * @generated
	 */
	public static Function<Component, PrimitiveType> createOwnedPrimitiveType(final String name) {
		return new Function<Component, PrimitiveType>() {
			public PrimitiveType apply(Component s) {
				return s.createOwnedPrimitiveType(name);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#createOwnedInterface()
	 * @generated
	 */
	public static Function<Component, Interface> createOwnedInterface(final String name) {
		return new Function<Component, Interface>() {
			public Interface apply(Component s) {
				return s.createOwnedInterface(name);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#realizedInterfaces()
	 * @generated
	 */
	public static Function<Component, EList<Interface>> realizedInterfaces(final Classifier classifier) {
		return new Function<Component, EList<Interface>>() {
			public EList<Interface> apply(Component s) {
				return s.realizedInterfaces(classifier);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#usedInterfaces()
	 * @generated
	 */
	public static Function<Component, EList<Interface>> usedInterfaces(final Classifier classifier) {
		return new Function<Component, EList<Interface>>() {
			public EList<Interface> apply(Component s) {
				return s.usedInterfaces(classifier);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Component#getRequireds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> getRequireds = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getRequireds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Component#getProvideds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> getProvideds = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getProvideds();
		}
	};

}
