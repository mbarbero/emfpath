package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ConnectorEnd ConnectorEnd} in a functional way.
 * <p>
 * A connector end is an endpoint of a connector, which attaches the connector to a connectable
 * element. Each connector end is part of one connector. 
 * @see org.eclipse.uml2.uml.ConnectorEnd
 * @generated
 */
public class ConnectorEndPath extends MultiplicityElementPath {

	/**
	 * @generated
	 */
	private ConnectorEndPath() {
		super();
	}

	/**
	 * A derived association referencing the corresponding association end on the association
	 * which types the connector owing this connector end. This association is derived by
	 * selecting the association end at the same place in the ordering of association ends
	 * as this connector end.
	 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> definingEnd = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getDefiningEnd();
		}
	};

	/**
	 * The connectable element attached at this connector end. When an instance of the containing
	 * classifier is created, a link may (depending on the multiplicities) be created to
	 * an instance of the classifier that types this connectable element.
	 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getRole()
	 * @generated
	 */
	public static final Function<ConnectorEnd, ConnectableElement> role = new Function<ConnectorEnd, ConnectableElement>() {
		public ConnectableElement apply(ConnectorEnd s) {
			return s.getRole();
		}
	};

	/**
	 * Indicates the role of the internal structure of a classifier with the port to which
	 * the connector end is attached. 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getPartWithPort()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> partWithPort = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getPartWithPort();
		}
	};
	
	/**
	 * The multiplicity of the connector end may not be more general than the multiplicity
	 * of the association typing the owning connector.
	true 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectorEnd> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectorEnd>() {
			public boolean apply(ConnectorEnd s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * If a connector end is attached to a port of the containing classifier, partWithPort
	 * will be empty.
	true 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validatePartWithPortEmpty(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectorEnd> validatePartWithPortEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectorEnd>() {
			public boolean apply(ConnectorEnd s) {
				return s.validatePartWithPortEmpty(diagnostics, context);
			}
		};
	}

	/**
	 * If a connector end references both a role and a partWithPort, then the role must be
	 * a port that is defined by the type of the partWithPort.
	true 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateRoleAndPartWithPort(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectorEnd> validateRoleAndPartWithPort(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectorEnd>() {
			public boolean apply(ConnectorEnd s) {
				return s.validateRoleAndPartWithPort(diagnostics, context);
			}
		};
	}

	/**
	 * The property held in self.partWithPort must not be a Port.
	true 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateSelfPartWithPort(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<ConnectorEnd> validateSelfPartWithPort(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConnectorEnd>() {
			public boolean apply(ConnectorEnd s) {
				return s.validateSelfPartWithPort(diagnostics, context);
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> getDefiningEnd = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getDefiningEnd();
		}
	};

}
