package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LinkEndCreationData LinkEndCreationData} in a functional way.
 * <p>
 * A link end creation data is not an action. It is an element that identifies links.
 * It identifies one end of a link to be created by a create link action. 
 * @see org.eclipse.uml2.uml.LinkEndCreationData
 * @generated
 */
public class LinkEndCreationDataPath extends LinkEndDataPath {

	/**
	 * @generated
	 */
	private LinkEndCreationDataPath() {
    super();
  }

	/**
	 * Specifies whether the existing links emanating from the object on this end should
	 * be destroyed before creating a new link. 
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#isReplaceAll()
	 * @generated
	 */
	public static final ComposablePredicate<LinkEndCreationData> isReplaceAll = new ComposablePredicate<LinkEndCreationData>() {
    public boolean apply(LinkEndCreationData s) {
      return s.isReplaceAll();
    }
  };

	/**
	 * Specifies where the new link should be inserted for ordered association ends, or where
	 * an existing link should be moved to. The type of the input is UnlimitedNatural, but
	 * the input cannot be zero. This pin is omitted for association ends that are not ordered.
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#getInsertAt()
	 * @generated
	 */
	public static final Function<LinkEndCreationData, InputPin> insertAt = new Function<LinkEndCreationData, InputPin>() {
    public InputPin apply(LinkEndCreationData s) {
      return s.getInsertAt();
    }
  };
	
	/**
	 * LinkEndCreationData can only be end data for CreateLinkAction or one of its specializations.
	self.LinkAction.oclIsKindOf(CreateLinkAction)
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#validateCreateLinkAction(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndCreationData> validateCreateLinkAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndCreationData>() {
      public boolean apply(LinkEndCreationData s) {
        return s.validateCreateLinkAction(diagnostics, context);
      }
    };
  }

	/**
	 * Link end creation data for ordered association ends must have a single input pin for
	 * the insertion point with type UnlimitedNatural and multiplicity of 1..1, otherwise
	 * the action has no input pin for the insertion point.
	let insertAtPins : Collection
	 * = self.insertAt in
	if self.end.ordering = #unordered
	then insertAtPins->size() = 0
	else
	 * let insertAtPin : InputPin = insertAts->asSequence()->first() in
	insertAtPins->size()
	 * = 1
	and insertAtPin.type = UnlimitedNatural
	and insertAtPin.multiplicity.is(1,1))
	endif
	
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#validateSingleInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndCreationData> validateSingleInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndCreationData>() {
      public boolean apply(LinkEndCreationData s) {
        return s.validateSingleInputPin(diagnostics, context);
      }
    };
  }

}
