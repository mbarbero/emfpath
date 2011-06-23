package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.GeneralOrdering GeneralOrdering} in a functional way.
 * <p>
 * A general ordering represents a binary relation between two occurrence specifications,
 * to describe that one occurrence specification must occur before the other in a valid
 * trace. This mechanism provides the ability to define partial orders of occurrence
 * cpecifications that may otherwise not have a specified order. 
 * @see org.eclipse.uml2.uml.GeneralOrdering
 * @generated
 */
public class GeneralOrderingPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private GeneralOrderingPath() {
		super();
	}

	/**
	 * The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced
	 * by after. 
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getBefore()
	 * @generated
	 */
	public static final Function<GeneralOrdering, OccurrenceSpecification> before = new Function<GeneralOrdering, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(GeneralOrdering s) {
			return s.getBefore();
		}
	};

	/**
	 * The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced
	 * by before. 
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getAfter()
	 * @generated
	 */
	public static final Function<GeneralOrdering, OccurrenceSpecification> after = new Function<GeneralOrdering, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(GeneralOrdering s) {
			return s.getAfter();
		}
	};
	
	

}
