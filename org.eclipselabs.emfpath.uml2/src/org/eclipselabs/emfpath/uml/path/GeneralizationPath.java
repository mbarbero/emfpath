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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Generalization Generalization} in a functional way.
 * <p>
 * A generalization is a taxonomic relationship between a more general classifier and
 * a more specific classifier. Each instance of the specific classifier is also an indirect
 * instance of the general classifier. Thus, the specific classifier inherits the features
 * of the more general classifier.
A generalization relates a specific classifier to
 * a more general classifier, and is owned by the specific classifier. 
 * @see org.eclipse.uml2.uml.Generalization
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
	 * Indicates whether the specific classifier can be used wherever the general classifier
	 * can be used. If true, the execution traces of the specific classifier will be a superset
	 * of the execution traces of the general classifier. 
	 * @see org.eclipse.uml2.uml.Generalization#isSubstitutable()
	 * @generated
	 */
	public static final Predicate<Generalization> isSubstitutable = new Predicate<Generalization>() {
		public boolean apply(Generalization s) {
			return s.isSubstitutable();
		}
	};

	/**
	 * References the general classifier in the Generalization relationship. 
	 * @see org.eclipse.uml2.uml.Generalization#getGeneral()
	 * @generated
	 */
	public static final Function<Generalization, Classifier> general = new Function<Generalization, Classifier>() {
		public Classifier apply(Generalization s) {
			return s.getGeneral();
		}
	};

	/**
	 * Designates a set in which instances of Generalization is considered members. 
	 * @see org.eclipse.uml2.uml.Generalization#getGeneralizationSets()
	 * @generated
	 */
	public static final Function<Generalization, EList<GeneralizationSet>> generalizationSet = new Function<Generalization, EList<GeneralizationSet>>() {
		public EList<GeneralizationSet> apply(Generalization s) {
			return s.getGeneralizationSets();
		}
	};

	/**
	 * References the specializing classifier in the Generalization relationship. 
	 * @see org.eclipse.uml2.uml.Generalization#getSpecific()
	 * @generated
	 */
	public static final Function<Generalization, Classifier> specific = new Function<Generalization, Classifier>() {
		public Classifier apply(Generalization s) {
			return s.getSpecific();
		}
	};
	
	/**
	 * Every Generalization associated with a given GeneralizationSet must have the same
	 * general Classifier. That is, all Generalizations for a particular GeneralizationSet
	 * must have the same superclass.
	true 
	 * @see org.eclipse.uml2.uml.Generalization#validateGeneralizationSameClassifier(DiagnosticChain, Map)
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
