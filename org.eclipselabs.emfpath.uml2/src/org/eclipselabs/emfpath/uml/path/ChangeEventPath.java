package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class ChangeEventPath extends EventPath {

	/**
	 * @generated
	 */
	private ChangeEventPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ChangeEvent#getChangeExpression()
	 * @generated
	 */
	public static final Function<ChangeEvent, ValueSpecification> changeExpression = new Function<ChangeEvent, ValueSpecification>() {
		public ValueSpecification apply(ChangeEvent s) {
			return s.getChangeExpression();
		}
	};
	
	

}
