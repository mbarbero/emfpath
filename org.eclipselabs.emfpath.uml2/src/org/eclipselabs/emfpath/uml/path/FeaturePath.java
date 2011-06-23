package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Feature Feature} in a functional way.
 * <p>
 * A feature declares a behavioral or structural characteristic of instances of classifiers.
 * @see org.eclipse.uml2.uml.Feature
 * @generated
 */
public class FeaturePath extends RedefinableElementPath {

	/**
	 * @generated
	 */
	 FeaturePath() {
		super();
	}

	/**
	 * Specifies whether this feature characterizes individual instances classified by the
	 * classifier (false) or the classifier itself (true). 
	 * @see org.eclipse.uml2.uml.Feature#isStatic()
	 * @generated
	 */
	public static final Predicate<Feature> isStatic = new Predicate<Feature>() {
		public boolean apply(Feature s) {
			return s.isStatic();
		}
	};

	/**
	 * The Classifiers that have this Feature as a feature. 
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = new Function<Feature, EList<Classifier>>() {
		public EList<Classifier> apply(Feature s) {
			return s.getFeaturingClassifiers();
		}
	};
	
	

}
