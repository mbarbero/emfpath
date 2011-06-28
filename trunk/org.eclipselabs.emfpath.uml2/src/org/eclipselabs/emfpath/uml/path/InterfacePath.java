package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Type;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Interface Interface} in a functional way.
 * <p>
 * An interface is a kind of classifier that represents a declaration of a set of coherent
 * public features and obligations. An interface specifies a contract; any instance of
 * a classifier that realizes the interface must fulfill that contract. The obligations
 * that may be associated with an interface are in the form of various kinds of constraints
 * (such as pre- and post-conditions) or protocol specifications, which may impose ordering
 * restrictions on interactions through the interface.
Interfaces may include receptions
 * (in addition to operations).
Since an interface specifies conformance characteristics,
 * it does not own detailed behavior specifications. Instead, interfaces may own a protocol
 * state machine that specifies event sequences and pre/post conditions for the operations
 * and receptions described by the interface. 
 * @see org.eclipse.uml2.uml.Interface
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
	 * The attributes (i.e. the properties) owned by the class. 
	 * @see org.eclipse.uml2.uml.Interface#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Interface, EList<Property>> ownedAttribute = new Function<Interface, EList<Property>>() {
    public EList<Property> apply(Interface s) {
      return s.getOwnedAttributes();
    }
  };

	/**
	 * The operations owned by the class. 
	 * @see org.eclipse.uml2.uml.Interface#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Interface, EList<Operation>> ownedOperation = new Function<Interface, EList<Operation>>() {
    public EList<Operation> apply(Interface s) {
      return s.getOwnedOperations();
    }
  };

	/**
	 * References all the Classifiers that are defined (nested) within the Class. 
	 * @see org.eclipse.uml2.uml.Interface#getNestedClassifiers()
	 * @generated
	 */
	public static final Function<Interface, EList<Classifier>> nestedClassifier = new Function<Interface, EList<Classifier>>() {
    public EList<Classifier> apply(Interface s) {
      return s.getNestedClassifiers();
    }
  };

	/**
	 * References all the Interfaces redefined by this Interface. 
	 * @see org.eclipse.uml2.uml.Interface#getRedefinedInterfaces()
	 * @generated
	 */
	public static final Function<Interface, EList<Interface>> redefinedInterface = new Function<Interface, EList<Interface>>() {
    public EList<Interface> apply(Interface s) {
      return s.getRedefinedInterfaces();
    }
  };

	/**
	 * Receptions that objects providing this interface are willing to accept. 
	 * @see org.eclipse.uml2.uml.Interface#getOwnedReceptions()
	 * @generated
	 */
	public static final Function<Interface, EList<Reception>> ownedReception = new Function<Interface, EList<Reception>>() {
    public EList<Reception> apply(Interface s) {
      return s.getOwnedReceptions();
    }
  };

	/**
	 * References a protocol state machine specifying the legal sequences of the invocation
	 * of the behavioral features described in the interface. 
	 * @see org.eclipse.uml2.uml.Interface#getProtocol()
	 * @generated
	 */
	public static final Function<Interface, ProtocolStateMachine> protocol = new Function<Interface, ProtocolStateMachine>() {
    public ProtocolStateMachine apply(Interface s) {
      return s.getProtocol();
    }
  };
	
	/**
	 * The visibility of all features owned by an interface must be public.
	self.feature->forAll(f
	 * | f.visibility = #public) 
	 * @see org.eclipse.uml2.uml.Interface#validateVisibility(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Interface> validateVisibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Interface>() {
      public boolean apply(Interface s) {
        return s.validateVisibility(diagnostics, context);
      }
    };
  }

	/**
	 * Creates an operation with the specified name, parameter names, parameter types, and
	 * return type (or null) as an owned operation of this interface. 
	 * @see org.eclipse.uml2.uml.Interface#createOwnedOperation(String, EList, EList, Type)
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
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this interface. 
	 * @see org.eclipse.uml2.uml.Interface#createOwnedAttribute(String, Type, int, int)
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
