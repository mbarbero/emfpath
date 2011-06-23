package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Class Class} in a functional way.
 * <p>
 * A class describes a set of objects that share the same specifications of features,
 * constraints, and semantics.
A class may be designated as active (i.e., each of its
 * instances having its own thread of control) or passive (i.e., each of its instances
 * executing within the context of some other object). A class may also specify which
 * signals the instances of this class handle.
A class has the capability to have an
 * internal structure and ports.
Class has derived association that indicates how it
 * may be extended through one or more stereotypes. Stereotype is the only kind of metaclass
 * that cannot be extended by stereotypes. 
 * @see org.eclipse.uml2.uml.Class
 * @generated
 */
public class ClassPath extends EncapsulatedClassifierPath {

	/**
	 * @generated
	 */
	 ClassPath() {
		super();
	}

	/**
	 * References behavior specifications owned by a classifier. 
	 *
	 * @see BehavioredClassifierPath#ownedBehavior()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Behavior>> ownedBehavior = BehavioredClassifierPath.ownedBehavior;

	/**
	 * A behavior specification that specifies the behavior of the classifier itself. 
	 *
	 * @see BehavioredClassifierPath#classifierBehavior()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, Behavior> classifierBehavior = BehavioredClassifierPath.classifierBehavior;

	/**
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations
	 * reference the Interfaces of which the BehavioredClassifier is an implementation. 
	 *
	 * @see BehavioredClassifierPath#interfaceRealization()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<InterfaceRealization>> interfaceRealization = BehavioredClassifierPath.interfaceRealization;

	/**
	 * References Trigger descriptions owned by a Classifier. 
	 *
	 * @see BehavioredClassifierPath#ownedTrigger()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Trigger>> ownedTrigger = BehavioredClassifierPath.ownedTrigger;

	/**
	 * References all the Classifiers that are defined (nested) within the Class. 
	 * @see org.eclipse.uml2.uml.Class#getNestedClassifiers()
	 * @generated
	 */
	public static final Function<Class, EList<Classifier>> nestedClassifier = new Function<Class, EList<Classifier>>() {
		public EList<Classifier> apply(Class s) {
			return s.getNestedClassifiers();
		}
	};

	/**
	 * The operations owned by the class. 
	 * @see org.eclipse.uml2.uml.Class#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Class, EList<Operation>> ownedOperation = new Function<Class, EList<Operation>>() {
		public EList<Operation> apply(Class s) {
			return s.getOwnedOperations();
		}
	};

	/**
	 * This gives the superclasses of a class. 
	 * @see org.eclipse.uml2.uml.Class#getSuperClasses()
	 * @generated
	 */
	public static final Function<Class, EList<Class>> superClass = new Function<Class, EList<Class>>() {
		public EList<Class> apply(Class s) {
			return s.getSuperClasses();
		}
	};

	/**
	 * Determines whether an object specified by this class is active or not. If true, then
	 * the owning class is referred to as an active class. If false, then such a class is
	 * referred to as a passive class. 
	 * @see org.eclipse.uml2.uml.Class#isActive()
	 * @generated
	 */
	public static final Predicate<Class> isActive = new Predicate<Class>() {
		public boolean apply(Class s) {
			return s.isActive();
		}
	};

	/**
	 * Receptions that objects of this class are willing to accept. 
	 * @see org.eclipse.uml2.uml.Class#getOwnedReceptions()
	 * @generated
	 */
	public static final Function<Class, EList<Reception>> ownedReception = new Function<Class, EList<Reception>>() {
		public EList<Reception> apply(Class s) {
			return s.getOwnedReceptions();
		}
	};

	/**
	 * References the Extensions that specify additional properties of the metaclass. The
	 * property is derived from the extensions whose memberEnds are typed by the Class. 
	 * @see org.eclipse.uml2.uml.Class#getExtensions()
	 * @generated
	 */
	public static final Function<Class, EList<Extension>> extension = new Function<Class, EList<Extension>>() {
		public EList<Extension> apply(Class s) {
			return s.getExtensions();
		}
	};
	
	/**
	 * If a behavior is classifier behavior, it does not have a specification.
	self.classifierBehavior.notEmpty()
	 * implies self.specification.isEmpty() 
	 *
	 * @see BehavioredClassifierPath#validateClassBehavior()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<BehavioredClassifier> validateClassBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return BehavioredClassifierPath.validateClassBehavior(diagnostics, context);
	}

	/**
	 * Retrieves the interfaces on which this behaviored classifier has an interface realization
	 * dependency. 
	 *
	 * @see BehavioredClassifierPath#getImplementedInterfaces()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getImplementedInterfaces = BehavioredClassifierPath.getImplementedInterfaces;

	/**
	 * Retrieves all the interfaces on which this behaviored classifier or any of its parents
	 * has an interface realization dependency. 
	 *
	 * @see BehavioredClassifierPath#getAllImplementedInterfaces()
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getAllImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getAllImplementedInterfaces = BehavioredClassifierPath.getAllImplementedInterfaces;

	/**
	 * A passive class may not own receptions.
	not self.isActive implies self.ownedReception.isEmpty()
	 * @see org.eclipse.uml2.uml.Class#validatePassiveClass(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Class> validatePassiveClass(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Class>() {
			public boolean apply(Class s) {
				return s.validatePassiveClass(diagnostics, context);
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Class#getExtensions()
	 * @generated
	 */
	public static final Function<Class, EList<Extension>> getExtensions = new Function<Class, EList<Extension>>() {
		public EList<Extension> apply(Class s) {
			return s.getExtensions();
		}
	};

	/**
	 * Creates an operation with the specified name, parameter names, parameter types, and
	 * return type (or null) as an owned operation of this class. 
	 * @see org.eclipse.uml2.uml.Class#createOwnedOperation(String, EList, EList, Type)
	 * @generated
	 */
	public static Function<Class, Operation> createOwnedOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final Type returnType) {
		return new Function<Class, Operation>() {
			public Operation apply(Class s) {
				return s.createOwnedOperation(name, parameterNames, parameterTypes, returnType);
			}
		};
	}

	/**
	 * Determines whether this class is a metaclass. 
	 * @see org.eclipse.uml2.uml.Class#isMetaclass()
	 * @generated
	 */
	public static final Predicate<Class> isMetaclass = new Predicate<Class>() {
		public boolean apply(Class s) {
			return s.isMetaclass();
		}
	};

}
