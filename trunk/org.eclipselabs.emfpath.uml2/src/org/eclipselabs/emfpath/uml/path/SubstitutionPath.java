package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Substitution;

/**
 * @generated
 */
public class SubstitutionPath extends RealizationPath {

	/**
	 * @generated
	 */
	private SubstitutionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Substitution#getContract()
	 * @generated
	 */
	public static final Function<Substitution, Classifier> contract = new Function<Substitution, Classifier>() {
		public Classifier apply(Substitution s) {
			return s.getContract();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier()
	 * @generated
	 */
	public static final Function<Substitution, Classifier> substitutingClassifier = new Function<Substitution, Classifier>() {
		public Classifier apply(Substitution s) {
			return s.getSubstitutingClassifier();
		}
	};
	
	

}
