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
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Behavior>> ownedBehavior = BehavioredClassifierPath.ownedBehavior;

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, Behavior> classifierBehavior = BehavioredClassifierPath.classifierBehavior;

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<InterfaceRealization>> interfaceRealization = BehavioredClassifierPath.interfaceRealization;

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Trigger>> ownedTrigger = BehavioredClassifierPath.ownedTrigger;

	/**
	 * @see org.eclipse.uml2.uml.Class#getNestedClassifiers()
	 * @generated
	 */
	public static final Function<Class, EList<Classifier>> nestedClassifier = new Function<Class, EList<Classifier>>() {
		public EList<Classifier> apply(Class s) {
			return s.getNestedClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Class, EList<Operation>> ownedOperation = new Function<Class, EList<Operation>>() {
		public EList<Operation> apply(Class s) {
			return s.getOwnedOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#getSuperClasses()
	 * @generated
	 */
	public static final Function<Class, EList<Class>> superClass = new Function<Class, EList<Class>>() {
		public EList<Class> apply(Class s) {
			return s.getSuperClasses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#isActive()
	 * @generated
	 */
	public static final Predicate<Class> isActive = new Predicate<Class>() {
		public boolean apply(Class s) {
			return s.isActive();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#getOwnedReceptions()
	 * @generated
	 */
	public static final Function<Class, EList<Reception>> ownedReception = new Function<Class, EList<Reception>>() {
		public EList<Reception> apply(Class s) {
			return s.getOwnedReceptions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#getExtensions()
	 * @generated
	 */
	public static final Function<Class, EList<Extension>> extension = new Function<Class, EList<Extension>>() {
		public EList<Extension> apply(Class s) {
			return s.getExtensions();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior()
	 * @generated
	 */
	public static Predicate<BehavioredClassifier> validateClassBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return BehavioredClassifierPath.validateClassBehavior(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getImplementedInterfaces = BehavioredClassifierPath.getImplementedInterfaces;

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getAllImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getAllImplementedInterfaces = BehavioredClassifierPath.getAllImplementedInterfaces;

	/**
	 * @see org.eclipse.uml2.uml.Class#validatePassiveClass()
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
	 * @see org.eclipse.uml2.uml.Class#getExtensions()
	 * @generated
	 */
	public static final Function<Class, EList<Extension>> getExtensions = new Function<Class, EList<Extension>>() {
		public EList<Extension> apply(Class s) {
			return s.getExtensions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Class#createOwnedOperation()
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
	 * @see org.eclipse.uml2.uml.Class#isMetaclass()
	 * @generated
	 */
	public static final Predicate<Class> isMetaclass = new Predicate<Class>() {
		public boolean apply(Class s) {
			return s.isMetaclass();
		}
	};

}
