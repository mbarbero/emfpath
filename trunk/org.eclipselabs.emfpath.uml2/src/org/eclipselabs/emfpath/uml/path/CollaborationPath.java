package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class CollaborationPath extends BehavioredClassifierPath {

	/**
	 * @generated
	 */
	private CollaborationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> ownedAttribute = StructuredClassifierPath.ownedAttribute;

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getParts()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> part = StructuredClassifierPath.part;

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getRoles()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<ConnectableElement>> role = StructuredClassifierPath.role;

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Connector>> ownedConnector = StructuredClassifierPath.ownedConnector;

	/**
	 * @see org.eclipse.uml2.uml.Collaboration#getCollaborationRoles()
	 * @generated
	 */
	public static final Function<Collaboration, EList<ConnectableElement>> collaborationRole = new Function<Collaboration, EList<ConnectableElement>>() {
		public EList<ConnectableElement> apply(Collaboration s) {
			return s.getCollaborationRoles();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#validateMultiplicities()
	 * @generated
	 */
	public static Predicate<StructuredClassifier> validateMultiplicities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return StructuredClassifierPath.validateMultiplicities(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute()
	 * @generated
	 */
	public static Function<StructuredClassifier, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
		return StructuredClassifierPath.createOwnedAttribute(name, type, lower, upper);
	}

}
