package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;

/**
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
	 * @see org.eclipse.uml2.uml.Feature#isStatic()
	 * @generated
	 */
	public static final Predicate<Feature> isStatic = new Predicate<Feature>() {
		public boolean apply(Feature s) {
			return s.isStatic();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers()
	 * @generated
	 */
	public static final Function<Feature, EList<Classifier>> featuringClassifier = new Function<Feature, EList<Classifier>>() {
		public EList<Classifier> apply(Feature s) {
			return s.getFeaturingClassifiers();
		}
	};
	
	

}
