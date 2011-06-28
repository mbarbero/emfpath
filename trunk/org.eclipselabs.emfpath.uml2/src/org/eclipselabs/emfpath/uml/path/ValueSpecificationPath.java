package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ValueSpecification ValueSpecification} in a functional way.
 * <p>
 * A value specification is the specification of a (possibly empty) set of instances,
 * including both objects and data values.
ValueSpecification specializes ParameterableElement
 * to specify that a value specification can be exposed as a formal template parameter,
 * and provided as an actual parameter in a binding of a template. 
 * @see org.eclipse.uml2.uml.ValueSpecification
 * @generated
 */
public class ValueSpecificationPath extends PackageableElementPath {

	/**
	 * @generated
	 */
	 ValueSpecificationPath() {
    super();
  }

	/**
	 * This information is derived from the return result for this Operation.
	The type of
	 * the TypedElement. 
	 *
	 * @see TypedElementPath#type()
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = TypedElementPath.type;
	
	/**
	 * The query isComputable() determines whether a value specification can be computed
	 * in a model. This operation cannot be fully defined in OCL. A conforming implementation
	 * is expected to deliver true for this operation for all value specifications that it
	 * can compute, and to compute all of those for which the operation is true. A conforming
	 * implementation is expected to be able to compute the value of all literals.
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.ValueSpecification#isComputable()
	 * @generated
	 */
	public static final ComposablePredicate<ValueSpecification> isComputable = new ComposablePredicate<ValueSpecification>() {
    public boolean apply(ValueSpecification s) {
      return s.isComputable();
    }
  };

	/**
	 * The query integerValue() gives a single Integer value when one can be computed.
	result
	 * = Set{} 
	 * @see org.eclipse.uml2.uml.ValueSpecification#integerValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, java.lang.Integer> integerValue = new Function<ValueSpecification, java.lang.Integer>() {
    public java.lang.Integer apply(ValueSpecification s) {
      return s.integerValue();
    }
  };

	/**
	 * The query booleanValue() gives a single Boolean value when one can be computed.
	result
	 * = Set{} 
	 * @see org.eclipse.uml2.uml.ValueSpecification#booleanValue()
	 * @generated
	 */
	public static final ComposablePredicate<ValueSpecification> booleanValue = new ComposablePredicate<ValueSpecification>() {
    public boolean apply(ValueSpecification s) {
      return s.booleanValue();
    }
  };

	/**
	 * The query stringValue() gives a single String value when one can be computed.
	result
	 * = Set{} 
	 * @see org.eclipse.uml2.uml.ValueSpecification#stringValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, String> stringValue = new Function<ValueSpecification, String>() {
    public String apply(ValueSpecification s) {
      return s.stringValue();
    }
  };

	/**
	 * The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.
	result
	 * = Set{} 
	 * @see org.eclipse.uml2.uml.ValueSpecification#unlimitedValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, java.lang.Integer> unlimitedValue = new Function<ValueSpecification, java.lang.Integer>() {
    public java.lang.Integer apply(ValueSpecification s) {
      return s.unlimitedValue();
    }
  };

	/**
	 * The query isNull() returns true when it can be computed that the value is null.
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.ValueSpecification#isNull()
	 * @generated
	 */
	public static final ComposablePredicate<ValueSpecification> isNull = new ComposablePredicate<ValueSpecification>() {
    public boolean apply(ValueSpecification s) {
      return s.isNull();
    }
  };

}
