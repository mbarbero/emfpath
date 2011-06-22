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
public class GeneralizationPath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private GeneralizationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Generalization#isSubstitutable()
	 * @generated
	 */
	public static final Predicate<Generalization> isSubstitutable = new Predicate<Generalization>() {
		public boolean apply(Generalization s) {
			return s.isSubstitutable();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Generalization#getGeneral()
	 * @generated
	 */
	public static final Function<Generalization, Classifier> general = new Function<Generalization, Classifier>() {
		public Classifier apply(Generalization s) {
			return s.getGeneral();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Generalization#getGeneralizationSets()
	 * @generated
	 */
	public static final Function<Generalization, EList<GeneralizationSet>> generalizationSet = new Function<Generalization, EList<GeneralizationSet>>() {
		public EList<GeneralizationSet> apply(Generalization s) {
			return s.getGeneralizationSets();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Generalization#getSpecific()
	 * @generated
	 */
	public static final Function<Generalization, Classifier> specific = new Function<Generalization, Classifier>() {
		public Classifier apply(Generalization s) {
			return s.getSpecific();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Generalization#validateGeneralizationSameClassifier()
	 * @generated
	 */
	public static Predicate<Generalization> validateGeneralizationSameClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Generalization>() {
			public boolean apply(Generalization s) {
				return s.validateGeneralizationSameClassifier(diagnostics, context);
			}
		};
	}

}
