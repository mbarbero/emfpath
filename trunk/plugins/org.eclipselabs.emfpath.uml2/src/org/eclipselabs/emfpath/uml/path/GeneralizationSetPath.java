package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.GeneralizationSet GeneralizationSet} in a functional way.
 * <p>
 * A generalization set is a packageable element whose instances define collections of
 * subsets of generalization relationships. 
 * @see org.eclipse.uml2.uml.GeneralizationSet
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
	 * Indicates (via the associated Generalizations) whether or not the set of specific
	 * Classifiers are covering for a particular general classifier. When isCovering is true,
	 * every instance of a particular general Classifier is also an instance of at least
	 * one of its specific Classifiers for the GeneralizationSet. When isCovering is false,
	 * there are one or more instances of the particular general Classifier that are not
	 * instances of at least one of its specific Classifiers defined for the GeneralizationSet.
	 * @see org.eclipse.uml2.uml.GeneralizationSet#isCovering()
	 * @generated
	 */
	public static final ComposablePredicate<GeneralizationSet> isCovering = new ComposablePredicate<GeneralizationSet>() {
    public boolean apply(GeneralizationSet s) {
      return s.isCovering();
    }
  };

	/**
	 * Indicates whether or not the set of specific Classifiers in a Generalization relationship
	 * have instance in common. If isDisjoint is true, the specific Classifiers for a particular
	 * GeneralizationSet have no members in common; that is, their intersection is empty.
	 * If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet
	 * have one or more members in common; that is, their intersection is not empty. For
	 * example, Person could have two Generalization relationships, each with the different
	 * specific Classifier: Manager or Staff. This would be disjoint because every instance
	 * of Person must either be a Manager or Staff. In contrast, Person could have two Generalization
	 * relationships involving two specific (and non-covering) Classifiers: Sales Person
	 * and Manager. This GeneralizationSet would not be disjoint because there are instances
	 * of Person which can be a Sales Person and a Manager. 
	 * @see org.eclipse.uml2.uml.GeneralizationSet#isDisjoint()
	 * @generated
	 */
	public static final ComposablePredicate<GeneralizationSet> isDisjoint = new ComposablePredicate<GeneralizationSet>() {
    public boolean apply(GeneralizationSet s) {
      return s.isDisjoint();
    }
  };

	/**
	 * Designates the Classifier that is defined as the power type for the associated GeneralizationSet.
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getPowertype()
	 * @generated
	 */
	public static final Function<GeneralizationSet, Classifier> powertype = new Function<GeneralizationSet, Classifier>() {
    public Classifier apply(GeneralizationSet s) {
      return s.getPowertype();
    }
  };

	/**
	 * Designates the instances of Generalization which are members of a given GeneralizationSet.
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations()
	 * @generated
	 */
	public static final Function<GeneralizationSet, EList<Generalization>> generalization = new Function<GeneralizationSet, EList<Generalization>>() {
    public EList<Generalization> apply(GeneralizationSet s) {
      return s.getGeneralizations();
    }
  };
	
	/**
	 * Every Generalization associated with a particular GeneralizationSet must have the
	 * same general Classifier.
	generalization->collect(g | g.general)->asSet()->size()
	 * <= 1 
	 * @see org.eclipse.uml2.uml.GeneralizationSet#validateGeneralizationSameClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<GeneralizationSet> validateGeneralizationSameClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<GeneralizationSet>() {
      public boolean apply(GeneralizationSet s) {
        return s.validateGeneralizationSameClassifier(diagnostics, context);
      }
    };
  }

	/**
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general
	 * Classifier in any of the Generalization relationships defined for that GeneralizationSet.
	 * In other words, a power type may not be an instance of itself nor may its instances
	 * be its subclasses.
	true 
	 * @see org.eclipse.uml2.uml.GeneralizationSet#validateMapsToGeneralizationSet(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<GeneralizationSet> validateMapsToGeneralizationSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<GeneralizationSet>() {
      public boolean apply(GeneralizationSet s) {
        return s.validateMapsToGeneralizationSet(diagnostics, context);
      }
    };
  }

}
