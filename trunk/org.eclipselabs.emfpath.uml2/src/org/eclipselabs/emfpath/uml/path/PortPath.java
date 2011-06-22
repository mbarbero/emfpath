package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.ProtocolStateMachine;

/**
 * @generated
 */
public class PortPath extends PropertyPath {

	/**
	 * @generated
	 */
	private PortPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Port#isBehavior()
	 * @generated
	 */
	public static final Predicate<Port> isBehavior = new Predicate<Port>() {
		public boolean apply(Port s) {
			return s.isBehavior();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#isService()
	 * @generated
	 */
	public static final Predicate<Port> isService = new Predicate<Port>() {
		public boolean apply(Port s) {
			return s.isService();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#getRequireds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> required = new Function<Port, EList<Interface>>() {
		public EList<Interface> apply(Port s) {
			return s.getRequireds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#getRedefinedPorts()
	 * @generated
	 */
	public static final Function<Port, EList<Port>> redefinedPort = new Function<Port, EList<Port>>() {
		public EList<Port> apply(Port s) {
			return s.getRedefinedPorts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#getProvideds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> provided = new Function<Port, EList<Interface>>() {
		public EList<Interface> apply(Port s) {
			return s.getProvideds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#getProtocol()
	 * @generated
	 */
	public static final Function<Port, ProtocolStateMachine> protocol = new Function<Port, ProtocolStateMachine>() {
		public ProtocolStateMachine apply(Port s) {
			return s.getProtocol();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Port#validateRequiredInterfaces()
	 * @generated
	 */
	public static Predicate<Port> validateRequiredInterfaces(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Port>() {
			public boolean apply(Port s) {
				return s.validateRequiredInterfaces(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Port#validatePortAggregation()
	 * @generated
	 */
	public static Predicate<Port> validatePortAggregation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Port>() {
			public boolean apply(Port s) {
				return s.validatePortAggregation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Port#validatePortDestroyed()
	 * @generated
	 */
	public static Predicate<Port> validatePortDestroyed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Port>() {
			public boolean apply(Port s) {
				return s.validatePortDestroyed(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Port#validateDefaultValue()
	 * @generated
	 */
	public static Predicate<Port> validateDefaultValue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Port>() {
			public boolean apply(Port s) {
				return s.validateDefaultValue(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Port#getProvideds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> getProvideds = new Function<Port, EList<Interface>>() {
		public EList<Interface> apply(Port s) {
			return s.getProvideds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Port#getRequireds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> getRequireds = new Function<Port, EList<Interface>>() {
		public EList<Interface> apply(Port s) {
			return s.getRequireds();
		}
	};

}
