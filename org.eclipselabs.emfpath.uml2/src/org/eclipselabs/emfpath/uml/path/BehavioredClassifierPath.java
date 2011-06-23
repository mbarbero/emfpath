package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Trigger;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.BehavioredClassifier BehavioredClassifier} in a functional way.
 * <p>
 * A behaviored classifier may have an interface realization.
A classifier can have
 * behavior specifications defined in its namespace. One of these may specify the behavior
 * of the classifier itself. 
 * @see org.eclipse.uml2.uml.BehavioredClassifier
 * @generated
 */
public class BehavioredClassifierPath extends ClassifierPath {

	/**
	 * @generated
	 */
	 BehavioredClassifierPath() {
		super();
	}

	/**
	 * References behavior specifications owned by a classifier. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Behavior>> ownedBehavior = new Function<BehavioredClassifier, EList<Behavior>>() {
		public EList<Behavior> apply(BehavioredClassifier s) {
			return s.getOwnedBehaviors();
		}
	};

	/**
	 * A behavior specification that specifies the behavior of the classifier itself. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, Behavior> classifierBehavior = new Function<BehavioredClassifier, Behavior>() {
		public Behavior apply(BehavioredClassifier s) {
			return s.getClassifierBehavior();
		}
	};

	/**
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations
	 * reference the Interfaces of which the BehavioredClassifier is an implementation. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<InterfaceRealization>> interfaceRealization = new Function<BehavioredClassifier, EList<InterfaceRealization>>() {
		public EList<InterfaceRealization> apply(BehavioredClassifier s) {
			return s.getInterfaceRealizations();
		}
	};

	/**
	 * References Trigger descriptions owned by a Classifier. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Trigger>> ownedTrigger = new Function<BehavioredClassifier, EList<Trigger>>() {
		public EList<Trigger> apply(BehavioredClassifier s) {
			return s.getOwnedTriggers();
		}
	};
	
	/**
	 * If a behavior is classifier behavior, it does not have a specification.
	self.classifierBehavior.notEmpty()
	 * implies self.specification.isEmpty() 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<BehavioredClassifier> validateClassBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<BehavioredClassifier>() {
			public boolean apply(BehavioredClassifier s) {
				return s.validateClassBehavior(diagnostics, context);
			}
		};
	}

	/**
	 * Retrieves the interfaces on which this behaviored classifier has an interface realization
	 * dependency. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getImplementedInterfaces = new Function<BehavioredClassifier, EList<Interface>>() {
		public EList<Interface> apply(BehavioredClassifier s) {
			return s.getImplementedInterfaces();
		}
	};

	/**
	 * Retrieves all the interfaces on which this behaviored classifier or any of its parents
	 * has an interface realization dependency. 
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getAllImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getAllImplementedInterfaces = new Function<BehavioredClassifier, EList<Interface>>() {
		public EList<Interface> apply(BehavioredClassifier s) {
			return s.getAllImplementedInterfaces();
		}
	};

}
