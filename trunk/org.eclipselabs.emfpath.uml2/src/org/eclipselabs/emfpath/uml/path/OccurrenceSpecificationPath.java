package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * @generated
 */
public class OccurrenceSpecificationPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 OccurrenceSpecificationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToBefores()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, EList<GeneralOrdering>> toBefore = new Function<OccurrenceSpecification, EList<GeneralOrdering>>() {
		public EList<GeneralOrdering> apply(OccurrenceSpecification s) {
			return s.getToBefores();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getEvent()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, Event> event = new Function<OccurrenceSpecification, Event>() {
		public Event apply(OccurrenceSpecification s) {
			return s.getEvent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToAfters()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, EList<GeneralOrdering>> toAfter = new Function<OccurrenceSpecification, EList<GeneralOrdering>>() {
		public EList<GeneralOrdering> apply(OccurrenceSpecification s) {
			return s.getToAfters();
		}
	};
	
	

}
