package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadLinkAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadLinkAction ReadLinkAction} in a functional way.
 * <p>
 * A read link action is a link action that navigates across associations to retrieve
 * objects on one end. 
 * @see org.eclipse.uml2.uml.ReadLinkAction
 * @generated
 */
public class ReadLinkActionPath extends LinkActionPath {

	/**
	 * @generated
	 */
	private ReadLinkActionPath() {
    super();
  }

	/**
	 * The pin on which are put the objects participating in the association at the end not
	 * specified by the inputs.
	 
	 * @see org.eclipse.uml2.uml.ReadLinkAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkAction, OutputPin> result = new Function<ReadLinkAction, OutputPin>() {
    public OutputPin apply(ReadLinkAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * Exactly one link-end data specification (the 'open' end) must not have an end object
	 * input pin.
	self.endData->select(ed | ed.value->size() = 0)->size() = 1 
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateOneOpenEnd(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadLinkAction> validateOneOpenEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadLinkAction>() {
      public boolean apply(ReadLinkAction s) {
        return s.validateOneOpenEnd(diagnostics, context);
      }
    };
  }

	/**
	 * The type and ordering of the result output pin are same as the type and ordering of
	 * the open association end.
	let openend : AssociationEnd = self.endData->select(ed
	 * | ed.value->size() = 0)->asSequence()->first().end in
	self.result.type = openend.type
	and
	 * self.result.ordering = openend.ordering
	 
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateTypeAndOrdering(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadLinkAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadLinkAction>() {
      public boolean apply(ReadLinkAction s) {
        return s.validateTypeAndOrdering(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the open association end must be compatible with the multiplicity
	 * of the result output pin.
	let openend : AssociationEnd = self.endData->select(ed
	 * | ed.value->size() = 0)->asSequence()->first().end in
	openend.multiplicity.compatibleWith(self.result.multiplicity)
	
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateCompatibleMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadLinkAction> validateCompatibleMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadLinkAction>() {
      public boolean apply(ReadLinkAction s) {
        return s.validateCompatibleMultiplicity(diagnostics, context);
      }
    };
  }

	/**
	 * The open end must be navigable.
	let openend : AssociationEnd = self.endData->select(ed
	 * | ed.value->size() = 0)->asSequence()->first().end in
	openend.isNavigable()
	 
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateNavigableOpenEnd(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadLinkAction> validateNavigableOpenEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadLinkAction>() {
      public boolean apply(ReadLinkAction s) {
        return s.validateNavigableOpenEnd(diagnostics, context);
      }
    };
  }

	/**
	 * Visibility of the open end must allow access to the object performing the action.
	let
	 * host : Classifier = self.context in
	let openend : AssociationEnd = self.endData->select(ed
	 * | ed.value->size() = 0)->asSequence()->first().end in
	openend.visibility = #public
	or
	 * self.endData->exists(oed | not oed.end = openend
	and (host = oed.end.participant
	or
	 * (openend.visibility = #protected
	and host.allSupertypes->includes(oed.end.participant))))
	
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateVisibility(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadLinkAction> validateVisibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadLinkAction>() {
      public boolean apply(ReadLinkAction s) {
        return s.validateVisibility(diagnostics, context);
      }
    };
  }

}
