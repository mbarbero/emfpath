package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ReclassifyObjectAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReclassifyObjectAction ReclassifyObjectAction} in a functional way.
 * <p>
 * A reclassify object action is an action that changes which classifiers classify an
 * object. 
 * @see org.eclipse.uml2.uml.ReclassifyObjectAction
 * @generated
 */
public class ReclassifyObjectActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReclassifyObjectActionPath() {
		super();
	}

	/**
	 * Specifies whether existing classifiers should be removed before adding the new classifiers.
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<ReclassifyObjectAction> isReplaceAll = new Predicate<ReclassifyObjectAction>() {
		public boolean apply(ReclassifyObjectAction s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * A set of classifiers to be removed from the classifiers of the object. 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getOldClassifiers()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, EList<Classifier>> oldClassifier = new Function<ReclassifyObjectAction, EList<Classifier>>() {
		public EList<Classifier> apply(ReclassifyObjectAction s) {
			return s.getOldClassifiers();
		}
	};

	/**
	 * A set of classifiers to be added to the classifiers of the object. 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getNewClassifiers()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, EList<Classifier>> newClassifier = new Function<ReclassifyObjectAction, EList<Classifier>>() {
		public EList<Classifier> apply(ReclassifyObjectAction s) {
			return s.getNewClassifiers();
		}
	};

	/**
	 * Holds the object to be reclassified. 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getObject()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, InputPin> object = new Function<ReclassifyObjectAction, InputPin>() {
		public InputPin apply(ReclassifyObjectAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * None of the new classifiers may be abstract.
	not self.newClassifier->exists(isAbstract
	 * = true) 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateClassifierNotAbstract(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReclassifyObjectAction> validateClassifierNotAbstract(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReclassifyObjectAction>() {
			public boolean apply(ReclassifyObjectAction s) {
				return s.validateClassifierNotAbstract(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the input pin is 1..1.
	self.argument.multiplicity.is(1,1) 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReclassifyObjectAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReclassifyObjectAction>() {
			public boolean apply(ReclassifyObjectAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * The input pin has no type.
	self.argument.type->size() = 0 
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ReclassifyObjectAction> validateInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReclassifyObjectAction>() {
			public boolean apply(ReclassifyObjectAction s) {
				return s.validateInputPin(diagnostics, context);
			}
		};
	}

}
