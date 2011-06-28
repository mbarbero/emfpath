package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Port Port} in a functional way.
 * <p>
 * A port is a property of a classifier that specifies a distinct interaction point between
 * that classifier and its environment or between the (behavior of the) classifier and
 * its internal parts. Ports are connected to properties of the classifier by connectors
 * through which requests can be made to invoke the behavioral features of a classifier.
 * A Port may specify the services a classifier provides (offers) to its environment
 * as well as the services that a classifier expects (requires) of its environment.
A
 * port has an associated protocol state machine. 
 * @see org.eclipse.uml2.uml.Port
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
	 * Specifies whether requests arriving at this port are sent to the classifier behavior
	 * of this classifier. Such ports are referred to as behavior port. Any invocation of
	 * a behavioral feature targeted at a behavior port will be handled by the instance of
	 * the owning classifier itself, rather than by any instances that this classifier may
	 * contain. 
	 * @see org.eclipse.uml2.uml.Port#isBehavior()
	 * @generated
	 */
	public static final ComposablePredicate<Port> isBehavior = new ComposablePredicate<Port>() {
    public boolean apply(Port s) {
      return s.isBehavior();
    }
  };

	/**
	 * If true indicates that this port is used to provide the published functionality of
	 * a classifier; if false, this port is used to implement the classifier but is not part
	 * of the essential externally-visible functionality of the classifier and can, therefore,
	 * be altered or deleted along with the internal implementation of the classifier and
	 * other properties that are considered part of its implementation. 
	 * @see org.eclipse.uml2.uml.Port#isService()
	 * @generated
	 */
	public static final ComposablePredicate<Port> isService = new ComposablePredicate<Port>() {
    public boolean apply(Port s) {
      return s.isService();
    }
  };

	/**
	 * References the interfaces specifying the set of operations and receptions which the
	 * classifier expects its environment to handle. This association is derived as the set
	 * of interfaces required by the type of the port or its supertypes. 
	 * @see org.eclipse.uml2.uml.Port#getRequireds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> required = new Function<Port, EList<Interface>>() {
    public EList<Interface> apply(Port s) {
      return s.getRequireds();
    }
  };

	/**
	 * A port may be redefined when its containing classifier is specialized. The redefining
	 * port may have additional interfaces to those that are associated with the redefined
	 * port or it may replace an interface by one of its subtypes. 
	 * @see org.eclipse.uml2.uml.Port#getRedefinedPorts()
	 * @generated
	 */
	public static final Function<Port, EList<Port>> redefinedPort = new Function<Port, EList<Port>>() {
    public EList<Port> apply(Port s) {
      return s.getRedefinedPorts();
    }
  };

	/**
	 * References the interfaces specifying the set of operations and receptions which the
	 * classifier offers to its environment, and which it will handle either directly or
	 * by forwarding it to a part of its internal structure. This association is derived
	 * from the interfaces realized by the type of the port or by the type of the port, if
	 * the port was typed by an interface.
	 
	 * @see org.eclipse.uml2.uml.Port#getProvideds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> provided = new Function<Port, EList<Interface>>() {
    public EList<Interface> apply(Port s) {
      return s.getProvideds();
    }
  };

	/**
	 * References an optional protocol state machine which describes valid interactions at
	 * this interaction point. 
	 * @see org.eclipse.uml2.uml.Port#getProtocol()
	 * @generated
	 */
	public static final Function<Port, ProtocolStateMachine> protocol = new Function<Port, ProtocolStateMachine>() {
    public ProtocolStateMachine apply(Port s) {
      return s.getProtocol();
    }
  };
	
	/**
	 * The required interfaces of a port must be provided by elements to which the port is
	 * connected.
	true 
	 * @see org.eclipse.uml2.uml.Port#validateRequiredInterfaces(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Port> validateRequiredInterfaces(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Port>() {
      public boolean apply(Port s) {
        return s.validateRequiredInterfaces(diagnostics, context);
      }
    };
  }

	/**
	 * Port.aggregation must be composite.
	true 
	 * @see org.eclipse.uml2.uml.Port#validatePortAggregation(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Port> validatePortAggregation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Port>() {
      public boolean apply(Port s) {
        return s.validatePortAggregation(diagnostics, context);
      }
    };
  }

	/**
	 * When a port is destroyed, all connectors attached to this port will be destroyed also.
	true
	 * @see org.eclipse.uml2.uml.Port#validatePortDestroyed(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Port> validatePortDestroyed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Port>() {
      public boolean apply(Port s) {
        return s.validatePortDestroyed(diagnostics, context);
      }
    };
  }

	/**
	 * A defaultValue for port cannot be specified when the type of the Port is an Interface
	true
	 * @see org.eclipse.uml2.uml.Port#validateDefaultValue(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Port> validateDefaultValue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Port>() {
      public boolean apply(Port s) {
        return s.validateDefaultValue(diagnostics, context);
      }
    };
  }

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Port#getProvideds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> getProvideds = new Function<Port, EList<Interface>>() {
    public EList<Interface> apply(Port s) {
      return s.getProvideds();
    }
  };

	/**
	 * 
	 * @see org.eclipse.uml2.uml.Port#getRequireds()
	 * @generated
	 */
	public static final Function<Port, EList<Interface>> getRequireds = new Function<Port, EList<Interface>>() {
    public EList<Interface> apply(Port s) {
      return s.getRequireds();
    }
  };

}
