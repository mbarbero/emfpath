package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Connector Connector} in a functional way.
 * <p>
 * Specifies a link that enables communication between two or more instances. This link
 * may be an instance of an association, or it may represent the possibility of the instances
 * being able to communicate because their identities are known by virtue of being passed
 * in as parameters, held in variables or slots, or because the communicating instances
 * are the same instance. The link may be realized by something as simple as a pointer
 * or by something as complex as a network connection. In contrast to associations, which
 * specify links between any instance of the associated classifiers, connectors specify
 * links between instances playing the connected parts only.
A delegation connector
 * is a connector that links the external contract of a component (as specified by its
 * ports) to the internal realization of that behavior by the component's parts. It represents
 * the forwarding of signals (operation requests and events): a signal that arrives at
 * a port that has a delegation connector to a part or to another port will be passed
 * on to that target for handling.
An assembly connector is a connector between two
 * components that defines that one component provides the services that another component
 * requires. An assembly connector is a connector that is defined from a required interface
 * or port to a provided interface or port. 
 * @see org.eclipse.uml2.uml.Connector
 * @generated
 */
public class ConnectorPath extends FeaturePath {

	/**
	 * @generated
	 */
	private ConnectorPath() {
    super();
  }

	/**
	 * An optional association that specifies the link corresponding to this connector. 
	 * @see org.eclipse.uml2.uml.Connector#getType()
	 * @generated
	 */
	public static final Function<Connector, Association> type = new Function<Connector, Association>() {
    public Association apply(Connector s) {
      return s.getType();
    }
  };

	/**
	 * A connector may be redefined when its containing classifier is specialized. The redefining
	 * connector may have a type that specializes the type of the redefined connector. The
	 * types of the connector ends of the redefining connector may specialize the types of
	 * the connector ends of the redefined connector. The properties of the connector ends
	 * of the redefining connector may be replaced. 
	 * @see org.eclipse.uml2.uml.Connector#getRedefinedConnectors()
	 * @generated
	 */
	public static final Function<Connector, EList<Connector>> redefinedConnector = new Function<Connector, EList<Connector>>() {
    public EList<Connector> apply(Connector s) {
      return s.getRedefinedConnectors();
    }
  };

	/**
	 * A connector consists of at least two connector ends, each representing the participation
	 * of instances of the classifiers typing the connectable elements attached to this end.
	 * The set of connector ends is ordered. 
	 * @see org.eclipse.uml2.uml.Connector#getEnds()
	 * @generated
	 */
	public static final Function<Connector, EList<ConnectorEnd>> end = new Function<Connector, EList<ConnectorEnd>>() {
    public EList<ConnectorEnd> apply(Connector s) {
      return s.getEnds();
    }
  };

	/**
	 * Indicates the kind of connector. 
	 * @see org.eclipse.uml2.uml.Connector#getKind()
	 * @generated
	 */
	public static final Function<Connector, ConnectorKind> kind = new Function<Connector, ConnectorKind>() {
    public ConnectorKind apply(Connector s) {
      return s.getKind();
    }
  };

	/**
	 * The set of Behaviors that specify the valid interaction patterns across the connector.
	 * @see org.eclipse.uml2.uml.Connector#getContracts()
	 * @generated
	 */
	public static final Function<Connector, EList<Behavior>> contract = new Function<Connector, EList<Behavior>>() {
    public EList<Behavior> apply(Connector s) {
      return s.getContracts();
    }
  };
	
	/**
	 * The types of the connectable elements that the ends of a connector are attached to
	 * must conform to the types of the association ends of the association that types the
	 * connector, if any.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateTypes(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateTypes(diagnostics, context);
      }
    };
  }

	/**
	 * The connectable elements attached to the ends of a connector must be compatible.
	true
	 * @see org.eclipse.uml2.uml.Connector#validateCompatible(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateCompatible(diagnostics, context);
      }
    };
  }

	/**
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector
	 * must be roles of the Classifier that owned the Connector, or they must be ports of
	 * such roles.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateRoles(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateRoles(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateRoles(diagnostics, context);
      }
    };
  }

	/**
	 * A delegation connector must only be defined between used Interfaces or Ports of the
	 * same kind, e.g. between two provided Ports or between two required Ports.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacesPorts(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateBetweenInterfacesPorts(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateBetweenInterfacesPorts(diagnostics, context);
      }
    };
  }

	/**
	 * If a delegation connector is defined between a used Interface or Port and an internal
	 * Part Classifier, then that Classifier must have an 'implements' relationship to the
	 * Interface type of that Port.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortImplements(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateBetweenInterfacePortImplements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateBetweenInterfacePortImplements(diagnostics, context);
      }
    };
  }

	/**
	 * If a delegation connector is defined between a source Interface or Port and a target
	 * Interface or Port, then the target Interface must support a signature compatible subset
	 * of Operations of the source Interface or Port.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortSignature(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateBetweenInterfacePortSignature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateBetweenInterfacePortSignature(diagnostics, context);
      }
    };
  }

	/**
	 * In a complete model, if a source Port has delegation connectors to a set of delegated
	 * target Ports, then the union of the Interfaces of these target Ports must be signature
	 * compatible with the Interface that types the source Port.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateUnionSignatureCompatible(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateUnionSignatureCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateUnionSignatureCompatible(diagnostics, context);
      }
    };
  }

	/**
	 * An assembly connector must only be defined from a required Interface or Ports to a
	 * provided Interface or Port.
	true 
	 * @see org.eclipse.uml2.uml.Connector#validateAssemblyConnector(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Connector> validateAssemblyConnector(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Connector>() {
      public boolean apply(Connector s) {
        return s.validateAssemblyConnector(diagnostics, context);
      }
    };
  }

}
