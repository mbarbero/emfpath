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
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<ReclassifyObjectAction> isReplaceAll = new Predicate<ReclassifyObjectAction>() {
		public boolean apply(ReclassifyObjectAction s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getOldClassifiers()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, EList<Classifier>> oldClassifier = new Function<ReclassifyObjectAction, EList<Classifier>>() {
		public EList<Classifier> apply(ReclassifyObjectAction s) {
			return s.getOldClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getNewClassifiers()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, EList<Classifier>> newClassifier = new Function<ReclassifyObjectAction, EList<Classifier>>() {
		public EList<Classifier> apply(ReclassifyObjectAction s) {
			return s.getNewClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#getObject()
	 * @generated
	 */
	public static final Function<ReclassifyObjectAction, InputPin> object = new Function<ReclassifyObjectAction, InputPin>() {
		public InputPin apply(ReclassifyObjectAction s) {
			return s.getObject();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateClassifierNotAbstract()
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
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateMultiplicity()
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
	 * @see org.eclipse.uml2.uml.ReclassifyObjectAction#validateInputPin()
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
