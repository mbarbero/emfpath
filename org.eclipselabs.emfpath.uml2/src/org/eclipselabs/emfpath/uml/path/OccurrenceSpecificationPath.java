package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.OccurrenceSpecification OccurrenceSpecification} in a functional way.
 * <p>
 * An occurrence specification is the basic semantic unit of interactions. The sequences
 * of occurrences specified by them are the meanings of interactions. 
 * @see org.eclipse.uml2.uml.OccurrenceSpecification
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
	 * References the GeneralOrderings that specify EventOcurrences that must occur before
	 * this OccurrenceSpecification
	 
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToBefores()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, EList<GeneralOrdering>> toBefore = new Function<OccurrenceSpecification, EList<GeneralOrdering>>() {
		public EList<GeneralOrdering> apply(OccurrenceSpecification s) {
			return s.getToBefores();
		}
	};

	/**
	 * References a specification of the occurring event. 
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getEvent()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, Event> event = new Function<OccurrenceSpecification, Event>() {
		public Event apply(OccurrenceSpecification s) {
			return s.getEvent();
		}
	};

	/**
	 * References the GeneralOrderings that specify EventOcurrences that must occur after
	 * this OccurrenceSpecification
	 
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToAfters()
	 * @generated
	 */
	public static final Function<OccurrenceSpecification, EList<GeneralOrdering>> toAfter = new Function<OccurrenceSpecification, EList<GeneralOrdering>>() {
		public EList<GeneralOrdering> apply(OccurrenceSpecification s) {
			return s.getToAfters();
		}
	};
	
	

}
