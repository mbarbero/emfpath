package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * @generated
 */
public class AbstractionPath extends DependencyPath {

	/**
	 * @generated
	 */
	 AbstractionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Abstraction#getMapping()
	 * @generated
	 */
	public static final Function<Abstraction, OpaqueExpression> mapping = new Function<Abstraction, OpaqueExpression>() {
		public OpaqueExpression apply(Abstraction s) {
			return s.getMapping();
		}
	};
	
	

}
