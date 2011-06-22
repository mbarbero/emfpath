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
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Behavior>> ownedBehavior = new Function<BehavioredClassifier, EList<Behavior>>() {
		public EList<Behavior> apply(BehavioredClassifier s) {
			return s.getOwnedBehaviors();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, Behavior> classifierBehavior = new Function<BehavioredClassifier, Behavior>() {
		public Behavior apply(BehavioredClassifier s) {
			return s.getClassifierBehavior();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<InterfaceRealization>> interfaceRealization = new Function<BehavioredClassifier, EList<InterfaceRealization>>() {
		public EList<InterfaceRealization> apply(BehavioredClassifier s) {
			return s.getInterfaceRealizations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Trigger>> ownedTrigger = new Function<BehavioredClassifier, EList<Trigger>>() {
		public EList<Trigger> apply(BehavioredClassifier s) {
			return s.getOwnedTriggers();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#validateClassBehavior()
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
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getImplementedInterfaces = new Function<BehavioredClassifier, EList<Interface>>() {
		public EList<Interface> apply(BehavioredClassifier s) {
			return s.getImplementedInterfaces();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.BehavioredClassifier#getAllImplementedInterfaces()
	 * @generated
	 */
	public static final Function<BehavioredClassifier, EList<Interface>> getAllImplementedInterfaces = new Function<BehavioredClassifier, EList<Interface>>() {
		public EList<Interface> apply(BehavioredClassifier s) {
			return s.getAllImplementedInterfaces();
		}
	};

}
