package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.DataType DataType} in a functional way.
 * <p>
 * A data type is a type whose instances are identified only by their value. A data type
 * may contain attributes to support the modeling of structured data types. 
 * @see org.eclipse.uml2.uml.DataType
 * @generated
 */
public class DataTypePath extends ClassifierPath {

	/**
	 * @generated
	 */
	 DataTypePath() {
    super();
  }

	/**
	 * The Attributes owned by the DataType. 
	 * @see org.eclipse.uml2.uml.DataType#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<DataType, EList<Property>> ownedAttribute = new Function<DataType, EList<Property>>() {
    public EList<Property> apply(DataType s) {
      return s.getOwnedAttributes();
    }
  };

	/**
	 * The Operations owned by the DataType. 
	 * @see org.eclipse.uml2.uml.DataType#getOwnedOperations()
	 * @generated
	 */
	public static final Function<DataType, EList<Operation>> ownedOperation = new Function<DataType, EList<Operation>>() {
    public EList<Operation> apply(DataType s) {
      return s.getOwnedOperations();
    }
  };
	
	/**
	 * Creates an operation with the specified name, parameter names, parameter types, and
	 * return type (or null) as an owned operation of this data type. 
	 * @see org.eclipse.uml2.uml.DataType#createOwnedOperation(String, EList, EList, Type)
	 * @generated
	 */
	public static Function<DataType, Operation> createOwnedOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final Type returnType) {
    return new Function<DataType, Operation>() {
      public Operation apply(DataType s) {
        return s.createOwnedOperation(name, parameterNames, parameterTypes, returnType);
      }
    };
  }

	/**
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this data type. 
	 * @see org.eclipse.uml2.uml.DataType#createOwnedAttribute(String, Type, int, int)
	 * @generated
	 */
	public static Function<DataType, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
    return new Function<DataType, Property>() {
      public Property apply(DataType s) {
        return s.createOwnedAttribute(name, type, lower, upper);
      }
    };
  }

}
