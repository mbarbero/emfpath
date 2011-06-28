package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Substitution;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Substitution Substitution} in a functional way.
 * <p>
 * A substitution is a relationship between two classifiers signifies that the substituting
 * classifier complies with the contract specified by the contract classifier. This implies
 * that instances of the substituting classifier are runtime substitutable where instances
 * of the contract classifier are expected. 
 * @see org.eclipse.uml2.uml.Substitution
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
	 * The contract with which the substituting classifier complies. 
	 * @see org.eclipse.uml2.uml.Substitution#getContract()
	 * @generated
	 */
	public static final Function<Substitution, Classifier> contract = new Function<Substitution, Classifier>() {
    public Classifier apply(Substitution s) {
      return s.getContract();
    }
  };

	/**
	 * Instances of the substituting classifier are runtime substitutable where instances
	 * of the contract classifier are expected. 
	 * @see org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier()
	 * @generated
	 */
	public static final Function<Substitution, Classifier> substitutingClassifier = new Function<Substitution, Classifier>() {
    public Classifier apply(Substitution s) {
      return s.getSubstitutingClassifier();
    }
  };
	
	

}
