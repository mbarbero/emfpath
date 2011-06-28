package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DurationConstraint DurationConstraint} in a functional way.
 * <p>
 * A duration constraint is a constraint that refers to a duration interval. 
 * @see org.eclipse.uml2.uml.DurationConstraint
 * @generated
 */
public class DurationConstraintPath extends IntervalConstraintPath {

	/**
	 * @generated
	 */
	private DurationConstraintPath() {
    super();
  }

	/**
	 * The value of firstEvent[i] is related to constrainedElement[i] (where i is 1 or 2).
	 * If firstEvent[i] is true, then the corresponding observation event is the first time
	 * instant the execution enters constrainedElement[i]. If firstEvent[i] is false, then
	 * the corresponding observation event is the last time instant the execution is within
	 * constrainedElement[i]. Default value is true applied when constrainedElement[i] refers
	 * an element that represents only one time instant. 
	 * @see org.eclipse.uml2.uml.DurationConstraint#getFirstEvents()
	 * @generated
	 */
	public static final Function<DurationConstraint, EList<java.lang.Boolean>> firstEvent = new Function<DurationConstraint, EList<java.lang.Boolean>>() {
    public EList<java.lang.Boolean> apply(DurationConstraint s) {
      return s.getFirstEvents();
    }
  };
	
	/**
	 * The multiplicity of firstEvent must be 2 if the multiplicity of constrainedElement
	 * is 2. Otherwise the multiplicity of firstEvent is 0.
	if (constrainedElement->size()
	 * =2)
	  then (firstEvent->size() = 2) else (firstEvent->size() = 0) 
	 * @see org.eclipse.uml2.uml.DurationConstraint#validateFirstEventMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<DurationConstraint> validateFirstEventMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<DurationConstraint>() {
      public boolean apply(DurationConstraint s) {
        return s.validateFirstEventMultiplicity(diagnostics, context);
      }
    };
  }

}
