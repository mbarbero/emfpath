package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Lifeline#getRepresents()
	 * @generated
	 */
	public static final Function<Lifeline, ConnectableElement> represents = new Function<Lifeline, ConnectableElement>() {
		public ConnectableElement apply(Lifeline s) {
			return s.getRepresents();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#getInteraction()
	 * @generated
	 */
	public static final Function<Lifeline, Interaction> interaction = new Function<Lifeline, Interaction>() {
		public Interaction apply(Lifeline s) {
			return s.getInteraction();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#getSelector()
	 * @generated
	 */
	public static final Function<Lifeline, ValueSpecification> selector = new Function<Lifeline, ValueSpecification>() {
		public ValueSpecification apply(Lifeline s) {
			return s.getSelector();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#getDecomposedAs()
	 * @generated
	 */
	public static final Function<Lifeline, PartDecomposition> decomposedAs = new Function<Lifeline, PartDecomposition>() {
		public PartDecomposition apply(Lifeline s) {
			return s.getDecomposedAs();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#getCoveredBys()
	 * @generated
	 */
	public static final Function<Lifeline, EList<InteractionFragment>> coveredBy = new Function<Lifeline, EList<InteractionFragment>>() {
		public EList<InteractionFragment> apply(Lifeline s) {
			return s.getCoveredBys();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Lifeline#validateInteractionUsesShareLifeline()
	 * @generated
	 */
	public static Predicate<Lifeline> validateInteractionUsesShareLifeline(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Lifeline>() {
			public boolean apply(Lifeline s) {
				return s.validateInteractionUsesShareLifeline(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#validateSelectorSpecified()
	 * @generated
	 */
	public static Predicate<Lifeline> validateSelectorSpecified(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Lifeline>() {
			public boolean apply(Lifeline s) {
				return s.validateSelectorSpecified(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Lifeline#validateSameClassifier()
	 * @generated
	 */
	public static Predicate<Lifeline> validateSameClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Lifeline>() {
			public boolean apply(Lifeline s) {
				return s.validateSameClassifier(diagnostics, context);
			}
		};
	}

}
