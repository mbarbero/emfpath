package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Lifeline Lifeline} in a functional way.
 * <p>
 * A lifeline represents an individual participant in the interaction. While parts and
 * structural features may have multiplicity greater than 1, lifelines represent only
 * one interacting entity. 
 * @see org.eclipse.uml2.uml.Lifeline
 * @generated
 */
public class LifelinePath extends NamedElementPath {

	/**
	 * @generated
	 */
	private LifelinePath() {
    super();
  }

	/**
	 * References the ConnectableElement within the classifier that contains the enclosing
	 * interaction. 
	 * @see org.eclipse.uml2.uml.Lifeline#getRepresents()
	 * @generated
	 */
	public static final Function<Lifeline, ConnectableElement> represents = new Function<Lifeline, ConnectableElement>() {
    public ConnectableElement apply(Lifeline s) {
      return s.getRepresents();
    }
  };

	/**
	 * References the Interaction enclosing this Lifeline. 
	 * @see org.eclipse.uml2.uml.Lifeline#getInteraction()
	 * @generated
	 */
	public static final Function<Lifeline, Interaction> interaction = new Function<Lifeline, Interaction>() {
    public Interaction apply(Lifeline s) {
      return s.getInteraction();
    }
  };

	/**
	 * If the referenced ConnectableElement is multivalued, then this specifies the specific
	 * individual part within that set. 
	 * @see org.eclipse.uml2.uml.Lifeline#getSelector()
	 * @generated
	 */
	public static final Function<Lifeline, ValueSpecification> selector = new Function<Lifeline, ValueSpecification>() {
    public ValueSpecification apply(Lifeline s) {
      return s.getSelector();
    }
  };

	/**
	 * References the Interaction that represents the decomposition. 
	 * @see org.eclipse.uml2.uml.Lifeline#getDecomposedAs()
	 * @generated
	 */
	public static final Function<Lifeline, PartDecomposition> decomposedAs = new Function<Lifeline, PartDecomposition>() {
    public PartDecomposition apply(Lifeline s) {
      return s.getDecomposedAs();
    }
  };

	/**
	 * References the InteractionFragments in which this Lifeline takes part. 
	 * @see org.eclipse.uml2.uml.Lifeline#getCoveredBys()
	 * @generated
	 */
	public static final Function<Lifeline, EList<InteractionFragment>> coveredBy = new Function<Lifeline, EList<InteractionFragment>>() {
    public EList<InteractionFragment> apply(Lifeline s) {
      return s.getCoveredBys();
    }
  };
	
	/**
	 * If two (or more) InteractionUses within one Interaction, refer to Interactions with
	 * 'common Lifelines,' those Lifelines must also appear in the Interaction with the InteractionUses.
	 * By common Lifelines we mean Lifelines with the same selector and represents associations.
	true
	 * @see org.eclipse.uml2.uml.Lifeline#validateInteractionUsesShareLifeline(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Lifeline> validateInteractionUsesShareLifeline(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Lifeline>() {
      public boolean apply(Lifeline s) {
        return s.validateInteractionUsesShareLifeline(diagnostics, context);
      }
    };
  }

	/**
	 * The selector for a Lifeline must only be specified if the referenced Part is multivalued.
	(self.selector->isEmpty()
	 * implies not self.represents.isMultivalued()) or
	(not self.selector->isEmpty() implies
	 * self.represents.isMultivalued())
	 
	 * @see org.eclipse.uml2.uml.Lifeline#validateSelectorSpecified(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Lifeline> validateSelectorSpecified(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Lifeline>() {
      public boolean apply(Lifeline s) {
        return s.validateSelectorSpecified(diagnostics, context);
      }
    };
  }

	/**
	 * The classifier containing the referenced ConnectableElement must be the same classifier,
	 * or an ancestor, of the classifier that contains the interaction enclosing this lifeline.
	if
	 * (represents->notEmpty()) then
	(if selector->notEmpty() then represents.isMultivalued()
	 * else not represents.isMultivalued())
	 
	 * @see org.eclipse.uml2.uml.Lifeline#validateSameClassifier(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Lifeline> validateSameClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Lifeline>() {
      public boolean apply(Lifeline s) {
        return s.validateSameClassifier(diagnostics, context);
      }
    };
  }

}
