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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Collaboration Collaboration} in a functional way.
 * <p>
 * A collaboration use represents the application of the pattern described by a collaboration
 * to a specific situation involving specific classes or instances playing the roles
 * of the collaboration. 
 * @see org.eclipse.uml2.uml.Collaboration
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
	 * References the properties owned by the classifier. 
	 *
	 * @see StructuredClassifierPath#ownedAttribute()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> ownedAttribute = StructuredClassifierPath.ownedAttribute;

	/**
	 * References the properties specifying instances that the classifier owns by composition.
	 * This association is derived, selecting those owned properties where isComposite is
	 * true. 
	 *
	 * @see StructuredClassifierPath#part()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getParts()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> part = StructuredClassifierPath.part;

	/**
	 * References the roles that instances may play in this classifier. 
	 *
	 * @see StructuredClassifierPath#role()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getRoles()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<ConnectableElement>> role = StructuredClassifierPath.role;

	/**
	 * References the connectors owned by the classifier. 
	 *
	 * @see StructuredClassifierPath#ownedConnector()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Connector>> ownedConnector = StructuredClassifierPath.ownedConnector;

	/**
	 * References connectable elements (possibly owned by other classifiers) which represent
	 * roles that instances may play in this collaboration. 
	 * @see org.eclipse.uml2.uml.Collaboration#getCollaborationRoles()
	 * @generated
	 */
	public static final Function<Collaboration, EList<ConnectableElement>> collaborationRole = new Function<Collaboration, EList<ConnectableElement>>() {
		public EList<ConnectableElement> apply(Collaboration s) {
			return s.getCollaborationRoles();
		}
	};
	
	/**
	 * The multiplicities on connected elements must be consistent.
	true 
	 *
	 * @see StructuredClassifierPath#validateMultiplicities()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#validateMultiplicities(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<StructuredClassifier> validateMultiplicities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return StructuredClassifierPath.validateMultiplicities(diagnostics, context);
	}

	/**
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this structured classifier. 
	 *
	 * @see StructuredClassifierPath#createOwnedAttribute()
	 * @see org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute(String, Type, int, int)
	 * @generated
	 */
	public static Function<StructuredClassifier, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
		return StructuredClassifierPath.createOwnedAttribute(name, type, lower, upper);
	}

}
