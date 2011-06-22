package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Property;

/**
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
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> definingEnd = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getDefiningEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getRole()
	 * @generated
	 */
	public static final Function<ConnectorEnd, ConnectableElement> role = new Function<ConnectorEnd, ConnectableElement>() {
		public ConnectableElement apply(ConnectorEnd s) {
			return s.getRole();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getPartWithPort()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> partWithPort = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getPartWithPort();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateMultiplicity()
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
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validatePartWithPortEmpty()
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
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateRoleAndPartWithPort()
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
	 * @see org.eclipse.uml2.uml.ConnectorEnd#validateSelfPartWithPort()
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
	 * @see org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd()
	 * @generated
	 */
	public static final Function<ConnectorEnd, Property> getDefiningEnd = new Function<ConnectorEnd, Property>() {
		public Property apply(ConnectorEnd s) {
			return s.getDefiningEnd();
		}
	};

}
