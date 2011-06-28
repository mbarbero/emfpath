package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ProtocolConformance ProtocolConformance} in a functional way.
 * <p>
 * Protocol state machines can be redefined into more specific protocol state machines,
 * or into behavioral state machines. Protocol conformance declares that the specific
 * protocol state machine specifies a protocol that conforms to the general state machine
 * one, or that the specific behavioral state machine abide by the protocol of the general
 * protocol state machine. 
 * @see org.eclipse.uml2.uml.ProtocolConformance
 * @generated
 */
public class ProtocolConformancePath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private ProtocolConformancePath() {
    super();
  }

	/**
	 * Specifies the protocol state machine to which the specific state machine conforms.
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getGeneralMachine()
	 * @generated
	 */
	public static final Function<ProtocolConformance, ProtocolStateMachine> generalMachine = new Function<ProtocolConformance, ProtocolStateMachine>() {
    public ProtocolStateMachine apply(ProtocolConformance s) {
      return s.getGeneralMachine();
    }
  };

	/**
	 * Specifies the state machine which conforms to the general state machine. 
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine()
	 * @generated
	 */
	public static final Function<ProtocolConformance, ProtocolStateMachine> specificMachine = new Function<ProtocolConformance, ProtocolStateMachine>() {
    public ProtocolStateMachine apply(ProtocolConformance s) {
      return s.getSpecificMachine();
    }
  };
	
	

}
