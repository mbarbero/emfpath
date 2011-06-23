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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Component Component} in a functional way.
 * <p>
 * A component represents a modular part of a system that encapsulates its contents and
 * whose manifestation is replaceable within its environment.
In the namespace of a
 * component, all model elements that are involved in or related to its definition are
 * either owned or imported explicitly. This may include, for example, use cases and
 * dependencies (e.g. mappings), packages, components, and artifacts. 
 * @see org.eclipse.uml2.uml.Component
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
	 * The kind of instantiation that applies to a Component. If false, the component is
	 * instantiated as an addressable object. If true, the Component is defined at design-time,
	 * but at runtime (or execution-time) an object specified by the Component does not exist,
	 * that is, the component is instantiated indirectly, through the instantiation of its
	 * realizing classifiers or parts. Several standard stereotypes use this meta attribute,
	 * e.g. <<specification>>, <<focus>>, <<subsystem>>. 
	 * @see org.eclipse.uml2.uml.Component#isIndirectlyInstantiated()
	 * @generated
	 */
	public static final Predicate<Component> isIndirectlyInstantiated = new Predicate<Component>() {
		public boolean apply(Component s) {
			return s.isIndirectlyInstantiated();
		}
	};

	/**
	 * The interfaces that the component requires from other components in its environment
	 * in order to be able to offer its full set of provided functionality. These interfaces
	 * may be used by the Component or any of its realizingClassifiers, or they may be the
	 * Interfaces that are required by its public Ports. 
	 * @see org.eclipse.uml2.uml.Component#getRequireds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> required = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getRequireds();
		}
	};

	/**
	 * The interfaces that the component exposes to its environment. These interfaces may
	 * be Realized by the Component or any of its realizingClassifiers, or they may be the
	 * Interfaces that are provided by its public Ports. 
	 * @see org.eclipse.uml2.uml.Component#getProvideds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> provided = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getProvideds();
		}
	};

	/**
	 * The set of PackageableElements that a Component owns. In the namespace of a component,
	 * all model elements that are involved in or related to its definition may be owned
	 * or imported explicitly. These may include e.g. Classes, Interfaces, Components, Packages,
	 * Use cases, Dependencies (e.g. mappings), and Artifacts. 
	 * @see org.eclipse.uml2.uml.Component#getPackagedElements()
	 * @generated
	 */
	public static final Function<Component, EList<PackageableElement>> packagedElement = new Function<Component, EList<PackageableElement>>() {
		public EList<PackageableElement> apply(Component s) {
			return s.getPackagedElements();
		}
	};

	/**
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers
	 * of which the Component is an abstraction; i.e., that realize its behavior. 
	 * @see org.eclipse.uml2.uml.Component#getRealizations()
	 * @generated
	 */
	public static final Function<Component, EList<ComponentRealization>> realization = new Function<Component, EList<ComponentRealization>>() {
		public EList<ComponentRealization> apply(Component s) {
			return s.getRealizations();
		}
	};
	
	/**
	 * Creates a(n) (abstract) class with the specified name as a packaged element of this
	 * component. 
	 * @see org.eclipse.uml2.uml.Component#createOwnedClass(String, boolean)
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
	 * Creates a enumeration with the specified name as a packaged element of this component.
	 * @see org.eclipse.uml2.uml.Component#createOwnedEnumeration(String)
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
	 * Creates a primitive type with the specified name as a packaged element of this component.
	 * @see org.eclipse.uml2.uml.Component#createOwnedPrimitiveType(String)
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
	 * Creates an interface with the specified name as a packaged element of this component.
	 * @see org.eclipse.uml2.uml.Component#createOwnedInterface(String)
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
	 * Utility returning the set of realized interfaces of a component.
	result = (classifier.clientDependency->
	select(dependency|dependency.oclIsKindOf(Realization)
	 * and dependency.supplier.oclIsKindOf(Interface)))->
	collect(dependency|dependency.client)
	 * @see org.eclipse.uml2.uml.Component#realizedInterfaces(Classifier)
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
	 * Utility returning the set of used interfaces of a component.
	result = (classifier.supplierDependency->
	select(dependency|dependency.oclIsKindOf(Usage)
	 * and dependency.supplier.oclIsKindOf(interface)))->
	collect(dependency|dependency.supplier)
	 * @see org.eclipse.uml2.uml.Component#usedInterfaces(Classifier)
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
	 * result = let usingInterfaces : Set(Interface) = self.implementation->collect(impl|impl.contract),
	usedInterfaces
	 * : Set(Interface) = UsedInterfaces(self),
	realizingClassifiers : Set(Classifier) =
	 * Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	allRealizingClassifiers
	 * : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),
	realizingClassifierInterfaces
	 * : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{}
	 * | rci->union(UsedInterfaces(c))),
	ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort),
	usedByPorts
	 * : Set(Interface) = ports.provided in ((usingInterfaces->union(usedInterfaces)->union(realizingClassifierInterfaces))->union(usedByPorts))->asSet()
	 * @see org.eclipse.uml2.uml.Component#getRequireds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> getRequireds = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getRequireds();
		}
	};

	/**
	 * result = let implementedInterfaces : Set(Interface) = self.implementation->collect(impl|impl.contract),
	realizedInterfaces
	 * : Set(Interface) = RealizedInterfaces(self),
	realizingClassifiers : Set(Classifier)
	 * = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	allRealizingClassifiers
	 * : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),
	realizingClassifierInterfaces
	 * : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{}
	 * | rci->union(RealizedInterfaces(c))),
	ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort)
	 * ,
	providedByPorts : Set(Interface) = ports.provided in ((implementedInterfaces->union(realizedInterfaces)->union(realizingClassifierInterfaces))->union(providedByPorts))->asSet()
	 * @see org.eclipse.uml2.uml.Component#getProvideds()
	 * @generated
	 */
	public static final Function<Component, EList<Interface>> getProvideds = new Function<Component, EList<Interface>>() {
		public EList<Interface> apply(Component s) {
			return s.getProvideds();
		}
	};

}
