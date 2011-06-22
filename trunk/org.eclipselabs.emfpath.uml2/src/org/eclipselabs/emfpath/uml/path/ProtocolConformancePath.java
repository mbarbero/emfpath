package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;

/**
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
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getGeneralMachine()
	 * @generated
	 */
	public static final Function<ProtocolConformance, ProtocolStateMachine> generalMachine = new Function<ProtocolConformance, ProtocolStateMachine>() {
		public ProtocolStateMachine apply(ProtocolConformance s) {
			return s.getGeneralMachine();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProtocolConformance#getSpecificMachine()
	 * @generated
	 */
	public static final Function<ProtocolConformance, ProtocolStateMachine> specificMachine = new Function<ProtocolConformance, ProtocolStateMachine>() {
		public ProtocolStateMachine apply(ProtocolConformance s) {
			return s.getSpecificMachine();
		}
	};
	
	

}
