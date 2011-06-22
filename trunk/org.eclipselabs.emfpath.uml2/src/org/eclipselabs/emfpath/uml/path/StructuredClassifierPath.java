package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;

/**
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
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> ownedAttribute = new Function<StructuredClassifier, EList<Property>>() {
		public EList<Property> apply(StructuredClassifier s) {
			return s.getOwnedAttributes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getParts()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Property>> part = new Function<StructuredClassifier, EList<Property>>() {
		public EList<Property> apply(StructuredClassifier s) {
			return s.getParts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getRoles()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<ConnectableElement>> role = new Function<StructuredClassifier, EList<ConnectableElement>>() {
		public EList<ConnectableElement> apply(StructuredClassifier s) {
			return s.getRoles();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#getOwnedConnectors()
	 * @generated
	 */
	public static final Function<StructuredClassifier, EList<Connector>> ownedConnector = new Function<StructuredClassifier, EList<Connector>>() {
		public EList<Connector> apply(StructuredClassifier s) {
			return s.getOwnedConnectors();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#validateMultiplicities()
	 * @generated
	 */
	public static Predicate<StructuredClassifier> validateMultiplicities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<StructuredClassifier>() {
			public boolean apply(StructuredClassifier s) {
				return s.validateMultiplicities(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute()
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
