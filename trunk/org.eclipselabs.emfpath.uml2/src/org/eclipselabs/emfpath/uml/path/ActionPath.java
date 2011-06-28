package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Action Action} in a functional way.
 * <p>
 * An action is a named element that is the fundamental unit of executable functionality.
 * The execution of an action represents some transformation or processing in the modeled
 * system, be it a computer system or otherwise.
An action represents a single step
 * within an activity, that is, one that is not further decomposed within the activity.
An
 * action has pre- and post-conditions. 
 * @see org.eclipse.uml2.uml.Action
 * @generated
 */
public class ActionPath extends ExecutableNodePath {

	/**
	 * @generated
	 */
	 ActionPath() {
    super();
  }

	/**
	 * The ordered set of output pins connected to the Action. The action places its results
	 * onto pins in this set. 
	 * @see org.eclipse.uml2.uml.Action#getOutputs()
	 * @generated
	 */
	public static final Function<Action, EList<OutputPin>> output = new Function<Action, EList<OutputPin>>() {
    public EList<OutputPin> apply(Action s) {
      return s.getOutputs();
    }
  };

	/**
	 * The ordered set of input pins connected to the Action. These are among the total set
	 * of inputs. 
	 * @see org.eclipse.uml2.uml.Action#getInputs()
	 * @generated
	 */
	public static final Function<Action, EList<InputPin>> input = new Function<Action, EList<InputPin>>() {
    public EList<InputPin> apply(Action s) {
      return s.getInputs();
    }
  };

	/**
	 * The classifier that owns the behavior of which this action is a part. 
	 * @see org.eclipse.uml2.uml.Action#getContext()
	 * @generated
	 */
	public static final Function<Action, Classifier> context = new Function<Action, Classifier>() {
    public Classifier apply(Action s) {
      return s.getContext();
    }
  };

	/**
	 * Constraint that must be satisfied when execution is started. 
	 * @see org.eclipse.uml2.uml.Action#getLocalPreconditions()
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPrecondition = new Function<Action, EList<Constraint>>() {
    public EList<Constraint> apply(Action s) {
      return s.getLocalPreconditions();
    }
  };

	/**
	 * Constraint that must be satisfied when executed is completed. 
	 * @see org.eclipse.uml2.uml.Action#getLocalPostconditions()
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPostcondition = new Function<Action, EList<Constraint>>() {
    public EList<Constraint> apply(Action s) {
      return s.getLocalPostconditions();
    }
  };
	
	

}
