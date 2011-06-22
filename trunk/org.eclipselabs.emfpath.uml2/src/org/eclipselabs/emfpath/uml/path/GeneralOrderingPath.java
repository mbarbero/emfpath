package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getBefore()
	 * @generated
	 */
	public static final Function<GeneralOrdering, OccurrenceSpecification> before = new Function<GeneralOrdering, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(GeneralOrdering s) {
			return s.getBefore();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.GeneralOrdering#getAfter()
	 * @generated
	 */
	public static final Function<GeneralOrdering, OccurrenceSpecification> after = new Function<GeneralOrdering, OccurrenceSpecification>() {
		public OccurrenceSpecification apply(GeneralOrdering s) {
			return s.getAfter();
		}
	};
	
	

}
