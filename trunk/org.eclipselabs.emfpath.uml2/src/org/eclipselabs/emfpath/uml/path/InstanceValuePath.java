package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InstanceValue InstanceValue} in a functional way.
 * <p>
 * An instance value is a value specification that identifies an instance. 
 * @see org.eclipse.uml2.uml.InstanceValue
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
	 * The instance that is the specified value. 
	 * @see org.eclipse.uml2.uml.InstanceValue#getInstance()
	 * @generated
	 */
	public static final Function<InstanceValue, InstanceSpecification> instance = new Function<InstanceValue, InstanceSpecification>() {
		public InstanceSpecification apply(InstanceValue s) {
			return s.getInstance();
		}
	};
	
	

}
