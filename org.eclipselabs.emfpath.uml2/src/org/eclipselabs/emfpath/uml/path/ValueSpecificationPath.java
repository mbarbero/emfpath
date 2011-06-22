package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = TypedElementPath.type;
	
	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#isComputable()
	 * @generated
	 */
	public static final Predicate<ValueSpecification> isComputable = new Predicate<ValueSpecification>() {
		public boolean apply(ValueSpecification s) {
			return s.isComputable();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#integerValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, java.lang.Integer> integerValue = new Function<ValueSpecification, java.lang.Integer>() {
		public java.lang.Integer apply(ValueSpecification s) {
			return s.integerValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#booleanValue()
	 * @generated
	 */
	public static final Predicate<ValueSpecification> booleanValue = new Predicate<ValueSpecification>() {
		public boolean apply(ValueSpecification s) {
			return s.booleanValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#stringValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, String> stringValue = new Function<ValueSpecification, String>() {
		public String apply(ValueSpecification s) {
			return s.stringValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#unlimitedValue()
	 * @generated
	 */
	public static final Function<ValueSpecification, java.lang.Integer> unlimitedValue = new Function<ValueSpecification, java.lang.Integer>() {
		public java.lang.Integer apply(ValueSpecification s) {
			return s.unlimitedValue();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ValueSpecification#isNull()
	 * @generated
	 */
	public static final Predicate<ValueSpecification> isNull = new Predicate<ValueSpecification>() {
		public boolean apply(ValueSpecification s) {
			return s.isNull();
		}
	};

}
