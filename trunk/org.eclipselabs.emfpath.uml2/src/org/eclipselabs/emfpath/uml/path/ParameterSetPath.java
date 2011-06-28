package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ParameterSet ParameterSet} in a functional way.
 * <p>
 * A parameter set is an element that provides alternative sets of inputs or outputs
 * that a behavior may use. 
 * @see org.eclipse.uml2.uml.ParameterSet
 * @generated
 */
public class ParameterSetPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private ParameterSetPath() {
    super();
  }

	/**
	 * Parameters in the parameter set. 
	 * @see org.eclipse.uml2.uml.ParameterSet#getParameters()
	 * @generated
	 */
	public static final Function<ParameterSet, EList<Parameter>> parameter = new Function<ParameterSet, EList<Parameter>>() {
    public EList<Parameter> apply(ParameterSet s) {
      return s.getParameters();
    }
  };

	/**
	 * Constraint that should be satisfied for the owner of the parameters in an input parameter
	 * set to start execution using the values provided for those parameters, or the owner
	 * of the parameters in an output parameter set to end execution providing the values
	 * for those parameters, if all preconditions and conditions on input parameter sets
	 * were satisfied. 
	 * @see org.eclipse.uml2.uml.ParameterSet#getConditions()
	 * @generated
	 */
	public static final Function<ParameterSet, EList<Constraint>> condition = new Function<ParameterSet, EList<Constraint>>() {
    public EList<Constraint> apply(ParameterSet s) {
      return s.getConditions();
    }
  };
	
	/**
	 * The parameters in a parameter set must all be inputs or all be outputs of the same
	 * parameterized entity, and the parameter set is owned by that entity.
	true 
	 * @see org.eclipse.uml2.uml.ParameterSet#validateSameParameterizedEntity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ParameterSet> validateSameParameterizedEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ParameterSet>() {
      public boolean apply(ParameterSet s) {
        return s.validateSameParameterizedEntity(diagnostics, context);
      }
    };
  }

	/**
	 * If a behavior has input parameters that are in a parameter set, then any inputs that
	 * are not in a parameter set must be streaming. Same for output parameters.
	true 
	 * @see org.eclipse.uml2.uml.ParameterSet#validateInput(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ParameterSet> validateInput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ParameterSet>() {
      public boolean apply(ParameterSet s) {
        return s.validateInput(diagnostics, context);
      }
    };
  }

	/**
	 * Two parameter sets cannot have exactly the same set of parameters.
	true 
	 * @see org.eclipse.uml2.uml.ParameterSet#validateTwoParameterSets(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ParameterSet> validateTwoParameterSets(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ParameterSet>() {
      public boolean apply(ParameterSet s) {
        return s.validateTwoParameterSets(diagnostics, context);
      }
    };
  }

}
