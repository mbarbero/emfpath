package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LiteralBoolean LiteralBoolean} in a functional way.
 * <p>
 * A literal Boolean is a specification of a Boolean value. 
 * @see org.eclipse.uml2.uml.LiteralBoolean
 * @generated
 */
public class LiteralBooleanPath extends LiteralSpecificationPath {

	/**
	 * @generated
	 */
	private LiteralBooleanPath() {
    super();
  }

	/**
	 * The specified Boolean value. 
	 * @see org.eclipse.uml2.uml.LiteralBoolean#isValue()
	 * @generated
	 */
	public static final ComposablePredicate<LiteralBoolean> isValue = new ComposablePredicate<LiteralBoolean>() {
    public boolean apply(LiteralBoolean s) {
      return s.isValue();
    }
  };
	
	

}
