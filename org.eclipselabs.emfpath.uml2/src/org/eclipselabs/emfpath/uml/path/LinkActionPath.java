package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndData;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LinkAction LinkAction} in a functional way.
 * <p>
 * LinkAction is an abstract class for all link actions that identify their links by
 * the objects at the ends of the links and by the qualifiers at ends of the links. 
 * @see org.eclipse.uml2.uml.LinkAction
 * @generated
 */
public class LinkActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 LinkActionPath() {
		super();
	}

	/**
	 * Data identifying one end of a link by the objects on its ends and qualifiers. 
	 * @see org.eclipse.uml2.uml.LinkAction#getEndData()
	 * @generated
	 */
	public static final Function<LinkAction, EList<LinkEndData>> endData = new Function<LinkAction, EList<LinkEndData>>() {
		public EList<LinkEndData> apply(LinkAction s) {
			return s.getEndData();
		}
	};

	/**
	 * Pins taking end objects and qualifier values as input. 
	 * @see org.eclipse.uml2.uml.LinkAction#getInputValues()
	 * @generated
	 */
	public static final Function<LinkAction, EList<InputPin>> inputValue = new Function<LinkAction, EList<InputPin>>() {
		public EList<InputPin> apply(LinkAction s) {
			return s.getInputValues();
		}
	};
	
	/**
	 * The association ends of the link end data must all be from the same association and
	 * include all and only the association ends of that association.
	self.endData->collect(end)
	 * = self.association()->collect(connection)) 
	 * @see org.eclipse.uml2.uml.LinkAction#validateSameAssociation(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<LinkAction> validateSameAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateSameAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * The association ends of the link end data must not be static.
	self.endData->forall(end.oclisKindOf(NavigableEnd)
	 * implies end.isStatic = #false 
	 * @see org.eclipse.uml2.uml.LinkAction#validateNotStatic(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<LinkAction> validateNotStatic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateNotStatic(diagnostics, context);
			}
		};
	}

	/**
	 * The input pins of the action are the same as the pins of the link end data and insertion
	 * pins.
	self.input->asSet() =
	let ledpins : Set = self.endData->collect(value) in
	if
	 * self.oclIsKindOf(LinkEndCreationData)
	then ledpins->union(self.endData.oclAsType(LinkEndCreationData).insertAt)
	else
	 * ledpins
	 
	 * @see org.eclipse.uml2.uml.LinkAction#validateSamePins(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<LinkAction> validateSamePins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateSamePins(diagnostics, context);
			}
		};
	}

	/**
	 * The association operates on LinkAction. It returns the association of the action.
	result
	 * = self.endData->asSequence().first().end.association 
	 * @see org.eclipse.uml2.uml.LinkAction#association()
	 * @generated
	 */
	public static final Function<LinkAction, Association> association = new Function<LinkAction, Association>() {
		public Association apply(LinkAction s) {
			return s.association();
		}
	};

}
