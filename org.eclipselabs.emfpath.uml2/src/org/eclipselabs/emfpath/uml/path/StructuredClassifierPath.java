package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.StructuredClassifier StructuredClassifier} in a functional way.
 * <p>
 * A structured classifier is an abstract metaclass that represents any classifier whose
 * behavior can be fully or partly described by the collaboration of owned or referenced
 * instances. 
 * @see org.eclipse.uml2.uml.StructuredClassifier
 * @generated
 */
public class StructuredClassifierPath extends ClassifierPath {

	/**
	 * @generated
	 */
	 StructuredClassifierPath() {
    super();
  }

	/**
	 * References the properties owned by the classifier. 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> ownedAttribute = new Function<StructuredClassifier, EList<Property>>() {
    public EList<Property> apply(StructuredClassifier s) {
      return s.getOwnedAttributes();
    }
  };

	/**
	 * References the properties specifying instances that the classifier owns by composition.
	 * This association is derived, selecting those owned properties where isComposite is
	 * true. 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getParts()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> part = new Function<StructuredClassifier, EList<Property>>() {
    public EList<Property> apply(StructuredClassifier s) {
      return s.getParts();
    }
  };

	/**
	 * References the roles that instances may play in this classifier. 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getRoles()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<ConnectableElement>> role = new Function<StructuredClassifier, EList<ConnectableElement>>() {
    public EList<ConnectableElement> apply(StructuredClassifier s) {
      return s.getRoles();
    }
  };

	/**
	 * References the connectors owned by the classifier. 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Connector>> ownedConnector = new Function<StructuredClassifier, EList<Connector>>() {
    public EList<Connector> apply(StructuredClassifier s) {
      return s.getOwnedConnectors();
    }
  };
	
	/**
	 * The multiplicities on connected elements must be consistent.
	true 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#validateMultiplicities(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<StructuredClassifier> validateMultiplicities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<StructuredClassifier>() {
      public boolean apply(StructuredClassifier s) {
        return s.validateMultiplicities(diagnostics, context);
      }
    };
  }

	/**
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this structured classifier. 
	 * @see org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute(String, Type, int, int)
	 * @generated
	 */
	public static Function<StructuredClassifier, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
    return new Function<StructuredClassifier, Property>() {
      public Property apply(StructuredClassifier s) {
        return s.createOwnedAttribute(name, type, lower, upper);
      }
    };
  }

}
