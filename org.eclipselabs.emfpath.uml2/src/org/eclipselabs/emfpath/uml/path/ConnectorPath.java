package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConnectorKind;

/**
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
	 * @see org.eclipse.uml2.uml.Connector#getType()
	 * @generated
	 */
	public static final Function<Connector, Association> type = new Function<Connector, Association>() {
		public Association apply(Connector s) {
			return s.getType();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Connector#getRedefinedConnectors()
	 * @generated
	 */
	public static final Function<Connector, EList<Connector>> redefinedConnector = new Function<Connector, EList<Connector>>() {
		public EList<Connector> apply(Connector s) {
			return s.getRedefinedConnectors();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Connector#getEnds()
	 * @generated
	 */
	public static final Function<Connector, EList<ConnectorEnd>> end = new Function<Connector, EList<ConnectorEnd>>() {
		public EList<ConnectorEnd> apply(Connector s) {
			return s.getEnds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Connector#getKind()
	 * @generated
	 */
	public static final Function<Connector, ConnectorKind> kind = new Function<Connector, ConnectorKind>() {
		public ConnectorKind apply(Connector s) {
			return s.getKind();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Connector#getContracts()
	 * @generated
	 */
	public static final Function<Connector, EList<Behavior>> contract = new Function<Connector, EList<Behavior>>() {
		public EList<Behavior> apply(Connector s) {
			return s.getContracts();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Connector#validateTypes()
	 * @generated
	 */
	public static Predicate<Connector> validateTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateTypes(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateCompatible()
	 * @generated
	 */
	public static Predicate<Connector> validateCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateCompatible(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateRoles()
	 * @generated
	 */
	public static Predicate<Connector> validateRoles(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateRoles(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacesPorts()
	 * @generated
	 */
	public static Predicate<Connector> validateBetweenInterfacesPorts(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateBetweenInterfacesPorts(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortImplements()
	 * @generated
	 */
	public static Predicate<Connector> validateBetweenInterfacePortImplements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateBetweenInterfacePortImplements(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateBetweenInterfacePortSignature()
	 * @generated
	 */
	public static Predicate<Connector> validateBetweenInterfacePortSignature(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateBetweenInterfacePortSignature(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateUnionSignatureCompatible()
	 * @generated
	 */
	public static Predicate<Connector> validateUnionSignatureCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateUnionSignatureCompatible(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Connector#validateAssemblyConnector()
	 * @generated
	 */
	public static Predicate<Connector> validateAssemblyConnector(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Connector>() {
			public boolean apply(Connector s) {
				return s.validateAssemblyConnector(diagnostics, context);
			}
		};
	}

}
