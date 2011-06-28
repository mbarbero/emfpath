package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExecutionSpecification ExecutionSpecification} in a functional way.
 * <p>
 * An execution specification is a specification of the execution of a unit of behavior
 * or action within the lifeline. The duration of an execution specification is represented
 * by two cccurrence specifications, the start occurrence specification and the finish
 * occurrence specification. 
 * @see org.eclipse.uml2.uml.ExecutionSpecification
 * @generated
 */
public class ExecutionSpecificationPath extends InteractionFragmentPath {

	/**
	 * @generated
	 */
	 ExecutionSpecificationPath() {
    super();
  }

	/**
	 * References the OccurrenceSpecification that designates the start of the Action or
	 * Behavior 
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#getStart()
	 * @generated
	 */
	public static final Function<ExecutionSpecification, OccurrenceSpecification> start = new Function<ExecutionSpecification, OccurrenceSpecification>() {
    public OccurrenceSpecification apply(ExecutionSpecification s) {
      return s.getStart();
    }
  };

	/**
	 * References the OccurrenceSpecification that designates the finish of the Action or
	 * Behavior. 
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#getFinish()
	 * @generated
	 */
	public static final Function<ExecutionSpecification, OccurrenceSpecification> finish = new Function<ExecutionSpecification, OccurrenceSpecification>() {
    public OccurrenceSpecification apply(ExecutionSpecification s) {
      return s.getFinish();
    }
  };
	
	/**
	 * The startEvent and the finishEvent must be on the same Lifeline
	start.lifeline =
	 * finish.lifeline 
	 * @see org.eclipse.uml2.uml.ExecutionSpecification#validateSameLifeline(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExecutionSpecification> validateSameLifeline(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExecutionSpecification>() {
      public boolean apply(ExecutionSpecification s) {
        return s.validateSameLifeline(diagnostics, context);
      }
    };
  }

}
