package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;

/**
 * @generated
 */
public class GeneralizationSetPath extends PackageableElementPath {

	/**
	 * @generated
	 */
	private GeneralizationSetPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#isCovering()
	 * @generated
	 */
	public static final Predicate<GeneralizationSet> isCovering = new Predicate<GeneralizationSet>() {
		public boolean apply(GeneralizationSet s) {
			return s.isCovering();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#isDisjoint()
	 * @generated
	 */
	public static final Predicate<GeneralizationSet> isDisjoint = new Predicate<GeneralizationSet>() {
		public boolean apply(GeneralizationSet s) {
			return s.isDisjoint();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getPowertype()
	 * @generated
	 */
	public static final Function<GeneralizationSet, Classifier> powertype = new Function<GeneralizationSet, Classifier>() {
		public Classifier apply(GeneralizationSet s) {
			return s.getPowertype();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations()
	 * @generated
	 */
	public static final Function<GeneralizationSet, EList<Generalization>> generalization = new Function<GeneralizationSet, EList<Generalization>>() {
		public EList<Generalization> apply(GeneralizationSet s) {
			return s.getGeneralizations();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#validateGeneralizationSameClassifier()
	 * @generated
	 */
	public static Predicate<GeneralizationSet> validateGeneralizationSameClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<GeneralizationSet>() {
			public boolean apply(GeneralizationSet s) {
				return s.validateGeneralizationSameClassifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.GeneralizationSet#validateMapsToGeneralizationSet()
	 * @generated
	 */
	public static Predicate<GeneralizationSet> validateMapsToGeneralizationSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<GeneralizationSet>() {
			public boolean apply(GeneralizationSet s) {
				return s.validateMapsToGeneralizationSet(diagnostics, context);
			}
		};
	}

}
