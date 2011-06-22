package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;

/**
 * @generated
 */
public class InstanceValuePath extends ValueSpecificationPath {

	/**
	 * @generated
	 */
	private InstanceValuePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.InstanceValue#getInstance()
	 * @generated
	 */
	public static final Function<InstanceValue, InstanceSpecification> instance = new Function<InstanceValue, InstanceSpecification>() {
		public InstanceSpecification apply(InstanceValue s) {
			return s.getInstance();
		}
	};
	
	

}
