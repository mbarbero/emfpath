package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
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
	 * @see org.eclipse.uml2.uml.DataType#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<DataType, EList<Property>> ownedAttribute = new Function<DataType, EList<Property>>() {
		public EList<Property> apply(DataType s) {
			return s.getOwnedAttributes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DataType#getOwnedOperations()
	 * @generated
	 */
	public static final Function<DataType, EList<Operation>> ownedOperation = new Function<DataType, EList<Operation>>() {
		public EList<Operation> apply(DataType s) {
			return s.getOwnedOperations();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DataType#createOwnedOperation()
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
	 * @see org.eclipse.uml2.uml.DataType#createOwnedAttribute()
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
