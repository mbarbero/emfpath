package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;

/**
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
	 * @see org.eclipse.uml2.uml.Action#getOutputs()
	 * @generated
	 */
	public static final Function<Action, EList<OutputPin>> output = new Function<Action, EList<OutputPin>>() {
		public EList<OutputPin> apply(Action s) {
			return s.getOutputs();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Action#getInputs()
	 * @generated
	 */
	public static final Function<Action, EList<InputPin>> input = new Function<Action, EList<InputPin>>() {
		public EList<InputPin> apply(Action s) {
			return s.getInputs();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Action#getContext()
	 * @generated
	 */
	public static final Function<Action, Classifier> context = new Function<Action, Classifier>() {
		public Classifier apply(Action s) {
			return s.getContext();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Action#getLocalPreconditions()
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPrecondition = new Function<Action, EList<Constraint>>() {
		public EList<Constraint> apply(Action s) {
			return s.getLocalPreconditions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Action#getLocalPostconditions()
	 * @generated
	 */
	public static final Function<Action, EList<Constraint>> localPostcondition = new Function<Action, EList<Constraint>>() {
		public EList<Constraint> apply(Action s) {
			return s.getLocalPostconditions();
		}
	};
	
	

}
