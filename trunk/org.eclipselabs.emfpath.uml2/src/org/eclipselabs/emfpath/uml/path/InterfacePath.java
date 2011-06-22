package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class InterfacePath extends ClassifierPath {

	/**
	 * @generated
	 */
	private InterfacePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Interface#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Interface, EList<Property>> ownedAttribute = new Function<Interface, EList<Property>>() {
		public EList<Property> apply(Interface s) {
			return s.getOwnedAttributes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interface#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Interface, EList<Operation>> ownedOperation = new Function<Interface, EList<Operation>>() {
		public EList<Operation> apply(Interface s) {
			return s.getOwnedOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interface#getNestedClassifiers()
	 * @generated
	 */
	public static final Function<Interface, EList<Classifier>> nestedClassifier = new Function<Interface, EList<Classifier>>() {
		public EList<Classifier> apply(Interface s) {
			return s.getNestedClassifiers();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interface#getRedefinedInterfaces()
	 * @generated
	 */
	public static final Function<Interface, EList<Interface>> redefinedInterface = new Function<Interface, EList<Interface>>() {
		public EList<Interface> apply(Interface s) {
			return s.getRedefinedInterfaces();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interface#getOwnedReceptions()
	 * @generated
	 */
	public static final Function<Interface, EList<Reception>> ownedReception = new Function<Interface, EList<Reception>>() {
		public EList<Reception> apply(Interface s) {
			return s.getOwnedReceptions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Interface#getProtocol()
	 * @generated
	 */
	public static final Function<Interface, ProtocolStateMachine> protocol = new Function<Interface, ProtocolStateMachine>() {
		public ProtocolStateMachine apply(Interface s) {
			return s.getProtocol();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Interface#validateVisibility()
	 * @generated
	 */
	public static Predicate<Interface> validateVisibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Interface>() {
			public boolean apply(Interface s) {
				return s.validateVisibility(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Interface#createOwnedOperation()
	 * @generated
	 */
	public static Function<Interface, Operation> createOwnedOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final Type returnType) {
		return new Function<Interface, Operation>() {
			public Operation apply(Interface s) {
				return s.createOwnedOperation(name, parameterNames, parameterTypes, returnType);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Interface#createOwnedAttribute()
	 * @generated
	 */
	public static Function<Interface, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
		return new Function<Interface, Property>() {
			public Property apply(Interface s) {
				return s.createOwnedAttribute(name, type, lower, upper);
			}
		};
	}

}
