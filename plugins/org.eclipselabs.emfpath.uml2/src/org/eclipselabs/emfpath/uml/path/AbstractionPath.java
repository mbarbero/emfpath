package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.OpaqueExpression;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Abstraction Abstraction} in a functional way.
 * <p>
 * An abstraction is a relationship that relates two elements or sets of elements that
 * represent the same concept at different levels of abstraction or from different viewpoints.
 * @see org.eclipse.uml2.uml.Abstraction
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
	 * An composition of an Expression that states the abstraction relationship between the
	 * supplier and the client. In some cases, such as Derivation, it is usually formal and
	 * unidirectional; in other cases, such as Trace, it is usually informal and bidirectional.
	 * The mapping expression is optional and may be omitted if the precise relationship
	 * between the elements is not specified. 
	 * @see org.eclipse.uml2.uml.Abstraction#getMapping()
	 * @generated
	 */
	public static final Function<Abstraction, OpaqueExpression> mapping = new Function<Abstraction, OpaqueExpression>() {
    public OpaqueExpression apply(Abstraction s) {
      return s.getMapping();
    }
  };
	
	

}
